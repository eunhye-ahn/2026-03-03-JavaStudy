package com.eunhye.lang;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Object_4 extends JFrame implements ItemListener{
	JComboBox box = new JComboBox(); //콤보박스
	JLabel la = new JLabel("",JLabel.CENTER);
	public Object_4() {
		box.addItem("홍길동"); //string 이 아니라 object
		box.addItem("홍길삼");
		box.addItem("홍길사");
		
		add("North", box);
		add("Center", box);
		
		setSize(300,350);
		setVisible(true);
		box.addItemListener(this);
	}
	public static void main(String[] args) {
		Object_4 obj = new Object_4();
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == box) {
			String name = box.getSelectedItem().toString(); //Object > 문자열로 변환
			//형변환보다는 toString으로 제어
			la.setText(name);
		}
	}
}
