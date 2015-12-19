<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="<%=request.getContextPath()%>/static/js/bootstrap.min.js" ></script>
<jsp:include page="/WEB-INF/views/head.jsp"/>

<body ng-app="GestionFeedback">

<%--   <jsp:include page="/WEB-INF/views/headerAdmin.jsp"> --%>
<%--   	<jsp:param name="title" value="mon titre"/> --%>
<%--   	<jsp:param name="NOM" value="Hicham"/> --%>
<%--   	<jsp:param value="Formulaire Nom" name="form"/> --%>
<%--   </jsp:include> --%>
  
  <div ng-view></div>
  
<jsp:include page="/WEB-INF/views/footer.jsp"/>

<script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/angular.min.js"> 
</script>
<script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/angular-resource.min.js"> 
 </script> 
 <script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/angular-route.min.js"> 
 </script>
 <script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/appFeedback.js"> 
</script>
 <script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/controllers/feedbackController.js">
 </script> 
<script type="text/javascript" src="<%=request.getContextPath()%>/static/AngularJS/services/feedbackService.js"> 
</script> 
    </body>
    </html>