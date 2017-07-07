package com.j1702.view;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import com.j1702.action.TransferAction;
import com.j1702.action.UserAction;
import com.j1702.db.DBUtil;
import com.j1702.model.Transfer;
import com.j1702.model.User;

public class TestView {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("请操作指令：1-转账；2-查询；其他任意键退出");
			String operator = scan.nextLine();

			switch (operator) {
			case "1":
			{
				System.out.println("请输入付款人姓名：");
				String from_name = scan.nextLine();
				System.out.println("请输入收款人姓名：");
				String to_name = scan.nextLine();
				System.out.println("请输入转账金额：");
				Integer money = scan.nextInt();
				scan.nextLine();
				Transfer tf = new Transfer(from_name, to_name, money);
				
				
				// 处理数据库操作
				UserAction ua = new UserAction();
				// 查询
				User u1 = ua.query(from_name);
				User u2 = ua.query(to_name);
				// 操作金额的增减
				u1.setMoney(u1.getMoney()-money);
				u2.setMoney(u2.getMoney()+money);
				
				// 更新 需要添加事务
	
				Connection conn = DBUtil.geConnection();
				conn.setAutoCommit(false);
				
				ua.update(u1);	
				ua.update(u2);	
				// 增加转账记录
				TransferAction ta = new TransferAction();
				ta.add(tf);	
				
				conn.commit();
			}
				break;
			case "2":
			{
				TransferAction ta = new TransferAction();
				List<Transfer> l_t = ta.query();
				for (Transfer transfer : l_t) {
					System.out.println(transfer.getTime()
							+ "\t->\t"
							+ transfer.getFrom_where() 
							+ "\t->\t"
							+ transfer.getTo_where()
							+ "\t->\t"
							+ transfer.getMoney()
							);
				}
			}
				break;
			default:
			{
				System.out.println("退出！");
				scan.close();
				System.exit(0);
			}
				break;
			}			
		}
	}
}
