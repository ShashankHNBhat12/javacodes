package programs;
class Employee
{
	String name;
	Employee()
	{
		
	}
	Employee(String n)
	{
		name=n;
	}
	
	
}
class Daily extends Employee
{
	static int a;
	static
	{
		a=100;
	
	}
	int hrs;

	Daily()
	{
		
	}
	Daily(String nam,int hours)
	{
		super(nam);
		this.hrs=hours;
	}
	
	void salary(Daily e)
	{
		if(e instanceof Daily)
		{
		System.out.println("Salary of "+super.name+" is "+(a*hrs));
		}
	}
	
}
class Salaried extends Employee
{
	static int b;
	int day;
	static
	{
		b=500;
	}
	Salaried(String nam,int days)
	{
		super(nam);
		day=days;
	}
	void salary()
	{
		System.out.println("Salary of "+super.name+" is "+(b*day));
	}
	
}
public class Worker {

	public static void main(String[] args) {
		
		Daily obj=new Daily("shashank",177);
		obj.salary(obj);
		Salaried ob=new Salaried("jhon wick",15);
		ob.salary();
	

	}

}
