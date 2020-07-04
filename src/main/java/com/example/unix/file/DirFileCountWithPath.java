package com.example.unix.file;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import java.io.File;

public class DirFileCountWithPath {
  public static void main(String args[]) {
     List<String> fileNames = new ArrayList<>();
    try {
      DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get("C:\\MyApp\\"));
      for (Path path : directoryStream) {
        fileNames.add(path.toString());
      }
    } catch (IOException ex) {
    }
    System.out.println("File Count NIO:"+fileNames.size());
    
    File directory=new File("C:\\MyApp\\");
    int fileCount=directory.list().length;
    System.out.println("File Count util.File:"+fileCount);
    
  }
}
