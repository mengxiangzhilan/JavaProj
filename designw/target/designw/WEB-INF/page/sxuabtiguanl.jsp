<%@ page import="com.designw.model.GraduationStudnt" %>
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
        <c:if test="${!empty graduationStudnt1.graduation.gradId}" >
            <table class="table table-condensed table-hover">
                <caption><b>学生基本信息</b></caption>
                <thead>
                <tr>
                    <th>学号</th>
                    <th>姓名</th>
                    <th>班级</th>
                    <th>毕业设计题目</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <th>${graduationStudnt1.student.studentId}</th>
                    <th>${graduationStudnt1.student.studentName}</th>
                    <th>${graduationStudnt1.student.class1}</th>
                    <th>${graduationStudnt1.graduation.gradName}</th>
                </tr>
                </tbody>
            </table>
        </c:if>
        <c:if test="${empty graduationStudnt1.graduation.gradId}">
            <form action="${pageContext.request.contextPath}/page/addxuankeguanli" method="post">
            <table class="table table-condensed table-hover">
                <caption><b>选择毕业设计题目</b></caption>
                <thead>
                <tr>
                    <th>教师id</th>
                    <th>教师名称</th>
                    <th>毕业设计题目</th>
                    <th>选择</th>
                </tr>
                </thead>
                <c:forEach items="${graduationTeacherList}" var="td">
                <tbody>
                <tr>
                    <th>${td.teacher.teacherId}</th>
                    <input type="hidden" name="teacherId" value="${td.teacher.teacherId}"/>
                    <th>${td.teacher.teacherName}</th>
                    <th> <select class="form-control" name="gradId">
                        <c:forEach items="${td.graduationList}" var="tre">
                            <option value=${tre.gradId}>${tre.gradName}</option>
                        </c:forEach>
                    </select></th>
                    <th><input type="radio" name="studentId" value="${graduationStudnt1.student.studentId}"/></th>
                </tr>
                </tbody>
                </c:forEach>
            </table>
                <input type="submit" value="提交"/>
            </form>
        </c:if>
    </div>
</div>
</body>
</html>
