<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<hr width="30%" color="lightgray">
			<h3>UPLODA 테이블 자료실 게시판 게시글 입력 폼페이지</h3>
		<hr width="30%" color="lightgray">
		<br>
		<%-- enctype : 이진 파일을 업로드하기 위한 속성 --%>
		<form method="post" enctype="multipart/form-data" action="<%=request.getContextPath()%>/upload_write_ok.do">
			<table border="1" cellspacing="0" width="350">
				<tr>
					<th>작성자</th>
					<td><input type="text" name="upload_writer"></td>
				</tr>
				<tr>
					<th>글제목</th>
					<td><input type="text" name="upload_title"></td>
				</tr>
				<tr>
					<th>글내용</th>
					<td><textarea rows="7" cols="20" name="upload_content"></textarea></td>
				</tr>
				<tr>
					<th>파일첨부</th>
					<td><input type="file" name="upload_file"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="upload_pwd"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit" value="글쓰기">&nbsp;&nbsp;&nbsp;
					<input type="reset" value="다시작성"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>