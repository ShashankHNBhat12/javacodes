package programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Batch 
{

	public static void main(String[] args)throws Throwable
	{
		
		FileOutputStream obj=new FileOutputStream("D:\\Batch.txt");
		String str="Shashank John Levi Kakashi ";
		obj.write(str.getBytes());
		System.out.println("File Created and DATA Written to file!");
		
		File f1=new File("D:\\Batch.txt");
		if(!f1.exists() || f1.length()<0)
		{
			System.out.println("File Not Exists!");
		}
		else
		{
			FileInputStream obj1=new FileInputStream(f1);
			int i;
			while((i=obj1.read())!=-1)
			{
				System.out.print((char)i);
			}
				
			obj1.close();
		}
		obj.close();
		
		
		
	}

}