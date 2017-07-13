package com.j1702.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.j1702.db.DBUtil;
import com.j1702.model.BookBean;

public class BookDao {

	/**
	 * 分页查询所有商品信息
	 * @param page 页数
	 * @return List<Book>
	 */
	public List<BookBean> find(int page) {
		List<BookBean> list = new ArrayList<>(); // 创建List
		Connection conn = DBUtil.geConnection(); // 获取数据库连接
		// 分页查询的SQL语句
		String sql = "select * from Book order by id asc limit ?,?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql); // 获取PreparedStatement
			ps.setInt(1, (page - 1) * BookBean.PAGE_SIZE); // 对SQL语句中的第1个参数赋值
			ps.setInt(2, BookBean.PAGE_SIZE); // 对SQL语句中的第2个参数赋值
			ResultSet rs = ps.executeQuery(); // 执行查询操作
			while (rs.next()) { // 光标向后移动，并判断是否有效
				BookBean b = new BookBean(); // 实例化BookBean
				b.setId(rs.getInt("id")); // 对id属性赋值
				b.setName(rs.getString("name")); // 对name属性赋值
				b.setPrice(rs.getFloat("price")); // 对price属性赋值
				b.setBookCount(rs.getInt("bookCount")); // 对bookCount属性赋值
				b.setAuthor(rs.getString("author")); // 对author属性赋值
				list.add(b); // 将BookBean添加到List集合中
			}
			rs.close(); // 关闭ResultSet
			ps.close(); // 关闭PreparedStatement
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 查询总记录数
	 * @return 总记录数
	 */
	public int findCount() {
		int count = 0; // 总记录数
		Connection conn = DBUtil.geConnection(); // 获取数据库连接
		String sql = "select count(*) from Book"; // 查询总记录数SQL语句
		try {
			Statement stmt = conn.createStatement(); // 创建Statement
			ResultSet rs = stmt.executeQuery(sql); // 查询并获取ResultSet
			if (rs.next()) { // 光标向后移动，并判断是否有效
				count = rs.getInt(1); // 对总记录数赋值
			}
			rs.close(); // 关闭ResultSet
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count; // 返回总记录数
	}
}