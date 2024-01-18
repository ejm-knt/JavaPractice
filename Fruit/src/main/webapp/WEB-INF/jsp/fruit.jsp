<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "ex.Fruit" %>    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- getName はメソット名でNが大文字だけど、スコープから取得する変数のnameは小文字なのでそこ注意 -->
	<p> ${fruit.name} の値段は ${fruit.price} 円です。</p>
</body>
</html>