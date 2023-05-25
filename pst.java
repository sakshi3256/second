import java.sql.*;

import java.util.Scanner;

public class pst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println( "enter id");
		 int id =sc.nextInt();
		 
		 System.out.println("enter name");
		 String name=sc.next();	
		 System.out.println("enter place");
		 String role=sc.next();
		
				String fcqn="com.mysql.jdbc.Driver";
				String url="jdbc:mysql://localhost:3306?user=root&password=Sakshi@22";
				String qry="insert into employeeinformation.employee values(?,?,?)";   //placeholder
				
			//	String qryx= "delete from  employeeinformation.employee where id =1";
				
				Connection con=null;
				PreparedStatement pstmt=null;
				
				try {
					Class.forName(fcqn);
			 con=	DriverManager.getConnection(url);
			
			 pstmt	=con.prepareStatement(qry);
			 
			 //set the values of placeholder
			 
			
			 pstmt.setInt(1,id);
			 pstmt.setString(2,name);
			 pstmt.setString(3, role);     
			
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
				

			




	