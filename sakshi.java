import java.sql.*;

import java.util.Scanner;

class P
{
static	String fcqn="com.mysql.cj.jdbc.Driver";
static	String url="jdbc:mysql://localhost:3306?user=root&password=Sakshi@22";
static	String qry="insert into car.carwale values(?,?,?)";
static Scanner sc =new Scanner(System.in);
	
}

class sachin extends P
{
	
	public static void case4()
	{
		Connection con=null;
		Statement stmt=null;
	//	PreparedStatement pstmt=null;
    
		
		
		try {
			Class.forName(fcqn);
	     con=	DriverManager.getConnection(url);
		
	stmt = con.createStatement();
	 
	ResultSet rs=stmt.executeQuery("select * from newcar.newcar ");    
	
	while(rs.next())
	{
		int id =rs.getInt(1);
		String name=rs.getString(2);
		double price=rs.getDouble(3);
		
		System.out.println("id ->"+id+"   "+"name-> "+name+"   "+"price ->"+price);
	}
	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public static void user()
	{
		Connection con=null;
	//	Statement stmt=null;
		PreparedStatement pstmt=null;
		String qryx="insert into userinformation.user values(?,?,?)";
		 System.out.println( "enter id");
		 int id0 =sc.nextInt();
		 
		 System.out.println("enter name");
		 String name0=sc.next();	
		 System.out.println("enter place");
		 String place=sc.next();
		 try {
			 Class.forName(fcqn);
			  con=	DriverManager.getConnection(url);
			pstmt	=con.prepareStatement(qryx);
			 pstmt.setInt(1,id0);
			 pstmt.setString(2,name0);
			 pstmt.setString(3, place);     
			
			pstmt.executeUpdate();
			System.out.println("data entered");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	

	public static void case1()
	{
		System.out.println("Register yourself");
		user();
		Connection con=null;
		Statement stmt=null;
		PreparedStatement pstmt=null;
System.out.print("visit the showroom");
		
		
		try {
			Class.forName(fcqn);
	     con=	DriverManager.getConnection(url);
		
	stmt = con.createStatement();
	 
	ResultSet rs=stmt.executeQuery("select * from car.carwale ");    
	
	while(rs.next())
	{
		int id =rs.getInt(1);
		String name=rs.getString(2);
		double price=rs.getDouble(3);
		
		System.out.println("id ->"+id+"   "+"name-> "+name+"   "+"price ->"+price);
	}
	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 
	public static void case2()
	{	
	
	Connection con=null;
	Statement stmt=null;
	
	
	try
	{
	Class.forName(fcqn);
	 con=	DriverManager.getConnection(url);
		
	
	
	 System.out.println( "enter id");
	 int id =sc.nextInt();
	 
	 System.out.println("enter name");
	 String name=sc.next();	
	 System.out.println("enter price");
	 String price=sc.next();
	 PreparedStatement pstmt=null;
	 
	 //set the values of placeholder
	 pstmt	=con.prepareStatement(qry);
	
	 pstmt.setInt(1,id);
	 pstmt.setString(2,name);
	 pstmt.setString(3, price);     
	
	pstmt.executeUpdate();
	                                              
	System.out.println("data entered");
			
		} 
	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void case3()
	{
		Connection con=null;
		Statement stmt=null;
		PreparedStatement pstmt=null;


		
		
		System.out.println( "enter id");
		 int id =sc.nextInt();
		 String qry1="delete from car.carwale where id=?"; 
		try {
			Class.forName(fcqn);
	 con=	DriverManager.getConnection(url);
		
	 pstmt	=con.prepareStatement(qry1);
	 pstmt.setInt(1,id);
	 
	 pstmt.executeUpdate();
	 
	
	 
	
	     
	                                              
	System.out.println("data changed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
			
}

public class sakshi {
	
	public static void S()
	{
		System.out.println("Enter 1 for choice");
		System.out.println("enter any no for exit");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n==1)
		{
			menu();
		}
		else
		{
			System.out.println("Thank you for visiting");
		}
	}
	
	public static void menu()
	{
		System.out.println("1.visit the showroom");
		System.out.println("2.To sell car");
		System.out.println("3.To Buy car");
		System.out.println("4.For new model ");
		 System.out.println("enter your choice:");
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
		switch(n)
		{
		case 1: System.out.println("visit the showroom");
		
		sachin.case1();
		break;
		case 2: 
			
	  System.out.println("To sell car");
		sachin.case2();
		
		break;
		case 3:System.out.println("To buy car");
		sachin.case3();
		
		
		break;
		case 4: System.out.println("New model");
		sachin.case4();
			
		break;
		default: System.out.println("invalid key");
		break;
		}
		
		S();
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		menu();
		
		
        
	
		
	}

}
