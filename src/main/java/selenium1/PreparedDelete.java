package selenium1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedDelete {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbc","root","root");
		PreparedStatement prestm=connection.prepareStatement("delete from user where id=?");
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter your id to be delete");
		int id=sc.nextInt();

		prestm.setInt(1, id);
		prestm.execute();
		connection.close();
		System.out.println("Deleted data successfully");
	}

}
