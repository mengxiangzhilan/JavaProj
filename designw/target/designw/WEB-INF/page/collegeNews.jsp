<%--
  Created by IntelliJ IDEA.
  User: 朱海
  Date: 2018/5/2
  Time: 2:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet"href="${pageContext.request.contextPath}/static/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.3.1.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>

</head>
<body>
<script>
    $(function(){
        $(".delete").click(function (){
            var href=$(this).attr("href");
            $("form").attr("action",href).submit();
            return false;
        });
    })
</script>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <a href="http://www.haust.edu.cn" class="navber-header" style="padding-top: 0">
            <img src="${pageContext.request.contextPath}/static/img/hhh.jpg" style="width: 70px;height: 70px">
        </a>
        <ul class="nav navbar-nav">
            <li role="presentation"><a href="#">首页</a></li>
            <li role="presentation" class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="true">用户管理<span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="${pageContext.request.contextPath}/page/adduser">添加用户</a></li>
                    <li><a href="${pageContext.request.contextPath}/page/selectuser">用户信息</a></li>
                </ul>
            </li>
            <li role="presentation"><a href="${pageContext.request.contextPath}/page/studentNews">学生信息管理</a></li>
            <li role="presentation"><a href="${pageContext.request.contextPath}/page/teacherNews">教师信息管理</a></li>
            <li role="presentation"><a href="${pageContext.request.contextPath}/page/managerNews">管理员信息管理</a></li>
            <li role="presentation" class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="true">学院管理<span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="${pageContext.request.contextPath}/page/addcollege">添加学院</a></li>
                    <li><a href="${pageContext.request.contextPath}/page/collegenews">学院信息</a></li>
                </ul>
            </li>
        </ul>
    </div>
</nav>
<form action="" method="post">
    <input type="hidden" name="_method" value="DELETE">
</form>
<div class="table-responsive">
    <c:if test="${empty collegeList}">
        没有学院信息！
    </c:if>
    <c:if test="${!empty collegeList}">
        <table class="table table-condensed table-hover">
            <caption><b>学院信息表</b></caption>
            <thead>
            <tr>
                <th>学院id</th>
                <th>学院名称</th>
                <th>学院修改</th>
                <th>删除</th>
            </tr>
            </thead>
            <c:forEach items="${collegeList}" var="td">
            <tbody>
            <tr>
                    <th>${td.collegeerId}</th>
                    <th>${td.collegeerName}</th>
                    <th><a href="${pageContext.request.contextPath}/page/updatecollegenews/${td.collegeerId}" >修改</a></th>
                    <th><a class="delete" href="${pageContext.request.contextPath}/page/deletecollegenews/${td.collegeerId}" >删除</a></th>
            </tr>
            </tbody>
            </c:forEach>
        </table>
    </c:if>
</div>
</body>
</html>
