package programs;
import java.util.*;

class Lib
{
	String book;
	String newspapaer;
	String video;
	@Override
	public String toString() {
		return "Lib [book=" + book + ", newspapaer=" + newspapaer + ", video=" + video + "]";
		
	}
	public Lib()
	{
		
	}
	public Lib(String book, String newspapaer, String video) {
		super();
		this.book = book;
		this.newspapaer = newspapaer;
		this.video = video;
	}
	
	
}
public class Q3 {

	public static void main(String[] args) {
		Lib a=new Lib("Narto","manga","funimation");
		Lib b=new Lib("SoloLevelling","manhwa","crunchyroll");
		Lib c=new Lib("GOH","webtoon","crunchyroll");
		
		LinkedList obj=new LinkedList();
		
		obj.add(a);
		obj.add(b);
		obj.add(c);
		System.out.println("Non-Generic output");
		for(Object i : obj)
		{
			System.out.println(i.toString());
		}
		
		LinkedList<Lib> obj1=new LinkedList<Lib>();
		
		obj1.add(a);
		obj1.add(b);
		obj1.add(c);
		System.out.println("Generic output");
		for(Object i : obj1)
		{
			System.out.println(i.toString());
		}
		
		
		
		

	}

}
