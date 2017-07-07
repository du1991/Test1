package com.j1702.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.j1702.db.DBUtil;
import com.j1702.model.Transfer;

public class TransferDao {

	// 增加
	public void addRecord(Transfer t) throws SQLException {
		Connection conn = DBUtil.geConnection();
		String sql = "insert Transfer (from_where,to_where,money) values(?,?,?)";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, t.getFrom_where());
		ptmt.setString(2, t.getTo_where());
		ptmt.setInt(3, t.getMoney());
		ptmt.execute();
	}

	// 查询
	public List<Transfer> queryTransfers() throws Exception {
		Connection conn = DBUtil.geConnection();
		Statement stmt = conn.createStatement();
		ResultSet res = stmt.executeQuery("select * from Transfer");
		List<Transfer> t_list = new ArrayList<Transfer>();
		Transfer t = null;
		while (res.next()) {
			t = new Transfer();
			t.setFrom_where(res.getString("from_where"));
			t.setTo_where(res.getString("to_where"));
			t.setMoney(res.getInt("money"));
			t.setTime(res.getString("time"));
			t_list.add(t);
		}
		return t_list;
	}
}
