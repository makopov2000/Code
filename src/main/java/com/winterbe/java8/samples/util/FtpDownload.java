package com.winterbe.java8.samples.util;

//import com.jcraft.jsch.*;
//
//import java.io.IOException;
//import java.util.Properties;
//import java.util.Vector;
//
//public class FtpDownload {
//
//    private static String env;
//    private static String hostname;
//    private static String login;
//    private static String password;
//    private static String directory;
//    private static String downloadDir;
//    private static String fileNameLike;
//    private static Session session;
//    private static Channel channel;
//    private static ChannelSftp channelSftp;
//
//
//
//
//    public static void main(String[] args) {
//        try {
//            setFtpProperties();
//            createFTPSession();
//            createChannel();
//            downloadFile();
//            disconnectChannel();
//            disconnectSession();
//        } catch (Exception e) {
//            disconnectChannel();
//            disconnectSession();
//
//        }
//    }
//
//    private static void downloadFile() throws SftpException {
//            channelSftp.cd(directory);
//            Vector<ChannelSftp.LsEntry> entries = channelSftp.ls(fileNameLike);
//            if (entries.size() == 0) {
//                System.out.println("There are no file exist");
//            } else if (entries.size() == 1) {
//                ChannelSftp.LsEntry entry = entries.get(0);
//                String fileName = entry.getFilename();
//                System.out.println("Will download file");
//                channelSftp.get(fileName, downloadDir);
//                System.out.println("File downloaded");
//            }else if (entries.size() > 1) {
//                System.out.println("There are more than 1 file exist");
//            }
//
//    }
//
//    private static void setFtpProperties() throws IOException {
//        hostname = PropertiesUtil.readProperties(env).getProperty("hostname");
//        login = PropertiesUtil.readProperties(env).getProperty("login");
//        directory = PropertiesUtil.readProperties(env).getProperty("directory");
//
//        String key = PropertiesUtil.readProperties(env).getProperty("jasypKey");
//        String pass = PropertiesUtil.readProperties(env).getProperty("password");
//        password = JasyptUtil.getInstance(key).decrypt(pass);
//
//    }
//
//    private static void createFTPSession() {
//        Properties properties = new Properties();
//        properties.put("StrictHostKeyChecking", "no");
//        JSch ssh = new JSch();
//        try {
//            session = ssh.getSession(login, hostname, 22);
//        } catch (JSchException e) {
//            e.printStackTrace();
//        }
//        session.setConfig(properties);
//        session.setPassword(password);
//        try {
//            session.connect();
//        } catch (JSchException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void createChannel() {
//        try {
//            channel = session.openChannel("sftp");
//        } catch (JSchException e) {
//            e.printStackTrace();
//        }
//        try {
//            channel.connect();
//        } catch (JSchException e) {
//            e.printStackTrace();
//        }
//        channelSftp = (ChannelSftp) channel;
//    }
//
//    private static void disconnectChannel() {
//        channel.disconnect();
//    }
//
//    private static void disconnectSession() {
//        session.disconnect();
//    }
//
//}
//
//
