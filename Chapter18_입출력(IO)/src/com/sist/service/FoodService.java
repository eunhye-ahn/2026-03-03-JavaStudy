package com.sist.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.sist.dao.FoodDAO;
import com.sist.vo.FoodVO;

import lombok.Getter;

@Getter
public class FoodService {
	private List<FoodVO> fList;
	public FoodService() {
		fList = FoodDAO.fList;
	}
    public List<Optional<FoodVO>> food_list(int page) {
        List<FoodVO> list = new ArrayList<FoodVO>();

        int rowsize = 10;
        int start = (page * rowsize) - rowsize;
        int end = page * rowsize;
        list = fList.subList(start, end);
        return list.stream()
        		.map(Optional::ofNullable)
        		.collect(Collectors.toList());
  //이런페이징도있꾼? 
    }
    public FoodVO detail_food(String foodName) {
    	return fList.stream()
    		.filter(f->f.getName().contains(foodName))
    		.findFirst()
    		.orElse(null);
    }
    //검색
    public List<FoodVO> food_type_find(String type){
    	return fList.stream()
    			.filter(f -> f.getType().contains(type))
    			.collect(Collectors.toList());
    			
    }
    //주소검색
    public List<FoodVO> food_adr_find(String address){
    	return fList.stream()
    			.filter(f -> f.getAddress().contains(address))
    			.collect(Collectors.toList());
    }
	
}
