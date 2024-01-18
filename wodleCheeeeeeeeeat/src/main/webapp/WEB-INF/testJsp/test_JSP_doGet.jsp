<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <style>
    .form {
    	display: inline-block;
		vertical-align: top;
    }
    
    .pullDownList {
    	display: inline-block;
    }
    
    .button {
      text-align: center;
      background: #b6beff;
      padding: 5px 10px;
      cursor: pointer;
    }
    .dropdown {
      background: #ffaf74;
      margin-bottom: 15px;
    }
    .hidden {
      display: none;
    }
    </style>
    <script src="https://code.jquery.com/jquery.min.js"></script>
    <script>
		$(function () {
		<%
		for (char c = 'A'; c <= 'Z'; c++) {
		%>
		  $("#button<%=c%>").click(function () {
		    $("#dropdown<%=c%>").toggleClass("hidden");
		  });
		<%
		}
		%>
		});
	</script>
</head>

<body>
<div class="form" id="form">
これはテストで入れて見ちゃうよん
</div>
<div class="pullDownList" id="pullDownList">

		<%
		for (char c = 'A'; c <= 'Z'; c++) {
		%>
			
			    <div class="button" id="button<%=c%>">startsWith <%=c%> ▼</div>
			    <div class="dropdown hidden" id="dropdown<%=c%>">
					<c:forEach var="wwList" items="${wordleWordList}<%=c%>" >
						<span><c:out value="${wwList.word}" />
						<c:out value="${wwList.allSpellDifferent}" /></span>
					</c:forEach>
				</div>

		<%
		}
		%>
			</div>
</body>
</html>
