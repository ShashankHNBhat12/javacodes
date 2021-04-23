package programs;
class Students implements Cloneable
{
	String fname,lname;

	public Students(String item, String item2) {
		super();
		this.fname = item;
		this.lname = item2;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}	
	
}

class Contact implements Cloneable
{
	int phno;
	String address;
	Students obj;

	public Contact(int phno, String address, Students obj) {
		super();
		this.phno = phno;
		this.address = address;
		this.obj = obj;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Contact v1=(Contact)super.clone();
		v1.obj=(Students)obj.clone();
		return v1;
	}

	@Override
	public String toString() {
		return "Contact phno=" + phno + ", address=" + address + ", obj=" + obj + "]";
	}
	
	
}


public class Copy {

	public static void main(String[] args) throws Exception {
		
		
		
		Students i=new Students("Hari","om");
		Contact j=new Contact(987654321,"17th street",i);
		
		Contact k=(Contact)i.clone();
		
		System.out.println("Student 1:: "+j);
		System.out.println("Student 2:: "+k);
		
	}

}
