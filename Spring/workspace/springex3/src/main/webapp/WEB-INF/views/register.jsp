<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 25. 6. 11.
  Time: 오후 4:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/ex4_1">
        <div>title:<input type="text" name="title"></div>
        <div>date:<input type="date" name="dueDate"></div>
        <div>finished:<input type="checkbox" name="finished"></div>
        <div>writer:<input type="text" name="writer"></div>
        <div><button>등록</button></div>
    </form>
</body>
</html>
