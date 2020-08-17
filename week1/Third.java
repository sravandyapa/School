/*
Q.3: Write a program, creating an Employee class containing details of empId, empName,
	empDesignation, empSalary and empLocation. Create necessary methods like getters, setters
	and toString. Create 10 instances of the same.
The problem is to generate stream of all the instances and do the following operations:
	a. Print the name of all the employees.
	b. Print all the salaries which are greater than 50,000/-
	c. Print all the locations starting with the letter ‘M’
	d. Print all the designations ending with ‘E’
*/

import java.util.*;

class Employee
{
	int empId,empSalary;
	String	empName,empDesignation,empLocation;
	
	void setter()
	{
		int flag=1;
		while(flag==1)
		{
			try
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter empId          = ");
				empId = sc.nextInt();
				System.out.print("Enter empSalary      = ");
				empSalary = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter empName        = ");
				empName = sc.nextLine();
				System.out.print("Enter empDesignation = ");
				empDesignation = sc.nextLine();
				System.out.print("Enter empLocation    = ");
				empLocation = sc.nextLine();
				flag=0;
			}
			catch(Exception e)
			{
				flag=1;
				System.out.println("Please Enter Valid data ");
			}
		}
	}
	
	int getId()
	{
		return empId;
	}
	int getSalary()
	{
		return empSalary;
	}
	String getName()
	{
		return empName;
	}
	String getLocation()
	{
		return empLocation;
	}
	String getDesignation()
	{
		return empDesignation;
	}
	

	
}

public class Third
{
	public static void main(String [] args)
	{
		List<Employee> emp = new ArrayList<Employee>();
		 
		for(int i=0;i<2;i++)
		{
			Employee e = new Employee();
			e.setter();
			emp.add(e);
		}
		
		System.out.println("Names of the emp's are\n{");
		emp.forEach(e -> System.out.println(e.getName()));
		System.out.println("}\nSalaries greater than 50000\n{");
		emp.stream().map(e->e.getSalary()).filter(n->n>50000).forEach(System.out::println);
		System.out.println("}\nLocations starting with S\n{");
		emp.stream().map(e->e.getLocation()).filter(s->s.charAt(0)=='M').forEach(System.out::println);
		System.out.println("}\nDesignations ending with E");
		emp.stream().map(e->e.getDesignation()).filter(s->s.charAt(s.length()-1)=='E').forEach(System.out::println);
		
		
	}
}