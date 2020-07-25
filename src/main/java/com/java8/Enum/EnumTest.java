package com.java8.Enum;

enum Department {
//	  @Override
	  HR("DEPT-01"){
	    public String getDeptCode(){
	      return "NOT ACCESSIBLE";
	    }
	  }, OPERATIONS("DEPT-02"), LEGAL("DEPT-03"), MARKETING("DEPT-04");//semi-colon is no longer optional here
	 
	  Department(String deptCode){
	    this.deptCode=deptCode;
	  }
	 
	  private String deptCode;
	 
	  public String getDeptCode(){
	    return deptCode;
	  }
	}
	//EnumTest.java
	public class EnumTest {
	  public static void main(String args[]) {
	   for(Department dept:Department.values()){
	     System.out.println("Department name: "+dept+", Department Code: "+dept.getDeptCode());
	   }
	   
	   System.out.println("==================");
	     Department enumVar = Department.valueOf("HR");
	     System.out.println("enumVar == Department.HR? "+(enumVar == Department.HR));
	     System.out.println("enumVar equals Department.HR? "+(enumVar.equals(Department.HR)));
	   
	  }
	}
