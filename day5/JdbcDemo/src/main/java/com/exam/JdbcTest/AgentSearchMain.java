package com.exam.JdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AgentSearchMain {
	public static void main(String[] args) {
		int agentId;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter agentId :");
		agentId=sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","india@123");
			 String cmd = "select*from Agent where agentId=?";
			 PreparedStatement pst = con.prepareStatement(cmd);
			 pst.setInt(1,agentId);
			 ResultSet rs = pst.executeQuery();
			 if(rs.next()){
			    	System.out.println("AgentId " + rs.getInt("agentId"));
			    	System.out.println("Name " + rs.getString("name"));
			    	System.out.println("City " + rs.getString("city"));
			    	System.out.println("Gender " + rs.getString("gender"));
			    	System.out.println("MaritalStatus" + rs.getInt("maritalstatus"));
			    	System.out.println("Premium" + rs.getInt("premium"));
			    	System.out.println("-----------------------------");
			    }
			 else{
				 System.out.println("record not found");

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
