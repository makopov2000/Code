package com.java8.util;

import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.ssl.SSLContexts;

import javax.net.ssl.SSLContext;
import java.io.*;
import java.net.URL;
import java.rmi.registry.Registry;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class HttpClient extends CloseableHttpClient {

    public static HttpResponse delete(String url, String endPoint, Map<String,String> headers) throws Exception {
    CloseableHttpClient client;
    HttpDelete delete = new HttpDelete(url);
    client = getClient(url,"env");
    HttpResponse response = client.execute(delete);
    return response;
    }

    public static HttpResponse post(String url, String endPoint, Map<String,String> headers) throws Exception {
        CloseableHttpClient client;
        HttpPost post = new HttpPost(url);
        client = getClient(url,"env");
        HttpResponse response = client.execute(post);
        return response;
    }

    public static HttpResponse get(String url, String endPoint, Map<String,String> headers) throws Exception {
        HttpGet get = new HttpGet((url+endPoint));
        CloseableHttpClient client;
        HttpResponse reponse;
        StringBuffer responseString = new StringBuffer();

        if (headers != null) {
            Set<String> keys = headers.keySet();
            for (String key : keys) {
                get.addHeader(key, headers.get(key));
            }
        }

        client = getClient(url, "env");
        reponse = client.execute(get);

        Integer statusCode = reponse.getStatusLine().getStatusCode();
        String statusExp = reponse.getStatusLine().getReasonPhrase();
        if (statusCode != 200){
            throw new RuntimeException(String.valueOf((statusCode)));
        }

        BufferedReader rd = new BufferedReader((new InputStreamReader((reponse.getEntity().getContent()))));
        String line = new String();
        while ((line = rd.readLine()) != null) {
            responseString.append(line);
        }

//        RestResponse restResponse;  //--->> create custom Object
//         restResponse.setResponseBody(responseString.toString());
//        restResponse.setResponseCode(reponse.getStatusLine().getStatusCode());
//        restResponse.setResponseMessage(reponse.getStatusLine().getReasonPhrase());
//        Header[] rheaders = reponse.getAllHeaders();
//        for (Header header : rheaders) {
//            restResponse.setHeader(header.getName(), header.getValue());
//        }
//        return restResponse;

//if (restResponse != null) {
//            if (restResponse.getResponseCode() == 404) {
//                setStatus(ACCOUNT_NOT_FOUND);
//            } else if (restResponse.getResponseCode() != 200) {
//                setStatus(ERROR);
//            } else {
//                if (restResponse.getResponseBody() != null) {
//                    mapper.readValue(restResponse.getResponseBody, AccountNumber.class);
//                }
//            }
//}

        return reponse;


    }

    public static CloseableHttpClient getClient(String url, String env) throws Exception {
        CloseableHttpClient client = null;
        URL aUrl = null;
        aUrl = new URL(url);
        //Check Protocol
        if (aUrl != null && "http".equalsIgnoreCase(aUrl.getProtocol())){
            client = HttpClientBuilder.create().build();
        } else if (aUrl!= null && "https".equalsIgnoreCase(aUrl.getProtocol())) {
            client = new SSLKeyStore().getKeyStore(env);
        }
        return (HttpClient) client;
    }

    @Override
    protected CloseableHttpResponse doExecute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException, ClientProtocolException {
        return null;
    }

    @Override
    public void close() throws IOException {

    }

    @Override
    public HttpParams getParams() {
        return null;
    }

    @Override
    public ClientConnectionManager getConnectionManager() {
        return null;
    }


    public static class SSLKeyStore {

        public static InputStream inputStream;

        public SSLKeyStore() {
        }

        public CloseableHttpClient getKeyStore(String env) throws Exception {
            Properties properties = readPropertiFile("env");
            String keyStorePassword = properties.getProperty("keystorepassword");
            String ketStoreFileName = properties.getProperty("keystorefilename");

            SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(new File(ketStoreFileName), keyStorePassword.toCharArray(), new TrustSelfSignedStrategy()).build();
            SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext, new String[]{"TLSv1"}, (String[])null, SSLConnectionSocketFactory.getDefaultHostnameVerifier());
            org.apache.http.config.Registry registry = RegistryBuilder.create().register("https", sslConnectionSocketFactory).build();
            PoolingHttpClientConnectionManager poolingHttpClientConnectionManager = new PoolingHttpClientConnectionManager(registry);
            CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(poolingHttpClientConnectionManager).build();

            if (inputStream != null) {
                inputStream.close();
            }
            return httpClient;
        }

        public Properties readPropertiFile(String env) {
            Properties properties = new Properties();
            inputStream = this.getClass().getClassLoader().getResourceAsStream(env);

            try {
                properties.load((inputStream));
            } catch (IOException v) {
                v.printStackTrace();
            }
            return properties;
        }
    }
}


