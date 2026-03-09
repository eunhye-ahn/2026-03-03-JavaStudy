
/*
 * 		System.out.print() => 가로 출력 (inline)
 * 		System.out.println() => 세로 출력 (block)
 * 		System.out.printf() => 서식이 있는 경우
 * 		%d 정수 %s 문자열 %c 문자 %f 실수
 * 
 * 		변수
 * 			데이터형
 * 			(int,long,double,boolean,String,char)
 * 			선언 방식
 * 			(선언만, 선언과 초기값 동시설정)				
 * 			초기값
 * 			(입력, 윈도우, 랜덤, 명시적)
 *  		연산처리 => 산술, 단항, 논리, 비교, 대입
 *  		화면 출력
 *  		(println, printf, print)
 */


public class 변수정리2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%.2f\n", 0.12345);
		System.out.printf("%-4d%-4d%-4d\n", 90,90,90);
		System.out.println(10/3.0);
		System.out.printf("%.2f",10/3.0);
		

	}

}
