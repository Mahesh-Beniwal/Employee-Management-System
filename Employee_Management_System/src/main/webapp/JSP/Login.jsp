<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert </title>
    <link rel="stylesheet" href="../css/Login.css">
</head>
<body>
    <section class="container">
        <section class="form-container">
            <section class="inner-container">
                <h3 class="heading">
                    Welcome, Good Morning  
                </h3>
                <form action="login" class="form">
                        <input type="text" name="EmployeId" class="fields" autofocus placeholder="EmployeId or Email" id="username" autocomplete="off">
                        <input type="password" name="Password" class="fields" placeholder="Password" id="password">
                        <div class="group">
                            <a href="/forgot">Forgot Password...?</a>
                        </div>
                        <input type="submit" name="submit" id="submit" value="Sign-in">
                        <Div>Don't have an account.. ?
                            <a href="EmployeeRegistration.jsp">Register Here first
                            </a>
                        </div>
                </form>
            </section>
        </section>
        <section class="side-container">
            <section class="side">
                <h3 class="side-heading">
                    Let's Start with us. 😊
                </h3>
            </section>
        </section>
    </section>
    
</body>
</html>