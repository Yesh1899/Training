package com.exam.JdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AgentInsertMain {
	public static void main(String[] args) {
		String name,city,gender;
		int premium,maritalstatus;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name..");
		name=sc.next();
		System.out.println("city");
		city=sc.next();
		System.out.println("gender");
		gender=sc.next();
		System.out.println("maritalstatus");
		maritalstatus=sc.nextInt();
		
		System.out.println("premium");
		premium=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","india@123");
			 String cmd = "insert into Agent(name,city,gender,maritalstatus,premium)" + "values(?,?,?,?,?)";
			 PreparedStatement pst = con.prepareStatement(cmd);
			 pst.setString(1, name);
			 pst.setString(2, city);
			 pst.setString(3, gender);
			 pst.setInt(4, maritalstatus);
			 pst.setInt(5, premium);
			 pst.executeUpdate();
			 System.out.println("agent record inserted");
			 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
