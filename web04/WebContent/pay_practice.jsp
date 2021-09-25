<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.12.4.min.js" ></script>
<script type="text/javascript" src="http://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
<!-- cdn 방식 : 다른 서버에 있는 파일을 네트워크로 연결하여 사용 
		content delivery 
-->

<script type="text/javascript">
function pay(){
	money = document.getElementById('money').value
	count = document.getElementById('count').value
	
	money2 = parseInt(money)
	count2 = parseInt(count)
	
	sum = money2 * count2
	
	//자바에서는 map!(키:값의 쌍으로 이루어 지는 자료의 형태)
	//자바스크립트에서는 {키:값, 키:값, 키:값}
	//=>JavaScript Object Notation
	// 자바스크립트에서 대상을 나타내는 표기법
	// JSON
	
	var IMP = window.IMP; // 생략가능
	IMP.init('iamport'); // 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용
	IMP.request_pay({
	pg : 'inicis', // version 1.1.0부터 지원.
	pay_method : 'card',
	merchant_uid : 'merchant_' + new Date().getTime(),
	name : '주문명:결제테스트',
	amount : 14000,
	buyer_email : 'iamport@siot.do',
	buyer_name : '구매자이름',
	buyer_tel : '010-1234-5678',
	buyer_addr : '서울특별시 강남구 삼성동',
	buyer_postcode : '123-456',
	m_redirect_url : 'www.yourdomain.com/payments/complete'
	}, function(rsp) {
	if ( rsp.success ) {
		var msg = '결제가 완료되었습니다.';
		msg += '고유ID : ' + rsp.imp_uid;
		msg += '상점 거래ID : ' + rsp.merchant_uid;
		msg += '결제 금액 : ' + rsp.paid_amount;
		msg += '카드 승인번호 : ' + rsp.apply_num;
	} else {
		var msg = '결제에 실패하였습니다.';
		msg += '에러내용 : ' + rsp.error_msg;
	}

	});
	/*  
	if (sum <= 20000){
		location.href = "http://www.naver.com"
	}else{
		alert('소액 결제는 2만원까지 가능합니다. 등신아!!')
	}
	*/
}
</script>

</head>
<body>
	하나당 가격 : <input id="money" value="10000"><br>
	물건의 개수 : <input id="count" value="50"><br>
	<button onclick="pay()" style='background: lime'>결제하기</button>
</body>
</html>