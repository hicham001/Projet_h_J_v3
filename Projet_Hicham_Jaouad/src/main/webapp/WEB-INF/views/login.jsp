<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>

    <link href="<%=request.getContextPath()%>/static/css/bootstrap.min.css" rel="stylesheet">
<link href='http://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
<meta charset="UTF-8">

<style type="text/css">
body {
    background: url('<%=request.getContextPath()%>/static/images/fond.jpg') no-repeat fixed center center;
    background-size: cover;
    font-family: Montserrat;
}

.logo {
    width: 213px;
    height: 36px;
    background: no-repeat;
    margin: 30px auto;
}

.login-block {
    width: 320px;
    padding: 20px;
    background: #fff;
    border-radius: 5px;
    border-top: 5px solid #ff656c;
    margin: 0 auto;
}

.login-block h1 {
    text-align: center;
    color: #000;
    font-size: 18px;
    text-transform: uppercase;
    margin-top: 0;
    margin-bottom: 20px;
}

.login-block input {
    width: 100%;
    height: 42px;
    box-sizing: border-box;
    border-radius: 5px;
    border: 1px solid #ccc;
    margin-bottom: 20px;
    font-size: 14px;
    font-family: Montserrat;
    padding: 0 20px 0 50px;
    outline: none;
}

.login-block input#username {
    background: #fff url('http://i.imgur.com/u0XmBmv.png') 20px top no-repeat;
    background-size: 16px 80px;
}

.login-block input#username:focus {
    background: #fff url('http://i.imgur.com/u0XmBmv.png') 20px bottom no-repeat;
    background-size: 16px 80px;
}

.login-block input#password {
    background: #fff url('http://i.imgur.com/Qf83FTt.png') 20px top no-repeat;
    background-size: 16px 80px;
}

.login-block input#password:focus {
    background: #fff url('http://i.imgur.com/Qf83FTt.png') 20px bottom no-repeat;
    background-size: 16px 80px;
}

.login-block input:active, .login-block input:focus {
    border: 1px solid #ff656c;
}

.login-block button {
    width: 100%;
    height: 40px;
    background: #ff656c;
    box-sizing: border-box;
    border-radius: 5px;
    border: 1px solid #e15960;
    color: #fff;
    font-weight: bold;
    text-transform: uppercase;
    font-size: 14px;
    font-family: Montserrat;
    outline: none;
    cursor: pointer;
}

.login-block button:hover {
    background: #ff7b81;
}


</style>
</head>  
	
<body>
    
     <div class="logo"></div>
            
                    <form action="<c:url value='j_spring_security_check'/>" method="post">
                       <div class="login-block">
                        <h1>Login</h1>
                        <div>
                            <input type="text" class="form-control" name="psseudo" placeholder="psseudo" required="" />
                        </div>
                        <div>
                            <input type="password" class="form-control" name="password" placeholder="mot de passe" required="" />
                        </div>
                        <div>
                            <button type="submit">Se Connecter</button>
                            
                        </div><br>
                        <div class="clearfix"><br>
                        <c:if test="condition"></c:if>
     <c:choose>
    <c:when test="${msg != null}">
        
                <p class="alert alert-danger alert-dismissible fade in" >${msg}</p>
    </c:when>    
    
</c:choose></div>
                        </div>
                    </form>
              
</body>

</html>