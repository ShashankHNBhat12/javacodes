package programs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.*;

public class Jdbccon {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
	
		Connection con=
	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","System","shashank");
		Statement st=con.createStatement();
		
		/*
		Scanner s1=new Scanner(System.in);
		System.out.println("Eno");
		int a1=s1.nextInt();
		s1.nextLine();
		System.out.println("ename ");
		String b1=s1.nextLine();
		System.out.println("Salary");
		int c1=s1.nextInt();
		s1.nextLine();
		System.out.println("Dept");
		String d1=s1.nextLine();
		
		System.out.println("Before insertion");
		*/
		String querry="select * from bank where custid=30063";
		java.sql.Statement stmt2=con.createStatement();
		ResultSet rs3=((java.sql.Statement) stmt2).executeQuery(querry);
		if(!rs3.next())
		{
			System.out.println("Details not found while debiting amount!!");
		}
		else
		{
			
			
			System.out.println("your account balance "+rs3.getInt(4));
			
		}
		
		/*
		ResultSet rs=st.executeQuery("select * from employee");
		while(rs.next())
		{
			int a=rs.getInt(1);
			String b=rs.getString(2);
			float c=rs.getInt(3);
			String d=rs.getString(4);
			System.out.println(a+ " "+b + " "+c + " "+d);
		}
		

		String query1="insert into employee values(?,?,?,?)";
		PreparedStatement ps1=con.prepareStatement(query1);
		ps1.setInt(1, a1); 
		ps1.setString(2, b1);
		ps1.setFloat(3,c1);
		ps1.setString(4, d1);
		
		
		int rows=ps1.executeUpdate();
		System.out.println(rows+ " Record inserted!");
		System.out.println("After insertion");
		
		ResultSet rs1=st.executeQuery("select * from employee");
		while(rs1.next())
		{
			int a=rs1.getInt(1);
			String b=rs1.getString(2);
			float c=rs1.getInt(3);
			String d=rs1.getString(4);
			System.out.println(a+ " "+b + " "+c + " "+d);
		}
		
		rs.close();*/
		//rs1.close();
		con.close();
	}

}
