<%@page import="java.util.List"%>
<%@page import="com.j1702.model.Goods"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台操作页面</title>
<style>
html, body {
	height: 100%;
	background-color: azure;
	margin: 0;
}

.div1 {
	height: 10%;
}

.div1_1 {
	height: 100%;
	width: 10%;
	background-image:
		url(http://oowvabkk3.bkt.clouddn.com/CD5F4AFE-4779-4199-888F-A0BD1BC326A4.png);
	background-position: center;
	background-size: cover;
	float: left
}

.div1_2 {
	height: 100%;
	width: 90%;
	margin-left: 10%;
	background-color: antiquewhite;
}

.div2 {
	height: 75%;
	background-color: azure;
	width: 80%;
	margin-left: 10%;
}

.div3 {
	height: 14%;
	width: 70%;
	margin-left: 10%;
	text-align: center;
}

td {
	width: 200px;
	text-align: center;
	font-size: 25px;
	border: solid;
}

input {
	height: 30px;
	font-size: 14px;
}

button {
	width: 90px;
	height: 50px;
	font-size: 25px;
}
</style>
</head>
<body>
	<%
		Goods oo = (Goods) request.getAttribute("LiGood");
	%>
	<div class="div1">
		<div class="div1_1"></div>
		<div class="div1_2"></div>
	</div>
	<div class="div2">
		<form action="BackStageServlet">
			<table>
				<tr>
					<td>商品名称</td>

					<td>原价</td>
					<td>优惠价</td>
					<td>库存</td>
					<td>商品图片</td>
				</tr>
				<tr style="display: none">
					<td></td>

					<td></td>
					<td></td>
					<td><input type="hidden" name="id" value="<%=oo.getId()%>"></td>
					<td style="font-size: 16px;"></td>
				</tr>
				<tr>
					<td><input type="text" name="newname"
						value="<%=oo.getName()%>"></td>

					<td><input type="text" name="newprice"
						value="<%=oo.getPrice()%>"></td>
					<td><input type="text" name="newlowprice"
						value="<%=oo.getLowprice()%>"></td>
					<td><input type="text" name="newnum" value="<%=oo.getNum()%>"></td>
					<td><input type="text" name="newpicture" style="width: 400px"
						value="<%=oo.getPicture()%>"></td>
				</tr>
				<tr>
					<td colspan="5"><button type="submit">提交</button></td>
				</tr>
			</table>
		</form>
	</div>
	<div class="div3"></div>
</body>
</html>