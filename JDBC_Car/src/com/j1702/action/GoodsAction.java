package com.j1702.action;
import java.sql.SQLException;
import java.util.List;

import com.j1702.dao.GoodsDao;
import com.j1702.model.Goods;


public class GoodsAction {

	public List<Goods> selectGoods() throws SQLException{
		GoodsDao gd=new GoodsDao();
		return gd.selectGoods();
	}
	
	public void updateGoodsNum(int id,int num) throws SQLException{
		GoodsDao gd=new GoodsDao();
		gd.updateGoodsNum(id, num);;
	}
}
