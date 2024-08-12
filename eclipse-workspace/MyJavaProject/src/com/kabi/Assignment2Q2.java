package com.kabi;
class Dog
{
	String dogName;
	String dogBreed;
	Dog(String dogName,String dogBreed)
	{
		this.dogName = dogName;
		this.dogBreed = dogBreed;
	}
	void set(String dogName , String dogBreed)
	{
		this.dogName = dogName;
		this.dogBreed=dogBreed;
		System.out.println("Dog name is : "+dogName);
		System.out.println("Dog breed is :"+dogBreed);
	}
}
public class Assignment2Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj = new Dog("Tommy","Doberman");
		obj.set("Subramani","Dashhund");
		obj.set("Jimmy","Pomerian");
	}

}
