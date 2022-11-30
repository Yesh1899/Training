package com.infinite.junit;



import static org.junit.Assert.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class EmployTest {
	
	
	@Test
	public void testGettersAndSetters() throws ParseException{
		Employ employ = new Employ();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    employ.setEmp_Id(1);
	    employ.setEmp_Name("kishore");
	    employ.setEmp_mail("kishore@gmail.com");
        employ.setEmp_Mob_No(798182204);
	    employ.setEmp_Dt_Join(Date.valueOf("2000-11-27"));
	    employ.setEmp_Dept("java");
	    employ.setEmp_Manager_Id(10);
	    employ.setEmp_Avail_leave_Bal(20);
	    
	    assertEquals(1, employ.getEmp_Id());
	    assertEquals("kishore", employ.getEmp_Name());
	    assertEquals("kishore@gmail.com", employ.getEmp_mail());
	    assertEquals(798182204, employ.getEmp_Mob_No());
	    assertEquals(Date.valueOf("2000-11-27"), employ.getEmp_Dt_Join());
	    assertEquals("java", employ.getEmp_Dept());
	    assertEquals(10, employ.getEmp_Manager_Id());
	    assertEquals(20, employ.getEmp_Avail_leave_Bal());
	
	}
	@Test
	public void testtoString() throws ParseException{
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Employ employ3 = new Employ(1, "kishore", "kishore@gmail.com",798182204, Date.valueOf("2000-11-27"), "java", 10, 20); 
		String result = "Employ [emp_Id=" + 1 + ", emp_Name=" + "kishore" + ", emp_mail=" + "kishore@gmail.com" + ", emp_Mob_No="
				+ 798182204 + ", emp_Dt_Join=" + "2000-11-27" + ", emp_Dept=" + "java" + ", emp_Manager_Id="
				+ 10 + ", emp_Avail_leave_Bal=" + 20 + "]";
		assertEquals(result, employ3.toString());
		
	}
	@Test
	public void testConstructor() throws ParseException{
		Employ employ = new Employ();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		assertNotNull(employ);
	   Employ employee = new Employ(1, "kishore", "kishore@gmail.com",798182204, Date.valueOf("2000-11-27"), "java", 10, 20);
		assertEquals(1, employee.getEmp_Id());
	    assertEquals("kishore", employee.getEmp_Name());
	    assertEquals("kishore@gmail.com", employee.getEmp_mail());
	    assertEquals(798182204, employee.getEmp_Mob_No());
	    assertEquals(sdf.parse("2000-11-27"), employee.getEmp_Dt_Join());
	    assertEquals("java", employee.getEmp_Dept());
	    assertEquals(10, employee.getEmp_Manager_Id());
	    assertEquals(20, employee.getEmp_Avail_leave_Bal());
	}
	

	
}
