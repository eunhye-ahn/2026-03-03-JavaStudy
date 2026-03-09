
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*100)+1;
		System.out.println(num);
		
		String a = num%2==0? "짝수" : "홀수";
		System.out.println(a);
		
		int num1 = 1;
		char c = num1==0 ? (char)((int)(Math.random()*26)+65): //65~90 A~Z
			(char)((int)(Math.random()*26)+97);					//97~123 a~z
		
		System.out.println(c);
		
		//scan : char은 못받음
		
		int n1 = (int)(Math.random()*100)+1;
		int n2 = (int)(Math.random()*100)+1;
		int n3 = (int)(Math.random()*100)+1;
		
		int max = n1>n2? n1 : n2;
		int min = n1<n2? n1 : n2;
		String number3 = n3%3==0 ? "3의 배수" : "3의배수X";
		System.out.println(n3+","+number3);
		
		System.out.println(max);
		System.out.println(min);
		

	}

}
