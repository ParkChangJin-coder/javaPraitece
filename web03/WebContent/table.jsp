<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css"> /* 기본 선택자: 태그명, 클래스명(.), 아이디명(#) */
		td{/* td 태그 전체 */
			text-align: center;
		}
		.left{ /*  class는 . 으로ㅗ 찾을 수 있다. */
			width: 100px;
			background: lime;
		}
		.right{
			width: 250px;
			background: orange;
		}
		input{
			width: 250px;
			background: pink;
		}
		#under{ /* id를 찾을 땐 # */
			background: gold;
		}
		button:hover{
			background: white;
			color: red;
		}
	</style>
</head>
<body>
<table border="1">
	<tr> <!-- table row -->
		<td class="left" style="background: blue; color:white;">항목 </td>
		<td class="right">입력 </td>
	</tr>
	<tr>
		<td class="left">번호</td>
		<td class="right">
			<input>
		</td>
	</tr>
		<tr>
		<td class="left">제목</td>
		<td class="right">
			<input>
		</td>
	</tr>
		<tr>
		<td class="left">내용</td>
		<td class="right">
			<input>
		</td>
	</tr>
		<tr>
		<td class="left">작성자</td>
		<td class="right">
			<input>
		</td>
	</tr>
	<tr>
		<td colspan="2" id="under"> <!-- 하나를 지정할 땐 id -->
			<button>글쓰기 완료</button>
		</td>
	</tr>
</table>

</body>
</html>