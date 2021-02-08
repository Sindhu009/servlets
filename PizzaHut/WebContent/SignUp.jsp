<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body {
  background-image:url(https://d1ralsognjng37.cloudfront.net/dc17742c-1eb5-4afd-b888-08aaa4d62160.jpeg);
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;  
}
</style>

<body>
<form action="SignUpServlet" method="post">
<div class="formContainer">
<div Style="color:white;">

<h1>Sign Up Form</h1>
<div>
<label for="Name"><b>Name</b></label>
<input type="text" placeholder="Enter  name" name="name" required>


</div>
<div>
<label for="email"><b>Email</b></label>
<input type="text" placeholder="Enter Email" name="email" required>

</div>
<div>
<label for="password"><b>Password</b></label>
<input type="password" placeholder="Enter Password" name="password" required>

</div>
<div>
<label for="PhoneNumber"><b>PhoneNumber</b></label>
<input type="text" placeholder="Phone Number" name="PhoneNumber" required>

</div>

<div>
<label>
<input type="checkbox" checked="checked" name="remember" style="marginbottom: 15px"> Remember me
</label>
</div>

<div>
<button type="button" class="cancel">Cancel</button>
<button type="submit" class="signup">Sign Up</button>

</div>
</div>
</form>


</body>
</html>