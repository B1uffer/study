<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>무제 문서</title>
</head>

<body>
	
	<?php
	
		echo($_POST['userid']);
		echo('<br>');
		echo($_POST['userpw']);
	
		if($_POST['userid'] == "춘천" && "원주") {
			
			echo("축하합니다! 당신은 강원도입니다!");
			
		} else {
			
			echo("저런, 당신은 강원도가 아닌 감자였군요!");
			
		}
	
	?>
	
</body>
</html>
