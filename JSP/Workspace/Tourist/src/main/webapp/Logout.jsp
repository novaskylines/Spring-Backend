<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// UserId로 저장되어 있는 세션 데이터 삭제
session.removeAttribute("UserId");
session.removeAttribute("UserName");
session.removeAttribute("UserDTO");
// invalidate(): 모든 세션 데이터 삭제
session.invalidate();
response.sendRedirect("Index.jsp");
%>