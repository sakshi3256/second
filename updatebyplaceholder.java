import java.sql.*;
import java.util.Scanner;

public class updatebyplaceholder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println( "enter id");
		 int id =sc.nextInt();
		

		String fcqn="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306?user=root&password=Sakshi@22";
		String qry="delete from employeeinformation.employee where eid=?";   //placeholder
		
		
		
		Connection con=null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName(fcqn);
	 con=	DriverManager.getConnection(url);
		
	 pstmt	=con.prepareStatement(qry);
	 pstmt.setInt(1,id);
	  pstmt.executeUpdate();
	 
	
	 
	
	     
	                                              
	System.out.println("data changed");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}

