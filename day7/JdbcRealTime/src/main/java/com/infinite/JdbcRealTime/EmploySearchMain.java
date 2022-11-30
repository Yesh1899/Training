package com.infinite.JdbcRealTime;

import java.sql.SQLException;
import java.util.Scanner;

public class EmploySearchMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empno;
		System.out.println("enter employ number:");
		empno=sc.nextInt();
		EmployDAO dao = new EmployDAO();
		try {
			Employ employ = dao.searchEmploy(empno);
			if(employ!=null){
				System.out.println(employ);
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
