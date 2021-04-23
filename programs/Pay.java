package programs;
import java.util.*;

interface Payable
{
	void getPayInfo ();
}

class Dailyw implements Payable
{
	int hours;
	Dailyw()
	{
		
	}
	Dailyw(int n)
	{
		hours=n;
	}

	@Override
	public void getPayInfo() {
		System.out.println("Total salary of daily worker is "+hours*100);
		
	}
	
}

class Salw implements Payable
{
	int days;
	Salw()
	{
		
	}
	Salw(int n)
	{
		days=n;
	}

	@Override
	public void getPayInfo() {
		System.out.println("Total salary of salaried worker is "+days*1000);
		
	}
	
}

public class Pay {

	public static void main(String[] args) {
		Salw ob=new Salw(22);
		Dailyw o=new Dailyw(174);
		ob.getPayInfo();
		o.getPayInfo();

	}

}
