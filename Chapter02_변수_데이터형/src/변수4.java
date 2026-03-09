/*
 * 변수 : 하나의 값의 주소의 별칭
 * RAM : 주소 (주소마다 데이터 저장)
 * 	=> 각 4byte => 저장된 위치 기억
 * 
 * 
 * 저장 크기 1/2/4/8 byte => 모아서 크기 지정 (사용자 정의)
 * 
 * 지역변수
 * 	=> stack 공간에 저장
 * 	=> {변수 선언} => 지역변수 ---- 블록이 종료되면 자동 해제 => 메모리 자체 관리
 * 
 * 
 * 캐멀스타일
 * 	가독성 : filename => fileName => 헝가리언식 표현
 * 
 * 
 */


public class 변수4 {
	public static void main(String[] args) {
		System.out.println((int)'A');
		
		byte b1 = 10;
		byte b2 = 20;
		//byte b3 = b1+b2;   //오류 => int 이하 데이터타입(short)이 연산되면 int가 됨
		int b3 = b1+b2;
		
		/*
		 * char => 문자저장
		 * 		=> 0~'A'5535 => 멀티바이트(2byte) => 유니코드
		 * 		=> 각국의 언어 표현이 가능
		 * 		=> 문자 한개만 저장 가능 ''
		 * String => 여러 문자 저장 가능 ""
		 * 
		 */
		
		
	}
}
