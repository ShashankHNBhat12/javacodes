package programs;

public class BankAccount {
	static int amt=0;
	void deposit(int a)
	{
		amt=amt+a;
	}
	void getbalance()
	{
		System.out.println(amt);
	}
	void withdraw(int a)
	{
		amt=amt-a;
		System.out.println("remaining balance "+amt);
	}
	class Interest{
		void interesr()
		{
			System.out.println("interest amount "+(amt*0.12)/12  );
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount a=new BankAccount();
		a.deposit(10000);
		a.getbalance();
		a.withdraw(11);
		
		BankAccount.Interest b=a.new Interest();
		b.interesr();

	}

}
