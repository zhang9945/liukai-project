<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
	<form action="" method="post">
		<div>
		用戶名：<input type="text" id="username" name="username" />
				<span id="checkResultName"></span>
		<br><br>
		密     码：<input type="password" name="password" />
		</div>
		<br><br>
		<button type="submit" id="regist">注册</button>
	</form>
</body>
<script type="text/javascript">
	!function(){

		var	$=function(selector){
			return document.querySelector(selector);
		};             
		$("#username").addEventListener('blur',function(){
			var xhr = new XMLHttpRequest();
			xhr.open("get","${pageContext.request.contextPath}/checkUserName.do?username="+this.value);
			xhr.onreadystatechange=function(){
				if(4 == xhr.readyState && 200==xhr.status)
					$("#checkResultName").innerHTML=xhr.responseText;
			};
			xhr.send(null);
		});
		
	}();

</script>
</html>