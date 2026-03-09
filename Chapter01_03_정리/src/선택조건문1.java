import java.util.Scanner;

public class 선택조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "admin1234";
		String pw = "1234";
		
		if(id.equals("admin1234") && pw.equals("1234")) {
			System.out.println("관리자");
		}else {
			System.out.println("관리자X");
		}
		
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		if((year%4==0) && (year%100!=0) || (year%400==0)) {
			System.out.println("윤년");
		}else {
			System.out.println("윤년X");
		}
	}

}
