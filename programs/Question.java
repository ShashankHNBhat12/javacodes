package programs;

import java.util.Scanner;

public class Question extends Thread {
	@Override
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			
			for(int i=0;i<5;i++)
			{
				Thread.sleep(1000);//2 seconds
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		} 
	
	public static void main(String[] args) {
		Question[] q=new Question[5];
		
		
		String[] que=new String[] {"Your name?","your age?","your gender?","your city?"};
		Scanner sc=new Scanner(System.in);
		String[] ans=new String[] {"levi","23","Male","leaf"};
		try {
			int count=0;
			
			for(int i=0;i<que.length;i++) {
				q[i]=new Question();
				q[i].start();
				String a=null;
				
				System.out.println(que[i]);
				
				Thread.sleep(1000);
				 
				a=sc.nextLine();
				
				if(a.equalsIgnoreCase(ans[i]) && q[i].isAlive())
					count++;
				
				else
					break;
			}
			if(count<4)
				System.out.println("Wrong answer or timeout :(");
			else
				System.out.println("All answers were correct :)");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	}


