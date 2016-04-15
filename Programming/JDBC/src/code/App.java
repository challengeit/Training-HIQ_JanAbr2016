package code;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
	public static void main(String[] args) throws SQLException 
	{
		/*
		String a = "a";
		String b = "'b'); drop database dbname;";
		try(Connection connection = DriverManager.getConnection("mysql://root:password@localhost/database_name","root","password");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from table1")) 
		{
			boolean bool = statement.execute("select * from table1");
			int numResults = statement.executeUpdate("insert into table1(col1, col2) values(" + a + "," + b + ")");
	//		resultSet.close();
	//		statement.close();
	//		connection.close();
		}
		*/
		// bad code!
//		try(ResultSet rs = DriverManager.getConnection("").createStatement().executeQuery(""))
//		{
//			
//		}
		
		// prepared statement
		try(Connection connection = DriverManager.getConnection("mysql://root:password@localhost/database_name","root","password");
			PreparedStatement statement = connection.prepareStatement("select c1, c2, c3, c4 from table1 where c1 = ? and c2 = ?")) 
			{
				String a = "a", b = "b";
				statement.setString(1, a);
				statement.setString(2, b);
				ResultSet resultSet = statement.executeQuery();
				while(resultSet.next())
				{
					resultSet.getString(1);
					resultSet.getDouble(2);
					ResultSetMetaData md = resultSet.getMetaData();
				
				}
			}
		
		boolean bool = false;		
		System.out.println((bool) ? "djjsd" : "fldsfdl");
		
		try {
			throw new IOException();
		}
		catch(IOException | ArrayIndexOutOfBoundsException e) {
			
		}
	}
}

