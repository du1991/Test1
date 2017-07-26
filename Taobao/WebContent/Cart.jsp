<%@page import="com.j1702.model.Carts"%>
<%@page import="java.util.List"%>
<%@page import="com.j1702.model.Goods"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购物车页面</title>
<style>
html, body {
	height: 100%;
	margin: 0;
	background-color: azure;
}

.div1 {
	height: 10%;
}
a{
text-decoration: none;
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
	width: 90%;
	margin-left: 10%;
}

.div3 {
	height: 14%;
	width: 90%;
	margin-left: 10%
}

td {
	width: 200px;
	text-align: center;
	font-size: 25px;
	border: solid 1px;
}

button {
	width: 90px;
	height: 40px;
	font-size: 25px;
}

.input {
	width: 35px;
	text-align: center;
	font-size: 20px;
	border: solid
}

.in {
	width: 35px;
	text-align: center;
	font-size: 20px;
	border: solid;
	background-color: silver;
}
</style>
<script>
    function add(b,ids,c,d){
        var a= document.getElementById(ids).value;
        if(a<b){
        	document.getElementById(ids).value++;
        document.getElementById("lastnum").value++;
        document.getElementById("lastmoney").value=parseInt(document.getElementById("lastmoney").value)+parseInt(document.getElementById(c).value);
        document.getElementById(d).innerHTML=parseInt(document.getElementById(d).innerHTML)+parseInt(document.getElementById(c).value);	
        }
        else{alert("超出数量范围")}
   
    } 
    function reduce(ids,c,d){
        var a=document.getElementById(ids).value;
        if(a>1){
        	document.getElementById(ids).value--;
        	document.getElementById("lastnum").value--;
        	document.getElementById("lastmoney").value=parseInt(document.getElementById("lastmoney").value)-parseInt(document.getElementById(c).value);
        	document.getElementById(d).innerHTML=parseInt(document.getElementById(d).innerHTML)-parseInt(document.getElementById(c).value);
        }
        else{alert("请至少选择一件商品")}
    }
 
    function tell(){
    	alert("该功能开发者未完善！尽情期待...")
    }
    
    function allSelect(){
    	var all=document.getElementById("all");
        var every=document.getElementsByTagName("input");
        for(var c=0;c<every.length;c++){
            every[c].checked=all.checked;
        }
    }
    
    </script>
</head>
<body>
	<%
		List<Carts> ca = (List<Carts>) request.getAttribute("cartgoods");
		int count = 0;
		int sum = 0;
	%>
	<div class="div1">
		<div class="div1_1"></div>
		<div class="div1_2"><a href="Servlet">返回继续购买</a></div>
	</div>
	<div class="div2">
		<form action="CartDeleteServlet">
			<table cellspacing="0">
				<tr>
					<td style="width: 100px;"><input type="checkbox" class="input"
						id="all" onclick="allSelect()">全选</td>
					<td style="width: 150px;">商品名字</td>
					<td>商品简图</td>
					<td>单价</td>
					<td style="width: 250px">数量</td>
					<td>金额</td>
					<td>操作时间</td>
				</tr>
				<%
					if (ca != null) {
						for (Carts caa : ca) {
							count += caa.getBuynum();
							sum += caa.getTotalmoney();
				%>
				<tr>
					<td style="width: 100px"><input type="checkbox" class="input"
						id="single" name="<%=caa.getId()%>" value="ssss"></td>
					<td style="width: 150px;"><%=caa.getGoodsname()%></td>
					<td class="td"
						style="background-image:url(<%=caa.getPicture()%>);background-size:contain"></td>
					<td><input class="input" style="width: 150px"
						value="<%=caa.getLowprice()%>" id="1<%=caa.getId()%>"></td>
					<td style="text-algin: right"><input type="text" value="-"
						onclick="reduce(<%=caa.getId()%>,1<%=caa.getId()%>,2<%=caa.getId()%>)"
						class="in"><input type="text"
						value="<%=caa.getBuynum()%>" id="<%=caa.getId()%>" class="input"><input
						class="in" type="text" value="+"
						onclick="add(<%=caa.getNum()%>,<%=caa.getId()%>,1<%=caa.getId()%>,2<%=caa.getId()%>)">
						<%=caa.getNum()%></td>
					<td id="2<%=caa.getId()%>"><%=caa.getTotalmoney()%></td>
					<td style="font-size: 18px"><%=caa.getTime()%></td>
				</tr>
				<%
					}
					} else {
				%>
				<tr>
					<td colspan="5">您的购物车还没有商品</td>
				</tr>
				<%
					}
				%>
				<tr>
					<td colspan="7">总件数：<input type="text" value="<%=count%>"
						id="lastnum" class="input">件; 总金额：<input type="text"
						value="<%=sum%>" id="lastmoney" class="input" style="width: 70px">元
					</td>
				</tr>
				<tr>
					<td colspan="7"><button type="submit">删除</button>
						<button type="button" onclick="tell()">结账</button></td>
				</tr>
			</table>
		</form>
	</div>
	<div class="div3"></div>
</body>
</html>