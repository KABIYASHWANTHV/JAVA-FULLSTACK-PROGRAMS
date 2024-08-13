package com.kabi;
class A1
{
	A1()
	{
		System.out.println("A1");
	}
	A1(int a)
	{
		System.out.println("A1 1");
	}
}
class B1 extends A1
{
	B1()
	{
		super(1000);
		System.out.println("B1");
	}
}
public class superKeyword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b = new B1();
	}

}
