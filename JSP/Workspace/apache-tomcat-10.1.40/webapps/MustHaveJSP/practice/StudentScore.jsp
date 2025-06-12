<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 성적 표시하기</title>
<style>
	table, td, th{
		border:1px solid black;
		border-collapse: collapse;
	}
	th, td{
		width:100px;
	}
</style>
</head>
<body>
<!-- 
scores배열의 데이터를 표를 이용하여 출력하기
학생번호    국어    영어    수학     총점     평균
=============================================
1번 학생:   80     60     70     210     70.0
2번 학생:   90     95     80     265     88.0
3번 학생:   75     80    100     255     85.0
4번 학생:   80     70     95     245     81.0
5번 학생:  100     65     80     245     81.0
 -->
	<% int[][] scores = {{80,60,70}, {90,95,80}, {75,80,100}, {80,70,95}, {100,65,80}}; %>
	<table>
		<tr>
			<th>학생번호</th>
			<th>국어</th>
			<th>영어</th>
			<th>수학</th>
			<th>총점</th>
			<th>평균</th>
		</tr>
		<%
		for(int i=0; i<scores.length; i++) {
			int sum = scores[i][0]+scores[i][1]+scores[i][2];
			%><tr>
				<td><%=i%>번 학생</td>
				<td><%=scores[i][0]%></td>
				<td><%=scores[i][1]%></td>
				<td><%=scores[i][2]%></td>
				<td><%=sum%></td>
				<td><%=String.format("%.1f", ((double) sum * 10 / 3) / 10)%></td>
			<%	
		}
		%>
	</table>
</body>
</html>










