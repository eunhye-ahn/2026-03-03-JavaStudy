package com.eunhye.lang;
/**
 * record : 
 * 보안을 위해서 사용 세터를 안주고 게터만 제공
 * 데이터를 모아서 브라우저에 전송할 목적
 * 거의 롬복으로 사용//
 */
record Person(String name, int age) {
	
}
public class Object_6 {
	public static void main(String[] args) {
		Person p = new Person("홍길동",20);
		System.out.println(p.name()); //getter
		System.out.println(p.age());
	}


}
