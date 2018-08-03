package com.java8.util;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileUtil {

public static void writeToFile(String fileName, List<String> records) throws IOException {
    BufferedWriter bw = null;
    FileWriter fw = null;

    try {
        File file = new File(fileName);
        // if file does not exist -> create
        if (!file.exists()) {
            file.createNewFile();
        }
        //true = append to file
        fw = new FileWriter(file.getAbsoluteFile(), true);
        bw = new BufferedWriter(fw);

        Iterator iterator = records.iterator();
        while (iterator.hasNext()) {
            bw.write((String) iterator.next());
            //do not write new line if last record in the list to prevent blank line at the end of the file
            if (iterator.hasNext()) {
                bw.newLine();
            }
        }
        System.out.println("Write -> Done");
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            if (bw != null) bw.close();
            if (fw != null) fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
}

public static List<String> readFile (String inputFileName) throws IOException {
    BufferedReader br = null;
    FileReader fr = null;
    List<String> records = new ArrayList<>();
    try {
        fr = new FileReader(inputFileName);
        br = new BufferedReader(fr);
        String record = null;
        while ((record = br.readLine()) != null) {
            records.add(record);
        }
    } catch (IOException er) {
        er.printStackTrace();
        throw er;
    } finally {
        try {
            if (br != null) br.close();
            if (fr != null) fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
    return records;
}

}
