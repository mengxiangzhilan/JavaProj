
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<div class="table-responsive">
    <form:form action="${pageContext.request.contextPath}/page/updteacherNews" class="form-horizontal" method="post" modelAttribute="teacher" >
        <div class="form-group">
            <label class="col-sm-2 control-label" >教师id</label>
            <div class="col-sm-3">
                ${teacher.teacherId}
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label" >教师姓名</label>
            <div class="col-sm-3">
                    <form:input path="teacherName" class="form-control"  placeholder="教师姓名"/>
                    <form:hidden path="teacherId"/>
                    <input type="hidden" name="_method" value="PUT"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label" >手机号</label>
            <div class="col-sm-4">
                <form:input path="teacherPhone" class="form-control" placeholder="手机号"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label" >学院id</label>
            <div class="col-sm-3">
               ${teacher.collegeIiD}
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-9 col-sm-offset-3">
                <input type="submit" value="提交" />
            </div>
        </div>
    </form:form>

</div>
</body>
</html>
