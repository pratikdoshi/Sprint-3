<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Search Room Page</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Template by FREEHTML5.CO" />
	<meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
	<meta name="author" content="FREEHTML5.CO" />

  <!-- 
	

  	<!-- Facebook and Twitter integration -->
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
	<link rel="shortcut icon" href="favicon.ico">
	<!-- <link href='https://fonts.googleapis.com/css?family=Lato:400,100,100italic,300,300italic,400italic,700italic,900,700,900italic' rel='stylesheet' type='text/css'> -->

	<!-- Stylesheets -->
	<!-- Dropdown Menu -->
	<link rel="stylesheet" href="css/superfish.css">
	<!-- Owl Slider -->
	<!-- <link rel="stylesheet" href="css/owl.carousel.css"> -->
	<!-- <link rel="stylesheet" href="css/owl.theme.default.min.css"> -->
	<!-- Date Picker -->
	<link rel="stylesheet" href="css/bootstrap-datepicker.min.css">
	<!-- CS Select -->
	<link rel="stylesheet" href="css/cs-select.css">
	<link rel="stylesheet" href="css/cs-skin-border.css">

	<!-- Themify Icons -->
	<link rel="stylesheet" href="css/themify-icons.css">
	<!-- Flat Icon -->
	<link rel="stylesheet" href="css/flaticon.css">
	<!-- Icomoon -->
	<link rel="stylesheet" href="css/icomoon.css">
	<!-- Flexslider  -->
	<link rel="stylesheet" href="css/flexslider.css">
	
	<!-- Style -->
	<link rel="stylesheet" href="css/style.css">

	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

