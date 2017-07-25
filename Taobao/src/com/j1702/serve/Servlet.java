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

@WebServlet("/")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    public Servlet() {
        super();
    }

	protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GoodsDao gdd=new GoodsDao();
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
		request.setAttribute("ListGoods", li);
		StringBuffer sb=new StringBuffer();
		int pageCount=0;
		try {
			int Counts=gdd.selectCount();
			if(Counts%10==0){pageCount=Counts/10;}
			else{pageCount=Counts/10+1;}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for(int i=1;i<=pageCount;i++){
			if(i==nowpage){sb.append("[" + i + "]");}
			else{sb.append("<a href='Servlet?page="+i+"'>"+i+"</a>");}
		}
		request.setAttribute("bar", sb.toString());
		request.getRequestDispatcher("index1.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
