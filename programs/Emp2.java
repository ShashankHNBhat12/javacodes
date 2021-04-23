package programs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class emp3
{
	int id;
	String name;
	emp3()
	{
		
	}
	public emp3(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	String dept;
	
	public void show()
	{
		System.out.println("Hello world");
	}
}

public class Emp2 {

	public static void main(String[] args) throws Exception {
		
		Class c=Class.forName("programs.emp3");
		System.out.println("Methods");
		Method m[]=c.getDeclaredMethods();
		for(Method i:m)
		{
			System.out.println(i);
		}
		
		System.out.println("Constructors");
		Constructor k[]=c.getDeclaredConstructors();
		for(Constructor j:k)
		{
			System.out.println(j);
		}
		
		
		

	}

}
