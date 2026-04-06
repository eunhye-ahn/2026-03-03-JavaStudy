package com.eunhye.lamda;

import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
class Food{
	private int no;
	private String name;
	private String type;
	private String phone;
	private String address;
	private double score;
	private String parking;
	private String poster;
	private String time;
	private String content;
	private String theme;
	private String price;
}
class FoodManager
{
	// 맛집 전체의 데이터는 공유 => static 
	// 오라클 데이터 => static (공유를 목적으로 한다) 
	public static List<Food> fList=
			     new ArrayList<Food>();
	// 메모리 할당 없이 초기화 
	static 
	{
		// 파일 => CheckedException => 반드시 예외처리 
		try
		{
			FileReader fr=
				new FileReader("C:\\javaDev\\food.txt");
			StringBuffer sb=new StringBuffer();
			// => 파일읽는 경우 => 1글자 
			// => 한줄씩 읽을 수 있다 
			// BufferedReader => IO
			int i=0; // 읽은 char 
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
			}
			fr.close(); // => try~with~resource 
			// 맛집별로 나눠서 저장 
			String[] datas=sb.toString().split("\n");
			// 변수로 나눠서 저장 
			for(String food:datas)
			{
				Food f=new Food();
				StringTokenizer st=
						new StringTokenizer(food,"|");
				f.setNo(Integer.parseInt(st.nextToken()));
				f.setName(st.nextToken());
				f.setType(st.nextToken());
				f.setPhone(st.nextToken());
				f.setAddress(st.nextToken());
				f.setScore(Double.parseDouble(st.nextToken()));
				f.setParking(st.nextToken());
				f.setPoster(st.nextToken());
				f.setTime(st.nextToken());
				f.setContent(st.nextToken());
				f.setTheme(st.nextToken());
				f.setPrice(st.nextToken());
				
				fList.add(f);
			}
			
		}catch(Exception ex) {}
	}
	/*
	 *   1. 정적 변수 : static {}
	 *   2. 인스턴스 변수 : 생성자를 통해 초기화 
	 *   3. 사용자 정의 데이터형 => 데이터를 모아서 한번 브라우저에 전송할 목적 
	 *      DTO (Data Transfor Object)
	 *      --------- 한개에 대한 정보 
	 *                학생 1명 / 맛집 1개 ...
	 */
}

public class Lamda_1 {
	public static void main(String[] args) {
		FoodManager fm = new FoodManager();
		double sum = 0.0;
		int len = fm.fList.size();
		
		for(Food f : fm.fList) {
			sum+=f.getScore();
		}
		
		System.out.printf("전체 평점 평균 : %.2f\n",(sum/len));
		
		double avg = fm.fList.stream()
				.collect(Collectors.averagingDouble(food-> food.getScore()));
		System.out.printf("전체 평점 평균 : %.2f\n",avg);
		
	}
}
