package com.java8.Heap_Analisys;

import java.util.HashMap;
import java.util.Map;

public class AddressBook {
    public static Map<User, Address> map = new HashMap<>();

    /**
     * Keeps adding user and their address infinitely.
     */
    public void addAddresses() {

        for (int counter = 0; ; ++counter) {

            User user = new User("Mike" + counter, "Akopov" + counter);
            Address address = new Address("San Francisco"+counter, "CA"+counter, "USA"+counter);
            map.put(user, address);
            System.out.println("added: " + user);
        }
    }

    public static void main(String args[]) {

        new AddressBook().addAddresses();
    }
}