<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../includeJsp/common.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>動的インクルードによるフッター表示</title>
</head>
<body>
	<h1>どこつぶへようこっそ</h1>
	<p>どこつぶは <%= today %> から存在する歴史のあるサイトです</p>
	<p>そしておまえのパスは ${loginUser.pass} だおぼえてろ</p>
	<jsp:include page="../includeJsp/footer.jsp" />
</body>
</html>