package com.infinte.day2;

public class StudentArray {

	public static void main(String[] args) {
		Student[] arr = new Student[]{
				new Student(1,"yeshu","sdnr",9.3),
				new Student(9,"yesh","shad",9),
				new Student(6,"yeshwanth","hyd",9.8)
		};
		for (Student student : arr) {
			System.out.println(student);
		}
	}

}
