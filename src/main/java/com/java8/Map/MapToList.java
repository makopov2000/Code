package com.java8.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.java8.Map.Entity.Employee;
 
public class MapToList {
 
    public static void main(String[] args) {
        
        HashMap<String, Employee> employeeMap = new HashMap<String, Employee>(); 
         
        employeeMap.put("emp01", new Employee("emp01", "Jason", "IT"));
        employeeMap.put("emp02", new Employee("emp02", "Aaron", "Supply Chain"));        
        employeeMap.put("emp03", new Employee("emp03", "Oliver", "Marketing"));
        employeeMap.put("emp04", new Employee("emp04", "Raj", "IT"));
        
 
        /*
         * Convert HashMap to List(ArrayList) containing map entries
         * using entrySet method of HashMap.
         */
        List<Map.Entry<String, Employee>> aListEntries = 
                new ArrayList<Map.Entry<String, Employee>>(employeeMap.entrySet());
        
        System.out.println("ArrayList containing HashMap Entries: ");
        for(Map.Entry<String, Employee> empEntry : aListEntries)
            System.out.println(empEntry);
 
    }
}
