package com.eunhye.manager;
import java.io.*;

import com.eunhye.commons.Manager;
import com.eunhye.vo.*;

public class FoodManager implements Manager {
	   // 맛집 데이터 저장 
	   public static FoodVO[] foods=new FoodVO[29];

	   static 
	   {

		   try
		   {
			   StringBuffer sb=new StringBuffer();

			   int i=0;
			   FileReader in=new FileReader("c:\\javaDev\\food.txt");
			   while((i=in.read())!=-1) // -1 EOF (파일의 끝)
			   {
				   sb.append((char)i);

			   }
			   in.close();
			   
			   String[] datas=sb.toString().split("\n");
			   i=0;
			   for(String data:datas)
			   {
				   System.out.println(data);
				   String[] s=data.split("\\|");
				   FoodVO vo=new FoodVO();
				   vo.setNo(Integer.parseInt(s[0]));
				   vo.setName(s[1]);
				   vo.setType(s[2]);
				   vo.setPhone(s[3]);
				   vo.setAddress(s[4]);
				   vo.setScore(Double.parseDouble(s[5]));
				   vo.setParking(s[6]);
				   vo.setPoster(s[7]);
				   vo.setTime(s[8]);
				   vo.setContent(s[9]);
				   vo.setTheme(s[10]);
				   vo.setPrice(s[11]);
				   foods[i]=vo;
				   i++;
			   }
			   
		   }catch(Exception ex){}
	   }
	   // 기능 
	   @Override
	   public FoodVO[] food_list(int page) {
		// TODO Auto-generated method stub
		int j=0;
		int pagecnt=(page*10)-10;
		int row=10;
		int total=food_total();
		if(total==page)
			row=foods.length%10;
		FoodVO[] food=new FoodVO[row];
		System.out.println("row:"+row);
		for(int i=0;i<foods.length;i++)
		{
			if(j<10 && i>=pagecnt)
			{
				
				food[j]=foods[i];
				j++;
			}
		}
		
		return food;
	   }
	   @Override
	   public FoodVO food_detail(int no) {
		// TODO Auto-generated method stub
		
		return foods[no-1];
	   }
	   @Override
	   public FoodVO[] food_find(String type, String fd) {
		// TODO Auto-generated method stub
		return null;
	   }
	   @Override
	   public FoodVO[] food_filter(String type) {
		// TODO Auto-generated method stub
		int row=0;
		for(FoodVO vo:foods)
		{
			if(vo.getType().contains(type))
			{
				row++;
			}
		}
		FoodVO[] food=new FoodVO[row];
		int i=0;
		for(FoodVO vo:foods)
		{
			if(vo.getType().contains(type))
			{
				food[i]=vo;
				i++;
			}
		}
		
		return food;
	   }
	   @Override
	   public int food_total() {
		// TODO Auto-generated method stub
		 return (int)(Math.ceil(foods.length/10.0));
	   }
	}
