<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- pageContext.request.contextPath: http://localhost:8080/ServletDemo -->
	<form action="${pageContext.request.contextPath}/LoginServlet" method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="username"/></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="登录"/></td>
			</tr>
		</table>
	</form>
</body>
</html>