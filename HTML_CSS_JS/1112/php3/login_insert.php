<meta charset="utf-8">
<?php
    include 'dbpassword.php';	// 데이터베이스 접속
?>
<?php
    $id   = $_POST["id"];
    $pass = $_POST["pass"];

   $sql = "select * from members where id='$id'";
   $result = $dbConnect->query($sql);	// 데이터베이스 실행

   $num_match = mysqli_num_rows($result);	// 조건에 충족되는 개수, 갯수 세는거임

   if(!$num_match) // 1이면 트루, 0이면 펄스 (반대)
   {
     echo("
           <script>
             alert('등록되지 않은 아이디입니다!');
             history.go(-1);
           </script>
         ");
    }
    else
    {
        $row = mysqli_fetch_array($result);	//	선택된 레코드를 조회해서 해당 변수에 배열로 넣음

        if($pass != $row["pass"])
        {
           echo("
              <script>
                alert('비밀번호가 틀립니다!');
                history.go(-1);
              </script>
           ");
        }
        else
        {
            session_start();	//	손님의 브라우저에 변수값 적재 (브라우저 종료되면 사라짐)
            $_SESSION["userid"] = $row["id"];
            $_SESSION["username"] = $row["name"];
            $_SESSION["userlevel"] = $row["level"];

            echo("
              <script>
                location.href = 'index.php';
              </script>
            ");
        }
     }        
?>
