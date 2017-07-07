package com.j1702.model;

// 转账记录表的映射
public class Transfer {

	private Integer id;			// 主键
	private String from_where;	// 转账人
	private String to_where;	// 收款人
	private Integer money;		// 转账金额
	private String time;		// 转账金额
	
	// 无参构造
	public Transfer(){}
	
	// 有参构造
	public Transfer( String from_where, String to_where, Integer money) {
		this.from_where = from_where;
		this.to_where = to_where;
		this.money = money;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFrom_where() {
		return from_where;
	}

	public void setFrom_where(String from_where) {
		this.from_where = from_where;
	}

	public String getTo_where() {
		return to_where;
	}

	public void setTo_where(String to_where) {
		this.to_where = to_where;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
