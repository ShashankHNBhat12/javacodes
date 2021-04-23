package programs;

import java.util.*;

public class Execeptions {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter input ");
			a=sc.nextInt();
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("input mismatch ");
		}
		try
		{
			String s="java";
			char c=s.charAt(44);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String index is out of range");
		}

	}

}
