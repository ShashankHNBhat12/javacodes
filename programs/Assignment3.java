package programs;

class Vehicle
{
	static String color=new String();
	static int wheel;
	static String model=new String();
	
	Vehicle()
	{
		
	}
	Vehicle(String a,int b,String c)
	{
		color=a;
		wheel=b;
		model=c;
	}
	
	void show()
	{
		System.out.println("Vehicle infromation");
		
		System.out.println("color is "+this.color+" , wheels="+this.wheel+" and "+this.model+ " model");
	}
	
}

class Truck extends Vehicle
{
	void show()
	{
		System.out.println("Truck infromation");
		
	}
	
}

class Bus extends Vehicle
{
	int regno;
	Bus()
	{
		
	}
	Bus(int a)
	{
		this.regno=a;
	}
	void show()
	{
		super.show();
		System.out.println("Bus infromation");
		System.out.println("reg no is "+regno);
		
	}
	
}

class Car extends Vehicle
{
	int regno;
	Car()
	{
		
	}
	Car(int a)
	{
		this.regno=a;
	}
	void show()
	{
		System.out.println("car infromation");
		System.out.println("reg no is "+regno);
		
	}
}

public class Assignment3 {

	public static void main(String[] args) {
		Vehicle v=new Vehicle("red",4,"bs6");
		Bus b=new Bus(10122);
		//v.show();
		b.show();
		Car c=new Car(2211);
		c.show();
		
		//isntanceof
		
		String nul=null;
		int a=1;
		if(nul instanceof String)
		{
			System.out.println(" valid ");
		}
		else
		{
			System.out.println("invalid");
		}

	}

}
