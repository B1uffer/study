<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>무제 문서</title>
</head>

<body>
	
	<?php
		
		echo($_POST["notice"]);
		echo('<br>');
		echo($_POST["select"]);
		echo('<br>');
		echo($_POST["check"]);
	
		if($_POST["check"] == "약관") {
			
			echo("체크한 손님");
			
		} else {
			
			echo('<script>alert("ㅋㅋ 체크안했음")</script>');
			echo('<script>location.href = "index.html";</script>');	// 사용자를 index.html로 이동시킴
			
		}
	
	?>
	
	
</body>
</html>
