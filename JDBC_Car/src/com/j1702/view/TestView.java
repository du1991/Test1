package com.j1702.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.j1702.action.CarAction;
import com.j1702.action.GoodsAction;

public class TestView {

	public static void main(String[] args) throws SQLException {
		while(true){
		System.out.println("请选择菜单 C-查看购物车 G-查看商品 P-付费 退出-其他任意键");
		Scanner scan=new Scanner(System.in);
		String option=scan.next();
		switch(option){
		case "C":
		case "c":
		{
			CarAction c=new CarAction();
			c.selectCart();
		}
		break;
		case "G":
		case "g":
		{
			GoodsAction ga=new GoodsAction();
			ga.selectGoods();
			System.out.println("请按照编码选择您所需的商品：");
			int op=scan.nextInt();
			System.out.println("输入购买数量：");
			int num=scan.nextInt();
			CarAction c=new CarAction();
			c.update(op,num);
			ga.updateGoodsNum(op, num);
			System.out.println("-----------------------");
		}
		break;
		case "P":
		case "p":
		{
			System.out.println("请输入付款人：");
			String shop=scan.next();
			System.out.println("根据购物车中您所选择的商品总额为：");
		}
		break;
		default : scan.close();System.exit(0);
		}
	}
}}
