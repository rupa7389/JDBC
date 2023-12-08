package selenium1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectUser {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbc","root","root");
		Statement statement=connection.createStatement();
//		boolean result=statement.execute("Select * from user where id=3");
//		System.out.println(result);
		ResultSet resultset=statement.executeQuery("Select * from User");
		
		while(resultset.next())
		{
			System.out.println(resultset.getInt(1));
			System.out.println(resultset.getString(2));
			System.out.println(resultset.getString(3));
		}
		connection.close();
		System.out.println("Yes done selected");
	}

}
