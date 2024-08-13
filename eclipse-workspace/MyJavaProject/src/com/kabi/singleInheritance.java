package com.kabi;
//single inheritance
class TwoWheeler
{
	void noOfWheels()
	{
		System.out.println("I have two wheels");
	}
}
class Bike extends TwoWheeler
{
	void brandName()
	{
		System.out.println("Brand Name is Honda");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike();
		bike.noOfWheels();
		bike.brandName();
	}

}
