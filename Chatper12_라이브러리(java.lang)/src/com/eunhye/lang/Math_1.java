package com.eunhye.lang;
/**
 * Math => ceil() , random(), round()
 * 			올림					반올림
 */
public class Math_1 {
	public static void main(String[] args) {
		String[] names = {
				"aa","bb","cc",
				"dd","ee","ff",
				"ii","jj","kk",
				"mm","nn","pp",
				"ww","xx","yy"
		};
		//5개씩 나눠서 출력 => 총페이지
		System.out.println((int)Math.ceil(names.length/5.0));
		//원형 => double ceil(double a)
		int rand = (int)(Math.random()*100)+1;
		System.out.println(rand);
		
		double d = Math.round(10.6);
		System.out.println(d);
	}
}
