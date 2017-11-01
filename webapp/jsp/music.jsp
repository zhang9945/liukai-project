<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>音乐趴</title>
	<base  href="${pageContext.request.contextPath}/"></base>
	<link rel="stylesheet" href="css/my01.css">
	<script type="text/javascript" src="js/my01.js"></script>
</head>
<body>
	<form name="form00" action="musiclist"  method="post">
		<table id="table01" name="table01" class="tab-list">
			<tr>
				<td>&nbsp;</td>
				<td>ID</td>
				<td>SONGNAME</td>
				<td>SINGER</td>
				<td>ALBUM</td>
				<td>COMPOSER</td>
				<td>COST</td>
				<td>&nbsp;</td>
			</tr>
			<c:forEach items="${musiclist}" var="music">
				<tr>
				    <td>
				    <input type="checkbox" name="deleteEmpnos" value="${music.id }"/>
				    </td>
					<td>${music.songName}</td>
					<td>${music.singer}</td>
					<td>${music.album}</td>
					<td>${music.composer}</td>
					<td>${music.cost}</td>
					<td>
						<a href=>修改</a>
					</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="10">
				<button id="add">添加</button>
				<button id="delete">删除</button>
				</td>
				</tr>
		</table>
	</form>
</body>
</html>
<script>
	!function(){
		$('#add').addEventListener('click',function(){
			  var tbl = document.all.table01;  
			  var rows = tbl.rows.length;  
			  var tr = tbl.insertRow(rows);  
			     
			  var id = tr.insertCell(0);  
			  id.innerHTML = '<input type="text">';  
			  var songname = tr.insertCell(1);  
			  songname.innerHTML = '<input type="text">'; 
			  var singer = tr.insertCell(2);  
			  singer.innerHTML = '<input type="text">';  
			  var album = tr.insertCell(3);  
			  album.innerHTML = '<input type="text">'; 
			  var composer = tr.insertCell(4);  
			  composer.innerHTML = '<input type="text">';  
			  var cost = tr.insertCell(5);  
			  cost.innerHTML = '<input type="text">'; 
			  var cost = tr.insertCell(6);  
			  cost.innerHTML = '<a href=>修改</a>'; 
			  
			//document.form00.action="addmusic";
			//document.form00.submit();
		});
	}();
	
	!function(){
		$('#delete').addEvenListener('click',function(){
			document.form00.action="deletemusic";
			document.form00.submit();
		});
	}
</script>