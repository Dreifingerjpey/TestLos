<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="CSS/LoSStyleSheet.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SummonerLookup</title>
</head>
<body class="body">

	<div class="summonerPreview">
		<!--<img  src="PICTURES/testSummonerIcon.png" alt="" class="summomerIcon"> </img>-->
		<img  src=${sIcon} alt="" class="summomerIcon" ></img>
		<div class="summonerdata"><br>${name}<br>Level: ${lvl} <br>	${devS} <br>${devF} <br></div>
	
	
			<br>worldwide rank <br>	serverrank <br>kda
	</div>
</body>

</html>