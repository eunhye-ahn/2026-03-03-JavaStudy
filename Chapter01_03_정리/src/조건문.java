import java.util.Random;

public class 조건문 {

	//짝수 - 홀수 1~100
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int i = r.nextInt(100)+1;
		
		System.out.println(i);
		
		if(i%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
	}

}
