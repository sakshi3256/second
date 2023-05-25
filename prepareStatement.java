import java.sql.*;


public class prepareStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fcqn="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306?user=root&password=Sakshi@22";
		String qry="insert into employeeinformation.employee values(20,'sayali','testing')";
		
		Connection con=null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName(fcqn);
	 con=	DriverManager.getConnection(url);
		
	 pstmt	=con.prepareStatement(qry);
	
	pstmt.executeUpdate();
	
	System.out.println("data entered");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		

	}

}
