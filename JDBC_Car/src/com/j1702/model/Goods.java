package com.j1702.model;

public class Goods {

	private int id;
	private String name;
	private Double price;
	private String factory;
	private String datetime;
	private int quantity;
	
	public Goods(int id){
		this.id=id;
	}
	
	public Goods (int id,String name,int quantity,Double price){
		this.id=id;
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	
	public Goods (String name,int quantity,Double price){
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	}
	
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
