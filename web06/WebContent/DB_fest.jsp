<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //1. 커넥터 설정
    Class.forName("com.mysql.jdbc.Driver");
    out.println("1. 드라이버 커넥터 설정 성공<br>");
    //2. db연결(url, user, pw)
    String url = "jdbc:mysql://localhost:3306/shop"; //url : ip + port
    String user = "root";
    String password = "1234";
    Connection con = DriverManager.getConnection(url, user, password);
    out.println("2. 드라이버 커넥터 설정 성공<br>");
    //3. sql문 객체화
    String sql = "insert into member values ('pen', 'pen00','park','010')";
    //String url2 = "https://www.naver.com";
    //URL url3 = new URL(url2);
    PreparedStatement ps = con.prepareStatement(sql);
    out.println("3. sql 부품(객체화) 성공 <br>");
    //Cup cup =
    //cup.water();
    
    ps.executeUpdate();
    out.println("4. sql db로 보내기 성공 <br>");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>