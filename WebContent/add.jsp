<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>添加商品</h2>
	<form action="${pageContext.request.contextPath}/ProductServlet?method=add" method="post">
		<table>
			<tr>
				<td>商品名称</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>商品单价</td>
				<td><input type="text" name="price" /></td>
			</tr>
			<tr>
				<td>商品数量</td>
				<td><input type="text" name="nums" /></td>
			</tr>
			<tr>
				<td>商品描述</td>
				<td><input type="text" name="description" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="添加" /></td>
			</tr>
		</table>
	</form>
</body>
</html>