package selenium1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedSelect {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbc","root","root");
		PreparedStatement prestm=connection.prepareStatement("Select * from user where id=?");

		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter your id to be selected");
		int id=sc.nextInt();
		prestm.setInt(1, id);
		
		ResultSet result=prestm.executeQuery();
		while(result.next())
		{
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getString(3));
		}
		connection.close();
		System.out.println("Data fatched successfully");
	}

}
