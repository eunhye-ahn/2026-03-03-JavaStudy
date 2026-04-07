package com.sist.lamda;
import java.util.*;

import javax.swing.JOptionPane;



public class Lamda_2 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("이름을 입력하세요 : ");
		//System.out.println(input); //확인:"" //취소:null
		String result = Optional.ofNullable(input)
				.filter(s->s.length()>=3)
				.map(s->s.toUpperCase())
				.orElse("입력값없음 (취소)");
		System.out.println(result);
		
		
	}
}
