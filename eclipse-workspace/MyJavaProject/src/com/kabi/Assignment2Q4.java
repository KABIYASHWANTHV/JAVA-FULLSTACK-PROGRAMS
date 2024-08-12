package com.kabi;
class Circle
{
	double circleRadius;
	Circle(double circleRadius)
	{
		this.circleRadius = circleRadius;
	}
	void circleArea()
	{
		double area = 3.14 * circleRadius * circleRadius;
		System.out.println("Area of circle : "+area);
	}
	void circleCircumference()
	{
		double circumference = 2 * 3.14 * circleRadius;
		System.out.println("Circumference of circle : "+circumference);
	}
}
public class Assignment2Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle(20);
		obj.circleArea();
		obj.circleCircumference();
	}

}
