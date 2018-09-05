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
            <li role="presentation"><a href="${pageContext.request.contextPath}/page/xuankeguanli">选题管理</a></li>
            <li role="presentation"><a href="${pageContext.request.contextPath}/page/teacherNews">留言版</a></li>
            <li role="presentation"><a href="${pageContext.request.contextPath}/page/biyeshejichengji">毕业设计成绩</a></li>
            <li role="presentation" class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="true">文件管理<span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="${pageContext.request.contextPath}/page/addcollege">上传文件</a></li>
                    <li><a href="${pageContext.request.contextPath}/page/collegenews">下载文件</a></li>
                </ul>
            </li>
        </ul>
    </div>
</nav>
<!--主页信息-->
<div class="container">
    <div class="table-responsive">
        <table class="table table-condensed table-hover">
            <caption><b>毕业生信息</b></caption>
            <thead>
            <tr>
                <th>学号</th>
                <th>教师号</th>
                <th>成绩</th>
                <th>评价</th>
            </tr>
            </thead>
                <tbody>
                <tr>
                    <th>${graduationNews.graduation.studentId}</th>
                    <th>${graduationNews.graduation.teacherId}</th>
                    <th>${graduationNews.SUM}</th>
                    <c:forEach items="${graduationNews.graduationScoreList}" var="ere">
                        <th>${ere.gradscoreAssess}</th>
                    </c:forEach>

                </tr>
                </tbody>
        </table>
    </div>
</div>
</body>
</html>
