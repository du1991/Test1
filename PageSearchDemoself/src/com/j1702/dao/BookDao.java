package com.j1702.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.j1702.db.DB;
import com.j1702.model.Book;

public class BookDao {
	
	public List<Book> selectBook(int nowpage) throws SQLException{
		Connection co=DB.getConnection();
		String sql="select * from Book limit ?,2";
		PreparedStatement ps=co.prepareStatement(sql);
		ps.setInt(1, nowpage*2-2);
		ResultSet rs=ps.executeQuery();
		List<Book> li=new ArrayList<Book>();
		while(rs.next()){
			Book b=new Book();
			b.setAuthor(rs.getString("author"));
			b.setBookCount(rs.getInt("bookCount"));
			b.setId(rs.getInt("id"));
			b.setName(rs.getString("name"));
			b.setPrice(rs.getFloat("price"));
			li.add(b);
		}
		return li;
	}
}
