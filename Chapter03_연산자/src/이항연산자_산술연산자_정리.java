import java.text.ChoiceFormat;

public class 이항연산자_산술연산자_정리 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(56)); //이진코드로 변환
		System.out.println(0b111000);					//0b : 이진코드임을 알림
		System.out.println(56 >> 3);
		
		int kor = 60;
		int eng = 70;
		int math = 90;
		
		double[] limits = {60,70,80,90};
		String[] score = {"D","C","B","A"};
		
		ChoiceFormat cf = new ChoiceFormat(limits, score);
		
		System.out.println(cf.format(kor));
		
	}
}
