package com.java8.List_2;

import java.util.ArrayList;
import java.util.List;

public class Contains_Partial_String {

	public static void main(String[] args) {
		String url = "/admin/mik/somethingels";
		List<String> urlList = new ArrayList<>();
		urlList.add("/webjar");
		urlList.add("/swagger");
		urlList.add("/csr");

		Boolean exist = urlList.stream()
				.anyMatch(rec-> url.contains(rec));
		

		System.out.println("Found: "+exist);
		
	}

}
