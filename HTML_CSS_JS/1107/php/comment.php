<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://code.jquery.com/jquery-3.6.4.js"></script>
    <title>Document</title>
    <style>
        *{
            padding: 0;
            margin: 0;
        }
        #wrap{
            width: 500px;
            height: auto;
            margin: 30px auto;
            border: 1px solid black;
            /* background: #ccc; */
        }
        #wrap h2{
            width: 100%;
            height: 50px;
            
            text-align: center;
        }
        .form{
            width: 360px;
            margin: 0 auto;
            /* background: red; */
        }
        input[type=text]{
            width: 200px;
            height: 30px;
            padding: 0 3px;
            margin: 10px;
            outline: none;
            border: 1px solid #000;
            border-radius: 10px;
        }
        button{
            width: 100px;
            height: 35px;
            margin: 10px;
            border: none;
            background: #ccc;
            color: black;
        }
        button:active{
            background: #febd2b;
            color: #fff;
        }
        ul{
            width: 350px;
            height: auto;
            margin: 10px auto;
            /* background: red; */
        }
        li{
			display : flex; justify-content: space-between;
            width: 350px;
            padding: 10px 5px;
            margin: 0 auto;
            list-style: none;
            border-bottom: 1px solid #000;
            box-sizing: border-box;
        }
    </style>
</head>
<body>
    
    <form id="wrap" method="post" action="insert.php">
        <h2>댓글작성</h2>
        <div class="form">
            <input type="text" id="comment" name="abc" placeholder="댓글입력">
            <button type="submit">댓글작성</button>
        </div>
        <ul>
            
			<?php
				$host = "localhost";
				$user = "b1uffer";   // 닷홈 데이터베이스 아이디 입력
				$pw = "zaq159357!";     // 닷홈 데이터베이스 비밀번호 입력
				$dbName = "b1uffer";         // 닷홈 데이터베이스 이름 입력
				$dbConnect = new mysqli($host, $user, $pw, $dbName);
				$dbConnect->set_charset("utf8");

				$sql = "select * from comment"; // order by num desc : num필드를 기준으로 내림차순
				$result = $dbConnect->query($sql);	// 데이터베이스 실행
				$count = mysqli_num_rows($result);	// 전체 레코드 개수
			
				for($i = 0; $i < $count; $i++){
					mysqli_data_seek($result, $i); // 레코드 선택
					$row = mysqli_fetch_array($result); // 선택된 레코드를 불러 와서 row변수에 객체로 적재
					echo '<li>' . $row['comment'] . '<a href = "delete.php?num='.$row['num'].'">지우기</a></li>'; // . 연결 연산자, echo : innerHTML
				}
			?>
			
        </ul>
    </div>
	
	
    <script>
        
        $('ul li a').click(function() {
			
			if(confirm('댓글을 삭제할래요? 진짜? 네?') == false) {
				
				return false;
				
			}
			
		})
		
    </script>
</body>
</html>
  
