<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Form Example</title>

<style>
	div{
		border: 10px;
		display: inline-block;
		vertical-align: top;
	}
</style>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	var count = 1;
	  $("#add").click(function(e){
	    e.preventDefault();
	    count++;
	    
	    $("#formYellowSpell").append('<span>ぽじ' + count + '：<input type="text" name="posi' + count + '" maxlength="1" size ="1" pattern="[1-5]" required /> 　</span>');
	    $("#formYellowSpell").append('<span>すぺ' + count + '：<input type="text" name="text' + count + '" maxlength="1" size ="1" pattern="[a-z]" required /></span><br/>');
	    
	  });
	  
	  $("#remove").click(function(e){
	    e.preventDefault();

		if(count > 1){
			count--;
		}
	    
	    if($("input[type='text']").length > 2) {
	      $("input[type='text']").slice(-2).remove();
	      $("span").slice(-2).remove();
	      $("br").last().remove();
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

</head>
<body>
<div>
	<p>緑(完全一致のアルファベット)の入力欄</p>
	<p>ぽじには1~5、すぺにはa~z のみ入力可能です。</p>
	<form id="formGreenSpell">
		<span>ぽじ1：<input type="text" name="posi1" maxlength="1" size ="1" pattern="[1-5]" /></span>　
		<span>すぺ1：<input type="text" name="text1" maxlength="1" size ="1" pattern="[a-z]" /></span><br/>
	</form>
</div>

<div>
	<p>黄色(順不同で含まれるアルファベット)の入力欄</p>
	<p>ぽじには1~5、すぺにはa~z のみ入力可能です。</p>
	<form id="formYellowSpell">
		<input type="button" id="add" value="追加" /> 
		<input type="button" id="remove" value="削除" /><br/>
		<span>ぽじ1：<input type="text" name="posi1" maxlength="1" size ="1" pattern="[1-5]" /></span>　
		<span>すぺ1：<input type="text" name="text1" maxlength="1" size ="1" pattern="[a-z]" /></span><br/>
	</form>
</div>

<div>
	<p>灰色(無関与なアルファベット)の入力欄</p>
	<p>すぺにa~z のみ入力可能です。</p>
	<form id="formGraySpell">
		<input type="button" id="add" value="追加" /> 
		<input type="button" id="remove" value="削除" /><br/>
		<span>すぺ1：<input type="text" name="text1" maxlength="1" size ="1" pattern="[a-z]" /></span><br/>
	</form>
</div>

</body>
</html>