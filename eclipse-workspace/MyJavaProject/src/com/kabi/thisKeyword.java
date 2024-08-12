package com.kabi;
//this keyword refers current class object
public class thisKeyword {
	String name;
	thisKeyword(String name)
	{
		this(10,20);
		this.name=name;
		this.greeting();
	}
	thisKeyword(int a,int b)
	{
		System.out.println("Sum : "+ (a+b));
	}
	void greeting()
	{
		System.out.println("Welcome "+ name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisKeyword obj = new thisKeyword("Kabi");

	}

}
