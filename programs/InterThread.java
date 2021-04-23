package programs;
class Calc12
{
	int i,j;
	public int mul() { return i*j;}
}
//child thread
class CalcService implements Runnable
{
Calc12 obj;
int[] a;
int b;

	public CalcService(Calc12 obj, int[] a, int b) {
	super();
	this.obj = obj;
	this.a = a;
	this.b = b;
}

	@Override
	public void run() 
	{
	try
	{
		System.out.println("Thread:: "+Thread.currentThread());
		//synchronizing Calc1 class object
		//synchronized block
		synchronized(obj)
		{
		for(int i=0;i<a.length;i++)	
		{
			obj.notify();
			obj.wait();	
			obj.i=a[i];
			obj.j=b;
			System.out.println("Hen laid egg "+obj.i+" farmer gain is "+obj.mul());
			
			
		}
		obj.notifyAll();//connects to MAIN THREAD!!!
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	
}
public class InterThread {

	public static void main(String[] args) throws Exception {
		Calc12 c=new Calc12();
		Thread t1=new Thread(new CalcService(c,
				new int[] {1,3,5,7,9},
				2
				));
		Thread t2=new Thread(new CalcService(c,
				new int[] {2,4,6,8,10},
				2
				));	
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("Main Thread Finished!");

	}

}
