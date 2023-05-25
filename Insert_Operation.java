import java.sql.*;
//import java.sql.DriverManager;

public class Insert_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Driver class loaded and registered");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Sakshi@22");
			System.out.println("connection established");
			
			Statement stmt =con.createStatement();
			
			System.out.println("platform created");
			
			stmt.executeUpdate("insert into employeeinformation.employee values(21,'anjali','developer')");
			
		//	stmt.executeUpdate("update  employeeinformation.employee set eid=0 where ename='jk' ");
			System.out.println("update");
			
		}
		
		catch(Exception e)
		{
			System.out.println("go for testing matlb pakadliya");
		}
	}

}
