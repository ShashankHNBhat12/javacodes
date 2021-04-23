package programs;

import programs.BankAccount.Interest;

public class InnerBank {
	static int amt=0;
	void deposit(int a)
	{
		amt=amt+a;
	}
	void getbalance()
	{
		System.out.println(amt);
		
		class Interest1{
			void interesr()
			{
				System.out.println("interest amount "+(amt*0.12)/12  );
			}
		}
		Interest1 ob=new Interest1();
		ob.interesr();
		
	}
	void withdraw(int a)
	{
		amt=amt-a;
		System.out.println("remaining balance "+amt);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerBank a=new InnerBank();
		a.deposit(10000);
		a.getbalance();
		a.withdraw(11);
		
		
	}

}
