package selenium1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CallableStmtSelectAll {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbc","root","root");
//		CallableStatement cs=connection.prepareCall("call selectUser");
//		ResultSet resultSet=cs.executeQuery();
//		
//		while(resultSet.next())
//		{
//			System.out.print(resultSet.getInt("id")+" ");
//			System.out.print(resultSet.getString("name")+" ");
//			System.out.print(resultSet.getString("address")+" ");
//			System.out.println();
//		}
		
		PreparedStatement pS= connection.prepareStatement("insert into user values(?,?,?)");
		Scanner sc= new Scanner(System.in);
		System.out.print("how many recourt you want to add ");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.print("Enter name ");
			String name=sc.next();
			System.out.print("Enter Address ");
			String address=sc.next();
			pS.setInt(1,id);
			pS.setString(2,name);
			pS.setString(3,address);
			
			pS.addBatch();
			i++;
		}
		
		pS.executeBatch();
		connection.close();
	}

}
