<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//자바 코드 넣는 부분 => 서블릿 
    	//1. 클라이언트가 입력한 데이터를 받아와야 한다.
    	//HttpsServletRequest = request = new HttpsServletRequest();
    	//객체를 미리 톰킷이 만들어서 내장하고 있다. request, response, session, application, out
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String name = request.getParameter("name");
    	String company = request.getParameter("company");
    	String tel = request.getParameter("tel");
    	String birth = request.getParameter("birth");
    	String gender = request.getParameter("gender");
    	String word = request.getParameter("word");
    	String[] hobby = request.getParameterValues("hobby");
    	String result="";
    	if(hobby != null){
    		for(String s : hobby){
    			result += s + " ";
    		}
    	}else{
    		result = "없음";
    	}
    	//취미는 여러개의 데이터를 받아와야 하기 때문에 String[] 배열과 ParameterValues를 사용
    	
    	//2. mySQL에 저장하기 위해서 sql문을 만들어야 한다.
    	//3. 가입 처리 후 응답하는 페이지(html)를 만들게 된다.
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원 가입 처리가 되었습니다.</h3>
	<hr color="lime">
	아이디 : <%= id  %><br>
	패스워드 : <%= pw  %><br>
	이름 : <%= name  %><br>
	통신사 : <%= company  %>-<%= tel  %><br>
	생년월일 : <%= birth  %><br>
	성별 : <%= gender  %><br>
	취미 : <%= result %><br>
	하고싶은말 : <%= word  %><br>
	
</body>
</html>