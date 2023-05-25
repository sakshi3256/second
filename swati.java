
import java.sql.*;
		import java.util.Scanner;
public class swati {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		

				System.out.println("1.visit the showroom");
				System.out.println("2.To sell car");
				System.out.println("3.To Buy car");
				
		         System.out.println("Enter your choice:");
				Scanner sc = new Scanner(System.in);
				int n=sc.nextInt();
				String fcqn="com.mysql.cj.jdbc.Driver";
				String url="jdbc:mysql://localhost:3306?user=root&password=Sakshi@22";
				String qryx="insert into userinformation.user values(?,?,?)";
				String qry="insert into car.carwale values(?,?,?)";
				String qry1="delete from car.carwale where id=?"; 
				
				
				Connection con=null;
				Statement stmt=null;
				PreparedStatement pstmt=null;
				
				
				try {
					Class.forName(fcqn);
			 con=	DriverManager.getConnection(url);
				
			
			
			switch(n)
			{
			case 0:
				
				 System.out.println( "enter id");
				 int id0 =sc.nextInt();
				 
				 System.out.println("enter name");
				 String name0=sc.next();	
				 System.out.println("enter place");
				 String place=sc.next();
				 pstmt	=con.prepareStatement(qryx);
				 
				 //set the values of placeholder
				 
				 
				
				 pstmt.setInt(1,id0);
				 pstmt.setString(2,name0);
				 pstmt.setString(3, place);     
				
				pstmt.executeUpdate();
				                                              
				System.out.println("data entered");
			//	break;
			//case 1: 
				System.out.println("visit the showroom");
			
			stmt = con.createStatement();
			 
			ResultSet rs=stmt.executeQuery("select * from car.carwale ");    
			
			while(rs.next())
			{
				int id =rs.getInt(1);
				String name=rs.getString(2);
				double price=rs.getDouble(3);
				
				System.out.println("id ->"+id+"   "+"name-> "+name+"   "+"price ->"+price);
			}
			
			break;
			case 2: System.out.println("To sell car");
			
			 System.out.println( "enter id");
			 int id =sc.nextInt();
			 
			 System.out.println("enter name");
			 String name=sc.next();	
			 System.out.println("enter price");
			 String price=sc.next();
			 
			 //set the values of placeholder
			 pstmt	=con.prepareStatement(qry);
			
			 pstmt.setInt(1,id);
			 pstmt.setString(2,name);
			 pstmt.setString(3, price);     
			
			pstmt.executeUpdate();
			                                              
			System.out.println("data entered");
			
			break;
			
			case 3 :System.out.println("To buy car");
			
			
			System.out.println( "enter id");
			 int id1 =sc.nextInt();
			
		 pstmt	=con.prepareStatement(qry1);
		 pstmt.setInt(1,id1);
		 
		 pstmt.executeUpdate();
		 
		                                           
		System.out.println("data changed");
		
		break;
		
			default : System.out.println("invalid key");
			break;
			
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
