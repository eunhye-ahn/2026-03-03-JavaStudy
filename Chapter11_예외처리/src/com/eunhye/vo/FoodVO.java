package com.eunhye.vo;

import lombok.Data;

@Data
public class FoodVO {
	private int no;
	private String name, type, phone, address, parking, poster, images,
	time, content, theme, price;
	private double score;
}
