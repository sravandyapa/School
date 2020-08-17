/*

Create two classes:

BaseClass
	The Rectangle class should have two data fields-width and height of int types. The class
	should have display() method, to print the width and height of the rectangle separated
	by space.
	
DerivedClass
	The RectangleArea class is derived from Rectangle class, i.e., it is the sub-class of
	Rectangle class.The class should have read_input() method, to read the values of width
	and height of the rectangle. The class should also overload the display() method to print
	the area (width*height) of the rectangle.

Input Format
	The first and only line of input contains two space separated integers denoting the
	width and
	height of the rectangle.

Constraints
	1 <= width, height <= 10^3
	Output Format
	The output should consist of:
	Print the width and height of the rectangle.
	In the second line, print the area of the rectangle.
	
*/

import java.util.*;

class Rectangle
{
	int width,height;
	
	void display(int width,int height)
	{
		System.out.println("Width : " + width + "\nHeight : " + height);
	}

}

class RectangleArea extends Rectangle
{
	void read_input()
	{
		while(true)
		{
			try
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter Width  : ");
				width = sc.nextInt();
				System.out.print("Enter Heigth : ");
				height = sc.nextInt();
				
			}
			catch(Exception e)
			{
				
			}
			finally
			{
				if((width>0 && height>0)&&(width<=1000 && height<=1000))
				{
					break;
				}
				else
				{
					System.out.println("Entered wrong detials");
				}
			}
			
		}
		
		
	}
	
	void display()
	{
		super.display(width,height);
		System.out.print("Area of the rectangle = " + width*height);
	}
}

public class Second
{
	public static void main(String [] args)
	{
		RectangleArea ra = new RectangleArea();
		
		ra.read_input();
		ra.display();
		
	}
}
	




































