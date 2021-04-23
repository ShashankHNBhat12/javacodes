package programs;

public class AnonymusBank {
	static int amt=0;
	void deposit(int a)
	{
		amt=amt+a;
	}
	void getbalance()
	{
		System.out.println(amt);
		abstract class Interest{
			abstract void interesr();
			
		}
		Interest ob=new Interest() {

			@Override
			void interesr() {
				{
					System.out.println("interest amount "+(amt*0.12)/12  );
				}
				
			}
		};
		System.out.println("anonymous class execution ");
		ob.interesr();
	}
	void withdraw(int a)
	{
		amt=amt-a;
		System.out.println("remaining balance "+amt);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymusBank a=new AnonymusBank();
		a.deposit(10000);
		a.getbalance();
		a.withdraw(11);

	}

}
