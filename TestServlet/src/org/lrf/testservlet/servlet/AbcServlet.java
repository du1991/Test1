package org.lrf.testservlet.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/a")
public class AbcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public AbcServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("abcs");
		response.setContentType("application/json");
		
		User user = new User();
		user.setName("luo");
		
		Map<String, Object> result = new HashMap<>();
		result.put("user", user);
		result.put("page", 1);
		
		
		System.out.println(new Gson().toJson(result));
		
		response.getOutputStream().write(new Gson().toJson(result).getBytes());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
