package com.infinite.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployInsertMain {

	public static void main(String[] args) {
		String name,dept,desig;
		int basic;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name..");
		name=sc.next();
		System.out.println("dept");
		dept=sc.next();
		System.out.println("desig");
		desig=sc.next();
		System.out.println("basic");
		basic=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/infinite","root","india@123");
			 String cmd = "insert into Employ(name,dept,desig,basic)" + "values(?,?,?,?)";
			 PreparedStatement pst = con.prepareStatement(cmd);
			 pst.setString(1, name);
			 pst.setString(2, dept);
			 pst.setString(3, desig);
			 pst.setInt(4, basic);
			 pst.executeUpdate();
			 System.out.println("employ record inserted");
			 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
