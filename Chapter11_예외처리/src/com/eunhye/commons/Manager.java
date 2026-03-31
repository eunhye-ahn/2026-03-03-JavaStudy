package com.eunhye.commons;
import com.eunhye.vo.*;

public interface Manager {
	  // 목록 
	  public FoodVO[] food_list(int page);
	  public int food_total();
	  // 상세보기 
	  public FoodVO food_detail(int no);
	  // 검색 
	  public FoodVO[] food_find(String type,String fd);
	  // => 1. 주소 , 2. 음식종류 , 3. 맛집명 
	  // 필터링 => 한식 / 중식 / 양식 / 일식 / 분식
	  public FoodVO[] food_filter(String type);
	}