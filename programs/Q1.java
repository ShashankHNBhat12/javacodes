package programs;

import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer a;
		HashSet<Integer> obj=new HashSet<Integer>();
		System.out.println("Enter the 10 numbers");
		for(int i=0;i<10;i++)
		{
			a=sc.nextInt();
			obj.add(a);
		}
		
		Iterator i1=obj.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		ArrayList o=new ArrayList(obj);
		
		System.out.println("Index list");
		for(Object i:o)
		{
			System.out.println("index of "+i+" is " +o.indexOf(i));
		}
		
	}

}
