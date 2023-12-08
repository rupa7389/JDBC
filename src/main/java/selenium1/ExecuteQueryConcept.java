package selenium1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteQueryConcept {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbc","root","root");
//		Statement statement=connection.createStatement();
//		statement.executeQuery("insert into user values(2,'Rupa','Bhopal')");
//		connection.close();//exceptionnnnnnnnnnnnnnnnnnn
//		System.out.println("Data inserted successfully");
		
//		update
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbc","root","root");
//		Statement statement=connection.createStatement();
//		statement.executeQuery("update user set name='pooji' where id=2");
//		connection.close();//exceptionnnnnnnnnnnnnnnnnnn
//		System.out.println("Data inserted successfully");
//		
		//delete
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbc","root","root");
		Statement statement=connection.createStatement();
		statement.executeQuery("Delete from user where id=2");
		connection.close();//exceptionnnnnnnnnnnnnnnnnnn
		System.out.println("Data inserted successfully");
	}

}
