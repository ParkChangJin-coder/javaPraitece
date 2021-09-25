<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function pay(){
	money = document.getElementById('money').value
	count = document.getElementById('count').value
	
	money2 = parseInt(money)
	count2 = parseInt(count)
	
	sum = money2 * count2
	
	if (sum <= 20000){
		location.href = "http://www.naver.com"
	}else{
		alert('소액 결제는 2만원까지 가능합니다. 등신아!!')
	}
}
</script>
<script type="text/javascript" src="code.jquery.com/jquery-1.12.4.min.js" ></script>
<script type="text/javascript" src="cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
</head>
<body>
	하나당 가격 : <input id="money" value="10000"><br>
	물건의 개수 : <input id="count" value="50"><br>
	<button onclick="pay()" style='background: lime'>결제하기</button>
</body>
</html>

