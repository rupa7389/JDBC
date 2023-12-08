package selenium1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableSelectUser {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbc","root","root");
		CallableStatement callableStatement= connection.prepareCall("call selectUser()");
		ResultSet resultSet=callableStatement.executeQuery();
		
		while(resultSet.next())
		{
			System.out.print(resultSet.getInt("id")+" ");
			System.out.print(resultSet.getString("name")+" ");
			System.out.println(resultSet.getString(3));
		}
		connection.close();
		System.out.println("Data selected successfully");

	}

}
