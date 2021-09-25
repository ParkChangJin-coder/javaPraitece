<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() {
		$('button').click(function() {
			replyValue = $('#reply').val()
			img = "<img src='img/download.jpg' width='100px' height='30px'>"
			$('#result').append(img + replyValue + "<br>")
		})
	})

</script>
</head>
<body>
댓글달기 : <input id ="reply"><button>등록</button>
<hr color="green">
<div id = "result"></div>
</body>
</html>