package com.kabi;
class A
{
	int a=10;
	A(String name)
	{
		System.out.println("Welcome "+name);
	}
	void myMethod1()
	{
		System.out.println("I am super class method");
	}
}
class B extends A
{
	B()
	{
		super("Kabi");
	}
	void myMethod2()
	{
		System.out.println("Super class variable : "+super.a);
		super.myMethod1();
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.myMethod2();
	}

}
