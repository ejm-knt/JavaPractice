<%@ page language="java" contentType="text/html; charset=UTF-8" import = "ex_prac.*" %>
<%@ page import = "java.lang.*" %>

<% Employee emp = new Employee("0001","湊"); %>
<% String[] pTags = {"<p style = \"color: blue\">","<p>"}; %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%	for (int i = 0; i < 10; i++) { %>

	<%	if(i % 3 == 0) { %>
			<%= pTags[0] %>
	<%	} else { %>
			<%= pTags[1] %>
	<%	}	%>
	
		IDは <%= emp.getId() %>、名前は<%= emp.getName() %>です</p>
<%	}	%>

</body>
</html>