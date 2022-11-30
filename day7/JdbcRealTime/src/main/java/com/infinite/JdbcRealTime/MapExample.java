package com.infinite.JdbcRealTime;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> data = new HashMap<Integer, String>();
		data.put(1, "YESH");
		data.put(2, "YESHU");
		data.put(3, "YESHWANTH");
		data.put(4, "YaSH");
		int key;
		String result;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter key(empno)");
		key=sc.nextInt();
		result=data.getOrDefault(key, "not found");
		System.out.println(result);
	}

}
