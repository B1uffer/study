<meta charset="utf-8">

<?php 

	include 'dbpassword.php';

	$email = $_POST['email'];
	$nickname = $_POST['nickname'];
	$name = $_POST['name'];
	$pw = $_POST['pw'];

	$day = $_POST['year'].'년'.$_POST['month'].'월'.$_POST['day'].'일';

	$sql = "insert into discord(email, nickname, name, pw, day) values('$email','$nickname','$name','$pw','$day')";

	$result = $dbConnect->query($sql); // 데이터베이스 실행함
	
?>

<script>
	
	location.href = 'index.php';
	
</script>