<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML> 
<html lang='pl'> 
<head>
	<meta charset='utf-8'>
	<meta name='viewport' content='width=device-width, initial-scale=1, maximum-scale=1'>
	<title>Logowanie</title>
	<link rel='stylesheet' href='gfx/styl.css'>
</head>
<body>
<div class='container'>
<!-- header --> 
	<header>
Logowanie
	</header>
	
	<!-- main -->
	<section id="main">
   	<form action="loginpage" method="post">
     <table>
	<tr>
	 <td><h1>Hello Anonymous!</h1></td>
	</tr>
	<tr><td>Please log in to continue</td></tr>
	<tr>
	 <td>Username:</td>
	 <td><input type="text" name="login" id="login"></td>
	</tr>
	<tr>
	 <td>Password:</td>
	 <td><input type="password" name ="password" id="password"></td>
	</tr>
	<tr>
	 <td>&nbsp;</td>
	 <td><input type="submit" value="Log in" ></td>
	</tr>
	<tr>
	 <td>Don't have an account? <a href="register.jsp">Sign up!</a></td>
	</tr>
     </table>
    </form>
   </section>
	
        &nbsp;<!-- footer -->
	<footer>

<p>AuthManager v 1.0</p>
	</footer>
</div>
</body>
</html>