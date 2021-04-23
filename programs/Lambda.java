package programs;

import java.util.LinkedList;

interface calcee
{
	public int add(int a,int b);
	
}
public class Lambda {
	public static void main(String[] args) 
	{
	
	calcee ob=(a,b)->(a+b);//no return keyword
	System.out.println("Result "+ob.add(12, 12));
	
	LinkedList<String> obj =new LinkedList();
	obj.add("Apple");
	obj.add("12112");
	obj.forEach(
			(k)->System.out.println(k)
			);
	}
	}

