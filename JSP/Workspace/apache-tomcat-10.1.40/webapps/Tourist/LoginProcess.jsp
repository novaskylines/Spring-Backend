<%@page import="member.dao.MemberDAO"%>
<%@page import="member.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%
String id = request.getParameter("id");
String password = request.getParameter("pw");

if (id=="") {
	// 아이디 입력 필요
	request.setAttribute("LoginErrMsg", "아이디를 입력하세요.");
	request.getRequestDispatcher("Login.jsp").forward(request, response);
} else if (password=="") {
	// 비밀번호 입력 필요
	request.setAttribute("LoginErrMsg", "비밀번호를 입력하세요.");
	request.getRequestDispatcher("Login.jsp").forward(request, response);
} else {
	MemberDAO dao = new MemberDAO();
	MemberDTO dto = dao.getMember(id, password);
	if (dto==null) {
		// 로그인 실패
		request.setAttribute("LoginErrMsg", "아이디 또는 비밀번호가 일치하지 않습니다.");
		request.getRequestDispatcher("Login.jsp").forward(request, response);
	} else {
		// 로그인 성공
		session.setAttribute("UserId", dto.getId());
		session.setAttribute("UserName", dto.getName());
		session.setAttribute("UserDTO", dto);
		response.sendRedirect("Index.jsp");
	}
}

%>