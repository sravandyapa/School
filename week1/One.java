/*

Q.1: Design a Calculator class which contains four lambda methods:

		a. add(a, b)
		b. difference(a, b)
		c. product(a, b)
		d. safeDivision(a, b)
		
Also design the main methods which pass actual parameters to test the Calculator class.

*/

interface cal
{
	void oper(int a,int b);
}

class Calculator
{
	
	void add(int a,int b)
	{
		cal add = (c,d) -> { System.out.println(c+d); };
		add.oper(a,b);
	}
	void sub(int a,int b)
	{
		cal sub = (c,d) -> { System.out.println(c-d); };
		sub.oper(a,b);
	}
	void mul(int a,int b)
	{
		cal mul = (c,d) -> { System.out.println(c*d); };
		mul.oper(a,b);
	}
	void div(int a,int b)
	{
		cal div = (c,e) -> { System.out.println(c/e); };
		div.oper(a,b);
	}
		
}

public class One
{
	public static void main(String [] args)
	{
		Calculator c = new Calculator();
		c.add(5,6);
		c.sub(5,6);
		c.mul(5,6);
		c.div(5,6);
	}
	
}