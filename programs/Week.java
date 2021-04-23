package programs;

import java.util.*;

public class Week {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		String[] s=new String[7];
		int count=0;
		obj.add("Monday");
		obj.add("Tuesday");
		obj.add("Wednesday");
		obj.add("Thursday");
		obj.add("Friday");
		obj.add("Saturday");
		obj.add("Sunday");
		
		for(Object i:obj)
		{
			System.out.println(i);
			s[count++]=(String)i;
		}
		
		System.out.println("Length of collection is "+obj.size());
		System.out.println("Array values ");
		
		for(String j:s)
		{
			System.out.println(j);
			
		}

	}

}
