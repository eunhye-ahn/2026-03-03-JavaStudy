package com.eunhye.regex;

import java.lang.reflect.Method;

class Controller{
	public void createPage() {
		System.out.println("생성");
	}
	public void readPage() {
		System.out.println("읽기");
	}
	public void updatePage() {
		System.out.println("수정");
	}
	public void deletePage() {
		System.out.println("삭제");
	}
}
public class 어노테이션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Controller ctr = new Controller();
			Class clasInfo = ctr.getClass();
			Method[] methods = clasInfo.getMethods();
			for(Method m : methods) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
