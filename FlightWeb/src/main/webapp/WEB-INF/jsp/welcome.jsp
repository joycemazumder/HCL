<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />

<!-- 
	<spring:url value="/css/main.css" var="springCss" />
	<link href="${springCss}" rel="stylesheet" />
	 -->
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
    $("form").submit(function(){''
       var searchCity= document.getElementById('City').value;
        alert(searchCity);
    });
});
</script>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
<table>
<tr>
<td></td>
<td>Search Flight: 
 <select id="drpcity">
  <option value="Kolkata">Kolkata</option>
  <option value="Delhi">Delhi</option>
  <option value="Bangalore">Bangalore</option> 
</select>
<button onclick="submitSearch()">Submit</button></td>
</tr>

</table>
 
<script>
function submitSearch() {
var ct="";
  ct=document.getElementById("drpcity").value;
alert(ct);
 
 $.get('/flightweb/flightsbyCity.html?city='+ct
  		, function(result) {
  			//var res = $(result);
  			var res = $(result).html();
			$("#atcity").html(res);
  			 	
  });

 
}


</script>
<br><br><br><br>
<p id="atcity"></p>
 


 
</body>
</html>
