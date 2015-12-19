<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>   
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
    
<sec:authorize access="hasRole('ADMIN')"> 
<jsp:include page="/WEB-INF/views/head.jsp"/>

<body ng-app="GestionCollaborateur" ng-controller="CollabController as ctrl" class="nav-md">

   <jsp:include page="/WEB-INF/views/headerAdmin.jsp">
  	<jsp:param name="nom" value="admin"/>
  	<jsp:param name="role" value="${pageContext.request.userPrincipal.name}"/>
  	<jsp:param name="prenom" value="admin"/>
  	<jsp:param value="Gestion des Collaborateurs" name="form_title"/>
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
 <script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/appCollaborateur.js"> 
</script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/directives/CollabDerictive.js">
</script>
 <script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/controllers/CollabController.js">
 </script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/services/CollabService.js"> 
</script>
    </body>
    </html>