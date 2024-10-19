package com.klu.jdbcps;

import java.sql.*;

public class App 
{
    public static void main( String[] args )throws Exception
    {
        
    	
    	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/klu","root","1997");
    	
    	String qry = "insert into employee values(?,?,?)";
    	PreparedStatement stmt = connection.prepareStatement(qry);
    	
    	stmt.setInt(1, 1050);
    	stmt.setString(2,"hanuman");
    	stmt.setString(3, "ECM");
    	
    	stmt.execute();
    	
    	
    	System.out.println("Records inserted successfully");
    	connection.close();
    	
    	
    	
    	
    	
    }
}
