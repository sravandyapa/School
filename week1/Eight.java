/*
Q.8: Write a program, creating a class containing the generic method which accepts only
	numbers, generating a custom exception when passed with the String value.
The functionality of the generic method is to print the 2/3 of the passed value.
*/

class Eight
{
	static <T> void method(T a)
	{
		if(a instanceof Integer)
		{
			int n = Integer.parseInt(String.valueOf(a));
			System.out.println("2/3 of "+n + " = " + (n*2)/3);
		}
		else
		{
			throw new ArithmeticException("Please use Integer");
		}
	}
	
	public static void main(String [] args)
	{
		try
		{
			method(10);
			method("method");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}