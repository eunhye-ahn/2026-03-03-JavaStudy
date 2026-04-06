package com.eunhye.lamda;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
class User{
	private String name;
	private int age;
}
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
class Order{
	private String userName;
	private int price;
}
public class Stream_3 {
	public static void main(String[] args) {
		List<User> users = Arrays.asList(
				new User("eunhye",25),
				new User("eunhye2",17),
				new User("eunhye1",26),
				new User("eunhye3",28),
				new User("eunhye4",35)
				);
		List<Order> orders = Arrays.asList(
				new Order("eunhye2",20000),
				new Order("eunhye2",30000),
				new Order("eunhye2",10000),
				new Order("eunhye4",50000),
				new Order("eunhye4",10000)
				);
		//1.성인회원
		List<User> adults = users.stream()
				.filter(user->user.getAge()>=20)
				.collect(Collectors.toList());
		adults.stream()
		.forEach(user->System.out.println(user.getName()+"("+user.getAge()+")"));
		
		//이름만 추출
		List<String> names = users.stream()
				.map(user -> user.getName())
				.collect(Collectors.toList());
		names.stream()
		.forEach(name->System.out.println(name));
		
		//특정회원
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		List<Order> kim = orders.stream()
				.filter(o->o.getUserName().equals(n))
				.collect(Collectors.toList());
		kim.stream()
		.forEach(o -> System.out.println(o.getPrice()));
		
		//총주문금액계산
		int total = orders.stream()
				.map(o -> o.getPrice())
				.reduce(0, (a,b)->a+b);
		DecimalFormat df = new DecimalFormat("#,###원");
		System.out.println(df.format(total));
		
		//
		Optional<Order> maxOrder =
				orders.stream()
				.max(Comparator.comparing(Order::getPrice));
		System.out.println(maxOrder);

	}
}
