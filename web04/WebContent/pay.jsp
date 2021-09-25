<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
<title>Insert title here</title>
</head>
<body>

</body>
</html>