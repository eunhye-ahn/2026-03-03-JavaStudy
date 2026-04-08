package com.sist.io;


import java.io.File;

//파일 생성, 폴더생성, 삭제
/**
 * 파일제어:입출력
 * => FileInputStream / FileOutputStream
 * => BufferedInputStream / BufferedOutputStream
 * => FileReader / FileWriter
 */
public class IO_3 {
	public static void main(String[] args) {
		try {
			File dir = new File("c:\\upload");
			if(!dir.exists()) {
				dir.mkdir();
			}else {
				System.out.println("이미 폴더가 존재합니다");
			}
//			if(!dir.exists()) {
//				dir.createNewFile();
//				System.out.println("파일생성완료");
//			}else {
//				System.out.println("파일이미존재");
//			}
//			if(dir.exists()) {
//				dir.delete();
//			}
		}catch(Exception e) {
			
		}
	}
}
