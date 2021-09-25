<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String test = request.getParameter("test");
    //ajax가 보냈을 때는 data안에 있던 test키를 파라메터로 받아줌
    
    %>
받은 데이터는 : <%= test %>    

<%-- //이하 필요없는 내용
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
test.jsp이닷!!<br> 
받은 데이터는 : <%= test %>
</body>
</html> --%>