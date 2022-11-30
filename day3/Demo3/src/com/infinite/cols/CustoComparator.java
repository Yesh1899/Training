package com.infinite.cols;
import java.util.Comparator;
public class CustoComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Customer c1 = (Customer)o1;
		Customer c2 = (Customer)o2;
//		return c1.city.compareTo(c2.city);
		if(c1.custId>=c2.custId){
			return 1;
		}
		else{
			return -1;
		}
	}
}
