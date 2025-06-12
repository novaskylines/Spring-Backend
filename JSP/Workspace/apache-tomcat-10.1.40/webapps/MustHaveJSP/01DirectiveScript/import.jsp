<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>
<!-- trimDirectiveWhitespaces="true": 개발자 도구로 소스코드 열람 시 공백을 지워줌 -->
<%@ page import="java.util.Date" import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page 지시어 - import 속성</title>
</head>
<body>
	<%
		Date today = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String todayStr = dateFormat.format(today);
		out.println("오늘 날짜 : " + todayStr);
	%>
</body>
</html>