package com.infinte.day2;

public class BoxingExample {
	public void show(Object ob) {
		String type = ob.getClass().getSimpleName();
		if(type.equals("Integer")){
			System.out.println("integer casting");
		}
		if(type.equals("String")){
			System.out.println("String casting");
		}
		if(type.equals("Double")){
			System.out.println("Double casting");
		}
		
	}

	public static void main(String[] args) {
		int a=2;
		String str="hi";
		double sal=332.554;
		// TODO Auto-generated method stub
//to boxing method
//		Object obj1=a;
//		Object obj2=str;
//		Object obj3=sal;
//		//unboxing method
//		int a1=(Integer)obj1;
//		String s1=(String)obj2;
//		double b1=(double)obj3;
		BoxingExample obj = new BoxingExample();
		obj.show(str);
		obj.show(a);
	}

}
