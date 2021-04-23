package programs;

import java.util.HashMap;
import java.util.Scanner;

public class Dict {

	public static void main(String[] args) {
		HashMap<String,String> obj=new HashMap<String,String>();
		obj.put("knife","sharp object to cut vegetable");
		obj.put("head","present in human body");
		obj.put("luck","sorry no luck");
		obj.put("bad","something not good");
		obj.put("mercy","heaven");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word");
		String s=sc.nextLine();
		
	System.out.println(obj.get(s));

	}

}
