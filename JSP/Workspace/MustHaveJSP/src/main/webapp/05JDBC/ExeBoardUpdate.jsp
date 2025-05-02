<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.sql.PreparedStatement"
    import = "java.sql.Connection"
    import = "common.JDBConnect"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board 데이터 추가하기</title>
</head>
<body>
	
	<%
	JDBConnect jdbc = new JDBConnect();
	String title = "titletest";
	String content = "content test content_test";
	String id = "test1";
	
	String sql = "INSERT INTO board VALUES (seq_board_num.nextval, ?, ?, ?, sysdate, 0)";
	jdbc.psmt = jdbc.con.prepareStatement(sql);

	jdbc.psmt.setString(1, title);
	jdbc.psmt.setString(2, content);
	jdbc.psmt.setString(3, id);

	
	int inResult = jdbc.psmt.executeUpdate();
	out.println(inResult+"행이 입력되었습니다.");
	
	jdbc.close();
	%>
	

</body>
</html>