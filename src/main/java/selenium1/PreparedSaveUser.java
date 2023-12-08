package selenium1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedSaveUser {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbc","root","root");
		//create statement
		PreparedStatement prestm=connection.prepareStatement("insert into user values(?,?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id");
		int id=sc.nextInt();
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your address");
		String address=sc.next();
		
		prestm.setInt(1, id);
		prestm.setString(2,name);
		prestm.setString(3, address);
		
		boolean value=prestm.execute();
		System.out.println(value);
		
		connection.close();
		System.out.println("Data inserted successfully by prepared Statement");
		
	}

}
