package com.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.HashSet;

public class RemoveDuplicates {
	public static class Department {
	    private int deptId;
	    private String deptName;
	    public Department(int deptId, String deptName) {
	        super();
	        this.deptId = deptId;
	        this.deptName = deptName;
	    }
	    public int getDeptId() {
	        return deptId;
	    }
	    public void setDeptId(int deptId) {
	        this.deptId = deptId;
	    }
	    public String getDeptName() {
	        return deptName;
	    }
	    public void setDeptName(String deptName) {
	        this.deptName = deptName;
	    }
	}

    public static void main(String[] args) {
        List<Department> deptList = new ArrayList<Department>();
        deptList.add(new Department(1, "IT"));
        deptList.add(new Department(2, "HR"));
        deptList.add(new Department(1, "IT"));
        deptList.add(new Department(4, "Development"));
        deptList.add(new Department(2, "HR"));
        // Removing the Elements by assigning list to TreeSet
        System.out.println("---------Removing the Elements by assigning list to TreeSet ---------");
        Set<Department> deptSet = deptList.stream()
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Department::getDeptName))));
        deptSet.forEach(dept -> System.out.println("DeptId (" + dept.getDeptId() + ") Name :" + dept.getDeptName()));
        
        // directly removing the elements from list if already existed in set
        System.out.println("---------directly removing the elements from list if already existed in set---------");
        Set<String> deptSet2 = new HashSet<>();
        deptList.removeIf(p -> !deptSet2.add(p.getDeptName()));
        deptList.forEach(dept->System.out.println(dept.getDeptId() +" : "+dept.getDeptName()));
    }

}
