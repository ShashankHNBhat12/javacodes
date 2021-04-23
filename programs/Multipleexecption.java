package programs;

import java.util.InputMismatchException;

public class Multipleexecption {

	public static void main(String args[])
	{
		try
		{
			
			int a[]=new int[-1];
			
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("negative array size ");
			e.printStackTrace();
		}
		try
		{
			int b[]=new int[1];
			b[3]=3;
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bound");
			e.printStackTrace();
		}
		try
		{
			int n=5;
			int c[]=new int[2];
			c[n]=4;
			
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("index out of bound ");
			e.printStackTrace();
		}
		try
		{
			String s=null;
			if(s.equals("sjdf"))
			{
			System.out.println(s);
			
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception ");
			e.printStackTrace();
		}
		try
		{
			int d=0;
			System.out.println(3/d);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception ");
			e.printStackTrace();
		}
		try
		{
			String f="javac";
			System.out.println(f.charAt(44));
			
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String index out of bound ");
			e.printStackTrace();
		}
		
	}

}
