<?php
session_start();

$user = $_SESSION['user'];
$pwd = $_SESSION['pwd'];

//echo "this the user info: $user  $pwd ";

$_SESSION['user'] = $user;
$_SESSION['pwd'] = $pwd;


//header("Location: dbConnect.php");

?>

<!DOCTYPE html>


<html lang="en">

   <head>
      <title>Update Made</title>
   </head>
   <link rel="stylesheet" type="text/css" href="style.css">
   <body > 
      
      <!-- alert window html code -->

  <SCRIPT LANGUAGE="JavaScript1.1">window.alert(

  "ALERT: SUPPLIER STATUS HAS CHANGED DUE TO BUSINESS LOGIC. DISPLAYING UPDATED SUPPLIER TABLE!");

  </SCRIPT>
     

      </form>

 <form action = "return.php">
        
        <button>Return to Main Page</button>
    
      </form action >

   </body>
</html>















