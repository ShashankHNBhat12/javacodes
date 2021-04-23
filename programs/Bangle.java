package programs;

import java.util.LinkedList;
import java.util.Queue;

public class Bangle {

	public static void main(String[] args) {
		System.out.println("Adding banles sequence in queue is");
		Queue obj=new LinkedList();
		for(int i=1;i<=12;i++)
		{
			System.out.print("  "+i);
			obj.add(i);
		}
		
		System.out.println("\n Removing bangles sequence in queue is");
		for(int i=1;i<=12;i++)
		{
			System.out.print(" "+obj.remove());
		}
		}

	}


