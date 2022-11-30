package com.infinite.day1;

public class CurrentBill {
	public void bill(double u) {
		double temp;
		double m1=0,m2=0,m3=0,m4=0,m5=0;
		double sum=0;
		if(u<=90){
			m1=u*1;
			System.out.println(m1);
		}
		if((91<u)&&(u<=150)){
			temp=u-90;
			if(temp<=90){
				m2=temp*1;
				}
			else{
				m2=temp*1.5;
				}
		}
		System.out.println(m2);
		if((151<u)&&(u<=200)){
			temp=u-150;
			if(temp<=50){
				m3=temp*1.5;
			}
			else{
				m3=temp*2;
			}
		}
		System.out.println(m3);
		if((201<u)&&(u<=240)){
			temp=u-201;
			m4=temp*2.5;
		}
		System.out.println(m4);
		if(240<u){
			m5=u*3;
		}
		System.out.println(m5);
		sum=m1+m2+m3+m4+m5;
		System.out.println("total current bill to pay is "+ sum);
	}

	public static void main(String[] args) {
		double u=200;
		CurrentBill obj=new CurrentBill();
		obj.bill(u);
		
		
	}

}
