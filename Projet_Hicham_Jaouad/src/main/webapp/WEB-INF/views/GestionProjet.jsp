<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<sec:authorize access="hasRole('MANAGER')">
 <jsp:include page="/WEB-INF/views/head.jsp"/>

<body ng-app="GestionProjet">
  <jsp:include page="/WEB-INF/views/NewFile.jsp">
  	<jsp:param name="title" value="mon titre"/>
  	<jsp:param name="NOM" value="Hicham"/>
  	<jsp:param value="Formulaire Nom" name="form"/>
  </jsp:include>
  <div ng-view></div>
  
<jsp:include page="/WEB-INF/views/footer.jsp"/> 

  </sec:authorize>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/angular.min.js"> 
</script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/angular-resource.min.js"> 
 </script> 
 <script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/angular-route.min.js"> 
 </script>
 <script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/appProjet.js"> 
</script>
 <script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/controllers/ProjetController.js">
 </script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/services/ProjetService.js"> 
</script> 
    </body>
    </html>