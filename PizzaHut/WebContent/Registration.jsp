<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registeration</title>
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
<h1 style="color:red;"></h1>

<h1 Style="color:red;" ><%="Register Here for Pizzahut" %></h1>      

<br><a>
<div Style="color:white;">
        <div>Enter a Name</div>
        <input type="text" autocomplete="off" name="name" placeholder="Enter a Name">
        <br>
        <div>Enter a Password</div>
        <input type="password" name="password" placeholder="Enter a Password">
        <br>
        <div>Select Gender </div>
        <input type="radio" name="gender" value="Male">Male
        <input type="radio" name="gender" value="Female">Female
        <input type="radio" name="gender" value="Others">Others

        <div>Enter a Age</div>
        <input type="number"  name="age">
        <br>
        <div>Enter a DOB</div>
        <input type="date" name="dob">
        <br><a>
            <div>Enter a Email</div>
            <input type="text" autocomplete="off" name="name" placeholder="Enter a Email">
        <br>
        <div>Select city</div>
        <select>
            <option>---Select City---</option>
            <option>Bengaluru</option>
            <option>Mysore</option>
            <option>Mangaluru</option>
            <option>Mandya</option>
        </select>
        <br>
        <div>Enter Address</div>
        <textarea rows="5" col="10">
      </textarea>
        <br>
        <button type="submit">Submit</button>
        <h1> <li class="nav-item">
                <a class="nav-link" href="Login.html">Login</a>
              </li>
             <h1> <li class="nav-item">
                <a class="nav-link" href="SignUp.jsp">Signup</a>
              </li>
    </a></div>
    </h1></h1>

</body>
</html>