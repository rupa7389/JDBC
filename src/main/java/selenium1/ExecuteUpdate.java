package selenium1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteUpdate {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbc","root","root");
//		Statement statement=connection.createStatement();
//		int value=statement.executeUpdate("insert into user values(10,'laxmi','up')");
//		System.out.println(value);
//		connection.close();
//		System.out.println("Data inserted successfully");
		
//		update
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbc","root","root");
//		Statement statement=connection.createStatement();
//		int value=statement.executeUpdate("update user set name='pooji' where id=2");
//		System.out.println(value);
//		connection.close();
//		System.out.println("Data inserted successfully");
		
//		delete
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbc","root","root");
//		Statement statement=connection.createStatement();
//		int value=statement.executeUpdate("Delete from user where id=2");
//		System.out.println(value);
//		connection.close();
//		System.out.println("Data inserted successfully");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbc","root","root");
		Statement statement=connection.createStatement();
		int a=statement.executeUpdate("select * from user");
		connection.close();
		System.out.println("Yes done selected");
	}

}
