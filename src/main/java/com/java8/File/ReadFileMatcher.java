package com.java8.File;

import java.io.File;
//import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.unix4j.Unix4j;
//import org.unix4j.builder.Unix4jCommandBuilder;
//import org.unix4j.line.Line;

public class ReadFileMatcher {

	public static void main(String[] args) throws IOException {
		
//	    int expectedLineCount = 4;
//	    File file = new File("C:/rest.txt");
//	    List<Line> lines = Unix4j.grep("appgrp03", file).toLineList(); 
//	    
//	    lines.stream().forEach(r-> System.out.println(r.toString()));
	    
//	    Unix4jCommandBuilder unix4j = Unix4j.builder();
//	    List<String> testClasses = unix4j.find("C:/", "*.txt").toStringList();
//	    for(String path: testClasses){
//	        System.out.println(path);
//	    }
		
//	    Path path = Paths.get("C:\\");
//	    Stream<Path> matches = listFiles(path);
//	    matches.forEach(System.out::println);
		
		//+++++++++++++++++++++++++++++++++++++
//		List<String> files = searchForFeedFiles();
//		for (String file  : files) {
//			if(file.contains(".txt")) {
//				System.out.println("+++Found Text File: "+file);
//			}
//		}

	}
	
	  private static List<String> searchForFeedFiles() {
		  List<String> filesFound = new ArrayList<>();
			File rootDir = new File("C:\\");
			File[] feedDirs = rootDir.listFiles();
			for (File feedDir : feedDirs) {
				if (feedDir.isDirectory()) {
					continue; // TODO if the files are expected to be placed at the root directory.
				}
				filesFound.add(feedDir.toString());
//				System.out.println(feedDir.toString());
			}
		  
		return filesFound;
	}

	private static Predicate<Path> matchesGlob(String glob) throws IOException {
		    FileSystem fileSystem = FileSystems.getDefault();
		    PathMatcher pathMatcher = fileSystem.getPathMatcher("glob:" + glob);
		    return pathMatcher::matches;
		  }

		  public static Stream<Path> listFiles(Path path){
		    return Stream.of(path);
		  }

}
