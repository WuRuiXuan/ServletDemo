<%@page import="com.study.demo.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% Product p = (Product) request.getAttribute("product"); %>
</head>
<body>
	<h2>修改商品</h2>
	<form action="${pageContext.request.contextPath}/ProductServlet?method=update&pid=<%= p.getPid() %>" method="post">
		<table>
			<tr>
				<td>商品名称</td>
				<td><input type="text" name="name" value="<%= p.getName() %>" /></td>
			</tr>
			<tr>
				<td>商品单价</td>
				<td><input type="text" name="price" value="<%= p.getPrice() %>" /></td>
			</tr>
			<tr>
				<td>商品数量</td>
				<td><input type="text" name="nums" value="<%= p.getNums() %>" /></td>
			</tr>
			<tr>
				<td>商品描述</td>
				<td><input type="text" name="description" value="<%= p.getDescription() %>" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交" /></td>
			</tr>
		</table>
	</form>
</body>
</html>