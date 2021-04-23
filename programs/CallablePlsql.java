package programs;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class CallablePlsql {
	public static void main(String args[]) throws Exception
	{
Class.forName("oracle.jdbc.driver.OracleDriver");
		
	
		Connection con=
	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","shashank");
	Scanner s1=new Scanner(System.in);
	System.out.println("Eno:: ");
	int id=s1.nextInt();
	CallableStatement cs=
			con.prepareCall("{call updatesomething(?,?)}");

	cs.setInt(1, id);
	cs.registerOutParameter(2,java.sql.Types.VARCHAR);
	
	
	cs.executeQuery();
	String name1=cs.getString(2);
	
	System.out.println("Name "+name1);
	con.close();
	}

}
