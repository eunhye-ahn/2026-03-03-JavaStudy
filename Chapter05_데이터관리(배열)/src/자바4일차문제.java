import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 자바4일차문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2
//		char[] c = new char[10];
//		int[] n = {0,1,2,3,4,5};
//		char[] day = {'일', '월', '화', '수', '목', '금', '토'};
//		boolean[] bool = {true, false, false, true};
//
//		char[] alpha = {'a', 'b', 'c', 'd'};
//
//		for(int i=0;i<alpha.length;i++)
//		     System.out.print(alpha[i]);
//		
//		Scanner scan = new Scanner(System.in);
//		int[] arr = new int[10];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = scan.nextInt();
//			if(arr[i]%3==0) System.out.print(arr[i]);
//		}
		
//		int[] arr1 = new int[10];
//		int sum = 0;
//		for(int i=0;i<arr1.length;i++) {
//			arr1[i] = (int)(Math.random()*10)+1;
//			sum += arr1[i];
//		}
//		System.out.println(sum/10.0);
//		
		
		Scanner scan = new Scanner(System.in);
//		int[] arr = new int[5];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = scan.nextInt();
//		}
//		for(int a:arr) {
//			System.out.print(a);
//		}
		
//		String[] arr = new String[10];
//		for(int i=0;i<arr.length;i++) {
//		arr[i] = scan.next();
//	}
//	for(String a:arr) {
//		System.out.print(a);
//	}	
		
//		int[] arr = new int[6];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		System.out.printf("%d%5d%5d",arr[3],arr[5],arr[arr.length-1]);
//		
		
//		int[] arr = new int[3];
//		int max = 0;
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = scan.nextInt();
//			if(max<arr[i]) max = arr[i];
//		}
//System.out.println(max);
		
//		int[] arr = new int[3];
//		int total = 0;
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = scan.nextInt();
//			total += arr[i];
//		}	
//		System.out.printf("%.2f",total/(double)arr.length;);

		int[] arr = {95,75,85,100,50};
		Arrays.sort(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
		
		


	}

}
