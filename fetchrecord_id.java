import java.sql.*;

import java.util.Scanner;


//WAP to fetch record where id=placeholder if id is not present write invalid id
public class fetchrecord_id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter id to fetch");
		Scanner sc=new Scanner(System.in);
		
		//int id = sc.nextInt();
		String fcqn="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306?user=root&password=Sakshi@22";
		String qry="select * from employeeinformation.employee where eid=?";   //placeholder
		
		
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs =null;
		
		try {
			Class.forName(fcqn);
			con= DriverManager.getConnection(url);
		pstmt=	con.prepareStatement(qry);
		
		int id=sc.nextInt();
		pstmt.setInt(1, id);
		
		 rs =pstmt.executeQuery();
		 //boolean res=false;
		
		while(rs.next())
		{
			int id1 =rs.getInt(1);
			String name=rs.getString(2);
			String role=rs.getString(3);
			
			if(id==id1)
			{
				System.out.println("id :"+id+"  "+"name: "+name+"  "+"role   "+role+" ");
			}
			else
				System.out.println("invalid data");
		}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}
}

