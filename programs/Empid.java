package programs;
import java.util.*;

class InvalidId extends Exception
{
	String ss;
	InvalidId(String s)
	{
		ss=s;
	}
	public String toString()
	{
		return ss;
	}
}

class id
{
	public static int i=100;
	int dob;
	String name;
	String id;
	id()
	{
		
	}
	id(int a,String b)
	{
		dob=a;
		name=b;
		id=(dob%100)+"-"+b.substring(0, 1).toUpperCase()+"-"+(i++);
	}
	void show()
	{
		System.out.println(id);
	}
}

public class Empid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		id d[]=new id[100];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of employees ");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter name and year of birth");
			String s=sc.nextLine();
			int y=sc.nextInt();
			sc.nextLine();
			d[i]=new id(y,s);
			System.out.println("your id is ");
			d[i].show();
		}
		
		System.out.println("enter id to check details ");
		
			String c=sc.nextLine();
			boolean check=true;
			try
			{
			for(int i=0;i<n;i++)
			{
				if(c.equals(d[i].id))
				{
					System.out.println("employee name="+d[i].name+" and year of birth "+d[i].dob);
					check=false;
				}
			}
			if(check)
			{
				throw new InvalidId("INVALID ID EXCEPTON!!!!");
			}
		
		}
			catch(InvalidId e)
			{
				System.out.println(e);
			}

	}

}
