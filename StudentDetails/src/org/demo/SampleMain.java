package org.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleMain {

	
	
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306?user=root && password=1234";
		String query="insert into vamshi.student values('Chnadra','CNIT')";

		try {
			System.out.println("started");
			Connection connection =DriverManager.getConnection(url);
			System.out.println("step 1");
			Statement statement=connection.createStatement();
			System.out.println("step 2");

			statement.executeUpdate(query);
			System.out.println("step 3");

			connection.close();
			System.out.println("Success");
			
			
		}
		catch(SQLException e)
		{
			System.out.println("handled");
		}
	}

}
