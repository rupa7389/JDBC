package selenium1;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.CallableStatement;

public class CallableInsert {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbc","root","root");
		CallableStatement callableStatement= connection.prepareCall("call insertUser(8,'pooji','xyz')");
		callableStatement.execute();
		connection.close();
		System.out.println("Data inserted successfully");

	}

}
