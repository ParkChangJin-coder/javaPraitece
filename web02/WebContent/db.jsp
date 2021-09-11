<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- %@ 지시자 : 톰킷에게 이 페이지는 자바로 처리를 하고 html로 결과를 만들어라는 지시자 -->
    <!-- %@ page: page지시자  -->
    <!-- jsp페이지에는 첫줄에 page 지시자가 와야 한다 -->
    <!-- 1. 클라이언트가 브라우저에서 입력하여 전송한 데이터를 서버에서 받아 주어야 한다  -->
    <%
    //자바코드 들어가는 부분
    //httpServerRequest request = new HttpServletRequest();
    //미리 객체를 만들어서 톰킷이 제공하고 있다.
    //이미 객체가 만들어져서 톰킷에 내장되어있다.
    //미리 만들어서 제공되는 객체 : 내장된 객체(Built-In)
    String id = request.getParameter("id"); //kgjava, id="kgjava"
    String pw = request.getParameter("pw"); 
    String name = request.getParameter("name"); 
    String tel = request.getParameter("tel"); 
    %>
    <!-- 2.db처리해주어야 한다(back-end)(생량) -->
    <!-- 3.처리후 클라이언트에게 보여줄 화면(html)을 만들면 된다 -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
	<h2>회원 가입이 되었습니다. 당신의 가입 정보 입니다.</h2>
	<hr>
		가입한 id : <%= id %><br>
		가입한 pw : <%= pw %><br>
		가입한 name : <%= name %> <br>
		가입한 tel : <%= tel %><br>
	<a href="index.html">
		<button type="submit">앞 페이지로 이동</button>
	</a>
	<a href="index.html"> <!-- img로 이미지 파일 불러오기 -->
		<img alt="버튼이미지" src="img/button.png" width="150" height="50"> 
		<!-- alt는 생략 가능 순서는 상관 없음 -->
		<!-- img/로 이미지 위치 지정 -->
	</a>
	<form action="index.html">
		<button>돌아가기</button>
	</form>
</body>
</html>