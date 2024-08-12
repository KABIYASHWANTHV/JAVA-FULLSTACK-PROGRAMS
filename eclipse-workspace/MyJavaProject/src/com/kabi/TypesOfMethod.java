package com.kabi;

public class TypesOfMethod {
	void myMethod1()
	{
		System.out.println("Instance or Object Method");
	}
	static void myMethod2()
	{
		System.out.println("Static or Class Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypesOfMethod obj = new TypesOfMethod();
		obj.myMethod1();
		TypesOfMethod.myMethod2();
	}

}
