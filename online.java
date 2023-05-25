import java.sql.*;

public class online {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Sakshi@22");
			Statement stmt =con.createStatement();
			
			stmt.executeUpdate(" update employeeinformation.employee set ename='sachi' where eid=2 ");
			System.out.println("data entered");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
