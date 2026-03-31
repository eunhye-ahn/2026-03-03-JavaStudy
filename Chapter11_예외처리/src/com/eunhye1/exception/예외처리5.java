package com.eunhye1.exception;

import java.util.*;

public class 예외처리5 {
//	public static void div(int a, int b) throws ArithmeticException{
//		int c=a/b;
//		System.out.println(c);
//	}
	public static void main(String[] args) {
//		try{
//			div(3,0);
//		}catch(ArithmeticException e) {
//			System.out.println(new ArithmeticException("0으로 나눔"));
//		}
//		String image = null;
//		try {
//			System.out.println(image.length());
//		}catch(NullPointerException e) {
//			System.out.println(new NullPointerException("이미지 없음"));
//		}
		Scanner scan = new Scanner(System.in);
		int res = scan.nextInt();
		try {
			if(res%2!=0) {
				throw new Exception("짝수가 필요합니다.");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
