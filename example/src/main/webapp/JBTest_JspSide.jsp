<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import"model.Human" %>    

<%
	// リクエストスコープからインスタンス取得
	// ()内は、JBtest.javaで定義した内容のワードを使う
	Human h = (Human)request.getAttribute("human");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>おっ！おっ！</p>
<p><%= h.getName() %>ですわ！</p>
<p><%= h.getAge() %>ですわ！</p>

</body>
</html>