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
	margin-left: 10%;
	margin-right: 10%
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
	line-height: 100px;
	background-color: aliceblue;
	border: solid 1px
}

.div7 {
	height: 10%;
	line-height: 50px;
	font-size: 25px
}

.div8 {
	height: 90%
}

.div9 {
	width: 180px;
	height: 90px;
	background-image:
		url(http://oowvabkk3.bkt.clouddn.com/CD5F4AFE-4779-4199-888F-A0BD1BC326A4.png);
	position: relative;
	left: 10px;
	top: 10px
}

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
<% List<Goods> li=(List<Goods>)request.getAttribute("List_Goods"); 
out.print(li.get(0).getPicture());
%>

	<div class="div1">
		<div class="div9"></div>
		<button>登录/免费注册</button>
		<button>购物车</button>
	</div>

	<%-- <div class="div2">
		<div class="div8">
			<div class="div4">
				<div class="div5"
					style="background-image: <%= li.get(0).getPicture() %>; background-size: cover"></div>
				<div class="div6">num.01</div>
			</div>
			<div class="div4">
				<div class="div5"
					style="background-image: <%= li.get(1).getPicture()%>; background-size: cover"></div>
				<div class="div6">num.02</div>
			</div>
			<div class="div4">
				<div class="div5"
					style="background-image: <%= li.get(2).getPicture()%>; background-size: cover"></div>
				<div class="div6">num.03</div>
			</div>
			<div class="div4">
				<div class="div5"
					style="background-image: <%= li.get(3).getPicture()%>; background-size: cover"></div>
				<div class="div6">num.04</div>
			</div>
		</div>
		<div class="div7">
			<ul class="ul1">
				<li>1</li>
				<li>2</li>
				<li>3</li>
			</ul>
		</div>

	</div> --%>
	<div class="div3"></div>
</body>
</html>