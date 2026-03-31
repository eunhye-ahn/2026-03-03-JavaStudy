package com.eunhye.exception;

import java.io.FileReader;
import java.io.IOException;

public class 예외처리5 {
	public static void main(String[] args) {
		FileReader in = null;
		try {
			in = new FileReader("");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println(1);
		}
	}
}