</head>
<body>
	<div id="fh5co-wrapper">
	<div id="fh5co-page">
	<div id="fh5co-header">
		<header id="fh5co-header-section">
			<div class="container">
				<div class="nav-header">
					<a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle"><i></i></a>
					<h1 id="fh5co-logo"><a href="index.html">Welcome!</a></h1>
					<nav id="fh5co-menu-wrap" role="navigation">
						<ul class="sf-menu" id="fh5co-primary-menu">
							
								<li><a class="active" href="index.html">Log out</a></li>
								 	
									
								
						</ul>
					</nav>
				</div>
			</div>
		</header>
		
	</div>
	<!-- end:fh5co-header -->
	<!-- aside code -->
	<aside id="fh5co-hero" class="js-fullheight">
		<div class="flexslider js-fullheight">
			<ul class="slides">
		   	<li style="background-image: url(images/slider1.jpg);">
		   		<div class="overlay-gradient"></div>
		   		<div class="container">
		   			<div class="col-md-12 col-md-offset-0 text-center slider-text">
		   				<div class="slider-text-inner js-fullheight">
		   					<div class="desc">
		   						<p><span>ABC Hotel</span></p>
		   						<h2>Reserve Room for Dream Vacation</h2>
			   <!-- commented this part --><!--<p>
			   						<a href="#" class="btn btn-primary btn-lg">Book Now</a>
			   					</p>-->
		   					</div>
		   				</div>
		   			</div>
		   		</div>
		   	</li>
		   	<li style="background-image: url(images/slider2.jpg);">
		   		<div class="overlay-gradient"></div>
		   		<div class="container">
		   			<div class="col-md-12 col-md-offset-0 text-center slider-text">
		   				<div class="slider-text-inner js-fullheight">
		   					<div class="desc">
		   						<p><span>ABC Hotel</span></p>
		   						<h2>Make Your Vacation Comfortable</h2>
			   				<!--	<p>
			   						<a href="#" class="btn btn-primary btn-lg">Book Now</a>
			   					</p> -->
		   					</div>
		   				</div>
		   			</div>
		   		</div>
		   	</li>
		   	<li style="background-image: url(images/slider3.jpg);">
		   		<div class="overlay-gradient"></div>
		   		<div class="container">
		   			<div class="col-md-12 col-md-offset-0 text-center slider-text">
		   				<div class="slider-text-inner js-fullheight">
		   					<div class="desc">
		   						<p><span>ABC Hotel</span></p>
		   						<h2>The Best Place To Enjoy Your Vacation</h2>
			   				<!--	<p>
			   						<a href="#" class="btn btn-primary btn-lg">Book Now</a>
			   					</p> -->
		   					</div>
		   				</div>
		   			</div>
		   		</div>
		   	</li>
		   	
		  	</ul>
	  	</div>
	</aside>
	
	<!-- end of aside -->
	
	<div class="wrap">
		<div class="container">
			<div class="row">
				<div id="availability">
					<form action="goToAddRoomServlet">

						<div class="a-col">
							<section>
								<select class="cs-select cs-skin-border">
									<option value="" disabled selected>Room Type</option>
									<option value="email">Standard Room</option>
									<option value="twitter">Family Room</option>
									<option value="linkedin">Suite</option>
								</select>
							</section>
						</div>
						
						
						<!--             start     -->
						
						
						
						<div class="a-col">
							<section>
								<select class="cs-select cs-skin-border" id="roomtype" name="roomtype">
									<option value="" disabled selected>Room Type</option>
									<option value="email">Standard Room</option>
									<option value="twitter">Family Room</option>
									<option value="linkedin">Suite</option>
								</select>
							</section>
						</div>
						
						<div class="a-col">
							
							
						<button type="button" class="btn btn-primary">Update</button>
							
						</div>
						
						<div class="a-col">
							
							
							
					<button type="submit" class="btn btn-primary col-md-12" "form-group">Add Room</button>
							
						</div>
						<!-- end -->
						<div>
						<br>
						</div>
						
						</form>
						
						
				</div>
			</div>
		</div>
	</div>
	

	
	<div class="wrap">
		<div class="container">
			<div class="row">
				<div id="availability">
					<form action="UpdateMeal">

						<div class="a-col">
							<section>
								<select class="cs-select cs-skin-border" id="mealtype" name="mealtype">
									<option value="" disabled selected>Meal Type</option>
									<option value="Breakfast">Breakfast</option>
									<option value="Breakfast + Lunch">Breakfast + Lunch</option>
									<option value="Breakfast + Lunch + Dinner">Breakfast + Lunch + Dinner</option>
								</select>
							</section>
						</div>
						
						<div class="a-col">
							<input type="text" class="form-control" id="mealprice" name=mealprice placeholder="Meal Price">
						</div>
			
						<div class="a-col">
							
							
						<button type="submit" class="btn btn-primary">Update</button>
							
						</div>
						
					
						<!-- end -->
						<div>
						<br>
						</div>
						
						</form>
						
						
				</div>
			</div>
		</div>
	</div>
	
	
	
	
	
	
	
	
	
	
	

	<footer id="footer" class="fh5co-bg-color">
		<div class="container">
			<div class="row">
				<div class="col-md-3">	
					<div class="copyright">
						<p><small>&copy; 2016 SSDI Team-11 . <br> All Rights Reserved. <br>
						<!--Designed by <a href="http://freehtml5.co" target="_blank">SSDI Team-11</a> <br> Demo Images: <a href="http://unsplash.com/" target="_blank">Unsplash</a></small></p>-->
					</div>
				</div>
				
			</div>
		</div>
	</footer>

	</div>
	<!-- END fh5co-page -->

	</div>
	<!-- END fh5co-wrapper -->
	
	<!-- Javascripts -->
	<script src="js/jquery-2.1.4.min.js"></script>
	<!-- Dropdown Menu -->
	<script src="js/hoverIntent.js"></script>
	<script src="js/superfish.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Counters -->
	<script src="js/jquery.countTo.js"></script>
	<!-- Stellar Parallax -->
	<script src="js/jquery.stellar.min.js"></script>
	<!-- Owl Slider -->
	<!-- // <script src="js/owl.carousel.min.js"></script> -->
	<!-- Date Picker -->
	<script src="js/bootstrap-datepicker.min.js"></script>
	<!-- CS Select -->
	<script src="js/classie.js"></script>
	<script src="js/selectFx.js"></script>
	<!-- Flexslider -->
	<script src="js/jquery.flexslider-min.js"></script>

	<script src="js/custom.js"></script>

</body>
</html>