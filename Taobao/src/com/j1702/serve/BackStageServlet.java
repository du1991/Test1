package com.j1702.serve;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.j1702.dao.GoodsDao;
import com.j1702.model.Goods;


@WebServlet("/BackStageServlet")
public class BackStageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public BackStageServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//删除处理
		GoodsDao gdd=new GoodsDao();
		if(request.getParameter("deleteid")!=null){
		int deid=Integer.parseInt(request.getParameter("deleteid"));
		Goods good=new Goods();
		good.setId(deid);
		try {
			gdd.delete(good);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		}
		//新增处理
		if(request.getParameter("anewname")!=null){
			String anewname=request.getParameter("anewname");
			int anewnum=Integer.parseInt(request.getParameter("anewnum"));
			Float anewprice=Float.parseFloat(request.getParameter("anewprice"));
			Float anewlowprice=Float.parseFloat(request.getParameter("anewlowprice"));
			String anewpicture=request.getParameter("anewpicture");
			String anewgoodexplain=request.getParameter("anewgoodexplain");
			String anewlowpriceexpalin=request.getParameter("anewlowpriceexpalin");
			Goods good=new Goods();
			good.setGoodexplain(anewgoodexplain);
			good.setLowprice(anewlowprice);
			good.setLowpriceexplain(anewlowpriceexpalin);
			good.setName(anewname);
			good.setNum(anewnum);
			good.setPicture(anewpicture);
			good.setPrice(anewprice);
			try {
				gdd.insert(good);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		
		}
		
		
		//修改处理
		if(request.getParameter("newpicture")!=null||request.getParameter("newprice")!=null||
				request.getParameter("newlowprice")!=null||request.getParameter("newnum")!=null){
			int newid=Integer.parseInt(request.getParameter("id"));
			Goods oldgood=null;
			try {
			  oldgood=gdd.selectById(newid);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			String newpicture=oldgood.getPicture();
			if(request.getParameter("newpicture")!=null){
				newpicture=request.getParameter("newpicture");
			}
			Float newprice=oldgood.getPrice();
			if(request.getParameter("newprice")!=null){newprice=Float.parseFloat(request.getParameter("newprice"));}
			Float newlowprice=oldgood.getLowprice();
			if(request.getParameter("newlowprice")!=null){
				newlowprice=Float.parseFloat(request.getParameter("newlowprice"));
			}
			int newnum=oldgood.getNum();
			if(request.getParameter("newnum")!=null){
				newnum=Integer.parseInt(request.getParameter("newnum"));
			}
			
			Goods good=new Goods();
			good.setPicture(newpicture);
			good.setPrice(newprice);
			good.setLowprice(newlowprice);
			good.setNum(newnum);
			good.setId(newid);
			try {
				gdd.updateById(good);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

		List<Goods> li=null;
		int nowpage=1;
		if(request.getParameter("page")!=null){
			nowpage=Integer.parseInt(request.getParameter("page"));
		}
		try {
			li=gdd.getAllGoods(nowpage);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("List", li);
		StringBuffer sb=new StringBuffer();
		int pageCount=0;
		try {
			int Counts=gdd.selectCount();
			if(Counts%4==0){pageCount=Counts/4;}
			else{pageCount=Counts/4+1;}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for(int i=1;i<=pageCount;i++){
			if(i==nowpage){sb.append("[" + i + "]");}
			else{sb.append("<a href='BackStageServlet?page="+i+"'>"+i+"</a>");}
		}
		request.setAttribute("bar", sb.toString());
		request.getRequestDispatcher("BackStage.jsp").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
