package programs;
import java.util.*;

abstract class Sbank
{
	int accNo;  //customer account number with Bank
	String custName; //customer name
	int custGender;  //customer gender 1 = Male, 2 =Female
	String custJob;  //customer job positions
	double curBal;  //customer balance in the bank account
	//public String toString();

	Sbank()
	{
		
	}
	Sbank(int a,String b,int c,String d,double e)
	{
		accNo=a;
		custName=b;
		custGender=c;
		custJob=d;
		curBal=e;
		
	}

	
	public abstract double calcBalance();

}

class Saving extends Sbank
{
double savRate=0.05;  //percent interest rate per year
Saving()
{
	
}
Saving(int a,String b,int c,String d,double e)
{
	super(a,b,c,d,e);
	
}
@Override
public double calcBalance() {
	
	return (curBal + (savRate * curBal));
}
}

class Current extends Sbank
{
boolean fixedDep;  //whether the customer keeps the fixed// deposit with the bank of not
double curRate=0.09;  //percent interest rate per year
Current(int a,String b,int c,String d,double e)
{
	super(a,b,c,d,e);
	
}
@Override
public double calcBalance() {
	
	return (curBal + (curRate * curBal));
}
}

public abstract  class Bank {
	
	
	public static void main(String[] args) {
		Saving s[]=new Saving[3];
		Current c[]=new Current[2];
		s[0]=new Saving(111,"shashank",1,"software engineer",10001);
		s[1]=new Saving(112,"john",1,"software engineer",12001);
		s[2]=new Saving(113,"dean",1,"alchemist",2020);
		
		c[0]=new Current(114,"ariana",2,"software engineer",95851);
		c[1]=new Current(115,"lalalisa",2,"singer",9999);
		
		System.out.println("enter the acc no ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean check=true;
		
		try
		{
		for(int i=0;i<c.length;i++)
		{
			if(n==c[i].accNo)
			{
		System.out.println("acc no "+c[i].accNo+" name "+c[i].custName+"  account balance="+c[i].calcBalance());
			check=false;
			break;
			}
			
		}
		}
		catch(Exception e)
		{
			
		}
		
		try
		{
		for(int i=0;i<s.length;i++)
		{
			if(n==s[i].accNo)
			{
		System.out.println("acc no "+s[i].accNo+" name "+s[i].custName+"  account balance="+s[i].calcBalance());
		check=false;
		break;
			}
		}
		}
		
		catch(Exception d)
		{
			
		}
		
		if(check)
		{
			System.out.println("NO ACCOUNT FOUND!!");
		}
		
		
		
		System.out.println("\n\nCurrent account details are ");
		try
		{
		for(int i=0;i<c.length;i++)
		{
		System.out.println("acc no "+c[i].accNo+" name "+c[i].custName+"  account balance="+c[i].calcBalance());
		}
		}
		catch(Exception e)
		{
			
		}
		
		

	}

}
