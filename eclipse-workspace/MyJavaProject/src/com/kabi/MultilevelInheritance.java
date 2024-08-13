package com.kabi;
//multilevel inheritance
class Vehicle
{
	void noOfEngine()
	{
		System.out.println("I have one engine");
	}
}
class TwoWheeler1 extends Vehicle
{
	void noOfWheels()
	{
		System.out.println("I have two wheels");
	}
}
class Bike1 extends TwoWheeler1
{
	void brandName()
	{
		System.out.println("Brand Name is Honda");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike1 bike1 = new Bike1();
		bike1.noOfEngine();
		bike1.noOfWheels();
		bike1.brandName();
	}

}

