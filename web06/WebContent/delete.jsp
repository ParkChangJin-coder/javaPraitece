<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    //1)서버에서 받음
	//2)db처리
	//3)결과를 html로 전달
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String name = request.getParameter("name");
    	String tel = request.getParameter("tel");
    	
    	//mySQL 5.5 연결, 받아놓은 데이터를 저장
    	//Browser--- html--- java(web server)--- sql --- dbms(mySQL, sql문만 인식)
    	//java db connection(JDBC) Programming
    	//순서가 항상 정해져 있음
    	//1. 커넥터 설정
        Class.forName("com.mysql.jdbc.Driver");
        out.println("1. 드라이버 커넥터 설정 성공<br>");
        //2. db연결(url, user, pw)
        String url = "jdbc:mysql://localhost:3306/shoes"; //url : ip + port
        String user = "root";
        String password = "1234";
        Connection con = DriverManager.getConnection(url, user, password);
        out.println("2. 드라이버 커넥터 설정 성공<br>");
        //3. sql문 객체화
        String sql = "DELETE FROM member where id = ?";
        //String url2 = "https://www.naver.com";
        //URL url3 = new URL(url2);
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id);
        out.println("3. sql 부품(객체화) 성공 <br>");
        //Cup cup =
        //cup.water();
		//4. sql문 전송
        int count = ps.executeUpdate();
        out.println("4. sql db로 보내기 성공 <br>");
    	//2. java db 연결, url, user, pw
    	//3. sql 생성, 전송
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	회원 탈퇴 페이지라네!
<hr color="red">
받은 아이디는 : <%= id  %> <br>
</body>
</html>