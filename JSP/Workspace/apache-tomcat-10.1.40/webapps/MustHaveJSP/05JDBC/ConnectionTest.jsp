<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="common.JDBConnect"
    import="common.DBConnPool"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC</title>
</head>
<body>
	<h2>JDBC 테스트 1</h2>
	<%
	DBConnPool jdbc1 = new DBConnPool();
	jdbc1.close();
	%>
</body>
</html>