package programs;

import java.util.Scanner;

public class Initial {

	public static void main(String[] args) {
		System.out.println("enter the first name");
		Scanner sc=new Scanner(System.in);
		String f=sc.nextLine();
		System.out.println("enter the last name ");
		String l=sc.nextLine();
		
		System.out.println("Result ="+(f.substring(0, 1).toUpperCase())+(l.substring(0, 1).toUpperCase()));
	}

}
