package programs;

import java.util.Scanner;

class NameErrorException extends Exception
{
	String ss;
	NameErrorException(String s)
	{
		ss=s;
	}
	public String toString()
	{
		return ss;
	}
	
}

class Age extends Exception
{
	String ss;
	Age(String s)
	{
		ss=s;
	}
	public String toString()
	{
		return ss;
	}
	
}
public class Empp extends Exception {
	

	public static void main(String[] args) {
		String s[]= {"jhon","adam","stone","daewi","trump"};
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("enter  the name");
			String d=sc.nextLine();
			boolean check=true;
			for(int i=0;i<s.length;i++)
			{
				if(s[i].equals(d))
				{
					throw new NameErrorException("Exception...");
				}
			}
			System.out.println("enter the age ");
			int a=sc.nextInt();
			if(a<18 || a>60)
			{
				throw new Age("Exception.....");
			}
		}
		catch(NameErrorException e)
		{
			System.out.println("same name not allowed!!!");
			System.out.println(e);
		}
		catch(Age d)
		{
			System.out.println("age limit exception!!!");
			System.out.println(d);
		}
		
		
	}

}
