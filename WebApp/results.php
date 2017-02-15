
<?php
         session_start();
         $user = $_SESSION['user'];
         echo "Welcome back: $user";

?>


<html lang="en">
   <head>
      <title>Database Search Results</title>
   </head>
   <body style = "font-family: arial, sans-serif" 
      style = "background-color: #4A766E" background=image1.jpg link=blue vlink=blue>
     
      <form action = "logout.php">
        
        <button>LOG OUT</button>
    
      </form action >
     
      <?php
         //session_start();

          //$user = $_SESSION['user'];
          $pwd = $_SESSION['pwd'];

          //echo "this is the user info: $user $pwd";

          $command = $_POST['command'];
          
          if ($command == " ")
          {
              $command = "select * from suppliers";
          }
        

         
         // Connect to MySQL
         if ( !( $database = mysqli_connect( "localhost:3306", 
            $user , $pwd, "project5" ) ) )
            die( "Could not connect to database" );
         
        if (isset($_POST["update"]))
         {
              if ( !( $result = mysqli_query( $database, $command) ) ) 
              {
                print( " Could not execute query! <br />" );
                //die( mysqli_error() );
                echo mysqli_error($command);
              }
              else 
              {
                header("Location: update.php");
              }
         }
         else if ( !( $result = mysqli_query( $database, $command) ) ) 
         {
            print( " Could not execute query! <br />" );
            //die( mysqli_error() );
               echo mysqli_error($command);
         }


      ?>

      <h3 style = "color: blue"> 
      Query Results</h3>
      <table border = "1" cellpadding = "3" cellspacing = "3"
         style = "background-color: blue">  <!-- ADD8E6  -->
        
         <?php
    // fetch meta-data
    $metadata = mysqli_fetch_fields( $result);
    print("<tr style = 'background-color: blue; color: yellow; font-weight: bold; text-align:center'>");
    for ($i=0; $i<count($metadata); $i++){
      print("<td>");
      printf("%s",$metadata[$i]->name);
      print("</td>");
    }
    print("</tr>");

         // fetch each record in result set
            for ( $counter = 0; 
               $row = mysqli_fetch_row( $result );
               $counter++ ){

               // build table to display results
               print( "<tr style = 'color: white'>" );

               foreach ( $row as $key => $value ) 
                  print( "<td>$value</td>" );

               print( "</tr>" );
            }
            mysqli_close( $database );

            $_SESSION['user'] = $user;
            $_SESSION['pwd'] = $pwd;
         ?>
      </table>
      
      <br />Your search yielded <strong>
      <?php print( "$counter" ) ?> results.<br /><br /></strong>
       

      <form action = "return.php">
        
        <button>Return to Main Page</button>
    
      </form action >

   </body>
</html>