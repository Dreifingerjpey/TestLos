<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<jsp:include page="CSS/Style.css"/>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/Style.css" />
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>League of Stalk</title>
</head>

<body >


	<div class="input">
<div>
				<img src="PICTURES/testlogo.jpeg" width="357" height="141" alt=""/>
				<form  action="SummonerLookup">
				<input type="text" name="summoner">
				<input type="submit" value="Summoner Lookup"/> 
			</div>
		</form>
	</div>
	
	<div class="news">News</div>


</body>

</html>