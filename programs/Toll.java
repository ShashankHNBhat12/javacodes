package programs;

class Cars
{
	//thread safe method (locking)
	//synchronized method!!!!!!!!!!!!!!!!!
	synchronized void display(String s)
	{
		System.out.println(""+s);
		try
		{
			Thread.sleep(2000);
			System.out.println("\t PASSING ");
		}
		catch(Exception e)
		{
			System.out.println("Interrrupted!");
		}
		System.out.println(" \t .......toll collected ");//CLOSE
		
	}
}
class MyThread implements Runnable
{
	Cars p1;
	String s1;

	public MyThread(Cars p1, String s1) {
		super();
		this.p1 = p1;
		this.s1 = s1;
	}

	@Override
	public void run() 
	{
	p1.display(s1);//calling Parentheses class display method!!!!	
	}
	
}
public class Toll {
	
	public static void main(String[] args) throws Exception {
		Cars p1=new Cars();
		Thread t1=new Thread(new MyThread(p1,"CAR 1"));
		Thread t2=new Thread(new MyThread(p1,"CAR 2"));
		Thread t3=new Thread(new MyThread(p1,"CAR 3"));
		Thread t4=new Thread(new MyThread(p1,"CAR 4"));
	
		t1.start();
		t1.setName("Thread-A");
		t2.start();
		t2.setName("Thread-B");
		t3.start();
		t3.setName("Thread-C");
		t4.start();
		t4.setName("Thread-D");
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		System.out.println("Done collections!!!");
		

	}

}
