
public class 중첩반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  		for(int i=2;i<=9;i++) { 
//			System.out.println("============="+i+"단=============");
//			for(int j=1;j<=9;j++) {	
//				System.out.printf("%d * %d = %d\n",i,j,i*j);
//			}
//		}
//		
		//2일때 9바퀴 
  		
//  		for(int i=1;i<=5;i++) { //5줄
//  			for(int j=1;j<=3;j++) {		//3개
//  				System.out.print("●");
//  			}
//  			System.out.println();
//  		}
  		
		
//		char c ='A';
//		for(int i=1;i<=4;i++) {
//			c = 'A';
//			for(int j=1;j<=3;j++) {
//				System.out.print(c++);
//			}
//			System.out.println();
//		}
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(j==3) System.out.print("●");
//				else System.out.print("◎");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(j==i) System.out.print("●");
//				else System.out.print("◎");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(j==i || j==6-i) System.out.print("●");
//				else System.out.print("◎");
//			}
//			System.out.println();
//		}
		
//		for(int i=0;i<=5;i++) {
//			for(int j=1;j<=5-i;j++) {
//				System.out.print("*");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		int kor = 70;
		int eng = 70;
		int math = 71;
		
		int total = kor+eng+math;
		double avg = total/3.0;
		
		System.out.printf("%d%6.2f",total,avg);
		

		
		
	}
}
