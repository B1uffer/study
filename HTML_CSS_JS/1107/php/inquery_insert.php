<?php

/*

	echo $_POST['name'] , '<br>';
	echo $_POST['phone1'] , '<br>';
	echo $_POST['shop'] , '<br>';
	echo $_POST['content'] , '<br>';
	
*/
?>

<?php
	

	
	$host = "localhost";
	$user = "b1uffer";   // 닷홈 데이터베이스 아이디 입력
	$pw = "zaq159357!";     // 닷홈 데이터베이스 비밀번호 입력
	$dbName = "b1uffer";         // 닷홈 데이터베이스 이름 입력
	$dbConnect = new mysqli($host, $user, $pw, $dbName);
	$dbConnect->set_charset("utf8");

	$name = $_POST['name']; // $ 변수선언
	$phone = $_POST['phone1'].$_POST['phone2'].$_POST['phone3'];
	$shop = $_POST['shop'];
	$content = $_POST['content'];


	$sql = "insert into inquery(name, phone, shop, content) values('$name','$phone','$shop','$content')";

	// $sql = "insert into comment(comment) values('$comment')";
// insert into 테이블명(필드명) values(넣을값)
// values() 안에 입력된 값을 comment테이블의 comment필드에 넣음
    $result = $dbConnect->query($sql);	// 데이터베이스 실행

	
	
?>
<script>
	// location.href = 'comment.php';
	alert('문의가 완료됐음');
	location.href = 'inquery.php';
</script>