package com.kabi;
//hierarchial inheritance
class Vehicle1
{
	void noOfEngine()
	{
		System.out.println("I have one engine");
	}
}
class TwoWheeler2 extends Vehicle1
{
	void noOfWheel()
	{
		System.out.println("I have two wheels");
	}
}
class Bike2 extends TwoWheeler2
{
	void brandName()
	{
		System.out.println("Brand name is Honda");
	}
}
class Scooty extends TwoWheeler2
{
	void brandName()
	{
		System.out.println("Brand name is Activa");
	}
}
public class HierarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike2 bike = new Bike2();
		bike.noOfEngine();
		bike.noOfWheel();
		bike.brandName();
		Scooty scooty=new Scooty();
		bike.noOfEngine();
		scooty.noOfWheel();
		scooty.brandName();
	}

}


