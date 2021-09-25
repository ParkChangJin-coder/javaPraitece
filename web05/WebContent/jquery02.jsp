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
		$('#b1').click(function() {
			//user 입력 값을 가져 와서 글자수를 체크
			userValue = $('#user').val()
			userCount = userValue.length
			if(userCount < 5){
				alert('더 입력해라 멍청아!')
				$('#result').html('더 입력하라고 멍청아!')
			}else{
				
				$('#result').html('잘했어 멍청아!')
			}
				
		})//b1 아이디
		
		$('#b2').click(function() {
			pw1Value = $('#pw1').val()
			pw2Value = $('#pw2').val()
			if (pw1Value == pw2Value){
				$('#result').html('일치!')
			}else{
				$('#result').html('불일치!')
			}
		})
		
	})
</script>
</head>
<body>
아디디 : <input id = "user"><button id = "b1">아이디 길이 체크</button><br>
<hr color="red">
패스워드 : <input id = "pw1"><br>
패스워드 확인 : <input id="pw2"><br>
<button id = "b2">패스워드 체크</button>
<hr color="green">
<div id = "result"></div>
</body>
</html>