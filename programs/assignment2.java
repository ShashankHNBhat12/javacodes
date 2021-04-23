package programs;
import java.util.*;

class sample
{
	static int totcount=0;
	sample(){
		this.totcount++;
	}
}

class empl
{
	String name;
	double salary;
	public empl(String a,double b)
	{
		this.name=a;
		this.salary=b;
		if(b<0)
		{
			this.salary=0;
		}
	}
	
	void display(empl d)
	{
		System.out.println("Name is "+d.name+" and raise is "+(d.salary*0.1)+" and yearly salary is "+((salary*12)+(d.salary*0.1)));
	}
}
class Calc1{
	 void add(int a,int b)
	{
		 System.out.println("sum is "+(a+b));
		
	}
	
	 void dif(int a,int b)
	{
		 System.out.println("diff is "+(a-b));
	}
	 void mul(int a,int b)
	{
		 System.out.println("mul is "+ (a*b));
	}
	
	void div(int a,int b)
	{
		System.out.println("division is "+(a/b));
	}
}

class Student{
	int roll;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	String name;
	int m1;
	int m2;
	int m3;
}
class shape
{
	public  void area(int a)
	{
		System.out.println("Area of square is "+(a*a));
	}
	public void area(int a,int b)
	{
		System.out.println("Area of rectangle is "+(a*b));
	}
	
	public void perimeter(int a,int b)
	{
		System.out.println("Perimeter of rectangle is "+(2*(a+b)));
	}
	
	public void perimeter(int a)
	{
		System.out.println("Perimeter of square is "+(4*a));
	}
}


public class assignment2 {
	
	
	
	public static void main(String args[])
			{
	
		//1
		Scanner sc=new Scanner(System.in);
		Calc1 c=new Calc1();
		c.add(12, 12);
		c.dif(12, 12);
		c.mul(12, 12);
		c.div(12, 12);
		
		//2
		System.out.println("enter the total no. of students");
		int n=sc.nextInt();
		sc.nextLine();
		Student[] arr=new Student[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=new Student();
			System.out.println("enter the name");
			String nam=sc.nextLine();
			arr[i].setName(nam);
			System.out.println("enter the 3 marks");
			int a1=sc.nextInt();
			int a2=sc.nextInt();
			int a3=sc.nextInt();
			arr[i].setM1(a1);
			arr[i].setM2(a2);
			arr[i].setM3(a3);
			arr[i].setRoll(i+1);
			sc.nextLine();
			
		}
		
		
		
		int max=0;
		int ref=1;
		for(int i=0;i<n;i++)
		{
			if(arr[i].getM2()>max)
			{
				max=arr[i].getM2();
				ref=i;
		}
		}
		
		System.out.println("roll number is"+arr[ref].getRoll()+" and highest mark of student in m2 "+arr[ref].getM2());
		
		//3
		
		
		shape ob=new shape();
		ob.area(3);
		ob.area(3,9);
		ob.perimeter(4);
		ob.perimeter(4,4);
		
	
		//4
		
		int arr1[]= {1,1,2,2,3,3,3,5,6,7,7,8,8};
		int che=-1;
		for(int j=0;j<arr1.length;j++)
		{
			int count=0;
			int r=arr1[j];
			
			for(int k=0;k<arr1.length;k++)
			{
				if(r==arr1[k] )
					count++;
				
			}
			if(che!=arr1[j])
			{
			System.out.println(" count of "+arr1[j]+" is "+count);
			}
			che=arr1[j];
		}
		
		//5
		 
		 
		boolean ch=true;
		while(ch)
		{
		System.out.println("enter the marks 1");
		int a=sc.nextInt();
		System.out.println("enter the marks 2");
		int b=sc.nextInt();
		if(a>100 || b>100 || a<0 || b<0)
		{
			
			System.out.println("invalid input");
			continue;
		}
		double ans=((a+b)/2);
		System.out.println("avg is "+ans);
		ch=false;
		
		}
		
		
		//7
		
		sample a1=new sample();
		sample a2=new sample();
		sample a3=new sample();
		System.out.println("NO. of objects created is "+a3.totcount);
		
		
		
		//8
		
		int[][] s=new int[4][];
		s[0]=new int[3];
		s[1]=new  int[4];
		s[2]=new int[4];
		s[3]=new  int[2];
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{
				s[i][j]=j+1;
			}
		}
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println("row number "+i+"empty seats left are ");
			
			for(int j=0;j<s[i].length;j++)
			{
				System.out.print(s[i][j]);
			}
			System.out.println();
		}
		
		
		
		//6
		
		empl e1=new empl("shashank",1000);
		empl e2=new empl("levi",1450);
		empl e3=new empl("killua",-88);
		e1.display(e1);
		e2.display(e2);
		e3.display(e3);
	
			}
	
	
}
