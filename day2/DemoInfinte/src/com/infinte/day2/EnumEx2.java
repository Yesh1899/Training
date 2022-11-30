package com.infinte.day2;
enum OrderStatus{
	PENDING,ACCEPTED,REJECTED
}

public class EnumEx2 {
	

	public static void main(String[] args) {
		OrderStatus obj=OrderStatus.PENDING;
		System.out.println(obj);
		obj=OrderStatus.valueOf("REJECTED");
		System.out.println(obj);
		// TODO Auto-generated method stub

	}

}
