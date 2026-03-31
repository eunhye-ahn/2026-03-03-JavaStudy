package com.eunhye.customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
//@Data
//@ToString
//@EqualsAndHashCode
public class CustomerVO {
	private String customer_id;
	private String login_id;
	private String pwd;
	private String name;
	private String email;
	private String phone;
	private String loc;
	private String regdate;
	private String grade;
}
//C089,user089,pw089,조도현,dohyun.jo89@test.com,010-1000-0089,광주,2023-03-31,GOLD