<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="css/out.css">
		<style>
			li{ /* 선택자 : 기본 선택자(tag명) */
				background: yellow;
				list-style: none;
				float: left;
				padding: 15px;
				width: 70px;
				height : 30px;
			}
			li:nth-child(2n){/* li중에서 짝수만 선택 가상 선택자 */
				background: orange;
			}
			li:first-child{
				border-radius: 20px 0px 0px 20px;
			}
			li:last-child{
				border-radius: 0 20px 20px 0;
			}
		</style>
	</head>
<body>
	<ul> <!-- unordered List -->
		<li>회원가입</li>
		<li>제품정보</li>
		<li>게시판</li>
		<li>장바구니</li>
	</ul>
</body>
</html>