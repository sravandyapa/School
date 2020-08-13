
import java.util.*;
import java.io.*;

class Demo
{
	public static void main(String [] args) throws Exception
	{
		FileReader fr = new FileReader("pokemon.csv");
		BufferedReader br = new BufferedReader(fr);
		
		int count;
		String line,word;
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		while((line=br.readLine())!= null)
		{
			word = line.split(",")[1];
			if(hm.containsKey(word))
			{
				count=hm.get(word);
				hm.put(word,++count);
			}
			else
			{
				hm.put(word,1);
			}
		}
		
		for(String key : hm.keySet())
		{
			System.out.println(key + " : " + hm.get(key));
		}
		
	}
}