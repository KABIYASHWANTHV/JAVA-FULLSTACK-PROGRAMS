package com.kabi;
class Emp
{
	String empName;
	String jobTitle;
	double salary;
	Emp(String empName,String jobTitle,double salary)
	{
		this.empName=empName;
		this.jobTitle=jobTitle;
		this.salary=salary;
	}
	void set(double salary)
	{
		this.salary=salary;
	}
	void display()
	{
		System.out.println("Employee name : "+empName);
		System.out.println("Job title : "+jobTitle);
		System.out.println("Salary : "+salary);
	}
}
public class Assignment2Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp obj = new Emp("Kabi","Manager",25000);
		obj.set(40000);
		obj.display();
	}

}
