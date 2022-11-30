package com.infinite.ex;

import java.util.Scanner;

public class Calculation {
	public void show(int a , int b) throws NegativeException, NumberZeroException {
		if(a<0||b<0){
			throw new NegativeException("negative is not valid");
		}
		else if(a==0||b==0){
			throw new NumberZeroException("zero is not valid");
		}
		else{
			int c=a+b;
			System.out.println(c);
		}
		
		
	}

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values");
		a=sc.nextInt();
		b=sc.nextInt();
		Calculation obj = new Calculation();
		try {
			obj.show(a, b);
		} catch (NegativeException e) {
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (NumberZeroException e) {
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}

}
