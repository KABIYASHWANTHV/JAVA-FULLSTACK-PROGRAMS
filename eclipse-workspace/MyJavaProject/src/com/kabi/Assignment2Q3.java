package com.kabi;
class Rectangle
{
	double rectWidth;
	double rectHeight;
	Rectangle(double rectWidth,double rectHeight)
	{
		this.rectWidth = rectWidth;
		this.rectHeight = rectHeight;
	}
	void rectArea()
	{
		double area = rectWidth*rectHeight;
		System.out.println("Area of rectangle : "+area);
	}
	void rectPerimeter()
	{
		double perimeter=(2*rectWidth)+(2*rectHeight);
		System.out.println("Perimeter of rectangle : "+ perimeter);
	}
}
public class Assignment2Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle(10,20);
		obj.rectArea();
		obj.rectPerimeter();
	}

}
