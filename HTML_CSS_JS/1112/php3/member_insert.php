<meta charset="utf-8">
<?php
    include 'dbpassword.php';	// 데이터베이스 접속
?>
<?php
    $id   = $_POST["id"];
    $pass = $_POST["pass"];
    $name = $_POST["name"];
    $email  = $_POST["email"];
    $regist_day = date("Y-m-d (H:i)");  // 현재의 '년-월-일-시-분'을 저장W

    $sql = "insert into members(id, pass, name, email, regist_day, level) values('$id', '$pass', '$name', '$email', '$regist_day', 0)"; // level이 0이니 일반계정
		// members 테이블에 새로운 레코드 삽입
    $result = $dbConnect->query($sql);	// 데이터베이스 실행

    echo "<script> alert('회원가입이 완료되었습니다! 로그인해서 이용하시면 됩니다.'); location.href = 'index.php' </script>";
?>