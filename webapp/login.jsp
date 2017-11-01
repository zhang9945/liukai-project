<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>登录界面</title>
</head>
<body>
	<form action="login" method="post">
		<div>
		用戶名：<input type="text" name="username" />
		<br><br>
		密     码：<input type="password" name="password" />
		</div>
		验证码:<img alt="验证码" src="ValidateImageServlet" id="validate">
		<input type="text" name="validateCode" style="width:50px;"/>
		<br><br>
		<button type="submit">登录</button>
	</form>
		<button type="submit" id="regist">注册</button>
</body>
<script type="text/javascript">
	!function(){
		var $ =function(selector){
			return document.querySelector(selector);
		}
		$("#validate").addEventListener('click',function(){
			this.src='ValidateImageServlet?time='+new Date().getTime();
		});
		$("#regist").addEventListener('click',function(){
			 window.location.href='${pageContext.request.contextPath}/jsp/register.jsp';
		});
	}();
</script>
</html>