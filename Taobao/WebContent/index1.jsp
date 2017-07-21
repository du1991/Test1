<%@page import="com.j1702.model.Users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="java.util.*" %>
	<%@ page import="com.j1702.model.Goods"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>淘宝网</title>
<style>
html, body {
	margin: 0px;
	height: 100%
}

.ul1 {
	list-style-type: none;
	margin: 0px;
	padding: 0px;
	width: 400px;
	margin-left: 48%
}

.ul1>li {
	float: left;
	margin-left: 10px
}

.div1 {
	border: solid 1px;
	height: 120px;
}

.div2 {
	background-color: bisque;
	height: 70%;
	text-align: center;
	margin-left: 10%;
	margin-right: 10%
}

.div3 {
	border: solid 1px;
	height: calc(30% - 130px);
	
}

.div4 {
	width: 25%;
	height: 100%;
	background-color: aquamarine;
	float: left
}

.div5 {
	height: 80%;
	border: solid 1px
}

.div6 {
	height: 20%;
	background-color: aliceblue;
	border: solid 1px;
	
}

.div7 {
text-align:center;
}

.div8 {
	height: 90%
}

.div9 {
	width: 180px;
	height: 100%;
	background-image:
		url(http://oowvabkk3.bkt.clouddn.com/CD5F4AFE-4779-4199-888F-A0BD1BC326A4.png);
	
	float:left;
}
.div10{width:500px;height: 90px;}
.div11{width:220px;height:100%;float:left}

button {
	position: relative;
	left: 75%;
	bottom: 70px;
	height: 50px;
	font-size: 25px
}

.img1 {
	width: auto;
	height: 70px;
}

a {
	text-decoration: none
}
</style>
</head>
<body>
<% List<Goods> li=(List<Goods>)request.getAttribute("ListGoods"); 
%>
	<div class="div1">
		<div class="div10">
		<div class="div9"></div>
		<div class="div11"> 
		<% Users u=(Users)session.getAttribute("ss"); 
			if(u!=null){ if(u.getPassword().equals("admin")&&u.getUsername().equals("admin")){ %>
				欢迎你，亲爱的管理员！
			<% } else{%>
 				欢迎你，亲爱的用户<%= u.getUsername() %>
		<% 	}}
		%>
		</div>
		</div>
		
		<% if(u==null){        %>
		<button><a href="Login.jsp">登录/免费注册</a></button>
		<% } %>
		<% if(u!=null){if(u.getPassword().equals("admin")&&u.getUsername().equals("admin")){%>
			<button > <a href="BackStageServlet">管理后台</a></button>
			
		<% }else{%> 
		<button > <a href="CartServletOri">我的购物车</a></button>
		<% }}else{%>
		<button><a href="Login.jsp">购物车</a></button>
		 <% }%>
	</div>
	 <div class="div2">
		<div class="div8">
		<% if(li!=null) { for(Goods gd:li){%>
			<div class="div4">
				<div class="div5"
		style="background-image: url(<%= gd.getPicture() %>); background-size: cover"></div>
				<div class="div6"><a href="DetailServlet?DetailGoodId=<%= gd.getId()%>"><%= gd.getName() %><br>点击查看详情</a></div>
			</div>
				<% } }%>
			</div>
		</div>
		<div class="div7">
			<%= request.getAttribute("bar") %>
		</div>
	</div> 
	<div class="div3"></div>
</body>
</html>