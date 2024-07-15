package com.util;

import java.util.Calendar;
import java.util.Date;

public class RnD {
	void date() {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getYear());

		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));

	}

	public static void main(String[] args) {
		// Date.year
		
		String digitRegEx = "[0-9]+"; // min:1 max:n 
//		String data = "1234";
//		String data = "1234a";

//		String data = "a1234";	
//		String data = "12a34";

		String data = "9aaaa";
		
		System.out.println(data.matches(digitRegEx));
		
	}	
}// 9aaaa
