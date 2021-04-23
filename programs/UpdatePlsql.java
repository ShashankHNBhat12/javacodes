package programs;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePlsql {

	public static void main(String[] args) throws Exception {
Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		Connection con=
	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","shashank");
	Scanner s1=new Scanner(System.in);
	System.out.println("Eno:: ");
	int id=s1.nextInt();
	

	CallableStatement cs=
			con.prepareCall("{call updatesalary(?)}");

	cs.setInt(1,id);
	
	
	int rows=cs.executeUpdate();
	System.out.println(rows + "Record Inserted!");

	PreparedStatement ps1=con.prepareStatement("select * from employee");
	
	ResultSet rs=ps1.executeQuery();
	System.out.println("Eno\tName\tSalary\tDept");
	while(rs.next())
	{
		System.out.print(rs.getInt(1) + "\t\t");
		System.out.print(rs.getString(2) + "\t\t");
		System.out.print(rs.getInt(3) + "\t\t");
		System.out.println(rs.getString(4));
		
	}
	rs.close();
	con.close();



	}

}
