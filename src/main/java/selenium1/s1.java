package selenium1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class s1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbc","root","root");
		Statement statement=connection.createStatement();
		statement.execute("insert into user values(2,'Rupa','Bhopal')");
		statement.execute("insert into user values(3,'Anshul','Bang')");
		statement.execute("insert into user values(4,'Vijay','Bihar')");
		connection.close();
		System.out.println("Data inserted successfully");
	
	}

}
