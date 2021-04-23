package programs;

public class Thread4 extends Thread {
	

		@Override
		public void run()
		{

			System.out.println("Current Thread Name:: "+Thread.currentThread().getName());
			
			
			System.out.println("Thread Name:: "+Thread.currentThread().getName());
			
			System.out.println("Current Thread Priority:: "+Thread.currentThread().getPriority());
			
			System.out.println("Active Threads?? "+Thread.currentThread().activeCount());
			
			System.out.println("Thread Alive?? "+Thread.currentThread().isAlive());
			
			
			try
			{
				for(int i=0;i<5;i++)
				{
					Thread.sleep(10000);//2 seconds
					System.out.println("Child Thread 1 :: "+i + " "+Thread.currentThread().getName());
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("Child Thread 1 enters into DEAD state!");
			System.out.println("Child Thread 1 Completed!");
			}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Thread4 t1=new Thread4();
		Thread4 t2=new Thread4();
		Thread4 t3=new Thread4();
		Thread4 t4=new Thread4();
		
		t1.setName("First Thread");
		t2.setName("Second Thread");
		t3.setName("Third Thread");
		t4.setName("fourth Thread");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		
		System.out.println("Main Thread completed!");

	}

}
