package com.eunhye.customer;

import java.awt.*;
import javax.swing.*;


public class Login extends JPanel{
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2; //로그인, 취소
	
	//시작과 동시에 => 생성자
	public Login() {
		//레이아웃 : 화면 배치
		setLayout(null); //사용자정의
		la1= new JLabel("아이디");
		la2= new JLabel("비밀번호");
		
		tf= new JTextField();
		pf= new JPasswordField();
		
		b1= new JButton("로그인");
		b2= new JButton("취소");
		
		la1.setBounds(10,15,80,30);
		tf.setBounds(95,15,100,30);
		
		la2.setBounds(10,50,80,30);
		pf.setBounds(95,50,100,30);
		
		add(la1);add(tf);
		add(la2);add(pf);
		
		JPanel p = new JPanel();
		p.add(b1); p.add(b2);
		p.setBounds(10,90,235,35);
		add(p);
		
//		setBounds(570, 300, 265, 175);
//		setVisible(true);
	
	}
	
	
}
