<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="WEB-INF/includeJsp/common.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>どこつぶ</title>
</head>
<body>
	<h1>どこつぶへようこそ</h1>
	<p>現在時刻：<%= today %></p>
	<p>おまえのなまえ： <%= name %> </p>

	<Form action = "Login" method = "post">
	ユーザー名：<input type = "text" name = "name"><br>
	パスワード：<input type = "password" name = "pass"><br>
	<input type = "submit" value = "ログイン">
	
	</Form>
</body>
</html>