import java.util.Scanner;


public class 변수2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int apple = 3; apple-=2; System.out.println(apple);
		 */
		
		/*
		 * Scanner scan = new Scanner(System.in); System.out.println("국어 점수 입력 : "); int
		 * 국어 = scan.nextInt(); System.out.println("국어 : " + 국어);
		 * System.out.println("영어 점수 입력 : "); int 영어 = scan.nextInt();
		 * System.out.println("영어 : " + 영어); System.out.println("영어 점수 입력 : "); int 수학 =
		 * scan.nextInt(); System.out.println("수학 : " + 수학);
		 * 
		 * System.out.println(); System.out.println("평균 : " + (국어+영어+수학)/3);
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 영어 수학 입력(1 1 1)");
		int 국어 = scan.nextInt();
		int 영어 = scan.nextInt();
		int 수학 = scan.nextInt();
		
		System.out.printf("평균 : %.2f", (국어+영어+수학)/3.0);
		
		
	}

}
