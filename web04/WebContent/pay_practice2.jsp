<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.12.4.min.js" ></script>
<script type="text/javascript" src="http://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
<script type="text/javascript">
function pay() {
//입력한 값들을 가지고 온다.
	money = document.getElementById('money').value
	count = document.getElementById('count').value
	
	//정수로 변환
	money2 = parseInt(money)
	count2 = parseInt(count)
	
	//총 결제금액을 계산
	sum = money2 * count2
	
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
// alert(‎msg);
}
</script>
</head>
<body>
하나당 가격: <input id="money" value="10000"><br>
물건의 개수: <input id="count" value="50"><br>
<button onclick="pay()" style='background: lime'>결제하기</button>
</body>
</html>