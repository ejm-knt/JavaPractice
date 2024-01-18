<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="model.User" %>
<% User user = (User)session.getAttribute("user"); %>
<% String errorMsg = (String)request.getAttribute("errorMsg"); %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録内容確認</title>
</head>

<body>
	<h1>登録内容確認</h1>
	
	<% if (errorMsg == null) { %>
	<p>ユーザー名: <%= user.getName() %></p>
	<span>パスワード: </span>
	<span>
	<% for (int i = 0; i < user.getPass().length(); i++) { %>*<% } %>
	</span>
	<br>
	<br>
	<a href="RegisterServlet?action=done">登録する</a> 
	<% } else { %>
		<p><%= errorMsg %></p>
	<% } %>	
	<a href="RegisterServlet">TOP画面に戻る</a>
	
</body>
</html>