package com.infinite.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

//import java.util.ArrayList;
//import java.util.List;


public class GenListEx1 {

	public static void main(String[] args) {
//		List<Employ> employList = new ArrayList<Employ>();
		Comparator<Employ> c= new GenComp();
		SortedSet<Employ> employList = new TreeSet<Employ>(c);
		
		employList.add(new Employ(1,"yeshu",32432));
		employList.add(new Employ(2,"sister",324));
		employList.add(new Employ(13,"brother",3243));
		employList.add(new Employ(14,"babi",3));
		employList.add(new Employ(12,"kovuu",32));
		for (Object obj : employList) {
			System.out.println(obj);
			
		}

	}

}
