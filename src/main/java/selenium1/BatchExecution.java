package selenium1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BatchExecution {

	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenjdbc","root","root");
		PreparedStatement prestm=connection.prepareStatement("insert into user values(?,?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter how many entries you want to store");
		int noOfValues=sc.nextInt();
		int i=0;
		while(i<noOfValues)
		{
			System.out.println("Please enter your id");
			int id=sc.nextInt();
			System.out.println("Please enter your name");
			String name=sc.next();
			System.out.println("Please enter your address");
			String address=sc.next();
			
			prestm.setInt(1, id);
			prestm.setString(2,name);
			prestm.setString(3, address);
			
			prestm.addBatch();
			System.out.println("added to the batch and observe im not adding it to database ");
			i++;
		}
		
		prestm.executeBatch();
		connection.close();
	}

}
