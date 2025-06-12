<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테이블 태그로 출력하는 구구단</title>
<style>
	table, td {
		border:1px solid black;
		border-collapse: collapse;
	}
	td {
		width: 40px; height: 40px;
		text-align: center;
	}
	.color1 {background-color:yellow;}
	.color2 {background-color:orange;}
	.color3 {background-color:#eee;}
</style>
</head>
<body>
	<table>
		<tr>
			<td></td>
			<%
				for(int j=1; j<=9; j++) {
					%><td class="color1"> <%=j%> </td><%
				}
			%>
		</tr>
		<%		
			for(int i=2; i<=9; i++) {
				%><tr><td class="color2"> <%=i%> </td><%
				for(int j=1; j<=9; j++) {
					%><td class="color3"> <%=i*j%> </td><%
				}
				%></tr><%
			}
		%>
	</table>

</body>
</html>