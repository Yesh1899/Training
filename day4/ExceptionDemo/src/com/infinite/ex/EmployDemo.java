package com.infinite.ex;

public class EmployDemo {
	public static void main(String[] args) {
		Employ employ = new Employ();
		employ.setBasic(6768.3);
		employ.setEmpno(1);
		employ.setName("yeshu");
		
		System.out.println(employ.getEmpno());
		System.out.println(employ.getName());
		System.out.println(employ.getBasic());
	}

}
