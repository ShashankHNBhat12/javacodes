package programs;
import java.util.Scanner;
import java.sql.*;

public class Movie {

	public static void main(String[] args) throws  Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Scanner sc=new Scanner(System.in);
		
		Connection con=
	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","System","shashank");
		Statement st=con.createStatement();
		
		
		System.out.println("enter the movie id ");
		int id=sc.nextInt();
		sc.nextLine();
		
		 String q="select * from movie where id="+id;
		ResultSet rs2=st.executeQuery(q);
		while(rs2.next())
		{
			int a=rs2.getInt(1);
			String b=rs2.getString(2);
			
			System.out.println(a+ " "+b );
		}
		
		
		System.out.println("Movie id  Movie name  Release date  Movie rating");
		ResultSet rs=st.executeQuery("select * from movie");
		while(rs.next())
		{
			int a=rs.getInt(1);
			String b=rs.getString(2);
			Date c=rs.getDate(3);
			int d=rs.getInt(4);
			System.out.println(a+ " \t "+b + " \t "+c + " \t "+d);
		}
		rs.close();
		
		System.out.println("Enter the movie id");
		int a=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the review");
		String s=sc.nextLine();
		System.out.println("Enter the rating (1-5)");
		int r=sc.nextInt();
		
		String query1="insert into movierev values(?,?,?)";
		PreparedStatement ps1=con.prepareStatement(query1);
		ps1.setInt(1, a); 
		ps1.setString(2, s);
		ps1.setInt(3, r);
		
		
		int rows=ps1.executeUpdate();
		System.out.println(rows+ " Record inserted!");
		
		System.out.println("Average rating based of viewers review ");
		ResultSet rs1=st.executeQuery(" select name,avg(stars) from movie e,movierev d where e.id=d.mid group by e.name");
		while(rs1.next())
		{
			
			String b=rs1.getString(1);
			
			float d=rs1.getFloat(2);
			System.out.println(b + " \t "+d);
		}
		rs2.close();

	}

}
