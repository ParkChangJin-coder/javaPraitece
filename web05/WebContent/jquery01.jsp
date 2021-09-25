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
			n1Value = parseInt($('#n1').val())
			n2Value = parseInt($('#n2').val())
			
			//data1 = parseInt(n1Value)
			//data2 = parseInt(n2Value)
			result = n1Value + n2Value
			
			$('#result').append('<span style="color:red"> 결과는 : ' + result )
		})
		
	})
</script>

</head>
<body>
숫자1 : <input id="n1"><br>
숫자2 : <input id="n2"><br>
<button id = "b1">더하기</button>
<div id = "result"></div>

</body>
</html>