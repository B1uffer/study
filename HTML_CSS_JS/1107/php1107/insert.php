<?php
	$host = "localhost";
	$user = "";   // 닷홈 데이터베이스 아이디 입력
	$pw = "";     // 닷홈 데이터베이스 비밀번호 입력
	$dbName = "";         // 닷홈 데이터베이스 이름 입력
	$dbConnect = new mysqli($host, $user, $pw, $dbName);
	$dbConnect->set_charset("utf8");

	$comment = $_POST['abc']; // $ 변수선언

	$sql = "insert into comment(comment) values('$comment')";
// insert into 테이블명(필드명) values(넣을값)
// values() 안에 입력된 값을 comment테이블의 comment필드에 넣음
    $result = $dbConnect->query($sql);	// 데이터베이스 실행
?>
<script>
	location.href = 'comment.php';
</script>