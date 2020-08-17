/*
Q.6: Write a program, creating a class which contains a method that would print the
	information (name, year of joining, salary, address) of three employees by creating a class
	named 'Employee'. The output should be as follows:

	Name 	Year of joining 	Address
	Robert	 1994 				64C- WallStreet
	Sam		 2000 				68D- WallStreet
	John	 1999 				26B- WallStreet
*/


class Employee
{
	String name,address,year;
	
	Employee(String name,String year,String address)
	{
		this.name = name;
		this.year = year;
		this.address = address;
	}
	
	void print()
	{
		int count=0,i=0;
		System.out.print(this.name);
		count=20-this.name.length();
		for(i=0;i<count;i++)
		{
			System.out.print(" ");
		}
		
		System.out.print(this.year);
		count=20-this.year.length();
		for(i=0;i<count;i++)
		{
			System.out.print(" ");
		}
		
		System.out.print(this.address);
		System.out.println("");
	}
	
}

public class six
{
	public static void main(String [] args)
	{
		Employee emp [] = new Employee[3];
		emp[0] = new Employee("Robert","1994","64C- WallStreet");
		emp[1] = new Employee("Sam","2000","68D- WallStreet");
		emp[2] = new Employee("John","1999","26B- WallStreet");
		
		System.out.println("Name                Year of joining     Address");
		for(int i=0;i<emp.length;i++)
		{
			emp[i].print();
		}
		
	}
}