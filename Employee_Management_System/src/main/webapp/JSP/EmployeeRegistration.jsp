<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
    <link rel="stylesheet" href="../css/Registration.css">
</head>
<body>
    <section class="container">
        <section class="box box1" id="welcome">
            <h2 class="heading"><pre>Welcome to 
     <span id="Google">One</span>-Solution</pre></h2>
     <h3 class="Note">Are you ready to Join Us ?</h3>
        </section>
        <section class="box box2" id="form_container">
            <form action="/EmployeeRegistration" method="post" id="form">
                <label for="EmployeeId" class="label">Employee Id </label>
                <input type="text" id="EmployeeId" class="fields" name="EmployeeId" disabled >

                <label for="username" class="label">Name  </label>
                <input type="text" id="username" class="fields" name="username">
                
                <label for="email" class="label">Email </label>
                <input type="text" id="email" class="fields" name="email">
                
                <div id="genderContainer" >
                    <label for="gender" class="label">Gender</label>
                    <label for="gender" class="inner-label">Male</label>
                    <input type="radio" class="gender" name="gender" value="Male">
                    <label for="gender" class="inner-label">Female</label>
                    <input type="radio" class="gender" name="gender" value="Female">
                    <label for="gender" class="inner-label">Other</label>
                    <input type="radio" class="gender" name="gender" value="Other">
                </div>

                <label for="password" class="label">Password </label>
                <input type="password" id="password" class="fields" name="password">

                <label for="ConfirmPassword" class="label"> Confirm Password</label>
                <input type="password" id="ConfirmPassword" class="fields" name="ConfirmPassword">

                <div class="buttons">
                <a href="Login.jsp" class="button">Login</a>
                <input type="submit" name="submit" id="submit" class="button" value="Submit">
                </div>
            </form>
        </section>
    </section>
</body>
</html>