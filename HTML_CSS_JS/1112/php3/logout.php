<?php
  session_start();
  unset($_SESSION["userid"]); // 주력 명령어 unset
  unset($_SESSION["username"]);
  unset($_SESSION["userlevel"]);
  
  echo("
       <script>
          location.href = 'index.php';
         </script>
       ");
?>
