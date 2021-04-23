package programs;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.*;
class empp1 implements Serializable
{
	int id;
	transient int sal;
	  String name;
	@Override
	public String toString() {
		return "empp [id=" + id + ", sal=" + sal + ", name=" + name + "]";
	}
	empp1()
	{
		
	}
	public empp1(int id, int sal, String name) {
		super();
		this.id = id;
		this.sal = sal;
		this.name = name;
	}
	
}

public class Serial {
	
	

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int id,sal;
		String n;
		System.out.println("enter the id,name and salary");
		id=sc.nextInt();
		sc.nextLine();
		n=sc.nextLine();
		sal=sc.nextInt();
		empp1 ob=new empp1(id,sal,n);
		
		FileOutputStream f1=new FileOutputStream("D:\\Emp.txt");
		ObjectOutputStream obj1=new ObjectOutputStream(f1);
		
		obj1.writeObject(ob);
		System.out.println("Book Data Serialized!");
		obj1.close();
		
		
		FileInputStream f2=new FileInputStream("D:\\Emp.txt");
		ObjectInputStream obj2=new ObjectInputStream(f2);
		empp1 b4=(empp1)obj2.readObject();
		System.out.println("Data DeSerialized!"+b4.toString());
		obj2.close();

	}

}
