<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String popupMode = "on";

// 모든 쿠키를 확인하는 반복문 작성
Cookie[] cookies = request.getCookies();
if (cookies != null) {
	for (Cookie c: cookies) {
		String cookieName = c.getName();
		String cookieValue = c.getValue();
		// PopupClose 쿠키가 존재하는지 확인
		if (cookieName.equals("PopupClose")) {
			popupMode = cookieValue;
		}
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키를 이용한 팝업 관리 ver 0.1</title>
<style>
	div#popup {
	position: absolute; top:100px; left:50px; color:yellow;
	width:270px; height:100px; background-color:gray;
	}
	div#popup>div {
		position: relative; background-color: #ffffff; top:0px;
		border: 1px solid gray; padding:10px; color:black;
	}
</style>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<script>
// JQuery를 헤더에 쓸때 필요, JS의 window.onload와 같은 역할
$(function() {
	// id : closeBtn의 클릭 이벤트
	$('#closeBtn').click(function() {
		// id : popup을 숨김
		$('#popup').hide();
		// id : inactiveToday의 input:checkbox 태그가 체크되어있는지 확인
		var chkVal = $("input:checkbox[id=inactiveToday]:checked").val();
		if(chkVal==1){
			// ajax : 새로고침, 페이지를 새롭게 받지 않고 원본 페이지에 그대로 서버의 데이터를 적용
			// 자바스크립트를 통해 새로고침 없이 통신
			$.ajax({
				// 페이지 설정
				url : './PopupCookie.jsp',
				// 메서드 타입
				type : 'get',
				// 보낼 데이터
				data : {inactiveToday : chkVal},
				// 데이터 타입 : text, json(, xml)
				dataType : "text",
				// 통신에 성공했을 경우 실행하는 함수
				// 매개변수 resData : 서버에서 보낸 데이터
				success : function(resData) {
					// 보낸 데이터가 존재할 경우 새로고침 실행
					if (resData != '') location.reload();
				}
			});
		}
	});
});
</script>
</head>
<body>
<h2>팝업 메인 페이지(ver 0.1)</h2>
<%
	for (int i = 1; i<= 10; i++) {
		out.print("현재 팝업창은 " + popupMode + "상태입니다.<br/>");	
	}
	
	if (popupMode.equals("on")) {
%>
	<div id="popup">
		<h2 align="center">공지사항 팝업입니다.</h2>
		<div align="right"><form name="popFrm">
			<input type="checkbox" id="inactiveToday" value="1" />
			하루 동안 열지 않음
			<input type="button" value="닫기" id="closeBtn" />
		</form></div>
	</div>
<%
	}
%>
</body>
</html>