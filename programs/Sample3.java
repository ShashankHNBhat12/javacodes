/*package programs;

public class Sample3 {

}

*/
package programs;

import java.util.*;

interface A1
{
	void add();
	void del();
}
abstract class Abc implements A1
{
	public void add()
	{
	System.out.println("ABC::ADD()");	
	}
}
class XYZ extends Abc
{

	@Override
	public void del() 
	{
	System.out.println("XYZ:del()");		
	}
	
}
public class Sample3{

	public static void main(String[] args)
	{
	
	XYZ obj=new XYZ();
	obj.add();
	obj.del();
	}

}
