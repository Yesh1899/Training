package com.infinte.sup;
class Employ{
	int empno;
	String name;
	double basic;
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
	
}
class Yeshu extends Employ{

	public Yeshu(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}

public class Supcon {
	public static void main(String[] args) {
		Yeshu obj = new Yeshu(1,"yeshwanth", 8732873);
		System.out.println(obj);
	}

}
