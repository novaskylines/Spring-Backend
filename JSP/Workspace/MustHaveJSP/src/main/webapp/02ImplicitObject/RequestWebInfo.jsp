<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장 객체 - RequestWebInfo</title>
</head>
<body>
	<h1>1. 클라이언트와 서버의 환경정보 읽기</h1>
	<ul>
		<li>데이터 전송 방식 : <%=request.getMethod() %></li>
		<li>URL(전체 주소) : <%=request.getRequestURL() %></li>
		<li>URI(포트번호 뒤의 주소) : <%=request.getRequestURI() %></li>
		<li>프로토콜 : <%=request.getProtocol() %></li>
		<li>서버명 : <%=request.getServerName() %></li>
		<li>서버 포트 : <%=request.getServerPort() %></li>
		<li>클라이언트 IP 주소 : <%=request.getRemoteAddr() %></li>
		<li>쿼리스트링(GET에서 파라미터의 문자열) : <%=request.getQueryString() %></li>
		<!-- Get/Post 상관없이 동일한 값을 받아올 수 있음 -->
		<li>전송된 값1 : <%=request.getParameter("eng") %></li>
		<li>전성된 값2 : <%=request.getParameter("han") %></li>
	</ul>
</body>
</html>