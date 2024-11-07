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

		$id = $_POST['id'];	// input태그 name속성값 입력
		$pw = $_POST['pw'];

		$sql = "select * from member where id = '$id'";
		// select * : 필드 3개 모두 조회함
		// from 테이블명
		// where id = '$id' // id필드에서 사용자가 입력한 id값이랑 일치하는걸 조회
		
	
		$result = $dbConnect->query($sql);	// 데이터베이스 실행
		$count = mysqli_num_rows($result);	// 전체 레코드 개수
		$row = mysqli_fetch_array($result); // 조회된 레코드(1개)를 row변수에 객체로 저장함 예:$row['필드명'];
		
		
		// echo $count;

	
		//echo "<script> alert('회원가입 성공');location.href = 'index.html';</script>";
	
		/*
		
		if($count == 0) {
			
			echo "<script> alert('존재하지 않는 회원입니다.'); location.href = 'login.html'; </script>";
			
		} else if ($pw != $row['pw']) {
			
			echo "<script>alert('비밀번호가 틀립니다.'); location.href = 'login.html'; </script>";
			
		}
	
		*/
	
		if($pw == $row['pw']) {
			
			session_start(); // 사용자가 입력한 비밀번호와 데이터베이스에 기록된 비밀번호가 같은지 검사한다
			$_SESSION['id'] = $id;  // 사용자 브라우저에 임시로 변수값을 저장함
			echo "<script> location.href = 'index.php'; </script>";
			
			// 사용자 브라우저에 임시로 변수값을 저장함, 로그인 주력 명령어
			
		} else {
			
			echo "<script> alert('아이디 또는 비밀번호가 틀립니다.'); location.href = 'login.html'; <script>";
			
		}
	
	?>
	
	
	
</body>
</html>
