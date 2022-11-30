package com.infinite.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

//import java.util.ArrayList;
//import java.util.List;

public class StudentDetails {

	public static void main(String[] args) {
//		List<Student> j = new ArrayList<Student>();
		Comparator<Student> c = new StuComp();
		SortedSet<Student> j = new TreeSet<Student>(c);
		j.add(new Student(1,"yeshu","hyd",9.2));
		j.add(new Student(1,"yesh","hyd",9.2));
		j.add(new Student(1,"yeshwanth","hyd",9.2));
		j.add(new Student(1,"yes","hyd",9.2));
		j.add(new Student(1,"yeshucxzc","hyd",9.2));
		for (Student s : j) {
			System.out.println(s);
			
		}

	}

}
