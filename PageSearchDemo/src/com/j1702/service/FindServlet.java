package com.j1702.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.j1702.dao.BookDao;
import com.j1702.model.BookBean;

@WebServlet("/FindServlet") // 配置Servlet为默认执行页
public class FindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FindServlet() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("执行GET请求的方法");
		int currPage = 1; // 当前页码
		if (request.getParameter("page") != null) { // 判断传递页码是否有效
			currPage = Integer.parseInt(request.getParameter("page"));// 对当前页码赋值
		}
		BookDao dao = new BookDao(); // 实例化BookDao
		List<BookBean> list = dao.find(currPage); // 查询所有图书信息
		System.out.println(list);
		request.setAttribute("list", list); // 将list放置到request中
		int pages; // 总页数
		int count = dao.findCount(); // 查询总记录数
		if (count % BookBean.PAGE_SIZE == 0) { // 计算总页数,总记录数和每页显示的数
			pages = count / BookBean.PAGE_SIZE; // 对总页数赋值
		} else {
			pages = count / BookBean.PAGE_SIZE + 1; // 对总页数赋值
		}
		StringBuffer sb = new StringBuffer(); // 实例化StringBuffer
		for (int i = 1; i <= pages; i++) { // 通过循环构建分页导航条
			if (i == currPage) { // 判断是否为当前页
				sb.append("『" + i + "』"); // 构建分页导航条
			} else {
				// 构建分页导航条
				sb.append("<a href='FindServlet?page=" + i + "'>" + i + "</a>");
			}
			sb.append("　"); // 构建分页导航条
		}
		request.setAttribute("bar", sb.toString()); // 将分页导航条的字符串放置到request中
		// 转发到bookList.jsp页面
		request.getRequestDispatcher("bookList.jsp").forward(request, response);
	}
}
