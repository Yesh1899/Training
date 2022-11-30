package com.infinite.day1;

public class MaX3 {
	public void check(int a,int b,int c) {
		int m=a;
		if(m>b){
			m=b;
		}
		if(m>c){
			m=c;
		}
		System.out.println("least value  "+ m);
		
	}

	public static void main(String[] args) {
		int a,b,c;
		a=7;
		b=2;
		c=3;
		MaX3 obj = new MaX3();
		obj.check(a,b,c);
	}

}
