package com.j1702.model;

/**
 * Title: BookBean Description: 数据库Book表对应实体类
 */
public class BookBean {
	public static final int PAGE_SIZE = 2; // 每页记录数
	private int id;			// 编号
	private String name;		// 图书名称
	private double price;	// 定价
	private int bookCount;	// 数量
	private String author;	// 作者

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getBookCount() {
		return bookCount;
	}

	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}