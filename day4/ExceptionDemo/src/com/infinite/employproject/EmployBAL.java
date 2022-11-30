package com.infinite.employproject;

import java.util.List;

public class EmployBAL {
	static StringBuilder sb = new StringBuilder();
	static EmployDAO dao= new EmployDAO();
	public List<Employ> showEmployBal() {
		return dao.showEmployDAO();		
	}
	public Employ searchEmployBAL(int empno) {
		return dao.searchEmployDAO(empno);
	}
	public String deleteEmployBAL(int empno) {
		return dao.deleteEmployDAO(empno);
	}
	public String updateEmployBAL(Employ employ) throws EmployException {
		if(invalid(employ)==false){
			throw new EmployException(sb.toString());
		}
		return dao.updateEmployDAO(employ);
		
		
	}
	
	public String addEmployBal(Employ employ) throws EmployException {
		if(invalid(employ)==false){
			throw new EmployException(sb.toString());
		}
		return dao.addEmployDAO(employ);
	}
	public boolean invalid(Employ employ) {
		boolean valid=true;
		if(employ.getEmpno()<=0){
			valid=false;
			sb.append("employ no cant be negative or zero\r\n");
		}
		if(employ.getName().length()<6){
			valid=false;
			sb.append("employ name should be more characters\r\n");
		}
		if(employ.getDept().length()<4){
			valid=false;
			sb.append("dept should be more \r\n");
		}
		if(employ.getDesig().length()<5){
			valid=false;
			sb.append("design should be more\r\n");
		}
		if(employ.getBasic()<5000||employ.getBasic()>80000){
			valid=false;
			sb.append("basic should be less\r\n");
		}
		return valid;
	}

}
