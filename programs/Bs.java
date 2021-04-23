package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Bookstore 
{
	
	public Bookstore(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Book name=" + name + ", id=" + id + " ";
	}
	String name;
	int id;
	

}

class bnameSorting implements Comparator<Bookstore>
{

	@Override
	public int compare(Bookstore o1, Bookstore o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
public class Bs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bookstore b1=new Bookstore("Three misktakes of my life",6);
		Bookstore b2=new Bookstore("Sorry you are not my type",3);
		Bookstore b3=new Bookstore("Bagavadgita",1);
		
		

		ArrayList<Bookstore> obj=new ArrayList<Bookstore>();
		obj.add(b1);
		obj.add(b2);
		obj.add(b3);
		
		System.out.println("Before Sorting");
		for(Bookstore t:obj)
		{
			System.out.println(t);
		}

		Collections.sort(obj, new bnameSorting());
		//Collections.sort

		System.out.println("After Sorting");
		for(Bookstore t:obj)
		{
			System.out.println(t);
		}

	}

}
