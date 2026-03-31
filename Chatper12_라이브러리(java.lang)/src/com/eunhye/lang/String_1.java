package com.eunhye.lang;
//문자열 저장하는 클래스
/**
 * 데이터형과 동시에 클래스형으로도 사용
 * 주로 웹/모바일/윈도우 => 전송하거나 값을 받을때 String으로 받음 Json도 String
 * 정수 / 실수 변환 => Wrapper 클래스
 * 
 * 주요기능
 * 비교 - equals() => 문자열 자체 비교
 * 		compare() => 문자열 크기 비교 => 문자열 정렬
 *  변환 - 
 *   검색 -  startsWith() => 시작문자열같은지 => 쿠키에 저장된 데이터
 *   		endsWith() => 확장자 - 다운로드,파일열기
 *   		contains() => 포함 문자열인지 => 실제검색
 *   		 - toUpperCase() => 대문자 변환
 *   		- toLowerCase() => 소문자변환
 *   		-replace() : 문자열/문자 변경
 *   		-replaceAll() : 정규식을 이용한 변환
 *   문자열 제어 - length : 길이
 *   		-trim() 공백제거
 *   		-substring : 원하는 우치에서 문자열 자르기
 *   		-indexOf 문자,문자열 위치찾기
 *   		-lastIndexOf 뒤에서부터 찾기
 *   		-valueOf() => staic메서드 : 모든 데이터형을 문자열로 변환
 *   	
 * 
 */
class A{
	int aa=100;
}
class B{
	public void changeInt(A a) {
		a.aa = 1000;
	} //콜바이레퍼런스 : 매개변수 => 객체의 주소
}
public class String_1 {
	public void changeString(String s) {
		s = "홍길동변경된";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		System.out.println(s.replace("l", "k"));
		System.out.println(s);
		s = s.replace("l", "k");
		System.out.println(s);
		System.out.println("Hello".substring(1));
		// String은 CallByValue임
		A a =  new A();
		B b = new B();
		
		System.out.println(a.aa);
		b.changeInt(a);
		System.out.println(a.aa); //값변경됨 콜바이레퍼런스
		
		String_1 si = new String_1();
		String s1 = "홍길동";
		si.changeString(s1);
		System.out.println(s1);

	}

}
