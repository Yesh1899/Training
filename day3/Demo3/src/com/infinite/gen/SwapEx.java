package com.infinite.gen;
class Data<T>{
	public void swap(T a,T b) {
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("swapped  b  to "+b);
		
	}
}
public class SwapEx {
	public static void main(String[] args) {
		Data obj = new Data();
		obj.swap(4, 5);
		String s1="yeshu",s2="yeshwanth";
		obj.swap(s1, s2);
		boolean y1=true,y2=false;
		obj.swap(y1, y2);
		
	}

}
