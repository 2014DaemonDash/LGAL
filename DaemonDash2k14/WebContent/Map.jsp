<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Map</title>
<div class="page-header">
   <h1>GreenFite</h1>
</div>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/button.css">
    <style type="text/css">
      html, body, #map-canvas { width: 75%; height: 75%; margin: 0; padding: 0;}
    </style>
    <script type="text/javascript"
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCRLw_iLkr-2N0nf49_wKgy_lagACw-u8Y">
    </script>
    <script type="text/javascript">
      function initialize() {
    	  var mapOptions = {

    	          center: { lat: 38.990165, lng: -76.937261},

    	          zoom: 18

    	        };
        var map = new google.maps.Map(document.getElementById('map-canvas'),
            mapOptions);
        if(navigator.geolocation) {
            navigator.geolocation.getCurrentPosition(function(position) {
              var pos = new google.maps.LatLng(position.coords.latitude,
                                               position.coords.longitude);

              var infowindow = new google.maps.InfoWindow({
                map: map,
                position: pos,
                content: 'Location found using HTML5.'
              });
              var myLatlng = new google.maps.LatLng(38.990013, -76.936536);
              
              var image = {
              	    url: 'images/Sustainable_Terp (2).png',
              	    size: new google.maps.Size(20, 32),
              	    origin: new google.maps.Point(0,0),        
              	    anchor: new google.maps.Point(0, 32)

              	  };
              var marker = new google.maps.Marker({
                  position: myLatlng,
                  map: map,
                  icon: image,
                  title:"Recycling Bin!"
              });
              var myLatlng2 = new google.maps.LatLng(38.989978, -76.936253);
              
              var image2 = 'images/water_drop2.png';
              
              var marker2 = new google.maps.Marker({
                  position: myLatlng2,
                  map: map,
                  icon: image2,

                  title:"Refill Station!"

              });
              var myLatlng3 = new google.maps.LatLng(38.990348, -76.936042);

              var marker = new google.maps.Marker({

                  position: myLatlng3,

                  map: map,

                  icon: image,

                  title:"Recycling Bin!"

              });
             
              var myLatlng4 = new google.maps.LatLng(38.990965, -76.938317);
                         
              var marker4 = new google.maps.Marker({

                  position: myLatlng4,

                  map: map,

                  icon: image2,

                  title:"Refill Station!"

              });
              
              
               var myLatlng5 = new google.maps.LatLng(38.990632, -76.937051);
              
               var marker5 = new google.maps.Marker({

                  position: myLatlng4,

                  map: map,

                  icon: image2,

                  title:"Refill Station!"

              });
               var myLatlng6 = new google.maps.LatLng(38.990548, -76.938479);

               var marker6 = new google.maps.Marker({

                   position: myLatlng6,

                   map: map,

                   icon: image,

                   title:"Recycling Bin!"

               });
              map.setCenter(pos);
            }, function() {
              handleNoGeolocation(true);
            });
          } else {
            // Browser doesn't support Geolocation
            handleNoGeolocation(false);
          }
        }

        function handleNoGeolocation(errorFlag) {
          if (errorFlag) {
            var content = 'Error: The Geolocation service failed.';
          } else {
            var content = 'Error: Your browser doesn\'t support geolocation.';
          }
      }
      google.maps.event.addDomListener(window, 'load', initialize);
    </script>
  </head>
  <body>
  <script src="http://code.jquery.com/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
<div id="map-canvas"></div>
<div class="container">
	<div class="row">
<div class="well text-center">
<FORM class="btn btn-fresh text-uppercase" action="Main.jsp">
<INPUT type=submit value="Enter Website">
</FORM>
</div>
</div>
</div>
  </body>
</html>