<?php

	// unset, 변수값 제거
	session_start(); // 사용자 브라우저에 변수값을 임시로 저장, 불러오기 할 때 씀

	unset($_SESSION['id']); // 변수값 제거

?>

<script>
	
	location.href = "index.php";
	
</script>