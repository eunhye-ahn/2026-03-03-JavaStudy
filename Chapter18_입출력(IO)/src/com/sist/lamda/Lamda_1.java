package com.sist.lamda;

import java.util.List;
import java.util.Optional;

public class Lamda_1 {
	public static void main(String[] args) {
//		List<Integer> list = List.of(1,2,3);
//		list.stream()
//		.map(li -> li*2)
//		.forEach(System.out::println);
//		
//		Optional<String> name = Optional.ofNullable(null);
//		System.out.println(name.orElse("이름없음"));
//		
//		Optional<String> name1 = Optional.of("홍길동");
//		System.out.println(name1.get());
//		
//		/**
//		 * 값이 없는경우 : orElse("")
//		 * 값이 존재하는지 : isPresent()
//		 * 값이 있는경우에만 수행 : ifPresent()
//		 * 
//		 */
//		
//		Optional<String> opt = Optional.of("hello");
//		Optional<Integer> len = opt.map(s->s.length());
//		System.out.println(len.get());
//		
//		Optional<String> opt2 = Optional.of("hello");
//		Optional<Integer> result = opt2.flatMap(s->Optional.of(s.length()));
//		//flatMap : Optional 제거 ???
//		System.out.println(result.get());
		
		Optional<Integer> opt3 = Optional.of(2);
		opt3.filter(n->n<10)
		.ifPresent(n-> System.out.println(n+"은 10보다 작음"));
		
;	}
}
