package com.exam.JdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AgentShowMain {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","india@123");
		    System.out.println("connected..");
		    String cmd = "select*from Agent";
		    PreparedStatement pst = con.prepareStatement(cmd);
		    ResultSet rs = pst.executeQuery();
		    while(rs.next()){
		    	System.out.println("AgentId " + rs.getInt("agentId"));
		    	System.out.println("Name " + rs.getString("name"));
		    	System.out.println("City " + rs.getString("city"));
		    	System.out.println("Gender " + rs.getString("gender"));
		    	System.out.println("MaritalStatus" + rs.getInt("maritalstatus"));
		    	System.out.println("Premium" + rs.getInt("premium"));
		    	System.out.println("-----------------------------");
		    }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
