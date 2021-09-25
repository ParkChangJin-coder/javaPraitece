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
			testValue = $('#test').val()
			$.ajax({
				url : "test.jsp",
				data : {
					test : testValue //test : 홍길동
				},
				success : function(jspResult) { //jspResult: jsp실행 결과가 들어감 변수
					//alert('ajax 성공')
					$('#result').html(jspResult)
				},
				error : function() {
					alert('ajax 실패')
				}//error
			})//ajax
		})//b1 click
		
		$('#b2').click(function() {
			moneyValue = $('#money').val()
			choiceValue = $('#choice').val()
			$.ajax({
				url : "money.jsp",
				data : {
					money : moneyValue,
					choice : choiceValue
				},
				success : function(jspResult) { //jspResult: jsp실행 결과가 들어감 변수
					//alert('ajax 성공')
					$('#result').html(jspResult)
				},
				error : function() {
					alert('ajax 실패')
				}//error
			})//ajax
		})//b2 click
		
		$('#b3').click(function() {
			userValue = $('#user').val()
			$.ajax({
				url : "check.jsp",
				data : {
					user : userValue
				},
				success : function(jspResult) { //jspResult: jsp실행 결과가 들어감 변수
					//alert('ajax 성공')
					$('#result').html(jspResult)
				},
				error : function() {
					alert('ajax 실패')
				}//error
			})//ajax
		})//b3 click
		
		$('#b4').click(function() {
			numberValue = $('#number').val()
			$.ajax({
				url : "tel.jsp",
				data : {
					number : numberValue
				},
				success : function(jspResult) { //jspResult: jsp실행 결과가 들어감 변수
					alert('니놈이 받은 인증 번호는 >> ' + jspResult)
					$('#result').html(jspResult)
				},
				error : function() {
					alert('ajax 실패')
				}//error
			})//ajax
		})//b4 click
		
	})//$()
</script>
</head>
<body>
	<h3>비동기 통신으로 서버와 통신하기</h3>
	<hr>
	ajax테스트 :
	<input id="test">
	<button id="b1">처리하기</button>
	<hr color='blue'>

	결제금액 :
	<input id="money">
	<br> 결제수단 : 1)계좌이체 2)신용카드 3)휴대폰결제
	<input id="choice">
	<button id="b2">결제하기(money.jsp)</button>
	<hr color="red">
	
	회원 가입할 id 입력 :
	<input id="user">
	<button id="b3">id중복체크(check.jsp)</button>
	<hr color="orange">
	
	인증받을 전화번호 입력 :
	<input id="number">
	<button id="b4">인증번호 받기(tel.jsp)</button>
	<br> 인증받은 숫자 입력 :
	<input id="number2">
	<button id="b5">인증번호 확인</button>
	<hr color="green">

	<div id="result"></div>
</body>
</html>