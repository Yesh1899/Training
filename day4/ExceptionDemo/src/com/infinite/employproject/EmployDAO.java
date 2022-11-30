package com.infinite.employproject;

import java.util.ArrayList;
import java.util.List;

public class EmployDAO {
	static List<Employ> employList;
	static{
		employList=new ArrayList<Employ>();
	}
	public String updateEmployDAO(Employ employNew) {
		Employ employFound=searchEmployDAO(employNew.getEmpno());
		if(employFound!=null){
			for (Employ employ : employList) {
				if(employ.getEmpno()==employNew.getEmpno()){
					employ.setName(employNew.getName());
					employ.setDept(employNew.getDept());
					employ.setDesig(employNew.getDesig());
					employ.setGender(employNew.getGender());
					employ.setBasic(employNew.getBasic());
				}
			}
			return"employ record updated";
		}
		return "record not found";
		
	}
	public String deleteEmployDAO(int empno) {
		Employ employFound = searchEmployDAO(empno);
		if(employFound!=null){
			employList.remove(employFound);
			return "employ record deleted...";
		}
		return "Employ record not found";
	}
	public Employ searchEmployDAO(int empno) {
		Employ employFound=null;
		for (Employ employ : employList) {
			if(employ.getEmpno()==empno){
				employFound=employ;
			}
		}
		return employFound;
	}
	public List<Employ> showEmployDAO() {
		return employList;
		
	}
	public String addEmployDAO(Employ employ){
		employList.add(employ);
		return "Employ record inserted";
	}

}
