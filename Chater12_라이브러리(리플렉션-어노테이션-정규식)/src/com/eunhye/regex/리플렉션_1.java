package com.eunhye.regex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Sawon{
	private int id;
	private String name;
	public Sawon() {
		System.out.println("sawon생성자...");
	}
	public void print() {
		System.out.println("method...");
	}
}
public class 리플렉션_1 {
	public static void main(String[] args) {
		try {
			Class className = Class.forName("com.eunhye.regex.Sawon");
			Constructor con = className.getConstructor();
			Object obj = con.newInstance();
			Method m = className.getMethod("info");
			m.invoke(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}
