package programs;
import java.util.*;
 public class Sample2 {
	 static int i;
	 int j;
	 static
	 {
		 i=1;
		 //this.j=9;
		 System.out.println("print i="+i);
	 }

	public static void main(String[] args) {
		byte a=10;
		int b=100;
		long c=93939;
		short d=99;
		boolean e=true;
		String s="check";
		char x='a';
		
		System.out.println(a+ " "+b + " "+c+ " "+d+ " "+e+ " "+s+ " "+x);
		
		float dd=2727.9898f;
		System.out.println(dd);
		long l=97979797966l;
		System.out.println(dd);
		
		int a2=x;
		System.out.println(a2);
		
		x++;
		System.out.println(x);
		x--;
		x--;
		System.out.println(++x);

	}

}
