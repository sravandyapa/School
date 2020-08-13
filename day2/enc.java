import java.util.*;
import java.util.regex.*;

class Secret
{
	static Boolean isAlpha(String secret)
	{
		return Pattern.matches("[a-zA-Z]*",secret);
	}
	
	static String asia(String secret)
	{
		if(isAlpha(secret))
		{
			String s="";
			for(int i=0;i<secret.length();i++)
				s+=(char)(secret.charAt(i)+2);
			return s;
		}
		else
		{
			return "Invalid message";
		}
	}
	
	static String dubai(String secret)
	{
		String s="";
		for(int i=secret.length()-1;i>=0;i--)
		{
			s+=secret.charAt(i);
		}
		return s;
	}
	
	static String unitedStates(String secret)
	{
		String s="";
		for(int i=0;i<secret.length()-1;i++)
			s+=(int)secret.charAt(i) + ".";
		s+=(int)secret.charAt(secret.length()-1);
		return s;
	}
	
}

class Demo extends Secret
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int locale [] = new int[n];
		String msg [] = new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			msg[i] = sc.nextLine();
		}
		
		for(int i=0;i<n;i++)
		{
			locale[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(locale[i]==0)
			{
				System.out.println(asia(msg[i]));
			}
			else if(locale[i]==1)
			{
				System.out.println(unitedStates(msg[i]));
			}
			else if(locale[i]==2)
			{
				System.out.println(dubai(msg[i]));
			}
			else
			{
				System.out.println("Invalid message");
			}
		}
		
	}
}




	