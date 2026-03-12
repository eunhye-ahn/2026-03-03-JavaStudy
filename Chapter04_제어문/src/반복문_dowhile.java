import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 반복문_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 1;
//		while(i<=9) {
//			if(i==2) {
//				continue;
//			}
//			System.out.println(i);
//			i++;
//		}
		
//		char c = 'A';
//		do {
//			System.out.print(c+" ");
//			c++;
//		}while(c<'Z');
//		System.out.println("\n"+c);
		
//		String s = JOptionPane.showInputDialog("문자열입력");
//		System.out.println("글자수"+s.length());
//		int count =0;
//		i=0;
//		do
		
		Scanner scan = new Scanner(System.in);
		
//		int com = (int)Math.random()*100+1;
//		Random r = new Random();
//		int com = r.nextInt(100)+1;
//		System.out.println(com);
//		
//		do {
//		System.out.println("사용자 입력 : ");
//		int user = scan.nextInt();
//		
//		if(user<1 || user>100) {
//			System.out.println("잘못된 입력");
//			continue;
////			System.out.println(1);
//		}
//		if(user > com) System.out.println("DOWN");
//		else if(user < com) System.out.println("UP");
//		else {
//			System.out.println("GAME OVER");
//			System.exit(0);
//		}
//		} while(true);		
		
		for(int i =0;i<=10;i++) {
			if(i==5) break;
			System.out.print(i);
		}
		
		for(int i =0;i<=10;i++) {
			if(i==5) continue;
			System.out.print(i);
		}		

	}

}
