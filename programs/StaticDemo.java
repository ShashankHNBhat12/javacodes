package programs;

public class StaticDemo {
	static String name=new String();
	static String hobby="Gamer";
	static
	{
		name="jhon";
		System.out.println("name in static block "+name);
	}
	
	static void show()
	{
		System.out.println("name="+name+" hobby="+hobby);
	}
	public static void main(String[] args) {
		show();
	
	}

}
