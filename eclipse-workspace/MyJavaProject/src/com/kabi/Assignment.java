package com.kabi;
import java.util.Scanner;
class student
{
	int registrationNo;
	String studentName;
	int arr[]=new int[5];
	student(int registrationNo,String studentName)
	{
		this.registrationNo=registrationNo;
		this.studentName=studentName;
	}
	void getMarks()
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	void displayGrade()
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Student Registration Number : "+registrationNo);
		System.out.println("Student Registration Name : "+studentName);
		System.out.println("Sum : "+sum);
		int average=sum/5;
		System.out.println("Average : "+average);
		if(average <=50)
		{
			System.out.println("Grade is : U");
		}
		else if(average >50 && average<=60)
		{
			System.out.println("Grade is : C");
		}
		else if(average >60 && average<=70)
		{
			System.out.println("Grade is : B");
		}
		else if(average >70 && average<=80)
		{
			System.out.println("Grade is : B+");
		}
		else if(average >80 && average<=90)
		{
			System.out.println("Grade is : A");
		}
		else if(average >90 && average<=95)
		{
			System.out.println("Grade is : A+");
		}
		else if(average >95 && average<=100)
		{
			System.out.println("Grade is : O");
		}
	}
}
public class Assignment 
{
	public static void main(String[] args)
	{
		student obj = new student(101,"Kabi");
		obj.getMarks();
		obj.displayGrade();
	}
}
