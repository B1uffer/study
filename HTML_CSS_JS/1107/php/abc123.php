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

				$sql = "select * from inquery order by num desc"; // order by num desc : num필드를 기준으로 내림차순
				$result = $dbConnect->query($sql);	// 데이터베이스 실행
				$count = mysqli_num_rows($result);	// 전체 레코드 개수
			
				for($i = 0; $i < $count; $i++){
					mysqli_data_seek($result, $i); // 레코드 선택
					
					$row = mysqli_fetch_array($result); // 선택된 레코드를 불러 와서 row변수에 객체로 적재
					
					echo '<li>' . $row['name'] $row['phone'] $row['shop'] $row['content'] . '</li>'; // . 연결 연산자, echo : innerHTML
				}
			
	
?>
	
</body>
</html>
