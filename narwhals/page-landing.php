

<!DOCTYPE html>
<html>
	<head>
		<title>Narwhals</title>
		<link rel="stylesheet" href="_/css/landing.css" type="text/css" media="screen" />
		<link rel="stylesheet" href="_/css/snow.css" type="text/css" media="screen" />
		
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		
		<script type="text/javascript" src="jquery.zoomooz.min.js"></script>
		<script type="text/javascript" src="fallingsnow_v6.js"></script>
		<link href="https://fonts.googleapis.com/css?family=Oxygen" rel="stylesheet">
		<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
	</head>

	<body> 
	   	<div id="snowflakeContainer">
    		<p class="snowflake">*</p>
		</div>

	   	<div class="landing-page-wrap">
		   	

			<header class="header">
				<h1>Narwhals of Adventure</h1>
  				<div class="nav-bar">
					  <li><a href="#Tickets">Tickets</a></li>
					  <li><a href="#Park">Park</a></li>
					  <li><a href="#Home">Intro</a></li>
				</div>
			</header>
 			


 			<div class="intro-container" id="Home">
 				<div class="the_words">
 					<h1>Ready for a Unique Adventure ?</h1>
					<p>Welcome to Narwhals of Adventure, a one of kind premier resort and hotel located in scenic Baffin Island, Canada. Take a break from the mundane and the familiar, and enjoy thrills seen in no other themepark, complemented at all times by the beautifully cool weather. Take in part in a variety of endeavors, from panoramic hikes, kayaking through nature, to daring rollers coasters through colossal mountains.If you've become jaded of sham castles and drab uninteresing oceanfronts, then reinvorate your excitement here at Narwhals of Adventure.</p><br/><br/>
 				</div>

 				<div class="picture">
 					<img src="_/img/baffin.jpg" alt="Mountain View">
 				</div>
 			</div>
		    
	 	    <div class="park-container" id="Park">
			   	<div  class="zoomTarget section_1" data-closeclick="true">
				    	
				    	<div class="background-image" style="background-image:url('_/img/winter_hotel.jpg');">
				    		<p>Relax in our luxurious wintery hotel with all the amenities you can think possible. Dine in our five star restuarant and relish delicacies found only this nothern side of the hemisphere.</p>
						</div>
				</div>

			    <div class="zoomTarget section_2" data-closeclick="true">                          
			    	
			    	<div class="background-image" style="background-image:url('_/img/baffin_hike.jpg');">
				    		<p>Take a picturesque hike through the exapansive Mount Thor. Whether by yourself or in a group, our experienced tour guides will be there to help you conquer the mountain of the god of thunder himself.</p>
					</div>
			    </div>

			   <div class="zoomTarget section_3" data-closeclick="true">
			    	
			    	<div class="background-image" style="background-image:url('_/img/winter_roller.jpg');">
				    		<p>Valhalla, a rollercoaster like no other, the tracks of this ride have been meticulously integrated to regions landscape. See countryside from a variety of angles as you race at high speeds.</p>
					</div>
			   </div>

			   <div class="zoomTarget section_4" data-closeclick="true">
				    	
				    	<div class="background-image" style="background-image:url('_/img/winter-kayaking.jpg');">
				    		<p>Kayak your way through the Baffin coast, mingling along with the local marine life.</p>
						</div>
				</div>

			    <div class="zoomTarget section_5" data-closeclick="true">
			    
			    	<div class="background-image" style="background-image:url('_/img/narwhal.jpg');">
				    		<p>Stroll, ride or ferry through the park's Artic Safari and meet the island's exotic animals, including the unicorns of the sea, the narwhals.</p>
					</div>
			    </div>

			    <div class="zoomTarget section_6" data-closeclick="true">
			    	
			    	<div class="background-image" style="background-image:url('_/img/winter_ferris.jpg');">
				    		<p>Have blast at Narwhals Cove, where you can take part in array of rides and enjoy the local food. Take a seat on our 400ft tall ferris wheel and get an astonishing view of the entire island.</p>
					</div>
			    </div>
				       
		    </div>

		    <div class="ticket-container" id="Tickets">
			    <form action="" style="border:1px solid #ccc">
				  	<div class="container">
					    <h1>Tickets</h1>
					    <p>Please select your number of tickets</p>
					    <!-- <hr> -->
					    <input type="radio" name="ticket_type" value="250">Hotel and Park<br>
  						<input type="radio" name="ticket_type" value="150">Park<br>
				    	
				    	<div class="t_and_d">
					    	<div class="tickets">
						    	<p>Qty</p>
						    	<select  name="tickets">
								  <option value="1">1</option>
								  <option value="2">2</option>
								  <option value="3">3</option>
								  <option value="4">4</option>
								  <option value="5">5</option>
								  <option value="6">6</option>
								  <option value="7">7</option>
								  <option value="8">8</option>
								</select>
							</div>

							<div class="days">
								<p>Days</p>
								<select name="days">
								  <option value="1">1</option>
								  <option value="2">2</option>
								  <option value="3">3</option>
								  <option value="4">4</option>
								   <option value="5">5</option>
								  <option value="6">6</option>
								  <option value="7">7</option>
								</select>
							</div>
  						</div>
  						<div class="email-section">
						    <label for="email"><b>Email</b></label>
						    <input type="text" placeholder="Enter Email" name="email" required>
					  	</div>
					    <p>By purchasing you agree to our <a href="#" style="color:dodgerblue">Terms & Conditions</a>.</p>

					    <div class="clear-submit">
					      <button class="btn" type="clear" class="cancelbtn">Cancel</button>
					      <button class="btn" type="submit" class="purchasebtn">Purchase</button>
					    </div>

				  	</div>
				</form>

			</div>
			<footer class="footer">&copy; 2018 Narwhals of Adventure</footer>
	 	</div>

		<script src="//www.kirupa.com/js/fallingsnow_v6.js"></script>
		<script src="//www.kirupa.com/js/prefixfree.min.js"></script>
	</body>
	
	

</html>