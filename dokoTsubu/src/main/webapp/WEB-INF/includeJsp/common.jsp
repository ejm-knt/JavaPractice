<%@ page language="java" pageEncoding="UTF-8" %>
<%@ page import = "java.util.Date, java.text.SimpleDateFormat" %>

<% String name = "湊 雄輔"; %>
<%
Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
String today = sdf.format(date);	
%>