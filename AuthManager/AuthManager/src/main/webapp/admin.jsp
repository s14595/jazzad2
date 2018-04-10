<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML> 
<html lang='pl'> 
<head>
	<meta charset='utf-8'>
	<meta name='viewport' content='width=device-width, initial-scale=1, maximum-scale=1'>
	<title>Premium Manager</title>
	<link rel='stylesheet' href='gfx/styl.css'>
</head>
<body>
<div class='container'>
<!-- header --> 
	<header>
Premium Manager
	</header>
	
	<!-- main -->
	<section id="main">

	<h1>Select users to grant premium account</h1>
	<form action="premiumMan" method="post">
		<label>Username:<input type="text" id="login" name="login"/></label><br>
		<label><input type="radio" name="permissions" value="premium" checked/>Add premium account</label><br/>
		<label><input type="radio" name="permissions" value="regular"/>Delete premium account</label><br/>
		<input type="submit" value="Change account"/>
	</form>
   </section>
	
        &nbsp;<!-- footer -->
	<footer>

<p>AuthManager v 1.0</p>
	</footer>
</div>
</body>
</html>