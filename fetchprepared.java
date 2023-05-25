import java.sql.*;

//fetch the record by using prepared statement
public class fetchprepared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String fcqn="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306?user=root&password=Sakshi@22";
		
		Connection con=null;
		PreparedStatement pstmt =null;
		
		
		
		
		try {
			Class.forName(fcqn);
			
			con= DriverManager.getConnection(url);
			pstmt=con.prepareStatement("select * from employeeinformation.employee");

			ResultSet rs= pstmt.executeQuery();
			
			while(rs.next())
			{
				int id =rs.getInt(1);
				String name=rs.getString(2);
				String role=rs.getString(3);
				
				System.out.println("id :"+id+"  "+"name: "+name+"  "+"role   "+role+" ");
			}
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

	}}
