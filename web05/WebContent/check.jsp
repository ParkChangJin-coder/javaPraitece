<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//user값을 받아오는 코드
	String user = request.getParameter("user");
	
	//이미 가입된 id들의 배열을 사용해 보자
	String[] list = { "root", "apple", "admin"};
	
	//중복체크
	String result = "중복이 되지 않는 가입 가능한 아이디다!";
	for(String s: list){
		if(s.equals(user)){
			result = "중복되는 id입니다. 가입불가다 멍청아!";
			break; //반복 종료
		}
	}
	//결과를 알려준다.
	%><%=result%>