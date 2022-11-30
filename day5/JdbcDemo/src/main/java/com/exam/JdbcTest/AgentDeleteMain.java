package com.exam.JdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AgentDeleteMain {
	public static void main(String[] args) {
		int agentId;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter agentId number: ");
		agentId=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","india@123");
			 String cmd = "delete from Agent where agentId=?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1,agentId);
		    pst.executeUpdate();
		    System.out.println("record deleted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
	}

}
