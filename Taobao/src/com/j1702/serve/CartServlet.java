package com.j1702.serve;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Session;

import com.j1702.dao.CartsDao;
import com.j1702.dao.GoodsDao;
import com.j1702.model.Carts;
import com.j1702.model.Goods;
import com.j1702.model.Users;


@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CartServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int GoodsIdDetail=Integer.parseInt(request.getParameter("GoodsIdDetail"));
		int buynum=Integer.parseInt(request.getParameter("buynum"));
		Users uss=(Users) request.getSession().getAttribute("ss");
		
		GoodsDao gdao=new GoodsDao();
		Goods gd=null;
		try {
			gd=gdao.selectById(GoodsIdDetail);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Carts ca=new Carts();
		
		ca.setBuynum(buynum);
		ca.setLowprice(gd.getLowprice());
		ca.setPicture(gd.getPicture());
		ca.setPrice(gd.getPrice());
		ca.setTotalmoney(gd.getLowprice()*buynum);
		ca.setUserid(uss.getId());
		ca.setNum(gd.getNum());
		ca.setGoodsname(gd.getName());
		
		CartsDao cad=new CartsDao();
		try {
			cad.insert(ca);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("CartServletOri").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
