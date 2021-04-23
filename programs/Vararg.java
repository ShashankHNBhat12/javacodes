package programs;

public class Vararg {
	static void show(String ...x)
	{
		for(String i:x)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		show();
		show("java","python","c++");
		show(new String[] {"dot net","oracle"});

	}

}
