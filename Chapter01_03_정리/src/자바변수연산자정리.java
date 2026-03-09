import java.util.Scanner;

public class 자바변수연산자정리 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		
		int min = num1;
		if(min>num2) min = num2;
		if(min>num3) min = num3;
		
		System.out.println(min);
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(a);

		if(a==1) {
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe http://cgv.co.kr");
		}
		

	}

}
