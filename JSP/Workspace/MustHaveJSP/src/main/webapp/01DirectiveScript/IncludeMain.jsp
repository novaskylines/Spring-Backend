<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="IncludeFile.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include 지시어 사용하기</title>
</head>
<body>
	<%
		// toDay, tomorrow는 IncludeFile.jsp에 정의되어 있다.
		// 사이트 공통으로 있는 header/footer를 보통 include로 불러옴 
		out.println("오늘 날짜" + toDay + "<br/>");
		out.println("내일 날짜" + tomorrow);
	%>
</body>
</html>