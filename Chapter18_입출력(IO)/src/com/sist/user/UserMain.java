package com.sist.user;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.sist.service.FoodService;
import com.sist.vo.FoodVO;

public class UserMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FoodService fService = new FoodService();
		while(true) {
			System.out.println("===Menu===");
			System.out.println("1.목록");
			System.out.println("2.상세보기");
			System.out.println("3.검색(음식종류)");
			System.out.println("4.검색(주소)");
			System.out.println("5.종료");
			System.out.println("=========");
			System.out.println("메뉴선택:");
			int menu = scan.nextInt();
			
			switch(menu){
				case 5 -> {
					System.out.println("프로그램종료");
					System.exit(0);
				}
				case 1 -> {
					System.out.println("페이지 입력 :");
					int page =scan.nextInt();
					List<Optional<FoodVO>> fList = fService.food_list(page);
					List<FoodVO> foods = fList.stream()
							.flatMap(Optional::stream) //null인애들 제거하기 - optional.empty()로 변경되면 자동제거됨
							.toList();
					if(foods.isEmpty()) {
						System.out.println("데이터없음");
					}else {
						foods.stream()
						.forEach(l -> System.out.println(l.getNo()+"."+l.getName()));
					}
	
//					fList.stream()
//					.forEach(food->System.out.println(food.get().getNo()+"."+food.get().getName()));
				}
				case 2 -> {
					System.out.println("상세보기 맛집 이름 : ");
					String input = scan.next(); 
					FoodVO result = fService.detail_food(input);
					System.out.println(result.getNo()+"."
					+result.getName()
					+" "+result.getAddress());
				}
				case 3 -> {
					System.out.println("한식 일식 중식 분식 양식 : ");
					String input = scan.next();
					List<FoodVO> result = fService.food_type_find(input);
					result.stream()
					.forEach(f->System.out.println(f.getName()+"("+f.getType()+")"));
				}
				case 4 -> {
					System.out.println("주소 : ");
					String input = scan.next();
					List<FoodVO> result = fService.food_adr_find(input);
					result.stream()
					.forEach(f->System.out.println(f.getName()+"("+f.getAddress()+")"));
				}
				default -> {
					System.out.println("메뉴가없음");
				}
			}
		}
	}
}
