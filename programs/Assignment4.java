package programs;

public class Assignment4 {

	public static void main(String[] args) {
		String s="The quick brown fox jumps over the lazy dog";
		
		System.out.println("12th index is "+s.charAt(12));
		System.out.println("is present="+s.contains("is"));
		System.out.println(s.concat(" and killed it"));
		//StringBuilder a=new StringBuilder(s);
		System.out.println("ends with dogs+"+s.endsWith("dogs"));
		System.out.println();
		System.out.println("The quick brown Fox jumps over the lazy Dog comparision="+s.equals("The quick brown Fox jumps over the lazy Dog"));
		System.out.println("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG comparision="+s.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		System.out.println("a at="+s.indexOf('a'));
		System.out.println("last e at "+s.lastIndexOf('e'));
		System.out.println("length is "+s.length());
		System.out.println("comparision is "+s.compareTo("The quick brown Fox jumps over the lazy Dog"));
		System.out.println("After replace "+s.replace("The", "A"));
		String[] a=s.split("jumps");
		for(String i:a)
		{
			System.out.println(i);
		}
		System.out.println("animal names are:");
		for(String i:a)
		{
			
			if(i.contains("fox") || i.contains("dog"))
			{
			System.out.println(i);
			}
			}
		
		System.out.println("lower case is "+s.toLowerCase());
		System.out.println("upper case is "+s.toUpperCase());
		
		//2nd question
		
		int count=0;
		String b[]=s.split(" ");
		for(String j:b)
		{
			//System.out.println(j);
			
		}
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='o')
			{
				count++;
			}
			
		}
		{
			//System.out.println(j);
			
		}
		System.out.println("total character is "+count);
		
	}

}
