package com.example.unix.clone;

import com.example.unix.clone.Employee;

public class DeepClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		 System.out.println("*****************  CLONE SHlow ****************** ");
		 
		EmployeeAddress empAddress=new EmployeeAddress("22","Avenue Street", "Dallas");
		
		 Employee emp=new Employee("David", 32,100.00, empAddress);
		 Employee empClone=null;
		 
		 empClone = (Employee) emp.clone();
		 
		 System.out.println("+++ emp before change: "+ emp.toString());
		 System.out.println("+++ empClone before change: "+ empClone.toString());
		 
		 emp.setAge(66);
		 emp.getAddress().setCity("Glendale");
		 
		 System.out.println("+++ emp after change: "+ emp.toString());
		 System.out.println("+++ empClone after change: "+ empClone.toString());

		 
		 System.out.println("*****************  CLONE Deep ****************** ");
			EmployeeAddress empAddressD=new EmployeeAddress("22","Avenue Street", "Dallas");
			
			 Employee empD=new Employee("David", 32,100.00, empAddressD);
			 Employee empCloneD=null;
			 
			 empCloneD = (Employee) CloneFactory.deepCopy(empD);
			 System.out.println("+++ empD before change: "+ empD.toString());
			 System.out.println("+++ empCloneD before change: "+ empCloneD.toString());
			 
			 empD.setAge(66);
			 empD.getAddress().setCity("Glendale");
			 
			 System.out.println("+++ empD after change: "+ empD.toString());
			 System.out.println("+++ empCloneD after change: "+ empCloneD.toString());
	}

}
