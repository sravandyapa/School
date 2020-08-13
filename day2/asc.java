import java.util.*;

class Demo
{
	
	static void X(int a,int b)
	{
		System.out.println(a+b);
	}
	
	static void X(String a, String b)
	{
		System.out.println(a+b);
	}
	
	static void X(int a, String b)
	{
		int c=0;
		for(int i=0;i<b.length();i++)
		{
			c+=(int)b.charAt(i);
		}
		System.out.println(a+c);
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		String in1 = sc.nextLine(),in2 = sc.nextLine();
		int i,c = sc.nextInt();
		
		if(c==1)
		{
			int a=0,b=0;
			for(i=0;i<in1.length();i++)
			{
				a+=(int)in1.charAt(i);
			}
			for(i=0;i<in2.length();i++)
			{
				b+=(int)in2.charAt(i);
			}
			X(a,b);
		}
		else if(c==2)
		{
			X(in1,in2);
		}
		else if(c==3)
		{
			
			X(Integer.valueOf(in1),in2);
		}
		else
		System.out.println("Invalid Operation");
		
		
		
	}
}