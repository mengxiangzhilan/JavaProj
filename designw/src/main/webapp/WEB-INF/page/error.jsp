<%--
  Created by IntelliJ IDEA.
  User: 朱海
  Date: 2018/5/2
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${!empty message}">
    <font color="red">${requestScope.message }</font>
</c:if>
<a href="${pageContext.request.contextPath}/page/index">返回登录页面</a>

</body>
</html>
