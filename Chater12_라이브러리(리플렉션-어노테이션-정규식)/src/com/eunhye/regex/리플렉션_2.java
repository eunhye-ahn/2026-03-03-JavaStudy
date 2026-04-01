package com.eunhye.regex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 리플렉션 : 클래스정보를 조회 (클래스,메서드,멤버변수)
 * IoC컨테이너 : 객체 빈 생성, 생명주기관리, 의존관계파악
 * 어노테이션 : 식별 + 명령어
 * DI : 의존성주입 - 어노테이션에 맞게 IoC컨테이너에서 꺼내서 주입시켜줌 (자동화)
 * 
 * 리플렉션 결과 IoC컨테이너에서 정리 및 관리
 * 1. 구분 : @Target으로 클래스,메서드,생성자,멤버변수 구분함
 * 2. 저장기간 
 * source : 클래스파일이 존재시까지
 * class : 컴파일시만 유지 => 실행시 사라짐
 * ***runtime : 파일 존재, 프로그램 종료시까지
 * 기능은 없고 => 찾기 기능만 가지고 잇음
 * 
 * 어노테이션 : 식별 + 명령어
 * 
 * 매치 
 * 
 * =>스프링
 */
class Student{
	private String name;
	private String address;
	public Student() {
		
	}
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public void create() {
		
	}
	public void read() {
		
	}
	public void update() {
		
	}
	public void delete() {
		
	}
}
public class 리플렉션_2 {
	public static void main(String[] args) {
		try {
			//클래스 객체 생성
			Student std = new Student();
			//클래스 정보조회
			Class clasInfo = std.getClass();
			//클래스의 메서드 조회
			Method[] m = clasInfo.getDeclaredMethods();
			for(Method method : m) {
				System.out.println(method.getName());
			}
			Field[] f = clasInfo.getDeclaredFields();
			for(Field field : f) {
				System.out.println(field.getName());
			}
			Constructor[] c = clasInfo.getDeclaredConstructors();
			for(Constructor con : c) {
				System.out.println(con.getName());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
