<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<jsp:include page="/WEB-INF/views/head.jsp"/>

<body class="nav-md">
<sec:authorize access="hasRole('ADMIN')">
  <jsp:include page="/WEB-INF/views/headerAdmin.jsp">
  <jsp:param value="Acceuil" name="title"/>
  	<jsp:param name="nom" value="${nom}"/>
  	<jsp:param name="role" value="${pageContext.request.userPrincipal.name}"/>
  	<jsp:param name="prenom" value="${prenom}"/>
  	<jsp:param value="Actualité" name="form_title"/>
  </jsp:include>
</sec:authorize>
  
 <sec:authorize access="hasRole('COLLABORATEUR')">
  <jsp:include page="/WEB-INF/views/headerCollaborateur.jsp">
  	<jsp:param name="nom" value="${nom}"/>
  	<jsp:param name="role" value="${pageContext.request.userPrincipal.name}"/>
  	<jsp:param name="prenom" value="${prenom}"/>
  	<jsp:param value="Actualité" name="form_title"/>
  </jsp:include>
  </sec:authorize>
  
  <sec:authorize access="hasRole('EVALUATEUR')">
  <jsp:include page="/WEB-INF/views/headerEvaluateur.jsp">
  	<jsp:param name="nom" value="${nom}"/>
  	<jsp:param name="role" value="${pageContext.request.userPrincipal.name}"/>
  	<jsp:param name="prenom" value="${prenom}"/>
  	<jsp:param value="Actualité" name="form_title"/>
  </jsp:include>
  </sec:authorize>
  
  <sec:authorize access="hasRole('MANAGER')">
  <jsp:include page="/WEB-INF/views/headerManager.jsp">
  	<jsp:param name="nom" value="${nom}"/>
  	<jsp:param name="role" value="${pageContext.request.userPrincipal.name}"/>
  	<jsp:param name="prenom" value="${prenom}"/>
  	<jsp:param value="Actualité" name="form_title"/>
  </jsp:include>
  </sec:authorize>
 
 
				</div>
			</div>
			</div>
			</div>
	<script src="<%=request.getContextPath()%>/static/js/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/static/js/bootstrap.min.js" ></script>
    <!-- gauge js -->
    
    <script type="text/javascript" src="<%=request.getContextPath()%>/static/js/gauge/gauge.min.js" ></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/static/js/gauge/gauge_demo.js" ></script>
    <!-- chart js -->
    
	<!-- bootstrap progress js -->
	<script src="<%=request.getContextPath()%>/static/js/progressbar/bootstrap-progressbar.min.js" ></script>
	<script src="<%=request.getContextPath()%>/static/js/nicescroll/jquery.nicescroll.min.js" ></script>
    <!-- icheck -->
    <script src="<%=request.getContextPath()%>/static/js/icheck/icheck.min.js" ></script>
    <!-- daterangepicker -->
    <script src="<%=request.getContextPath()%>/static/js/moment.min.js" type="text/javascript"></script>
   <script src="<%=request.getContextPath()%>/static/js/custom.js" ></script>
		
</body>
</html>