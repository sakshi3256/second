import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;

public class employee {
	
	
	    static Scanner sc =new Scanner(System.in);
	public static void saveEmployee() throws Exception
	{
		System.out.println("enter the id");
		int id=sc.nextInt();
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the email");
		String pos=sc.next();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Sakshi@22");
		
		PreparedStatement pstmt =con.prepareStatement("insert into employeeinformation.employee values(?,?,?)");
		pstmt.setInt(1,id);
		pstmt.setString(2, name);
		pstmt.setString(3, pos);
		pstmt.execute();
		//5.close
		con.close();
		
		System.out.println("inserted "+name +" data");
	}
	
	public static void updateEmployee() throws Exception
	{
		System.out.println("enter the id");
		int id=sc.nextInt();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Sakshi@22");
		
		PreparedStatement pstmt =con.prepareStatement("select * from employeeinformation.employee where eid=? ");
		pstmt.setInt(1,id);
		
		ResultSet result = pstmt.executeQuery();
		while(result.next()) {
			System.out.println(result.getInt(1)+" empid"+"empname  "+result.getString(2)+"emppos   "+result.getString(3));
		}
		
	}
	
	public static void update() throws Exception
	{
		System.out.println("enter the id");
		int id=sc.nextInt();
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the email");
		String pos=sc.next();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Sakshi@22");
		
		PreparedStatement pstmt =con.prepareStatement("update employeeinformation.employee set ename=? ,eposition=? where eid=?");
		pstmt.setInt(3,id);
		pstmt.setString(1, name);
		pstmt.setString(2, pos);
		pstmt.execute();
	con.close();
		
		System.out.println("inserted "+name +" data");
		
		
	}
	
	public static void delete() throws Exception
	{
		System.out.println("enter the id");
		int id=sc.nextInt();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Sakshi@22");
		
		PreparedStatement ps=con.prepareStatement("delete from employeeinformation.employee  where eid=?");    //placeholder====1st
		ps.setInt(1, id) ;
		ps.execute();
		System.out.println("deleted");
	}
	public static void retriveall () throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Sakshi@22");
		PreparedStatement ps=con.prepareStatement("select * from employeeinformation.employee");    //placeholder====1st
		
		ResultSet result = ps.executeQuery();
		while(result.next()) {
			System.out.println(" empid  -->  "+result.getInt(1)+"    empname -->  "+result.getString(2)+"  emppos-->   "+result.getString(3));
		}
	}
	
	
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		
		boolean check =true;
		
		
do {
	System.out.println("chhose your option \n1.save\n2.update\n3.delete\n4.retriveby id"
			+ "\n5.retrive all\n6login\n7.exit");
	int choise=sc.nextInt();
	
	switch(choise) {
	
	case 1:{
		System.out.println("save");
		saveEmployee();
	}break;
    case 2:{
		System.out.println("update");
		update();
		
	}break;
    case 3:{
	  System.out.println("delete");
	  delete();
     }break;
    case 4:{
	  System.out.println("retrivebyid");
	  updateEmployee();
    }break;
    case 5:{
	    System.out.println("all employees");
	    retriveall();
     }break;
     case 6:{
	System.out.println("login");
     }break;
     case 7:{
    	 check=false;
     }
     break;
  default: System.out.println("please enter valid key");;
	break;
	
	}
	
} while (check);
	}

}
