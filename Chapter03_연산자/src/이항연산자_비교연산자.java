/*
 * A 65 a 97 0 48
 */


public class 이항연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b1 = 'A' == 'B'; 
		
		System.out.println(b1); //false
		
		b1 = 'A' != 'B';
		System.out.println(b1); //true
		
		b1 = 'A' <= 'B';
		System.out.println(b1); //true
		
		b1 = 'A' >= 'B';
		System.out.println(b1); //false
		
		boolean B1 = true;
		boolean B2 = false;
		
		b1 = B1==B2; //false
		//b1 = B1<B2; //err
	}

}
