<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/head.jsp"/>

  <body ng-app="GestionEvaluateur" ng-controller="EvaluateurController as ctrl" class="nav-md">
  <jsp:include page="/WEB-INF/views/headerAdmin.jsp">
  	<jsp:param name="nom" value="Hicham"/>
  	<jsp:param value="Gestion Evaluateur" name="form_title"/>
  </jsp:include>
  <div ng-view></div>
  
  
<jsp:include page="/WEB-INF/views/footer.jsp"/>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/angular.min.js">
</script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/angular.min.js">
</script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/angular-route.min.js">
</script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/appEvaluateur.js">
</script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/directives/collab_derictive.js">
</script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/controllers/EvaluateurController.js">
</script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/services/EvaluateurService.js">
</script>
    
</body>
</html>