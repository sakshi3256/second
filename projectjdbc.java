import java.sql.*;

 class ABC
{
	static String fcqn="com.mysql.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306?user=root&password=Sakshi@22";
	
	 static Connection con=null;
	PreparedStatement pstmt=null;
	
	
	
	
}



public class projectjdbc extends ABC
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("connected");
		
		try {
			Class.forName(fcqn);
			con= DriverManager.getConnection(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}

