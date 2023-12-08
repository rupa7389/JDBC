package selenium1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableDelete {

		public static void main(String[] args) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbc","root","root");
			CallableStatement callableStatement= connection.prepareCall("call deleteUser(1002)");
			callableStatement.execute();
			connection.close();
			System.out.println("Data deleted successfully");


	}

}
