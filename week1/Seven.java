/*
Q.7: Write a program, creating a Triangle class which contains a method that takes three
	parameters of the three sides of the triangle, ‘a’, ‘b’, ‘c’, and returns you with the area of the
	triangle and print it.
*/


class Triangle
{
	static double getArea(double a,double b,double c)
	{
		if(a<0||b<0||c<0)
		{
			System.out.println("values should be positive");
			return 0;
		}
		else
		{
			double s = (a+b+c)/2,area;
			area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.println("Area of the triangle = " + area);
			return area;
		}
	}
}

public class Seven
{
	public static void main(String [] args)
	{
		Triangle.getArea(18,24,30);
		Triangle.getArea(10,-20,30);
	}
}