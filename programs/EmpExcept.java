package programs;
import java.util.*;

class LowSalException extends Exception
{
	String ss;
	LowSalException(String s)
	{
		ss=s;
	}
	public String toString()
	{
		return ss;
	}
}
class check
{
	int Id ;                   
	String Name ;      
	String desin ;             
	double b;                        
	double hra;
	check()
	{
		
	}
	check(int a,String be,String c,double d)
	{
		Id=a;
		Name=be;
		desin=c;
		b=d;
		try
		{
			if(d<5000)
	
		{
			throw new LowSalException("excption");
		}
	}
		catch(LowSalException e)
		{
			System.out.println("Low salary!!!!");
			System.out.println(e);
		}
	
	}

}

public class EmpExcept {

	public static void main(String[] args) {
		check c=new check(1,"shashank","HR",45454);
		check d=new check(2,"jhon","Manager",454);

	}

}
