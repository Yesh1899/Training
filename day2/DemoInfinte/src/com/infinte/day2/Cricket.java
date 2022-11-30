package com.infinte.day2;

public class Cricket {
	static int score;
	public void increment(int x) {
		score++;
		
	}

	public static void main(String[] args) {
		Cricket fb= new Cricket();
		Cricket sb= new Cricket();
		Cricket tb= new Cricket();
		
		fb.increment(9);
		sb.increment(8);
		tb.increment(7);
        System.out.println(score);
		
		
	}

}
