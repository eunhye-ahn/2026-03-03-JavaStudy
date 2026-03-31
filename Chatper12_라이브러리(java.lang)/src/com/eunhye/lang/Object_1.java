package com.eunhye.lang;

/**
 * 자바에서 지원하는 클래스 집합 : 라이브러리
 * = 라이브러리
 * 1.자바에서지원
 * 2.외부라이브러리 => 자바 개발업체 / 오픈소스 => mvnrepository.com - lombok.jar/jsoup.jar... 
 * 																+ spring..
 * -----------------+사용자클래스 => 조립
 * java.lang : 자바에서 많이 사용되는 클래스의 집합 => import생략가능 Object
 * java.util
 * java.net
 * java.io
 * java.text
 * -------------------javax(jakarta).http.servlet (<---웹관련 : javax)
 * 웹서버를 설치할때 톰캣을 사용하는데 톰캣 9 => javax --------> 스프링 프레임워크
 * 톰캣 10 이상 => jakarta ------> 스프링부트가 톰캣 10버전 이상부터 지원
 */

//finalize()
class Sawon {
	private String name;
	private String dept;
	public Sawon(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	public void print() {
		System.out.println("이름출력:"+name);
		System.out.println("부서출력:"+dept);
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체메모리해제");
	}
}
public class Object_1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s = new Sawon("홍길동","개발부");
		s.print();
		s=null; //메모리해제 - 소멸 -> 자동 GC 호출 -> GC수거 -> finalize 호출 : Object담당 
		//								>> 자동 => 회수시간 느림
		System.gc(); //빠른 메모리 해제
	}

}
