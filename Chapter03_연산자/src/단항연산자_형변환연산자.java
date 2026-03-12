import java.util.Scanner;

public class 단항연산자_형변환연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 :");
		int num1 = scan.nextInt();
		System.out.print("+ - * / : ");
		String yeon = scan.next();
		System.out.print("두번째 정수 :");
		int num2 = scan.nextInt();
		
		
//		if(yeon.equals("+")) System.out.printf("%d + %d = %d", num1,num2,num1+num2);
//		else if(yeon.equals("-")) System.out.printf("%d - %d = %d", num1,num2,num1-num2);
//		else if(yeon.equals("*")) System.out.printf("%d * %d = %d", num1,num2,num1*num2);
//		else if(yeon.equals("/")) {
//			if(num2==0) {System.out.println("0으로 처리 X");}
//			else {System.out.printf("%d / %d = %d", num1,num2,num1/num2);}
//			}
//		}
		
		
//		switch(yeon)
//		{
//		case "+" :
//			System.out.printf("%d + %d = %d", num1,num2,num1+num2);
//			break;
//		case "-" :
//			System.out.printf("%d + %d = %d", num1,num2,num1-num2);
//			break;
//		case "*" :
//			System.out.printf("%d + %d = %d", num1,num2,num1*num2);
//			break;
//		case "/" :
//			System.out.printf("%d + %d = %d", num1,num2,num1/num2);
//			break;
//		default :
//			System.out.println("잘못된 연산자");
//		}
		
		switch(yeon)
		{
		case "+", "%" -> {
			System.out.printf("%d + %d = %d", num1,num2,num1+num2);
			System.out.println("프로그램종료");
		}
		case "-" -> System.out.printf("%d + %d = %d", num1,num2,num1-num2);
		case "*" -> System.out.printf("%d + %d = %d", num1,num2,num1*num2);
		case "/" -> System.out.printf("%d + %d = %d", num1,num2,num1/num2);
		default -> System.out.println("잘못된 연산자");
		}

	}
}

