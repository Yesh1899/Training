package com.infinite.employproject;

public class Employ {
	private int empno;
	private String name;
	private String dept;
	private double basic;
    private Gender gender;
	private String desig;
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", dept=" + dept + ", basic=" + basic + ", gender="
				+ gender + ", desig=" + desig + "]";
	}
	public Employ(int empno, String name, String dept, double basic, Gender gender, String desig) {
	
		this.empno = empno;
		this.name = name;
		this.dept = dept;
		this.basic = basic;
		this.gender = gender;
		this.desig = desig;
	}
	public Employ() {
		
		// TODO Auto-generated constructor stub
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	
	

}
