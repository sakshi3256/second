import java.sql.*;


//WAP to fetch the records from dATAbase
public class fetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fcqn="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306?user=root&password=Sakshi@22";
		//String qry="insert into employeeinformation.employee values(?,?,?)";   //placeholder
		
		
		
		Connection con=null;
		//PreparedStatement pstmt=null;
		Statement stmt=null;
		
		try {
			Class.forName(fcqn);
	 con=	DriverManager.getConnection(url);
		
	stmt = con.createStatement();
	 
	ResultSet rs=stmt.executeQuery("select * from employeeinformation.employee ");    
	
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
			if(stmt!=null)
			{
				try {
					stmt.close();
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
