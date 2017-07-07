package com.j1702.action;

import java.util.List;

import com.j1702.dao.TransferDao;
import com.j1702.model.Transfer;

public class TransferAction {

	// 1 新增转账记录
	public void add(Transfer t) throws Exception{
		TransferDao dao = new TransferDao();
		dao.addRecord(t);
	}
	
	// 2 查询转账记录
	public List<Transfer> query() throws Exception{
		TransferDao dao = new TransferDao();
		return dao.queryTransfers();
	}	
}
