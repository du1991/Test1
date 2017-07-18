package com.j1702.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.j1702.db.DB;
import com.j1702.model.Goods;

public class GoodsDao {
	
	public static List<Goods> getAllGoods() throws SQLException{
		Connection co=DB.getConnection();
		String sql="select * from Goods";
		PreparedStatement ps=co.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		List<Goods> li=new ArrayList<Goods>();
		while(rs.next()){
			Goods gd=new Goods();
			gd.setId(rs.getInt("id"));
			gd.setName(rs.getString("name"));
			gd.setNum(rs.getInt("num"));
			gd.setPrice(rs.getFloat("price"));
			gd.setPicture(rs.getString("picture"));
			li.add(gd);
		}
		return li;
	} 
	
}
