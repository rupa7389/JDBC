package selenium1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedUpdate {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbc","root","root");
		PreparedStatement prestm=connection.prepareStatement("update user set name=? where id=?");
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter your id to be update");
		int id=sc.nextInt();
		System.out.println("Enter your name");
		String name=sc.next();
		
		prestm.setString(1, name);
		prestm.setInt(2, id);
		
		prestm.execute();
		connection.close();
		System.out.println("Update data successfully");
		
	}

}
