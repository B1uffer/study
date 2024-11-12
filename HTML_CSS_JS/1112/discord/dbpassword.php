
<?php

	$host = "localhost";
    $user = "b1uffer";   // 닷홈 ftp 아이디 입력
    $pw = "zaq159357!";     // 닷홈 ftp 비밀번호 입력
    $dbName = "b1uffer";         // 닷홈 데이터베이스 아이디 입력
    $dbConnect = new mysqli($host, $user, $pw, $dbName);
    $dbConnect->set_charset("utf8");

?>