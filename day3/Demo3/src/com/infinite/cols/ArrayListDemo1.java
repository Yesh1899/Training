package com.infinite.cols;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		List names= new ArrayList();
		names.add("yeshwanth");
		names.add("yeshwant");
		names.add("yeshwan");
		names.add("yeshwa");
		names.add("yeshw");
		names.add("yesh");
		System.out.println("names are");
		for (Object obj : names) {
			System.out.println(obj);
			
		}

	}

}
