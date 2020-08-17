/*
Q.5: Print the sum, difference and product of two complex numbers by creating a class named
	'Complex' with separate methods for each operation whose real and imaginary parts are
	entered by user.
*/

import java.util.*;

class Complex
{
	int fi,fr,si,sr;
	
	Complex()
	{
		int flag=1;
		Scanner sc = new Scanner(System.in);
		while(flag==1)
		{
			try
			{
				System.out.print("Enter First real  = ");
				fr = sc.nextInt();
				System.out.print("Enter First img   = ");
				fi = sc.nextInt();
				System.out.print("Enter Second real = ");
				sr = sc.nextInt();
				System.out.print("Enter Second img  = ");
				si = sc.nextInt();
				flag=0;
			}
			catch(Exception e)
			{
				System.out.println("Please give valid input");
				flag=1;
			}
			
		}
	}
	
	void add()
	{
		System.out.println("  " + fr + " + " + fi + "i\n" + "+ " + sr + " + " + si + "i" );
		System.out.println("------------------");
		System.out.println("  " + (fr+sr) + " + " + (fi+si) + "i");
		System.out.println("------------------");
	}
	
	void sub()
	{
		System.out.println("  " + fr + " + " + fi + "i\n" + "- " + sr + " + " + si + "i" );
		System.out.println("------------------");
		System.out.println("  " + (fr-sr) + " + " + (fi-si) + "i");
		System.out.println("------------------");
	}
	
	void mul()
	{
		System.out.println("  " + fr + " + " + fi + "i\n" + "x " + sr + " + " + si + "i" );
		System.out.println("------------------");
		System.out.println("  " + (fr*sr - fi*si) +" + "+(fr*si + sr*fi) + "i");
		System.out.println("------------------");
	}
	
}
public class Five
{
	public static void main(String[] args)
	{
		Complex c = new Complex();
		c.add();
		c.sub();
		c.mul();
	}
}