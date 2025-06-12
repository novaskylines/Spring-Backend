<%@page import="member.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%
String id = request.getParameter("email_1");
String email = request.getParameter("email_1")+"@"+request.getParameter("email_2");
String name = request.getParameter("name");
String password = request.getParameter("password");
String phone = request.getParameter("phone");
String gender = request.getParameter("gender");
int agree = request.getParameter("agree")==null?0:1;
String content = request.getParameter("content");

MemberDAO dao = new MemberDAO();
dao.addMember(id, email, name, password, phone, gender, agree, content);
response.sendRedirect("Index.jsp");
%>