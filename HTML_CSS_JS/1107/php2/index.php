<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>최용수 연습용</title>
	<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
	
	<meta name="Description" content="더조은아카데미! 모두가 취업하는 그날까지!">
	<meta name="Keywords" content="더조은 춘천, 웹퍼블리셔 춘천">
	<link rel="shortcut icon" href="img/ch2.png">
	
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	<style>
		*{margin: 0; padding: 0;} /* 전체 선택자 (우선순위 0) */
		a{text-decoration: none; color: inherit;}
		li{list-style: none;} /* 점(글머리 기호) 표시 제거 */
		table{border-collapse: collapse;} /* 틈새 제거 */
		textarea{resize: none;}
		em, i, address{font-style: normal;}
		
		body{height: 5000px;}
		
		#header{height: 150px; background: red;}
		img{display: block; width: 100%;}
	</style>
	
	
</head>
	
<body>
	<form method="post" action="insert.php">
		<input type="text" name="id" placeholder="아이디를 입력하세요">
		<input type="password" id = "pw1" name="pw" placeholder="비밀번호를 입력하세요">
		<input type = "password" id = "pw2" placeholder="비밀번호 확인">
	
		<button type="submit">회원가입</button>
	</form>
	
	
    <?php
	
		session_start();
		// isset($_SESSION['$id']);
		// isset(변수명); : 변수값이 있다면 true, 없다면 false
	
		if(isset($_SESSION['id']) == true) {
			
			echo '<a href = "logout.php">로그아웃</a>';
			
		} else {
			
			echo '<a href = "login.html">로그인</a>';
			
		}
		
	
	?>
	
    <script>
		
		$('form button').click(function() {
			
			if($('#pw1').val() == $('#pw2').val()) {
				
				$('form').submit();
				
			} else {
				
				alert('비밀번호가 일치하지 않아욧!!!!');
				return false;
				
			}
			
		})
		
    </script>   
	
</body>
	
</html>
















