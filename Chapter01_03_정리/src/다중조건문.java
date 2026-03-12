import java.util.Scanner;

public class 다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.println("날짜 입력 : ");
//		int month = scan.nextInt();
//		
//		if(month == 12 || month == 1 || month == 2) System.out.println(month + "월은 겨울입니다");
//		else if(month == 3 || month == 4 || month == 5) System.out.println(month + "월은 봄입니다");
//		else if(month == 6 || month == 7 || month == 8) System.out.println(month + "월은 여름입니다");
//		else if(month == 9 || month == 10 || month == 11) System.out.println(month + "월은 겨울입니다");
//		else System.out.println("잘못입력");
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("월 입력");
//		int month = scan.nextInt();
//		
//		switch(month)
//		{
//		case 3,4,5 -> 		System.out.println("봄");
//		case 6,7,8 -> 		System.out.println("여름");
//		default -> System.out.println("가을이나 겨울");
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = scan.nextInt();
		
//		if(score >= 90) c = 'A';
//		else if(score >= 80) c = 'B';
//		else c='F';
//		
//		System.out.println(c);
		
		
		char c = switch(score/10) 
		{
		case 10,9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		default -> 'F';
		};
		
		System.out.println(c);
		
				
		
	}

}
