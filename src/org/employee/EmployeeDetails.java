package org.employee;

public class EmployeeDetails { // block or body of the class
	
	//methods
	// private - access specifier
	// void    - return type
	// empName - method name
	// ()      - arguments place / parameter / input
	// {}      - block or body of the method
	// ""      - double quote String - it will print all
	private void empName() {
		System.out.println("Employee name : Anand");
	}
	
	private void empId() {
		System.out.println("Employee id : 1001");
	}
	//.......methods
	private void empAdd() {
		System.out.println("chennai");
	}
	private void empMobile() {
		System.out.println("8939915557");
	}
//<<<<<<< HEAD
//======
//>>>>>>> fe2b6f9718346a39c442b1e56e1b818f054b6c3c
	
	
	public static void main(String[] args) {
		
		
		// object creation
		EmployeeDetails e = new EmployeeDetails();
		// method call
		e.empName();
		
		
	}
	

}
