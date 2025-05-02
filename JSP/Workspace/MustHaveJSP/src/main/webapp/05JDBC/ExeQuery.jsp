<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.sql.ResultSet"
    import="java.sql.Statement"
    import="java.sql.Connection"
    import="common.JDBConnect"
    import="common.DBConnPool"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 목록 조회 테스트(executeQuery() 사용)</h2>
	<%
	/* JDBConnect jdbc = new JDBConnect(); */
	DBConnPool jdbc = new DBConnPool();
	
	// Statement 사용시 ?를 쓸 수 없기 때문에 모든 SQL절이 String에 달려있어야함
	String sql = "SELECT id, pass, name, regidate FROM member";
	jdbc.stmt = jdbc.con.createStatement();
	jdbc.rs = jdbc.stmt.executeQuery(sql);
	
	// rs에 SELECT문의 결과가 들어있고 
	// rs.next()를 이용하여 데이터가 있는지 확인하고 그 데이터를 사용할 수 있도록 합니다.
	while (jdbc.rs.next()) {
		// rs.getString(1) : 1을 적으면 첫번째 열인 id의 데이터를 반환
		String id = jdbc.rs.getString(1);
		// 2을 적으면 첫번째 열인 pass의 데이터를 반환
		String pw = jdbc.rs.getString(2);
		// name을 적으면 name열의 데이터를 반환
		String name = jdbc.rs.getString("name");
		// regidate을 적으면 regidate열의 데이터를 반환
		java.sql.Date regidate = jdbc.rs.getDate("regidate");
		
		out.println(String.format("%s, %s, %s, %s", id, pw, name, regidate) + "<br/>");
	}
	
	jdbc.close();
	%>
</body>
</html>