<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 출력하기</title>
</head>
<body>
	<!-- 1~9단까지의 구구단 출력하기 -->
	<p>
		<%
			for(int i=2; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					%> <p><%=i%> * <%=j%> = <%=i*j%></p>
				<%}
			}
		%>
		
		<p>
	</p>
</body>
</html>