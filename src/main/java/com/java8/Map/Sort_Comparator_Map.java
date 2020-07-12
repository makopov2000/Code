package com.java8.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Sort_Comparator_Map {

public static void main(String[] args) {
        
        //HashMap containing employee and it's manager mappings
        HashMap<Employee, Employee> hMapEmployeeManager = 
                new HashMap<Employee, Employee>();
        
        
        hMapEmployeeManager.put(new Employee("021", "Scott", "IT"),
                new Employee("0033", "Carl", "IT"));
 
        hMapEmployeeManager.put(new Employee("005", "Adam", "IT"),
                new Employee("0033", "Carl", "IT"));
 
        hMapEmployeeManager.put(new Employee("004", "Raj", "IT"),
                new Employee("0033", "Carl", "IT"));
 
        hMapEmployeeManager.put(new Employee("011", "Marie", "IT"),
                new Employee("0033", "Carl", "IT"));
 
        
        //print HashMap
        System.out.println("Unsorted HashMap Keys & Values");
        for(Employee e : hMapEmployeeManager.keySet()){
            System.out.println("Employee: " + e 
                    + ", Manager: " + hMapEmployeeManager.get(e));
        }
 
         System.out.println("");
        
        //Create a new TreeMap with the custom Comparator
        TreeMap<Employee, Employee> treeMapEmployees =
                new TreeMap<Employee, Employee>(new EmpComparator());
        
        //put all elements of HashMap to TreeMap, thus sorting them
        treeMapEmployees.putAll(hMapEmployeeManager);
        
        //print TreeMap
        System.out.println("Sorted TreeMap Keys & Values");
        for(Employee e : treeMapEmployees.keySet()){
            System.out.println("Employee: " + e 
                    + ", Manager: " + treeMapEmployees.get(e));
        }
        
    }
}
 
class EmpComparator implements Comparator<Employee>{
    
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareToIgnoreCase(e2.getName());        
    }    
}

