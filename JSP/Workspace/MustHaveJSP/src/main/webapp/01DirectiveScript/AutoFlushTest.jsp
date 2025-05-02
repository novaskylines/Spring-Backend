<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    buffer="1kb"
    autoFlush="true" %>
<!-- buffer: 한번에 전송 가능한 용량 설정. 기본: 8kb. -->
<!-- autoFlush: 버퍼가 가득 차면 데이터를 전송하고 버퍼를 자동으로 비우는 옵션. 기본: true. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>buffer, autoFlush 테스트</title>
</head>
<body>
	<%
		// buffer 사이즈(예: 1kb)보다 출력하는 데이터의 용량이 더 크고, autoFlush가 False일 경우 버퍼 오버플로우가 발생
		// 웬만해서 기본 8kb인 buffer는 최적화를 하는게 아닌 이상 건드리지 않는다
		for(int i=1; i<=100; i++){
			out.println("abcde12345");
		}
	%>

</body>
</html>