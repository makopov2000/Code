package com.winterbe.java8.samples.comparator;

import java.util.Comparator;

public class CustomerSortingComparator implements Comparator<Customer> {
	 
    @Override
    public int compare(Customer cust1, Customer cust2) {
 
        // all comparison
        int compareName = cust1.getCustName().compareTo(cust2.getCustName());
        int compareCity = cust1.getCustCity().compareTo(cust2.getCustCity());
        int compareAge = cust1.getCustAge().compareTo(cust2.getCustAge());
 
        // 3-level comparison using if-else block
        if(compareName == 0) {
            return ((compareCity == 0) ? compareAge : compareCity);
        }
        else {
            return compareName;
        }
    }
}
