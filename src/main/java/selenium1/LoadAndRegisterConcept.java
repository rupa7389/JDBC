package selenium1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;
public class LoadAndRegisterConcept {

	public static void main(String[] args) throws SQLException
	{
		//explicit load the driver
		Driver driver = new Driver();
		//Register the driver
		DriverManager.registerDriver(driver);
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbc?user=root&password=root");
		Statement statement=connection.createStatement();
		statement.execute("insert into user values(1002,'kratika','Hoshangabad')");
		connection.close();
		System.out.println("Data inserted successfully by load and register the driver by using expliitly");

	}

}
