<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
		<link rel="stylesheet" href="css/out.css">
		<style>
			li{
			background: red;
			color: white;
			font-weight: bold;
			float: left;
			list-style: none;
			margin: 10px;
			height: 100px;
			width: 100px;
			padding-top: 50px;
			}
			a{
				text-decoration: none;
			}
			a:hover {/* 마우스를 올리면 스타일 적용  */
				text-decoration: overline;
				font-size: 20px;
				color: black;
			}
			li:hover{
				background: white;
			}
			
		</style>
	</head>
		<body>
			<ul>
				<li>
				<a href="http://www.naver.com"> to naver</a>
				</li>
				<li>
				<a href="http://www.daum.com"> to daum</a>
				</li>
				<li>
				<a href="http://www.google.com"> to google</a>
				</li>
			</ul>
		</body>
</html>