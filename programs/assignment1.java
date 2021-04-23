package programs;
import java.util.*;
public class assignment1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=8;
		int b=2345;
		double c=(a+b)/3;
		double d=(c%5)*5;
		System.out.println("question one op "+d);
		
		int e=8;
		e+=2345;
		e/=3;
		e%=5;
		e*=5;
		System.out.println("que two "+e);
		
		int tot=90;
		int boys=45;
		int girls=tot-boys;
		double totalA=0.5;
		int totala=(int)(tot*totalA);
		int res=(totala-20);
		System.out.println("total girls count"+res);
		
		System.out.println("\n\n");
		System.out.println("fourth question ");
		
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter roll number");
		int roll=sc.nextInt();
		sc.nextLine();
		System.out.println("enter interest");
		String intrest=sc.nextLine();
		
		System.out.println("Hey, my name is "+name+" and my roll number is "+roll+". My field of interest are "+intrest);
		
		System.out.println("\n\n");
		System.out.println("fifth question ");
		
		System.out.println("enter salary ");
		int sal=sc.nextInt();
		System.out.println("enter your service years ");
		int ser=sc.nextInt();
		 
		if(ser>6)
		{
			System.out.println("net bonus is"+ sal*0.1);
		}
		else 
		{
			System.out.println("no bonus :(");
		}
		
		System.out.println("\n\n sixth question ");
		
		System.out.println("enter the marks");
		int m=sc.nextInt();
		if(m<25)
		{
			System.out.println("GRADE IS F");
		}
		else if(m<46)
		{
			System.out.println("GRADE IS E");
		}
		else if(m<51)
		{
			System.out.println("GRADE IS ");
		}
		else if(m<81)
		{
			System.out.println("GRADE IS B");
		}
		else
		{
			System.out.println("GRADE IS A");
		}
		

		System.out.println("\n\n 7&8 question");
		
		System.out.println("enter no. of classes held");
		int held=sc.nextInt();
		System.out.println("enter no. of classes attended");
		int att=sc.nextInt();
		sc.nextLine();
		System.out.println("had any medical issue(y\n)");
		String med=sc.next();
		String s3="y";
		double avg=(att/held)*100;
		
		if(avg>70 ||  med.equals(s3))
		{
			System.out.println("YOU CAN ATTEND");
		}
		else
		{
			System.out.println("you cant attend!!!!!!");
		}
		
		
		System.out.println("\n\n question nine");
		
		System.out.println("enter the product no(1 or 2 or 3)");
		int no=sc.nextInt();
		System.out.println("enter the number of product sold");
		int sold=sc.nextInt();
		double p1=22.5;
		double p2=44.5;
		double p3=3.5;
		
		switch(no)
		{
		case 1:
			System.out.println("product price is 22.5");
			System.out.println("total cost is "+(p1*sold));
			break;
		case 2:
			System.out.println("product price is 22.5");
			System.out.println("total cost is "+(p2*sold));
			break;
		case 3:
			System.out.println("product price is 22.5");
			System.out.println("total cost is "+(p3*sold));
			break;
		default:
			System.out.println("invalid no");
			break;
			
		
		}
		
		System.out.println("\n\n last question");
		
		System.out.println("enter no. of eggs");
		int egg=sc.nextInt();
		int gross=(egg-(egg%144))/144;
		int remgross=egg-(gross*144);
		int dozen=(remgross-(remgross%12))/12;
		int rem=egg-(gross*144)-(dozen*12);
		System.out.println("gross is "+gross +" dozen is "+dozen+"remaining is "+rem);
		
		
		
		
		

	}

}
