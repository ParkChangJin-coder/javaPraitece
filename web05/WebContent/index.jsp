<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.6.0.js"></script>
<script type="text/javascript">
//document.getElementById('data').value $는 다큐먼트
$(function() { //브라우저가 body를 다 읽어서 준비가 되면
	//DOM TREE : document object model
	//브라우저가 RAM에 body 태그 아래 부분을 읽어 들일 때, 태그간의 포함관계를 유지하면서
	//읽어들이기 위해 body 태가 아래 대상들을 tree방식으로 읽어들이는 방식
	//document.ready()
	alert('body 읽기 성공')
	$('button').click(function() {
		//button을 눌르면 
		dataValue = $('#data').val() //#data -> id 읽어옴
		alert('가져온 데이터는 ' + dataValue)
		//$('#result').html('<h2>가지고 온 데이터는 ' + dataValue)
		$('#result').append('<h2>가지고온 데이터는 ' + dataValue)
	}) //button
	
})

</script>

</head>
<body>
<h3>오늘은 토요일 JSP 5일차</h3>
<hr>
데이터 입력: <input type="text" id="data"><br>
<button>입력값 확인</button>
<hr>
<div id="result" style="width:500px; height:300px; background-color: yellow"></div>
</body>
</html>