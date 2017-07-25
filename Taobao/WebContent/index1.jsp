<%@page import="com.j1702.model.Users"%>
<%@page import="com.j1702.model.Goods"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>淘宝网</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
body, html {
	height: 100%;
	margin: 0;
}

#global {
	width: 1900px;
	height: 100%;
	background-color: silver;
}

#heading {
	width: 100%;
	height: 100px;
	background-color: azure;
}

#content_menu {
	width: 5%;
	height: 75%;
	background-color: #C5E9F3;
	float: left;
}

#content_body {
	width: 90%;
	height: 75%;
	background-color: white;
	float: left
}

#floor {
	clear: both;
	height: calc(25% - 100px);
	background-color: silver;
	text-align: center;
	font-size: 30px;
}

.d1 {
	width: 200px;
	height: 100%;
	float: left;
	background: green;
	text-align: center;
	line-height: 100px;
	font-size: 60px;
	color: white
}

.d2 {
	width: 19%;
	height: 50%;
	float: left;
	background-color: antiquewhite;
	margin-left: 1%;
	text-align: center;
}

.d3 {
	height: 80%;
	width: 80%;
	background-color: beige;
	margin-left: 10%;
}

.img {
	width: 100%;
	height: 100%;
}

.d4 {
	font-size: 40px;
}

.b1 {
	height: 45px;
	font-size: 20px;
	left: 70%;
	top: 23%;
	position: relative
}

a {
	text-decoration: none;
}
</style>
</head>

<body>
	<%
		List<Goods> li = (List<Goods>) request.getAttribute("ListGoods");
	%>
	<div id="global">
		<div id="heading">
			<div class="d1">淘宝</div>
			<%
				Users u = (Users) session.getAttribute("ss");
				if (u != null) {
					if (u.getPassword().equals("admin") && u.getUsername().equals("admin")) {
			%>
			欢迎你，亲爱的管理员！
			<%
				} else {
			%>
			欢迎你，亲爱的用户<%=u.getUsername()%>
			<%
				}
				}
			%>
			<%
				if (u == null) {
			%>
			<button class="b1">
				<a href="Login.jsp">登录/免费注册</a>
			</button>
			<%
				}
			%>
			<%
				if (u != null) {
					if (u.getPassword().equals("admin") && u.getUsername().equals("admin")) {
			%>
			<button class="b1">
				<a href="BackStageServlet">管理后台</a>
			</button>
			<%
				} else {
			%>
			<button class="b1">
				<a href="CartServletOri">我的购物车</a>
			</button>
			<%
				}
				} else {
			%>
			<button class="b1">
				<a href="Login.jsp">购物车</a>
			</button>
			<%
				}
			%>
		</div>
		<div id="content_menu"></div>
		<div id="content_body">
			<%
				if (li != null) {
					for (Goods gd : li) {
			%>
			<div class="d2">
				<div class="d3">
					<img class="img" src="<%=gd.getPicture()%>" alt="图片损毁，请联系管理员">
				</div>
				<div calss="d4">
					<a href="DetailServlet?DetailGoodId=<%=gd.getId()%>"><%=gd.getName()%><br>点击查看详情</a>
				</div>
			</div>
			<%
				}
				}
			%>
		</div>
		<div id="floor"><%=request.getAttribute("bar")%></div>
	</div>
</body>
</html>