<!doctype html>
<meta charset="utf-8">

<?php
	$host = "localhost";
    $user = "b1uffer";   // 닷홈 데이터베이스 아이디 입력
	$pw = "zaq159357!";     // 닷홈 데이터베이스 비밀번호 입력
	$dbName = "b1uffer";         // 닷홈 데이터베이스 이름 입력
    $dbConnect = new mysqli($host, $user, $pw, $dbName);
    $dbConnect->set_charset("utf8");

	$id = $_POST['id'];	// input태그 name속성값 입력
	$pw = $_POST['pw'];

	$sql = "insert into member(id, pw) values('$id', '$pw')";
	// insert into 테이블명(필드명) values(넣을값)
	// values() 안에 입력된 값을 comment테이블의 comment필드에 넣음
    $result = $dbConnect->query($sql);	// 데이터베이스 실행

	//echo "<script> alert('회원가입 성공');location.href = 'index.html';</script>";
?>

<script>
	alert('회원가입 성공');
	location.href = 'index.html';
</script>