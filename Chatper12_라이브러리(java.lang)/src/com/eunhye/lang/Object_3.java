package com.eunhye.lang;

import lombok.ToString;

/**
 * CICD 할때 우분투로 jar을 묶어서 해야하는데 그때 clone사용?
 * 
 * toString() => 객체를 문자열화 시키는 경우 사용 => 생략가능
 * 
 */
@ToString
class Student{
	private String name = "홍길동";
//	@Override
//		public String toString() {
//			String info = "이름"+name;
//			return info;
//		}
}
public class Object_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		//new : 메모리 공간확보
		//Student() : 생성자 => 인스턴스 변수값 주입
		System.out.println(s);
	}

}
