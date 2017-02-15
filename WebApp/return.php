<?php
session_start();

$user = $_SESSION['user'];
$pwd = $_SESSION['pwd'];

//echo "this the user info: $user  $pwd ";

$_SESSION['user'] = $user;
$_SESSION['pwd'] = $pwd;


header("Location: dbConnect.php");

?>


