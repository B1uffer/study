<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>무제 문서</title>
</head>

<body>
	
	<?php
		
		
	
		$host = "localhost";
		$user = "b1uffer";   // 닷홈 데이터베이스 아이디 입력
		$pw = "zaq159357!";     // 닷홈 데이터베이스 비밀번호 입력
		$dbName = "b1uffer";         // 닷홈 데이터베이스 이름 입력
		$dbConnect = new mysqli($host, $user, $pw, $dbName);
		$dbConnect->set_charset("utf8");
	
		$num = $_GET['num'];
	
		$sql = "delete from comment where num = $num"; // delete from 테이블명
		// comment 테이블의 레코드를 제거하는데, num필드에서 $num값이랑 일치하는 것만 제거함
	
		$result = $dbConnect->query($sql);	// 데이터베이스 실행
	
	?>
	
	<script>
		
		location.href = 'comment.php';
		
	</script>
	
</body>
</html>
