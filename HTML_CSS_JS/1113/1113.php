<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>무제 문서</title>
</head>

<body>
	
	<a href = "inquiry.php">글쓰기</a>
	
	<div id = "wrap">
		
		<p>롯데월드 소식</p>
		<ul>
			
			<?php
			
				include 'dbpassword.php';
			
			$sql = "select * from lotte order by num desc"; // lotte 테이블 num 필드 기준으로 내림차순 정렬
			$result = $dbConnect->query($sql);
			$total_record = mysqli_num_rows($result); // 호출된 테이블 전체 레코드 수
			
			if($total_record >= 4) {  // 4 이상이면 4 사이클만 돌리겠다
				
				$total_record = 4;
				
			}
			
			// 레코드 총 개수가 4개 이상이면 4사이클 고정, 4개 미만이면 레코드 갯수만큼 for문 돌림
			for($i = 0; $i < $total_record; $i++) {
				
				mysqli_data_seek($result, $i);
				$row = mysqli_fetch_array($result);
				
				$num = $row['num'];
				$subject = $row['subject'];
				$regist_day = $row['regist_day'];
				
			
				echo '<li><a href = "view.php?num='.$num.'">
							<b><?php ?></b>
							<span></span>
						  </a>
					  </li>';
				
			}
			
			?>
			
		</ul>
		
	</div>
	
</body>
</html>
