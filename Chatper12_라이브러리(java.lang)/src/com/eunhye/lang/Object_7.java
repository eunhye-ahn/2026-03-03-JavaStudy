package com.eunhye.lang;

import java.lang.reflect.Method;

//클래스 정보 얻기 => Class.forName() / .getClass / .class
//리플렉션 => 어노테이션으로 빈컨테이너에서 클래스정보를 저장해두고 관리함 (필요한 곳에 DI주입, .. 등)

public class Object_7 {
	public static void main(String[] args) {
		String str = "hello";
		Class clasName = str.getClass(); //클래스 정보 조회
		System.out.println(clasName.getName());	//클래스의 네임 꺼내기
		Object obj = new String();
		System.out.println(obj.getClass());
		//객체 타입 => 데이터형 => 어떤 클래스
		clasName=String.class;
		System.out.println(clasName.getName());
		
		Method[] methods = clasName.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}
}
