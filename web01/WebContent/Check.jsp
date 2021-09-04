<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //자바코드 넣는 부분 
    //브라우저에서 입력한 데이터를 받아주는 코드
    String id = request.getParameter("id"); //"kgjava"
    String pw = request.getParameter("pw"); //"test"
    
  //ID, PW가 맞는지 조건문 처리
  String result = "";
    if(id.equals("kgjava") && pw.equals("pass")){
    	result = "로그인 성공";
    }else{
    	result = "로그인 실패";
    }
    
    
    //조건에 따라 결과를 다르게 보여주면 됨
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
로그인 결과는 : <%= result %>
</body>
</html>