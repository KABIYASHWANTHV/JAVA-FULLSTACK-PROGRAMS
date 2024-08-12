package com.kabi;

class Employee
{
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	Employee(int employeeId,String employeeName, float employeeSalary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
	void display()
	{
		System.out.println("Employee Id : "+ employeeId);
		System.out.println("Employee Name : "+ employeeName);
		System.out.println("Employee Salary : "+ employeeSalary);
	}
}

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(101,"Kabi",2000.00f);
		emp1.display();
		Employee emp2 = new Employee(102,"Dharun",3000.133f);
		emp2.display();
	}

}
