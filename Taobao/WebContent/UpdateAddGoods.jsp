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
    </style>
</head>
<body>
<%  Goods oo=(Goods)request.getAttribute("LiGood");%>
    <div class="div1">
        <div class="div1_1"></div>
        <div class="div1_2"> </div>
    </div>
    <div class="div2" >
        <form action="BackStageServlet">
            <table>
                <tr>
                   <td><input type="checkbox" class="input">全选</td>
                   <td>商品图片</td>
                   <td>原价</td>
                   <td>优惠价</td>
                   <td>库存</td>
                </tr>
                <tr>
                <td><input type="checkbox" class="input"></td>
                <td style="background-image:url(<%= oo.getPicture()%>);background-size:contain"></td>
                <td><%= oo.getPrice()%></td>
                <td><%= oo.getLowprice()%></td>
                <td><%= oo.getNum()%><input type="hidden" name="id" value="<%= oo.getId() %>"></td>
                
                </tr>
                 <tr>
                <td><input type="checkbox" class="input"></td>
                <td ><input type="text" name="newpicture" placeholder="请输入新图片地址"></td>
                <td><input type="text" name="newprice" placeholder="请重新输入原价"></td>
                <td><input type="text" name="newlowprice" placeholder="请重新输入现价"></td>
                <td><input type="text" name="newnum" placeholder="请重新输入库存"></td>
                </tr>
                <tr><td colspan="5"><button type="submit">提交</button></td></tr>
            </table>
        </form>
    </div>
    <div class="div3">
    </div>
</body>
</html>