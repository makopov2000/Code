package com.java8.File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import au.com.bytecode.opencsv.CSVReader;

public class Read_File_3Ways {
	// Delimiters used in the CSV file
	private static final String COMMA_DELIMITER = ",";

	public static void main(String[] args) {

		/////////////////// Using Buffered Reader and String.split()
		/////////////////// ////////////////////
		System.out.println("++++++++++++++   Using Buffered Reader and String.split() ++++++++++++");
		BufferedReader br = null;
		try {
			// Reading the csv file
			br = new BufferedReader(new FileReader("Employee.csv"));

			// Create List for holding Employee objects
			List<Employee> empList = new ArrayList<Employee>();

			String line = "";
			// Read to skip the header
			br.readLine();
			// Reading from the second line
			while ((line = br.readLine()) != null) {
				String[] employeeDetails = line.split(COMMA_DELIMITER);

				if (employeeDetails.length > 0) {
					// Save the employee details in Employee object
					Employee emp = new Employee(Integer.parseInt(employeeDetails[0]), employeeDetails[1],
							employeeDetails[2], Integer.parseInt(employeeDetails[3]));
					empList.add(emp);
				}
			}

			// Lets print the Employee List
			for (Employee e : empList) {
				System.out.println(
						e.getEmpId() + "   " + e.getFirstName() + "   " + e.getLastName() + "   " + e.getSalary());
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException ie) {
				System.out.println("Error occured while closing the BufferedReader");
				ie.printStackTrace();
			}
		}

		/////////////////// Using Scanner of Java Util package ////////////////////
		System.out.println("++++++++++++++   Using Scanner of Java Util package ++++++++++++");
		Scanner scanner = null;
		try {
			// Get the scanner instance
			scanner = new Scanner(new File("Employee.csv"));
			// Use Delimiter as COMMA
			scanner.useDelimiter(COMMA_DELIMITER);
			while (scanner.hasNext()) {
				System.out.print(scanner.next() + "   ");
			}
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} finally {
			scanner.close();
		}

		/////////////////// Using OpenCSV ////////////////////
		System.out.println("");
		System.out.println("++++++++++++++   Using OpenCSV ++++++++++++");
		CSVReader csvReader = null;

		try {
			/**
			 * Reading the CSV File Delimiter is comma Start reading from line 1
			 */
			csvReader = new CSVReader(new FileReader("Employee.csv"), ',', '"', 1);
			// employeeDetails stores the values current line
			String[] employeeDetails = null;
			// Create List for holding Employee objects
			List<Employee> empList = new ArrayList<Employee>();

			while ((employeeDetails = csvReader.readNext()) != null) {
				// Save the employee details in Employee object
				Employee emp = new Employee(Integer.parseInt(employeeDetails[0]), employeeDetails[1],
						employeeDetails[2], Integer.parseInt(employeeDetails[3]));
				empList.add(emp);
			}

			for (Employee e : empList) {
				System.out.println(
						e.getEmpId() + "   " + e.getFirstName() + "   " + e.getLastName() + "   " + e.getSalary());
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		}

	}

}

class Employee {
	private int empId;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int empId, String firstName, String lastName, int salary) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
}
