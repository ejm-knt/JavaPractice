<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>なんちゃってドロップダウン</title>
</head>
<body>

<form action="testenq",method="post">

	お名前：<input type="text" name="name"><br>
	
	お問い合わせ種類：
	<select name="qtype">
		<option value="company">会社について</option>
		<option value="product">製品について</option>
		<option value="support">アフターサポートについて</option>
	</select><br>
	
	お問い合わせ内容：<br>
	<textarea name="body" rows="3" cols="45"></textarea><br>
	
	<input type="submit" , value="送信">
</form>


</body>
</html>