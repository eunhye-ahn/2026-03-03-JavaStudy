import java.util.Arrays;
import java.util.Scanner;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		for(int a:arr) { //배열,컬렉션 : 데이터가 모아진 상태에서 사용 가능 => 같거나 큰 형으로 받을 수 있음
//			System.out.print(a+" ");
//		}
//		System.out.println(arr); //arr[0]의 주소
		
//		int[] arr1 = new int[5]; //자동으로 초기화
//		for(int i=0;i<arr1.length;i++) {
//			arr1[i]=(int)(Math.random()*100)+1; //1~100
//		}
//		for(int a:arr1) {
//			System.out.print(a+" ");
//		}
//		System.out.println(Arrays.toString(arr1));
//		Arrays.sort(arr1);
//		System.out.println(Arrays.toString(arr1));
		
		//여러개 동시에 가져올때
//		String[] names = {"안","은","혜"};
//		String[] address = {"a","e","h"};
//		for(int i=0;i<names.length;i++) {
//			System.out.println(names[i]+"("+address[i]+")");
//		}
//		for(String n:names) {
//			System.out.print(n);
//		}
//		int[] arr1 = new int[5]; //자동으로 초기화
//		for(int i=0;i<arr1.length;i++) {
//			arr1[i]=(int)(Math.random()*100)+1; //1~100
//			System.out.print(arr1[i]+" ");
//		}
//		
//		int max = arr1[0];
//		int min = arr1[0];
//		for(int i:arr1) {
//			if(max<i) max=i;
//			if(min>i) min=i;
//		}	
//		System.out.println();
//		System.out.println(max);
//		System.out.println(min);
//		
//		for(int i=0;i<arr1.length;i++) {
//			if(max==arr1[i]) System.out.println("max"+(i+1)+"번쨰");
//			else if(min == arr1[i]) System.out.println((i+1)+"번째");
//		}

		
//	int[] arr = {1,2,3,4,5};
//	int[] copy = arr;
////	copy[0] = 0;
//
//	int[] copy2 = arr.clone(); //새로운 메모리에 저장
//	copy2[0] = 0;
//	System.out.println(copy2[0]);
//	System.out.println(arr[0]);
//	System.out.println(copy);
//	System.out.println(copy2);
//	System.out.println(arr);
//	//clone or copy
//	
//	System.out.println(Arrays.toString(copy2));
		
//		char[] c = new char[10];
//		System.out.println(c.length);
//		System.out.println(Arrays.toString(c));
//		for(int i=0;i<c.length;i++) {
//			c[i] = (char)((int)(Math.random()*26)+96);
//		}
//		System.out.println(Arrays.toString(c));
//		for(char a:c) {
//			System.out.print(a);
//		}
//		
//		for(char a:c) {
//			System.out.print(a);
//		}
//		int win =0,lose=0,same=0;
//		Scanner scan = new Scanner(System.in);
//		String[] res = {"가위","바위","보"};
//		for(int i=0;i<3;i++) {
//			System.out.print("가위바위보:");
//			int user = scan.nextInt(); //0 1 2
//			if(user<0 || user>2) {
//				i--;
//				continue;
//			}
//			System.out.println("사용자:"+res[user]);
//			int com = (int)(Math.random()*3);
//			System.out.println("컴퓨터:"+res[com]);
//			int r = com-user;
//			if(r==-1 || r==2) win++;
//			else if(r==1 || r==-2) lose++;
//			else same++;
//		}
//		System.out.println("사용자:컴퓨터\n"+win+":"+lose);
//
//		
		
		int[] lotto = new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) { //4,5
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		

			
	}

}
