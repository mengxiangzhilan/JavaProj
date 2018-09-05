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
<!--主页信息-->
<div class="table-responsive">
    <c:if test="${empty studentList}">
        没有学生信息！
    </c:if>
    <c:if test="${!empty studentList}">
        <table class="table table-condensed table-hover">
            <caption><b>学生信息表</b></caption>
            <thead>
            <tr>
                <th>教师id</th>
                <th>姓名</th>
                <th>班级</th>
                <th>学院</th>
                <th>修改</th>
            </tr>
            </thead>
            <c:forEach items="${studentList}" var="td">
                <tbody>
                <tr>
                    <th>${td.studentId}</th>
                    <th>${td.studentName}</th>
                    <th>${td.class1}</th>
                    <th>${td.collegeIiD}</th>
                    <th><a href="${pageContext.request.contextPath}/page/updateStudentnews/${td.studentId}" >修改</a></th>
                </tr>
                </tbody>
            </c:forEach>
            <tfoot><td colspan="3" style="text-align: left">删除学生信息请在用户管理进行</td></tfoot>
        </table>
    </c:if>
</div>
</body>
</html>
