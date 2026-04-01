package com.eunhye.regex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class 정규식_6 {
	public static void main(String[] args) {
		System.out.println("dat".matches("[abc]at"));
		System.out.println("A".matches("[a-z]"));
		
		System.out.println("코메디".matches("[가-힣]{3}"));
		
		System.out.println("aabb".matches("(a+b+)+"));
		
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sf.format(date));
	}
}
