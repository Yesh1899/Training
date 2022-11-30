package com.infinite.day1;

public class CtoF {
	public void calc(double cel) {
		double faren;
		faren=((cel*9)/5)+32;
		cel=((faren-32)*5)/9;
		System.out.println("celsius value is " + cel);
		System.out.println("farenheit value "+ faren);
	}

	public static void main(String[] args) {
		double cel = 37;
		CtoF obj = new CtoF();
		obj.calc(cel);
	}

}
