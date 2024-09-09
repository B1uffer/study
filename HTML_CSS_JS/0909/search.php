<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>무제 문서</title>
</head>

<body>
	<h1>나는 무적</h1>
	
	<?php
		echo("hello, PHP");
		echo("출력성공");
	
		echo($_GET['search']);		// 사용자가 입력한 검색값을 가져와서 화면에 출력함 (대괄호 안에 name 속성값)
	
		$name = 1;
	
		echo($name);
	
		$abc = $_GET['search'];		// abc 이름으로 변수를 만들고 사용자가 입력한 검색값을 가져와서 abc변수에 넣음
	
		if($abc == "춘천") {		// 사용자가 입력한 검색값이 춘천이랑 같은지 검사
			
			// $abc대신 $_GET['search'] 넣어도 됨
			
			echo("축하합니다! 당신은 버거입니다!");
			
			echo('<img src = "images/001.png" alt = "춘천">');
			// echo에 html을 넣고 싶을땐 ""가 아닌 ''를 써야한다
			
		} else {
			
			echo("거짓입니다");
			
		}
	?>
	
	
</body>
</html>
