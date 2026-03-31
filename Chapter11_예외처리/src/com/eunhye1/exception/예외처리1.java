package com.eunhye1.exception;

import java.io.*;
/**
 * 예외복구 : try~catch - 직접처리
 * 예외회피 : throws	- 간접처리
 * 
 * 파일 브라우저에서 열기(오리지널네임, 리소스 객체(파일경로,파일바이너리로읽도록 set), contentType)
 * 파일 아이디 받기 -> 파일 리포에서 찾기 ->  
 * 
 * 파일 다운로드(오리지널네임, 리소스객체(파일경로), )
 * 
 */

public class 예외처리1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FileReader in = null;
//		try {
//			in = new FileReader("C:\\javaDev\\javaStudy\\Chapter08_인터페이스\\src\\인터페이스_1.java");
//			int i=0;
//			while((i=in.read())!=-1) {
//				System.out.print((char)i);
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				in.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
		try(FileReader r = new FileReader("C:\\javaDev\\javaStudy\\Chapter08_인터페이스\\src\\인터페이스_1.java")) 
		{
			int i=0;
			while((i=r.read())!=-1) {
				System.out.print((char)i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		//auto close => 자동으로 파일이 닫기??
		
	}

}
