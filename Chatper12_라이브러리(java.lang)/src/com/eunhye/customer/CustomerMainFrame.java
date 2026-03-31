package com.eunhye.customer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class CustomerMainFrame extends JFrame implements ActionListener{
	CardLayout card = new CardLayout();
	Login login = new Login();
	CustomerDataCollection cdc = new CustomerDataCollection();
	CustomerList cList = new CustomerList();
	public CustomerMainFrame() {
		setLayout(card);
		add("login", login);
		add("cList",cList);
		setSize(950,700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		
	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		}catch(Exception e) {
			
		}
		new CustomerMainFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == login.b2) {
			JOptionPane.showMessageDialog(this, "프로그램을 종료합니다");
			System.exit(0);
		}
		else if(e.getSource() == login.b1) {
			String id = login.tf.getText();
			if(id.trim().length()<1) {
				JOptionPane.showMessageDialog(this, "id를 입력하세요");
				login.tf.requestFocus();
				login.tf.setText("");
				return;
			}
			String pwd = String.valueOf(login.pf.getPassword());
			if(pwd.trim().length()<1) {
				JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
				login.pf.requestFocus();
				login.pf.setText("");
				return;
			}
			String res = cdc.isLogin(id, pwd);
			if(res.equals("NOID")) {
				JOptionPane.showMessageDialog(this, "아이디가 존재하지않습니다");
				login.tf.setText("");
				login.pf.setText("");
				login.tf.requestFocus();
			}else if(res.equals("NOPWD")) {
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");
				login.pf.setText("");
				login.pf.requestFocus();
			}else {
				JOptionPane.showMessageDialog(this, "로그인에 성공하였습니다");

				String name = res.substring(res.indexOf("|")+1);
				
				setTitle(name+"님 로그인되었습니다");
				card.show(this, "cList");

			}
		}
	}

}
