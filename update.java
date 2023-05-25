import java.sql.*;


import java.util.Scanner;

public class update {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the id");
		int n =sc.nextInt();
		
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter role");
		String role = sc.next();
		
		String fqcn="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306?user=root&password=Sakshi@22";		
		try {
			
			Class.forName(fqcn);
			
			Connection con = DriverManager.getConnection(url);
		PreparedStatement pstmt=con.prepareStatement("insert into employeeinformation.employee values(?,?,?)");
			
		//	PreparedStatement pstmt=con.prepareStatement("delete from employeeinformation.employee where id=1");
			pstmt.setInt(1,n);
			pstmt.setString(2,name);
			pstmt.setString(3, role);
					
			pstmt.executeUpdate();
			System.out.println("data erolentered");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
