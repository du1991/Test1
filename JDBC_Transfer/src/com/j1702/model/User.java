package com.j1702.model;

public class User {
	
	private Integer id;		// 主键
	private String name;	// 用户名
	private Integer money;	// 用户余额
	
	public User(){}
	
	public User(String name, Integer money){
		this.name = name;
		this.money = money;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}
	
}
