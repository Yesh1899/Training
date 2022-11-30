package com.infinte.day2;

public class EmpArray {

	public static void main(String[] args) {
		Emp[] arr = new Emp[]{
				new Emp(1,"yeshu",32412),
				new Emp(9,"yesh",322),
				new Emp(6,"yeshwanth",2412)
		};
		for (Emp emp : arr) {
			System.out.println(emp);
			
		}
	}

}
