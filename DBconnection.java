package com.StudentDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
class DBConnect
{
	public static Connection getDB()
	{
	Connection con =null;
	try
	{
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/student","postgres","postgres");
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return con;
}
}

public class DBconnection{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
