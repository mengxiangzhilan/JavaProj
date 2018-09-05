<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>欢迎登录毕业设计管理系统</title>
	<style type="text/css"></style>
	<style>
	*{
		padding: 0;
		margin: 0
	}
	.center-box{
   		/*固定宽度*/
  		width: 1300px;
   		}
   		.ccc{
   			padding-left: 60px;
   		}
   	.logo{
   		width: 150px;
   		height: 150px;
   		padding: 0 0 25px 80px;

   	}
	
	.login-box{
  		float: right;
  		margin-top: 110px;
  		margin-right:80px;
  		width: 300px; 
  		height: 260px;
  		position:relative;
  		/*内边距*/
  		background-color:#fff;
  		padding:20px;
  		border-radius: 3px;
	}		
	.login-box label{
		font-family: 隶书;
			}
	form>div,.login-box>div{
  		margin-top: 15px;
	}
	.login-box input{
     	width: 250px;
    	height: 18px;
    	font-size: 14px;
    	/*边框色*/
    	border:1px solid #DDD;
    	/*内边距*/
    	padding: 11px 8px 11px 5px;
     	background-repeat: no-repeat;
  	}
  	button{
  		width: 50px;
  		height: 30px;
  		margin: 0 10px;
  		border-radius: 3px;
  	}

	</style>
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.3.1.js"></script>
	<script>
        function ddd(){
            f1.reset();
        }
        $(function(){
            $("#dddd").click(function () {
                if($("#pwd").val().length!=0 && $("#regName").val().length!=0){
                    $("form").submit();
				}
				else {
				    alert("用户名或密码为空");
				}
				return false;
            });
        })
	</script>
</head>
<body>
	<div>
		<div class="center-box">
			<div class="ccc">
					<a href="http://www.haust.edu.cn" style="text-decoration: none;">
						<img src="${pageContext.request.contextPath}/static/img/he.png">
					</a>
						<img class="logo"
						src="${pageContext.request.contextPath}/static/img/hhh.jpg">
			</div>
			<a href="#" style="text-decoration: none;">
				<img class="ccc" src="${pageContext.request.contextPath}/static/img/bi.png">
			</a>
	    </div>
	</div>
	<div style="background-image: url(${pageContext.request.contextPath}/static/img/beijng1.jpg);
    height: 600px;background-position: center center;">
		<div class="center-box">
			<div class="login-box">
				<form action="page/yonghudelu" method="post"  id="f1">
					<div>
					<label>用　户　名</label>
						<input type="text" name="userId" id="regName" autocomplete="off" maxlength="20" placeholder="学号或教职工号" class="hed" /></div>
					<div>
						<label>密　　　码</label>
						<input style="display:none" type="password" name="pwd"  />
						<input type="password" name="userPwd" id="pwd"maxlength="20" placeholder="身份证号后6位" class="hed" />
					</div>
				<div>
                   <button id="dddd">登录</button>
                   <button onclick="ddd()">取消</button>
                </div>
				</form>
			</div>								
		</div>
	</div>	
</body>
</html>