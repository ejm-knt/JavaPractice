<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>greenSpellsViewTest</title>
</head>

<body>
<h1>テストじゃ！</h1>

<c:forEach var="gs" items="${greenSpells}" varStatus="status">
	<p>ポジ${status.index+1}：<c:out value="${gs}" /></p>
</c:forEach>

<c:forEach var="ys" items="${yellowSpellList}" varStatus="status">
	<p>ポジ${status.index+1}：<c:out value="${ys.position}" /></p>
	<p>スペ${status.index+1}：<c:out value="${ys.alphabet}" /></p>
</c:forEach>

<p><c:out value="${graySpell}" /></p>

<a href="Main">もどる</a>

<br>


</body>
</html>