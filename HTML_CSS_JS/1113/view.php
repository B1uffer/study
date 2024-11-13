<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>무제 문서</title>
</head>

<body>
	
	<?php
	
		include 'dbpassword.php';
	
		// echo $_GET['num'];
	
		$num = $_GET['num'];
		$sql = "select * from lotte where num = $num"; // lotte 테이블에서 num필드랑 식별자 num변수랑 같은 것만 조회함
		$result = $dbConnect->query($sql);
	
		$row = mysqli_fetch_array($result); // 조건에 충족되는 값을 row 변수에 객체로 저장한다
	
		$subject = $row['subject'];
		$content = $row['content'];
		$regist_day = $row['regist_day'];
	
	?>
	
	<h2>공지사항</h2>
	
	<div id = "wrap">
		
		<h3><?php echo $subject; ?></h3>
		<span><?php echo $regist_day; ?></span>
		<div class = "content">
			
			<?=$content?> <!-- php echo $content를 줄여쓴 것임 -->
			
		</div>
		
	</div>
	
</body>
</html>
