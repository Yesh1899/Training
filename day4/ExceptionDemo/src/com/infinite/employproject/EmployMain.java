package com.infinite.employproject;
import java.util.List;
import java.util.Scanner;

public class EmployMain {
	static Scanner sc = new Scanner(System.in);
	static EmployBAL bal = new EmployBAL();
	public static void showEmployMain() {
		List<Employ>  employList = bal.showEmployBal();
		for (Employ employ : employList) {
			System.out.println(employ);
		}
		
	}
	public static void main(String[] args) {
		int choice;
		do{
			System.out.println("O P T I O N S");
			System.out.println("-------------");
			System.out.println("1, Add Employ");
			System.out.println("2, Show Employ");
			System.out.println("3, Search Employ");
			System.out.println("4, Delete Employ");
			System.out.println("5, Update Employ");
			System.out.println("6, Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				try {
					addEmployMain();
				} catch (EmployException e) {
					System.err.println(e.getMessage());
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
				break;
			case 2:
				showEmployMain();
				break;
			case 3:
				searchEmployMain();
				break;
			case 4:
				deleteEmployMain();
				break;
			case 5:
				try {
					updateEmployMain();
				} catch (EmployException e) {
					System.err.println(e.getMessage());
					// TODO Auto-generated catch block
//					e.printStackTrace();
				}
				break;
			case 6:
				
				break;
			}
		}
		while(choice!=6);
	}
	public static void searchEmployMain() {
		int empno;
		System.out.println("enter empno");
		empno=sc.nextInt();
		Employ employFound = bal.searchEmployBAL(empno);
		if(employFound!=null)
		{
			System.out.println(employFound);
		}
		else{
			System.out.println("record not found");
		}
		
	}
	public static void deleteEmployMain() {
		int empno;
		System.out.println("enter empno");
		empno=sc.nextInt();
		System.out.println(bal.deleteEmployBAL(empno));
	}
	public static void addEmployMain() throws EmployException {
		Employ employ =  new Employ();
		System.out.println("enter the empno");
		employ.setEmpno(sc.nextInt());
		System.out.println("enter emp name");
		employ.setName(sc.next());
		System.out.println("enter gender m/f");
		String gen= sc.next();
		if(gen.toUpperCase().equals("MALE")){
			employ.setGender(Gender.MALE);
		}
		if(gen.toUpperCase().equals("FEMALE")){
			employ.setGender(Gender.FEMALE);
		}
		System.out.println("enter the dept");
		employ.setDept(sc.next());
		System.out.println("enter design");
		employ.setDesig(sc.next());
		System.out.println("enter basic");
		employ.setBasic(sc.nextDouble());
		System.out.println(bal.addEmployBal(employ));
		
	}
	public static void updateEmployMain() throws EmployException {
		Employ employ =  new Employ();
		System.out.println("enter the empno");
		employ.setEmpno(sc.nextInt());
		System.out.println("enter emp name");
		employ.setName(sc.next());
		System.out.println("enter gender m/f");
		String gen= sc.next();
		if(gen.toUpperCase().equals("MALE")){
			employ.setGender(Gender.MALE);
		}
		if(gen.toUpperCase().equals("FEMALE")){
			employ.setGender(Gender.FEMALE);
		}
		System.out.println("enter the dept");
		employ.setDept(sc.next());
		System.out.println("enter design");
		employ.setDesig(sc.next());
		System.out.println("enter basic");
		employ.setBasic(sc.nextDouble());
		System.out.println(bal.updateEmployBAL(employ));
		
	}

}
