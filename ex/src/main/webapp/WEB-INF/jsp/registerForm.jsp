<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー新規登録</title>
</head>
<body>
	<h1>ユーザー新規登録</h1>
	<form action="RegisterServlet" method="post">
		<input type="text" name="name"><br>
		<input type="password" name="pass"><br>
		<input type="submit" value="送信">
	</form>

</body>
</html>