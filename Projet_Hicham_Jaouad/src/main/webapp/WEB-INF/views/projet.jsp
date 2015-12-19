<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<jsp:include page="/WEB-INF/views/head.jsp"/>

  <sec:authorize access="hasRole('MANAGER')">

<body ng-app="GestionProjet" ng-controller="ProjetController as ctrl" class="nav-md">

  <jsp:include page="/WEB-INF/views/headerManager.jsp">
  	<jsp:param name="nom" value=""/>
  	<jsp:param name="role" value="Manager"/>
  	<jsp:param name="prenom" value="Hicham"/>
  	<jsp:param value="Gestion des Projet" name="form_title"/>
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