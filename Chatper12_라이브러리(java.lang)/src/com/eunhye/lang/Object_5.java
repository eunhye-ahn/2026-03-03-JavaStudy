package com.eunhye.lang;

import java.util.Objects;
/**
 * String은 Object의 equals가 재정의된 상태
 * 객체를 비교할때는
 * 해시코드 오버라이딩 => 메모리주소를 같게만든다
 * equals 오버라이딩 => 주소가 아닌 값으로 비교하도록 만든다
 * ==> HashMap은 해시코드로 먼저 찾고 이퀄스로 비교하므로 둘다 오버라이딩
 */

/**
 * 언제 사용?
 * 중복이 없는 객체 생성 => Set : hashCode + equals 사용
 * 권한관리
 * 연관관계 매핑 - oneToMany
 * 카테고리/태그 
 * 
 * oneToMany 은 Json변환시 무한 순환참조 발생 가능성 있음
 * >> @JsonIgnore로 순환끊기
 * 
 * 하지만! 그래도 단방향으로 처리하자!!
 */

//equals (객체비교)/ hashCode (객체식별)
class Human {
	String id,name;
	public Human(String id, String name) {
		this.id = id;
		this.name = name;
	}
	//오버라이딩 => 값만 비교하도록
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Human h = (Human)obj;
		return name.equals(h.name)&&id.equals(h.id);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id,name);
	}
}
public class Object_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h = new Human("hong", "gildong");
		Human h2 = new Human("hong", "gildong");
		
		System.out.println(h.hashCode());
		System.out.println(h2.hashCode()); //해시코드 => 식별자
		if(h.equals(h2)){ //equals => 주소비교
			System.out.println("동일");
		}else {
			System.out.println("다름");
		}
	}

}
