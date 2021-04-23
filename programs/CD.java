package programs;

import java.util.ArrayList;
import java.util.Collections;

class Singer implements Comparable<Singer>
{
	String name;
	String title;
	@Override
	public String toString() {
		return "Singer name=" + name + ", Song title=" + title + " ";
	}
	public Singer(String name, String title) {
		super();
		this.name = name;
		this.title = title;
	}
	@Override
	public int compareTo(Singer b) {
		if(name.equals(b.name))
		{
			
			return 0;
		}
		else if((name.compareTo(name))>0)
		{
		
			return 1;
		}
		else
		{
			
			return -1;
		}
	}
	
}
public class CD 

{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singer ob=new Singer("Camilla","Havana");
		Singer ob1=new Singer("J Balvin","Positivo");
		Singer ob2=new Singer("Bad bunny","Mia");
		

		ArrayList<Singer> obj=new ArrayList<Singer>();
		obj.add(ob);
		obj.add(ob1);
		obj.add(ob2);
		
		System.out.println("Before Sorting::");
		for(Singer t:obj)
		{
			System.out.println(t);
		}
		
		Collections.sort(obj);

		System.out.println("After Sorting::");
		for(Singer t:obj)
		{
			System.out.println(t);
		}
		

	}

}
