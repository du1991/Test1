package com.j1702.action;

import java.sql.SQLException;

import com.j1702.dao.CarDao;


public class CarAction {

	public void update(int id,int num) throws SQLException{
		CarDao c=new CarDao();
		c.upadte(id,num);
	}
	
	public void selectCart() throws SQLException{
		CarDao c=new CarDao();
		c.selectCart();
	}
	
	public Double total() throws SQLException{
		CarDao c=new CarDao();
		return c.total();
	}
	
	public void delete() throws SQLException{
		CarDao c=new CarDao();
		c.delete();
	}
}
