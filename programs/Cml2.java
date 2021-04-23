package programs;
import java.util.*;

public class Cml2 {
	static int i=0;
	public static void main(String[] args)
	{
		i++;
		//String s=new String();
		System.out.println(args+"\n");
		System.out.println(args.length);
		String[] s=args;
		
		
		main();
		if(i!=2)
		
		{
		main(new String[] {"a","b"});
		}
		
	}
	public static void main()
	{
		System.out.println("\n printing second main ");
	}

}