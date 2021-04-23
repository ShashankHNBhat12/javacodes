package programs;
import java.util.*;

interface Drawable
{
	String drawingColor();
	String thickness ();
	
}
interface Fillable
{
	String fillingColor();
	int size();
}

class Line implements Drawable,Fillable
{

	@Override
	public String fillingColor() {
		//System.out.println("red");
		return "red";
		
	}

	@Override
	public int size() {
		//System.out.println("11");
		return 11;
		
	}

	@Override
	public String drawingColor() {
		//System.out.println("black");
		return "black";
	}

	@Override
	public String thickness() {
		//System.out.println("1.1 mm");
		return "1.1mm";
		
	}
	
}

public class Interfa {
	
	public static void main(String arfs[])
	{
		Line ob=new Line();
		System.out.println("Line size= "+ob.size()+" thickness= "+ob.thickness()+" drawing color is "+ob.drawingColor()+" filling color is "+ob.fillingColor());
		
	}

}
