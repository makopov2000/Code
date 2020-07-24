package com.example.unix.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.example.unix.List.Entity.User;

public class Sort_List {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		
		/////////////////////////////////////////////////////////Sort by created date ascending
		Collections.sort(users);
		/////////////////////////////////////////////////////////Sort by created date descending
		Collections.reverse(users);
		/////////////////////////////////////////////////////////Sort by created date ascending
		Collections.sort(users, new Comparator<User>() {
			  @Override
			  public int compare(User u1, User u2) {
			    return u1.getCreatedOn().compareTo(u2.getCreatedOn());
			  }
			});
		/////////////////////////////////////////////////////////Sort by created date descending
		Collections.sort(users, new Comparator<User>() {
			  @Override
			  public int compare(User u1, User u2) {
			    return u2.getCreatedOn().compareTo(u1.getCreatedOn());
			  }
			});
		/////////////////////////////////////////////////////////Sort by created date ascending
		users.sort(Comparator.comparing(User::getCreatedOn));
		/////////////////////////////////////////////////////////Sort by created date descending
		users.sort(Comparator.comparing(User::getCreatedOn).reversed());
		///////////////////////////////////////////////////////// Sort ascending/descending with STREAM
		List<User> sortedUsers = users.stream()
				  .sorted(Comparator.comparing(User::getCreatedOn))
				  .collect(Collectors.toList());
		List<User> sortedUsers2 = users.stream()
				  .sorted(Comparator.comparing(User::getCreatedOn).reversed())
				  .collect(Collectors.toList());
		

	}

}
