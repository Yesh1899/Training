package com.infinite.intf;
interface Ione{
	void name();
}
interface Itwo{
	void mail();
}
class Yeshwanth implements Ione,Itwo{

	@Override
	public void mail() {
		System.out.println("yeshwanthmail.com");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void name() {
		System.out.println("yeshwanth");
		// TODO Auto-generated method stub
		
	}
	
}
public class MultiInh {

	public static void main(String[] args) {
		Yeshwanth obj = new Yeshwanth();
		obj.name();
		obj.mail();

	}

}
