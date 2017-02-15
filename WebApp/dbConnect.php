<?php
session_start();
$user = $_POST['user'];
$pwd = $_POST['pwd'];



$con = mysqli_connect("localhost",$user,$pwd,"project5");
if(!$con)
{
	$user = $_SESSION['user'];
	$pwd = $_SESSION['pwd'];
	$con = mysqli_connect("localhost",$user,$pwd,"project5");
   //die("connection failed: ".mysqli_connect_error());
	if(!$con)
	{
		header("Location: login.php");
	}
   
}
else
{
	echo "Welcome back: $user";
	
}

$_SESSION['user'] = $user;
$_SESSION['pwd'] = $pwd;

?>

<!DOCTYPE html>
<html lang="en">

   <head>
      <title>dbConnect</title>
   </head>
   <link rel="stylesheet" type="text/css" href="style.css">
   <body > 
      
      <form action = "logout.php">
        
        <button>LOG OUT</button>
    
      </form action >

      <br><br>

      <center><h2>Enter Query</h2>  </center> 
         <center><h3>Please enter a valid SQL query or update statement. 
         </h3>  </center> 
         <center><h3>You may also just press 'Submit Query' to run a default query against the database.
         </h3>  </center> 

      <form method = "POST" action = "results.php">
        <center>
        <textarea name="command" rows="4" cols="50"> </textarea>
        <br>  <button type = "submit" name="query">Submit Query</button>  
        <button type = "submit" name="update">Subtmit Update</button> 
        <input type="reset" value="Reset Window">
         </center>
      </form>

   </body>
</html>
