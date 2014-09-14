<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/NavTab.css">
<script type="text/javascript"
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCRLw_iLkr-2N0nf49_wKgy_lagACw-u8Y">
    </script>
</head>
<body>
<!-- Nav tabs -->
<ul class="nav nav-tabs">
    <li class="active"><a href="#home" data-toggle="tab">Login</a></li>
    <li><a href="#battle" data-toggle="tab" data-tab-url="jsp/Battle.jsp">Battle</a></li>
    <li><a href="#recycle" data-toggle="tab" data-tab-url="jsp/Recycle.jsp">Recycle</a></li>
    <li><a href="#stats" data-toggle="tab" data-tab-url="jsp/Stats.jsp">Stats</a></li>
    <li><a href="#equipment" data-toggle="tab" data-tab-url="jsp/Equipment.jsp">Equipment</a></li>
</ul>

<!-- Tab panes -->
<div class="tab-content">
    <div class="tab-pane active" id="home">
        <p>Login here!</p>
    </div>
    <div class="tab-pane" id="battle"></div>
    <div class="tab-pane" id="recycle"></div>
    <div class="tab-pane" id="stats"></div>
    <div class="tab-pane" id="equipment"></div>
</div>
<script src="http://code.jquery.com/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/bootstrap-remote-tabs.min.js"></script>
<script src="js/jquery.loadmask.js"></script>
</body>
</html>