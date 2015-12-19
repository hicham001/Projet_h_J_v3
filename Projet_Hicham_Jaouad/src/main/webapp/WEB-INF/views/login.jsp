<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
 	<link href="<%=request.getContextPath()%>/static/css/bootstrap.min.css" rel="stylesheet">

    <link href="<%=request.getContextPath()%>/static/fonts/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/static/css/animate.min.css" rel="stylesheet">

    <!-- Custom styling plus plugins -->
    <link href="<%=request.getContextPath()%>/static/css/custom.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/static/css/icheck/flat/green.css" rel="stylesheet">
	<script src="<%=request.getContextPath()%>/static/js/jquery.min.js"></script>
	
<body style="background:#FFF0D6;">
    
    <div class="">
        <a class="hiddenanchor" id="toregister"></a>
        <a class="hiddenanchor" id="tologin"></a>

        <div id="wrapper">
            <div id="login" class="animate form" style="background:#FFFFFF;">
     
                <p class="alert alert-danger alert-dismissible fade in" >${msg}</p>
                 
           
                
                <section class="login_content">
            
                    <form action="<c:url value='j_spring_security_check'/>" method="post">
                        <h1>Login</h1>
                        <div>
                            <input type="text" class="form-control" name="psseudo" placeholder="psseudo" required="" />
                        </div>
                        <div>
                            <input type="password" class="form-control" name="password" placeholder="mot de passe" required="" />
                        </div>
                        <div>
                            <input class="btn btn-default submit" type="submit" value="se connecter" />
                            
                        </div>
                        <div class="clearfix"></div>
                        
                    </form>
                    <!-- form -->
                </section>
                <!-- content -->
            </div>
            
        </div>
    </div>

</body>

</html>