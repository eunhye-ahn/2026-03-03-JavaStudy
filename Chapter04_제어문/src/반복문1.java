import java.util.Scanner;

public class 반복문1 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("곱셈 시작");
//		int num = scan.nextInt();
//		
//		for(int i=9;i>=1;i--) {	
//			System.out.printf("%d * %d = %d\n", num,i,num*i);
//		}
//
//		
//		String str = "HELLO";
//		for(int i=0;i<str.length();i++) {
//			System.out.print(str.charAt(i));
//		}
//		System.out.println();
//		for(int i=str.length()-1;i>=0;i--) {
//			System.out.print(str.charAt(i));
//		}		
		
//		int num1 = (int)(Math.random()*100)+1;
//		System.out.println(num1);
//		Scanner scan = new Scanner(System.in);
//		

		
//		for(;;) {
//			System.out.println("사용자 입력 : ");
//			int user = scan.nextInt();
//			System.out.println("입력한 값 : "+user);
//			if(num1>user) System.out.println("UP");
//			else if(num1<user) System.out.println("DOWN");
//			else {
//				System.out.println("게임오버");
//				System.exit(0);
//			}
//			
//		}
		
//		int sum =0;
//		for(int i = 0;i<=100;i++) {
//			System.out.print(sum+"+");
//			sum += i;
//			System.out.println(i+"="+sum);
//		}
//		System.out.println(sum);
		
//		int jjak = 0;
//		int odd = 0;
//		
//		for(int i=1;i<=100;i++) {
//			if(i%2==0) jjak += i;
//			else odd += i;
//		}
//		System.out.println("짝수 합 : "+jjak);
//		System.out.println("홀수 합 : "+odd);
		
		
//		int sum = 0;
//		for(int i=1;i<=10;i++) {
//			if(i%2==0) {
//				sum-=i;
//			}else sum +=i;
//		}
//		System.out.println(sum);
		
		for(int i=1;i<=10;i++) {
			if(i%2==0 && i%5==0) System.out.print(i);
		}
	}
}