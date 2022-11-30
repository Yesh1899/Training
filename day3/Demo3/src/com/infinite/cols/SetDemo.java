package com.infinite.cols;

import java.util.SortedSet;
import java.util.TreeSet;

//import java.util.LinkedHashSet;
//import java.util.HashSet;
//import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
//		Set names = new HashSet();
//		Set names = new LinkedHashSet();
		SortedSet names = new TreeSet();
		names.add("dasharatha");
		names.add("sharadha");
		names.add("yeshwanth");
		names.add("nikitha");
		names.add("ramakrishna");
		names.add("raju");
		names.add("mamatha");
		for (Object obj : names) {
			System.out.println(obj);
			
		}
	}

}
