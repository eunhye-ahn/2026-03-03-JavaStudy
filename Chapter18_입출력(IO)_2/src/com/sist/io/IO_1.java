package com.sist.io;

import java.io.File;
import java.text.SimpleDateFormat;

public class IO_1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("C:\\javaDev\\javaStudy\\Chapter18_입출력(IO)_2");
			System.out.println("파일명:"+file.getName());
			System.out.println("파일경로:"+file.getParent());
			System.out.println("파일경로.파일명:"+file.getPath());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println("수정일:"+sdf.format(file.lastModified()));
			System.out.println("숨김파일여부:"+file.isHidden());
			System.out.println("파일여부:"+file.isFile());
			System.out.println("읽기전용:"+file.canRead());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
