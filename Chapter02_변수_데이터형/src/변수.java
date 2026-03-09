/**
 *  저장 공간 (메모리)
 *  ----------------------------
 *  stack => 변수 저장 => 메모리 자체 관리
 *  	함수를 벗어나면 자동 삭제 : 함수 실행을 위해 잠깐 쓰는 메모리
 *  	속도 : 힙 < 스택
 *  
 *  heap => 개발자가 만든 => GC가 관리
 *  	실제 데이터 저장 (오래쓰는 데이터)
 *  
 *  
 *  최적화 : 메모리 < 속도
 *  ------------------------------------------------
 * 	정수
 * 		byte : 파일다운로드, 파일복사, 네트워크 전송(인코딩)
 * 		short : c언어 호환 문제 => 거의 사용 X
 * 		int : default	=> 속도빠름, 가장 많이 사용
 * 		long : 빅데이터, 금융권, 공공기업 => 정산, 회계, 통계 
 * 	문자
 * 		char
 * 	논리
 * 		boolean
 * 	참조
 * 		string
 * 	------------------------------------------------
 * 	변수 => 변경가능
 * 	int a = 10; 
 * 
 * 	상수 => 변경불가
 * 	final int A = 10;
 * 
 * 
 * https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%9DGIA
 * 									-----------------
 */


public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * int apple = 3; int bae = 2;
		 * 
		 * 
		 * System.out.println("사과 : " + apple); System.out.println("배 : " + bae);
		 * System.out.println("총 개수 : " + (apple+bae));
		 */
		
		/*
		 * int apple_price = 1000; int bae_price = 2000; int apple_count = 3; int
		 * bae_count = 2;
		 * 
		 * System.out.println("총 가격 : " + (apple_price * apple_count + bae_price *
		 * bae_count));
		 */
		
		int apple = 10;
		int 친구 = 3;
		System.out.println(apple / 3.0);
		
	}

}
