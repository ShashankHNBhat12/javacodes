package programs;

import java.util.Scanner;

public class Tank {

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Garbage collocetion done");
		super.finalize();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank ob=new Tank();
		Scanner sc=new Scanner(System.in);
		System.out.println("Clean the tank yes=1 or no=2");
		int a=sc.nextInt();
		if(a==1)
		{
		ob=null;
		System.gc();
		}
		else
		{
			System.out.println("Garbage collocetion not done");
		}

	}

}
