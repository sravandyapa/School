/*
Q.4: Create the following class as stated:

	A class called circle is designed as shown in the following class diagram. It contains:
		• Two private instance variables: radius (of the type double) and color (of the type
		String), with default value of 1.0 and "red", respectively.
		• Two overloaded constructors - a default constructor with no argument, and a
		constructor which takes a double argument for radius.
		• Two public methods: getRadius() and getArea(), which return the radius and area of
		this instance, respectively.
*/


class Circle
{
	private double radius = 1.0;
	private String color = "red";
	
	Circle()
	{
		
	}
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return 2*3.14*radius;
	}
	
}

public class Fourth
{
	public static void main(String [] args)
	{
		Circle c1 = new Circle();
		Circle c2 = new Circle(5.5);
		System.out.println("c1.Radius = "+c1.getRadius());
		System.out.println("c2.Radius = "+c2.getRadius());
		System.out.println("c1.Area = "+c1.getArea());
		System.out.println("c2.Area = "+c2.getArea());
	}
}
