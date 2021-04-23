package programs;

import java.util.HashMap;
import java.util.Map;

public class Telephone {
	

	public static void main(String[] args) {
		HashMap<String,Long> obj=new HashMap<String,Long>();
		obj.put("Abrham",9876754673l);
		obj.put("Ben",7483683947l);
		obj.put("Diana",8475768948l);
		obj.put("Harry",8888899999l);
		obj.put("jhon",8989898989l);
		
		for(Map.Entry<String, Long> s1: obj.entrySet())
		{
			System.out.println("Name and Mobile ::"+s1.getKey() + " "+s1.getValue());
		}

	}

}
