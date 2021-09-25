<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
	String number = request.getParameter("number");
	//01011112222
	String sub = number.substring(0,3); // 0~2 추출 -> 010추출
	String result = "";
	if(sub.equals("010")){
		result = "12345";
	}else if(sub.equals("011")){
		result = "67890";
	}else{
		result = "45678";
	}
	%><%=result%>