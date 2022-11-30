package com.infinite.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivEx {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values");
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println(c);
		} 
		catch (ArithmeticException e){
			System.out.println("division by 0 not done");
		}
		catch (InputMismatchException e) {
			System.out.println("should not given as input");
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("welcome to errors");
		}

	}

}
