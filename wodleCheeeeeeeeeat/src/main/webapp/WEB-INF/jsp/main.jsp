<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Wordle簡易検索</title>

<style>
body{
	background: #e3e3e1;
	}

div {
	display: inline-block;
	vertical-align: top;
	margin-left:  20px;
	margin-right: 20px;
}
</style>



</head>

<body>
	<h1>Wordle簡易検索</h1>

	<div>
		<h2>試すスペルを入力</h2>
		
		<Form action="SendForm" method="post">
			試すスペル：<input type="text" name="tryWord"><br>
						<input	type="submit" value="送信">
		</Form>

		<br>

		<h2>試したスペル一覧</h2>
		<table border="1" style="display: inline-block;">
			<tr>
				<th>試したスペル</th>
			</tr>
			<c:forEach var="tw" items="${tryWordList}">
				<tr>
					<th><c:out value="${tw}" /></th>
				</tr>
			</c:forEach>

		</table>

		<br>
		<h2>リセットする</h2>
		<Form action="ResetTest" method="post">
			<input type="submit" value="reset" style="font-size: 20px">
		</Form>
		<br>
	</div>

	<div>
		<h2>試せるスペル候補</h2>

		<table border="1" style="display: inline-block;">
			<tr>
				<th>スペル</th>
				<th>重複有無(1は無し)</th>
			</tr>

			<c:forEach var="ww" items="${wordleWordList}">
				<tr>
					<th><c:out value="${ww.word}" /></th>
					<th><c:out value="${ww.allSpellDifferent}" /></th>
				</tr>
			</c:forEach>

		</table>
	</div>

	<div>
		<h2>絞っている条件(鋭意制作中_以下は実装例)</h2>
		<table border="1" style="display: inline-block;">
			<tr>
				<th>条件</th>
				<th>ポジション</th>
				<th>アルファベット</th>
			</tr>
			<tr>
				<th>完全一致</th>
				<th>2</th>
				<th>b</th>
			</tr>
			
		</table>
	</div>

</body>
</html>