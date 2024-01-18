<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Wordle簡易検索</title>

<style>
body {
	background: #e3e3e1;
}

div {
	margin: 10px;
	display: inline-block;
	vertical-align: top;
}
</style>

</head>
<body>


	<h2>
		今入力したスペル =
		<c:out value="${tryWord}" />
	</h2>

	<form action="Main" id="form" method="post">
		<div id="greenDiv">
			<p style="background-color: #6aaa64">緑(完全一致のアルファベット)の入力欄</p>
			<p>ぽじには1~5、すぺにはa~z のみ入力可能です。</p>

			<c:forEach var="gs" items="${greenSpells}" varStatus="status">
				<c:choose>
					<c:when test="${gs != '_'}">
						<span>すぺ${status.index+1}：<c:out value="${gs}" /></span>
						<br />
					</c:when>

					<c:when test="${gs == '_' || empty gs}">
						<span>すぺ${status.index+1}：<input type="text"
							name="greenSpell_${status.index+1}" maxlength="1" size="1"
							pattern="[a-z]" /></span>
						<br />
					</c:when>
				</c:choose>
			</c:forEach>

		</div>

		<div id="yellowDiv">
			<p style="background-color: #c9b458;">黄色(順不同で含まれるアルファベット)の入力欄</p>
			<p>ぽじには1~5、すぺにはa~z のみ入力可能です。</p>

			<p>入力済みリスト</p>
			<table border="1">
				<tr>
					<th>ポジション</th>
					<th>アルファベット</th>
				</tr>
				<c:forEach var="ys" items="${yellowSpellList}">
					<tr>
						<th><c:out value="${ys.position}" /></th>
						<th><c:out value="${ys.alphabet}" /></th>
					</tr>
				</c:forEach>
			</table>

			<br>
			
			<input type="button" id="add" value="追加" /> <input type="button"
				id="remove" value="削除" /><br />
			<br>
			
		</div>

		<div id="grayDiv">
			<p style="background-color: #787c7e;">灰色(無関与なアルファベット)の入力欄</p>
			<p>すぺにa~z のみ入力可能です。</p>
			<span>すぺ：<input type="text" name="graySpell" maxlength="5"
				pattern="[a-z]+" /></span><br />
		</div>

		<div style="display: block">
			<input type="submit" value="go">
			<div>
	</form>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {
	var count = 0;

	$("#add").click(function(e) {
		e.preventDefault();
		if (count < 5) {
			count++;

			// カウントに応じて、nameにカウントが追加される
			$("#yellowDiv").append('<span id="yellow">ぽじ'+ count 
			+ '：<input type="text" name="yellowPosition_' + count + '" maxlength="1" size ="1" pattern="[1-5]" id="yellow" required /> 　</span>');

			$("#yellowDiv").append('<span id="yellow">すぺ'+ count
			+ '：<input type="text" name="yellowAlphabet_' + count + '" maxlength="1" size ="1" pattern="[a-z]" id="yellow" required /></span><br id="yellow" />');
	
			// 既存の隠しフィールドを削除
			$('form #count').remove();
	
			// カウントをフォームに追加
			$('<input>').attr({
				type : 'hidden',
				id : 'count',
				name : 'count',
				value : count
			}).appendTo('form');
		}
	});

	$("#remove").click(function(e) {
		e.preventDefault();
	
		if (count > 0) {
			count--;
		}
	
		if ($("input[type='text'][id='yellow']").length > 0) {
			$("input[type='text'][id='yellow']")
					.slice(-2).remove();
			$("span[id='yellow']")
					.slice(-2).remove();
			$("br[id='yellow']").last()
					.remove();
		}
	});

});

	$(document).on('input', "input[type='text']", function() {
		if ($(this).val() === '') {
			$(this).css('background-color', '');
		} else if ($(this)[0].checkValidity()) {
			$(this).css('background-color', 'palegreen');
		} else {
			$(this).css('background-color', 'lightpink');
		}
	});
</script>
</body>
</html>