<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/head.jsp"/>

<body ng-app="profilCollab" class="nav-md">

  <jsp:include page="/WEB-INF/views/headerCollaborateur.jsp">
  	<jsp:param name="title" value="mon titre"/>
  	<jsp:param name="NOM" value="Hicham"/>
  	<jsp:param value="Mes Objectifs" name="form_title"/>
  </jsp:include>
  
  <div ng-view></div>
  
<jsp:include page="/WEB-INF/views/footer.jsp"/>

<script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/angular.min.js"> 
</script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/angular-resource.min.js"> 
 </script> 
 <script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/angular-route.min.js"> 
 </script>
 <script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/profilCollab.js"> 
</script>
 <script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/controllers/profilCollabController.js">
 </script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/services/profilCollabService.js"> 
</script> 
    </body>
    </html>