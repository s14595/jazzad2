<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML> 
<html lang='pl'> 
<head>
	<meta charset='utf-8'>
	<meta name='viewport' content='width=device-width, initial-scale=1, maximum-scale=1'>
	<title>Rejestracja</title>
	<link rel='stylesheet' href='gfx/styl.css'>
</head>
<body>
<div class='container'>
<!-- header --> 
	<header>
Rejestracja
	</header>
	
	<!-- main -->
	<section id="main">
     <form action="addUser" method="post">
     <table>
     
	<tr>
	 <td><h1>Hello Anonymous!</h1></td>
	</tr>
	<tr><td>Please fill in all the fields</td></tr>
	<tr>
	
	 <td>Username:</td>
	 <td><input type="text" name="login" id="login"></td>
	</tr>
	<tr>
	 <td>Password:</td>
	 <td><input type="password" name ="password" id="password"></td>
	</tr>
	<tr>
	 <td>Confirm password:</td>
	 <td><input type="password" name ="confirmpassword" id="password"></td>
	</tr>
	<tr>
	 <td>E-mail</td>
	 <td><input type="text" name ="email" id="email"></td>
	</tr>
	<tr>
		
	 <td>&nbsp;</td>
	 <td><input type="hidden" id="premium" name="premium" value="0"/>
	 <input type="submit" value="Create Account" ></td>
	</tr>
	<tr>
	</tr>
	<tr>
	 <td>Already have an account? <a href="login.jsp">Log in!</a></td>
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