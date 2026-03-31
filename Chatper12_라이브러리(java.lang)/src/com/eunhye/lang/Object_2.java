package com.eunhye.lang;
/**
 * 
 */
class Member implements Cloneable{
	String name = "홍길동";
	public void display() {
		System.out.println(name);
	}
	@Override //깊은복사 - 메모리따로저장
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
	
}
class CallByReference{
	public void change(Member m) {
		m.name = "박문수";
	}
}
public class Object_2 {
	public static void main(String[] args) throws CloneNotSupportedException{
//		Member m = new Member();
//		m.display();
//		Member m2 = m; //같은 메모리주소 -> 얕은복사
//		m.name = "철수";
//		m.display();
//		m2.display();
//		if(m == m2) {
//			System.out.println("주소공유");
//		}
//		CallByReference c = new CallByReference();
//		c.change(m2);
//		m2.display();
		
		//깊은복사
		Member m = new Member();
		m.name = "안은혜";
		Member m2= (Member)m.clone(); //새로운 메모리생성 => 프로토타입패턴 (객체복사)

		m2.display();
		m.display();
		if(m == m2) {
			System.out.println("주소공유");
		}
	}
}
