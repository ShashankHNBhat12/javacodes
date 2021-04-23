package programs;
class Ab
{
	int a;
}

public class Finall {

	public static void main(String[] args) {
		Ab s=new Ab();
		s.a=1;
		try
		{
			System.out.println(s);
		}
		catch(Exception e)
		{
			System.out.println("error ");
		}
		finally
		{
			s=null;
			System.out.println(s);
		}

	}

}
