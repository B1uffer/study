<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>무제 문서</title>
	
	<script src = "https://code.jquery.com/jquery-3.7.1.js"></script>
	
</head>
	
<body>
	<h2>계정 만들기</h2>
	<form method = "post" action = "member_insert.php">
		
		<ul>
			<li>
				<label for = "email">이메일<span>*</span></label>

				<input type = "text" id = "imail" name = "email">
				<p>이메일 주소에 @를 포함하세요.</p>
			</li>
		
			<li>
			
				<label for = "nickname">별명</label>
				<input type = "text" id = "nickname" name = "nickname">
				<p>다른 회원에게 표시되는 이름이에요.</p>
			
			</li>
			
			<li>
				
				<label for  = "name">사용자명<span>*</span></label>
				<input type = "text" id = "name" name = "name">
				<p>이름이에요.</p>
				
			</li>
			
			
			<li>
			
				<label for = "pw">비밀번호<span>*</span></label>
				<input type = "text" id = "pw" name = "pw">
				
			
			</li>
			
			<li>
			
				<label for = "day">생년월일</label>
				<select id = "year" name = "year">
					<option>년</option>
				</select>
				<select id = "month" name = "month">
					<option>월</option>
				</select>
				<select id = "day" name = "day">
					<option>일</option>
				</select>
			
			</li>
			
		</ul>
		
		<button type = "submit">계속하기</button>
	</form>
	
	
	<script>
		
		/*
		$('#year').append('<option>2024</option>');
		$('#year').append('<option>2023</option>');
		// append(); 마지막 자식을 추가함
		*/
		
		//new date를 활용해서 자동으로 연도가 바뀌게 하기
		var TODAY = new Date();
		TODAY = TODAY.getFullYear();
		// console.log(TODAY); // 2024년이니까 2024가 나옴
		
		for(i = 2024; i >= 1900; i--) {
			
			$('#year').append('<option>' + i + '</option>');
			
		}
		
	</script>
	
</body>
</html>