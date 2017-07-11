package com.j1702.action;
import java.sql.SQLException;
import com.j1702.dao.GoodsDao;


public class GoodsAction {

	public void selectGoods() throws SQLException{
		GoodsDao gd=new GoodsDao();
		gd.selectGoods();
	}
	
	public void updateGoodsNum(int id,int num) throws SQLException{
		GoodsDao gd=new GoodsDao();
		gd.updateGoodsNum(id, num);;
	}
}
