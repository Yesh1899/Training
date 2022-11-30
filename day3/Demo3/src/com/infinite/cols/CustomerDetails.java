package com.infinite.cols;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

//import java.util.ArrayList;
//import java.util.List;

public class CustomerDetails {

	public static void main(String[] args) {
//		List custo = new ArrayList();
		Comparator c = new CustoComparator();
		SortedSet custo = new TreeSet(c);
		custo.add(new Customer(1,"yeshu","shadnagar",30));
		custo.add(new Customer(2,"yeshuth","shadn",30000));
		custo.add(new Customer(3,"yeshudf","shadna",300));
		custo.add(new Customer(4,"yeshubv","shadnag",3000));
		custo.add(new Customer(5,"yeshuxbv","shadnaga",3));
		for (Object obj : custo) {
			Customer takers = (Customer)obj;
			System.out.println(takers);
			
		}

	}

}
