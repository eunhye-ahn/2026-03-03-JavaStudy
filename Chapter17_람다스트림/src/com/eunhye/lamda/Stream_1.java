package com.eunhye.lamda;

import java.util.Arrays;
import java.util.List;

public class Stream_1 {
	public static void main(String[] args) {
		// List.of() : 정적팩토리메서드 <- 보충공부필요
		// Arrays.asList()
		// list.add()
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream()
		.filter(x->x%2==0) //필터 (조건)
		.map(x->x*x) //변환
		.forEach(System.out::println);
		
		List<String> names = Arrays.asList("king","queen","prince","scott");
		names.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
	}
}
