package com.infinite.JdbcRealTime;

import java.sql.SQLException;
import java.util.Scanner;

public class AddEmployMain {
	public static void main(String[] args) {
		Employ employ = new Employ();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employ name: ");
		employ.setName(sc.next());
		System.out.println("enter dept:");
		employ.setDept(sc.next());
		System.out.println("enter desig");
		employ.setDesig(sc.next());
		System.out.println("enter basic");
		employ.setBasic(sc.nextInt());
		EmployDAO dao = new EmployDAO();
		try {
			System.out.println(dao.addEmploy(employ));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
