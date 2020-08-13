import java.util.*;

class SavingAmount
{
	private int savings;
	
	SavingAmount(int savings)
	{
		this.savings = savings;
	}
	
	void setter(int savings)
	{
		this.savings = savings;
	}
	
	void getter()
	{
		System.out.println("Your current savings are Rs " + savings);
	}
	
	void increment()
	{
		savings+=1000;
	}
	
	void decrement()
	{
		savings-=100;
	}
	
	void checkSavings()
	{
		if(savings>=1000)
		{
			System.out.println("Congratulations! You have saved a good amount");
		}
		else if(savings>=0&&savings<1000)
		{
			System.out.println("Insufficient saving!");
		}
		else
		{
			System.out.println("You are in debt");
		}
	}
	
}


class Demo
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		SavingAmount sa = new SavingAmount(amount);
		sa.decrement();
		sa.increment();
		sa.checkSavings();
		sa.getter();
		
	}
}

