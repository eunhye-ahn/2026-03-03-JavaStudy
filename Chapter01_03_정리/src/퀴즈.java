
public class 퀴즈 {

	public static void main(String[] args) {
		// 변수
		int apple = 3;		
		int pencil = 5;
		int jiugae = 2;
		int student = 30;
		int milk = 2500;
		double height = 175.5;
		String name = "Minsu";
		int bus = 12;
		int subway = 20;
		int kor = 85;
		int eng = 90;
		double pie = 3.14;
		int labtop = 1;
		int mouse = 2;
		int keyboard = 1;
		
		int add = 5+3;
		int minus = 10-4;
		int gob = 6*7;
		int nanugi = 20/4;
		
		int nameogi = 15%4;
		int yeon1 = (8+2)*3;
		int yeon2 = 10;
		yeon2++;
		int yeon3 = 10;
		yeon3--;
		boolean bigyo = 7>5;
		int a =5;
		int b = 10;
		boolean bigyo2 = a>3 && b<20;
		
		//조건문
		int num = 0;
		if(num>10) {
			System.out.println("10보다 큽니다");
		}
		
		int score = 0;
		if(score>=60) {
			System.out.println("합격");
		}
		
		int age = 0;
		if(age>=20) {
			System.out.println("성인입니다");
		}
		
		if(num%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		if(score>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		double temperature = 0.0;
		if(temperature>=30) {
			System.out.println("덥다");
		}else {
			System.out.println("덥지않다");
		}
		
		if(score>=90) System.out.println('A');
		else if(score>=80) System.out.println('B');
		else if(score>=70) System.out.println('C');
		else System.out.println('D');
		
		if(num>0) System.out.println("양수");
		else if(num==0) System.out.println("0");
		else System.out.println("음수");
		
		if(age<=13) System.out.println("어린이");
		else if(age<=19) System.out.println("청소년");
		else System.out.println("성인");
		
		if(num>10) System.out.println("10보다큼");
		else if(num == 10) System.out.println("10과 같음");
		else System.out.println("10보다 작음");
		
		
	}

}
