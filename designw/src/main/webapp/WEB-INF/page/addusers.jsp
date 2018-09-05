
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
<script type="text/javascript">
    $(function () {
        $("#phone").hide();
       $("#ddwwd").change(function () {
           var a=$("#ddwwd").val();
           if (a==0){
               $("#class_1").hide();
               $("#phone").hide();
               $("#col").hide();
           }else if(a==1){
               $("#class_1").hide();
               $("#col").show();
               $("#phone").show();
           }else if(a==2){
               $("#class_1").show();
               $("#col").show();
               $("#phone").hide();
           }
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
<div class="container">
<form action="${pageContext.request.contextPath}/page/adduserNews" class="form-horizontal" method="post">
    <div class="form-group">
        <label class="col-sm-2 control-label" >用户id</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="Alluserid" placeholder="用户id">
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label" >用户名</label>
        <div class="col-sm-3">
            <input type="text" class="form-control" name="AlluserNmae" placeholder="用户名">
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label" >密码</label>
        <div class="col-sm-4">
            <input type="password" class="form-control" id="pwd" placeholder="密码" name="users.userPwd">
        </div>
    </div>
    <div class="form-group">
        <label class="col-sm-2 control-label" >登录类型</label>
        <div class="col-sm-4">
            <select id="ddwwd" class="form-control" name="users.userType">
                <option class="stu" value=2>学生</option>
                <option class="teach" value=1>教师</option>
                <option class="admin" value=0>管理员</option>
            </select>
        </div>
    </div>
    <div id="phone" class="form-group">
        <label class="col-sm-2 control-label" >手机号</label>
        <div class="col-sm-4">
            <input type="text" class="form-control"  placeholder="手机号" name="teacher.teacherPhone"/>
        </div>
    </div>
    <div id="class_1" class="form-group">
        <label class="col-sm-2 control-label" >班级</label>
        <div class="col-sm-4">
            <input type="text" class="form-control"  placeholder="班级" name="student.class1"/>
        </div>
    </div>
    <div class="form-group" id="col">
        <label class="col-sm-2 control-label" >学院</label>
        <div class="col-sm-4">
            <select class="form-control" name="student.collegeIiD">
                <c:forEach items="${collegeList}" var="td">
                <option value=${td.collegeerId}>${td.collegeerName}</option>
                </c:forEach>
            </select>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-9 col-sm-offset-3">
            <input type="submit" class="btn btn-default" value="提交"/>
        </div>
    </div>
</form>
</div>
</body>

</html>
