package com.infinte.day2;
enum WeekDays {
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY

}

public class Week {
	public static void main(String[] args) {
		WeekDays obj = WeekDays.SATURDAY;
		System.out.println(obj);
		obj=WeekDays.valueOf("MONDAY");
		System.out.println(obj);
		
	}
}


