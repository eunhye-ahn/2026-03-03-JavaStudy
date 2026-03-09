import javax.swing.*;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 * 
 *		날짜나 시간을 가져올때 : Long 
 *
 *		변수 = 초기값
 *			---- 명시적
 *			---- 입력값 : scanner
 *			---- 랜덤
 *				Math.random() => (int)(0.0~0.99) => 0~99
 *			---- 윈도우 : dos창에서 입력 받기
 */


public class 변수정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File f = new File("C:\\javaDev\\javaStudy\\Chapter02_변수_데이터형\\src\\변수정리.java");
//		long fileType = f.lastModified();  //=> 파일이 마지막으로 수정된 시간을 밀리초로 계산
//		System.out.println(fileType);
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(fileType))); 
//		=> SimpleDateFormat : Date 객체를 보고 문자열로 변환

		
//		String name = JOptionPane.showInputDialog("이름입력 :"); //팝업을 띄워서 입력 받기
//		System.out.println(name);
		
		int kor = (int)(Math.random()*101); // (int)0 ~ 100.99 => 0~100
		int eng = (int)(Math.random()*101);
		int math = (int)(Math.random()*101);
		
		System.out.println(kor);
		System.out.println(eng);
	}

}