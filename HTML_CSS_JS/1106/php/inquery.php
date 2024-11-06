<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://code.jquery.com/jquery-3.6.4.js"></script>
    <title>Document</title>
    <style>
		* {margin : 0; padding : 0;}
		
		ul {list-style : none;}
       
    </style>
</head>
<body>
    
    <form id="wrap" method="post" action="inquery_insert.php"> <!-- 폼태그 꼭 넣어야함, action -->
		
		<table>
			
			<tr> <!-- tr th td는 중간에 뭐가 들어오면 절대 안된다, 표준임 -->
				
				<th><label for = "name">이름</label></th>
				<td><input type = "text" id = "name" name = "name"></td> <!-- name이 꼭 들어가야함 -->
				
			</tr>
			
			<tr>
				<th><label for = "phone1">연락처</label></th>
				<td>
				
					<select name = "phone1"> <!-- name은 중복이 안된다 -->
						<option>010</option>
						<option>011</option>
					</select>
					<input type = "text" name = "phone2">
					<input type = "text" name = "phone3">
				
				</td>
			</tr>
			
			<tr>
				
				<th><label for = "shop">점포명</label></th>
				<td><input type = "text" id = "shop" name = "shop"></td>
				<!-- action 파일을 name을 이용해서 보낼 수 있다 -->
				
			</tr>
			
			<tr>
				
				<th><label for = "content">문의내용</label></th>
				<td><textarea type = "text" id = "content" name = "content"></textarea></td>
				
			</tr>
			
		</table>
		
		<input type = "checkbox" id = "check">
		<label for = "check">문의를 위한 개인정보 활용을 동의합니다.</label>
		
		<button type = "submit">문의하기</button>
		
	</form>
	
        <h2>댓글작성</h2>
        <div class="form">
            <input type="text" id="comment" name="abc" placeholder="댓글입력">
            <button type="submit">댓글작성</button>
        </div>
       
    
	
	
    <script>
        
		
		$('button').click(function() {
			
			if($('#check').prop('checked') == true) { // 체크되어 있으면 true
				
				$('form').submit(); // 폼태그 값 액션파일로 전송함
				
			} else {
				alert('약관에 동의해!!!!!!!');
				return false;
				
			}
			
		})
		
        /*console.log($('#check').prop('checked'));
		console.log(document.querySelector('#check').checked); */
    </script>
</body>
</html>
  
