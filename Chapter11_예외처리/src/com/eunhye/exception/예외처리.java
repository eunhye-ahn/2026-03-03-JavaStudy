package com.eunhye.exception;
import java.lang.reflect.Method;
import java.util.Scanner;

class MyException {
    public void display() {
        System.out.println("MyException Call..");
    }
    public void aaa() {
        System.out.println("MyException Call..aaa");
    }
}

public class 예외처리 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("입력:");
            String m = scan.next();

            Class<?> className = Class.forName("com.eunhye.exception.MyException"); 
            Object obj = className.getDeclaredConstructor().newInstance();           
            Method[] methods = className.getDeclaredMethods();

            for (Method mm : methods) {                       
                if (mm.getName().equals(m)) {
                    mm.invoke(obj, (Object[]) null);            
                }
            }
        } catch (Exception e) {                                 
            e.printStackTrace();
        }
    }
}