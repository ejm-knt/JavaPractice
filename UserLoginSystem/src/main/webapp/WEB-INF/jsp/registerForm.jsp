<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録</title>
 	 <script type="text/javascript">
        function addField() {
            var form = document.getElementById('dynamicForm');
            var input = document.createElement('input');
            input.type = 'text';
            input.name = 'newField';
            form.appendChild(input);
            
         	// Add a line break after the new field
            var br = document.createElement('br');
            form.appendChild(br);
        }
    </script>
</head>
<body>
 <form action="RegisterUser" method="post">
	ログインID：<input type="text" name="id"><br>
	パスワード：<input type="password" name="pass"><br>
	名前：<input type="text" name="name"><br>
 	<input type="submit" value="確認">
 </form>

 <form id="dynamicForm">
        <input type="button" value="追加" onclick="addField()">
    </form>
 	

</body>
</html>