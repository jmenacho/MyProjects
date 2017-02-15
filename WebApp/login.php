<?php
session_start();
?>

<!DOCTYPE html>


<html lang="en">

   <head>
      <title>login</title>
   </head>
   <link rel="stylesheet" type="text/css" href="style.css">
   <body > 
   <center><h1>CNT 4714 Project Five Database Client</h1>  </center> 
      <form method = "POST" action = "dbConnect.php">
        <input type="text" name="user" placeholder="username"><br>
        <input type="password" name="pwd" placeholder="password"><br>
        <button type = "submit">LOG IN</button><br>

        <center><h2>Welcome to the database client</h2>  </center> 
         <center><h3>This system will allo any registered user to run SQL queries
         			and update statments on the database show below, once login to the system is successful.
         </h3>  </center> 
         
         <br><center><h2>Database Connection</h2>  </center> 
                  <center><h3>Connection to the MySQL Database named: localhost:3306
         </h3>  </center>

         <br><center><h2>User Login</h2>  </center> 
                  <center><h3>Client login to the system uses the login area on the upper left
         </h3>  </center>
          <center><h3>Username: root
         </h3>  </center>
          <center> <h3>Password: pass
         </h3>  </center>

      </form>
   </body>
</html>
