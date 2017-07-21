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
        html,body{height: 100%;margin: 0}
        .div1{height:10%;}
        .div1_1{height: 100%;width:10%;background-image: url(http://oowvabkk3.bkt.clouddn.com/CD5F4AFE-4779-4199-888F-A0BD1BC326A4.png);background-position: center;background-size: cover;float: left}
        .div1_2{height: 100%;width: 70%;margin-left: 10%;background-color:antiquewhite;}
        .div2{height: 75%;background-color: azure;width: 70%;margin-left: 10%;}
        .div3{height:14%;width: 70%; border: solid 1px;margin-left: 10%;text-align:center}
        .input{width: 40px;height:40px;margin-top: 0px;}
        td{width: 200px;text-align: center;font-size: 25px}
        button{width: 90px;height: 50px;font-size: 25px;}
        .button{width: 200px;height: 50px;font-size: 25px;}
    </style>
</head>
<body>
<% List<Goods> gd=(List<Goods>)request.getAttribute("List"); %>
    <div class="div1">
        <div class="div1_1"></div>
        <div class="div1_2"> </div>
    </div>
    <div class="div2" >
        <form action="">
            <table>
                <tr>
                   <td><input type="checkbox" class="input">全选</td>
                   <td>商品图片</td>
                   <td>原价</td>
                   <td>优惠价</td>
                   <td>库存</td>
                   <td>删除</td>
                   <td>修改</td>
                </tr>
                <% for(Goods oo:gd){%>
                <tr>
                <td><input type="checkbox" class="input"></td>
                <td style="background-image:url(<%= oo.getPicture()%>);background-size:contain"></td>
                <td><%= oo.getPrice()%></td>
                <td><%= oo.getLowprice()%></td>
                <td><%= oo.getNum()%></td>
                 <td><button ><a href="BackStageServlet?deleteid=<%= oo.getId()%>">删除</a></button></td>
                  <td><button><a href="UpdateAddGoodsServlet?updateid=<%= oo.getId()%>">修改</a></button></td>
                </tr>
                 <%} %>
                 <tr><td colspan="7" ><button class="button" ><a href="NewAdd.jsp">新增商品</a></button></td></tr>
            </table>
        </form>
    </div>
    <div class="div3">
    <%= request.getAttribute("bar") %>
    </div>
</body>
</html>