package com.java8.Map;


import java.util.HashMap;
import java.util.TreeMap;

import com.java8.Map.Entity.Employee;

public class Sort_TreeMap_Map {

public static void main(String[] args) {
        
        //HashMap containing Employee and it's manager mappings
        HashMap<Employee, Employee> hMapEmployeeManager = 
                new HashMap<Employee, Employee>();
        
        
        hMapEmployeeManager.put(new Employee("021", "Emp1", "IT"),
                new Employee("0033", "Manager1", "IT"));
 
        hMapEmployeeManager.put(new Employee("005", "Emp1", "IT"),
                new Employee("0033", "Manager1", "IT"));
 
        hMapEmployeeManager.put(new Employee("004", "Emp1", "IT"),
                new Employee("0033", "Manager1", "IT"));
 
        hMapEmployeeManager.put(new Employee("011", "Emp1", "IT"),
                new Employee("0033", "Manager1", "IT"));
 
        
        //print HashMap
        System.out.println("Unsorted HashMap Keys & Values");
        for(Employee e : hMapEmployeeManager.keySet()){
            System.out.println("Employee: " + e 
                    + ", Manager: " + hMapEmployeeManager.get(e));
        }
        
        
        //convert HashMap to TreeMap, thus sorting it
        TreeMap<Employee, Employee> treeMapEmployees =
                new TreeMap<Employee, Employee>(hMapEmployeeManager);
        
        //print TreeMap
        System.out.println("Sorted TreeMap Keys & Values");
        for(Employee e : treeMapEmployees.keySet()){
            System.out.println("Employee: " + e 
                    + ", Manager: " + treeMapEmployees.get(e));
        }
        
    }

}

