package com.eunhye1.exception;
//사용자정의예외처리
class CustomException extends Exception{
	public CustomException(String msg) {
		super(msg);  //throw는 exception을 상속받아야만 가능 super로 생성자를 덮어써줘야함
//		this.msg = msg;
	}
}
public class 예외처리8 {
	public static void main(String[] args) {
		char c ='A';
		try {
			if(c>=65 && c<=95) {
				throw new CustomException("소문자만 입력가능");
			}
		}catch(CustomException e) {
			System.out.println(e.getMessage());
		}
	}
}
