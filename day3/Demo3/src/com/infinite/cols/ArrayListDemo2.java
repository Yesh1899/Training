package com.infinite.cols;

import java.util.Comparator;
//import java.util.ArrayList;
//import java.util.List;
import java.util.SortedSet;
//import java.util.TreeMap;
import java.util.TreeSet;

public class ArrayListDemo2 {

	public static void main(String[] args) {
//		List employList = new ArrayList();
		Comparator c = new NameComparator();
		SortedSet employList = new TreeSet(c);
		employList.add(new Employ(1,"yeshu",32432));
		employList.add(new Employ(2,"sister",324));
		employList.add(new Employ(13,"brother",3243));
		employList.add(new Employ(14,"babi",3));
		employList.add(new Employ(12,"kovuu",32));
		for (Object obj : employList) {
			Employ employ = (Employ)obj;
			System.out.println(employ);
			
		}
	}

}
