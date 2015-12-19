<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="container body">
        <div class="main_container">
            <div class="col-md-3 left_col">
                <div class="left_col scroll-view">
                    <div class="navbar nav_title" style="border: 0;">
                        <a href="#" class="site_title"><i class="fa fa-credit-card"></i> <span>SQLI::BAPs</span></a>
                    </div>
                    <div class="clearfix"></div>
                    <!-- menu prile quick info -->
                    <div class="profile">
                        <div class="profile_pic">
                            <img src="<%=request.getContextPath()%>/static/images/img.jpg" alt="..." class="img-circle profile_img">
                        </div>
                        <div class="profile_info">
                            <span>${param.nom}</span>
                            <h2>${param.prenom}</h2>
                        </div>
                    </div>
                    <!-- /menu prile quick info -->
                    <br />
                    <!-- sidebar menu -->
                    <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                        <div class="menu_section"><br>
                       <h3>${param.role}</h3>
                            <ul class="nav side-menu"><br><br>
                                <li><a href="#">
								<i class="fa fa-home"></i> Acceuil</a>                 
                                </li>
                                <li><a><i class="fa fa-edit"></i> Feedbacks <span class="fa fa-chevron-down"></span></a>
                                    <ul class="nav child_menu" style="display: none">
                                        <li><a href="#/createFeedbak">Nouveau Feedback</a>
                                        </li>
                                        <li><a href="./GestionFeedback">Gestion Feedback</a>
                                        </li>
                                        
                                    </ul>
                                </li>
                              
                               
                                <li><a><i class="fa fa-bar-chart-o"></i> Historiques <span class="fa fa-chevron-down"></span></a>
                                    <ul class="nav child_menu" style="display: none">
                                        
                                        <li><a href="./historique/feedback">Feedbacks</a>
                                        </li>
                                        <li><a href="./historique/resultas">Résultats</a>
                                        </li>
                                       
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        

                    </div>
                    <!-- /sidebar menu -->

                    <!-- /menu footer buttons -->
                    <!-- /menu footer buttons -->
                </div>
            </div>

            <!-- top navigation -->
            <div class="top_nav">

                <div class="nav_menu">
                    <nav class="" role="navigation">
                        <div class="nav toggle">
                            <a id="menu_toggle"><i class="fa fa-bars"></i></a>
                        </div>

                        <ul class="nav navbar-nav navbar-right">
                            <li class="">
                                <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                    <img src="<%=request.getContextPath()%>/static/images/img.jpg" alt="">${param.nom}
                                    <span class=" fa fa-angle-down"></span>
                                </a>
                                <ul class="dropdown-menu dropdown-usermenu animated fadeInDown pull-right">
                             
                                    <li><a href="<c:url value="/j_spring_security_logout" />" ><i class="fa fa-sign-out pull-right"></i> Déconnecter</a>
                                    </li>
                                </ul>
                            </li>

                            <li role="presentation" class="dropdown">
                                <a href="javascript:;" class="dropdown-toggle info-number" data-toggle="dropdown" aria-expanded="false">
                                    <i class="fa fa-envelope-o"></i>
                                    <span class="badge bg-green">2</span>
                                </a>
                                <ul id="menu1" class="dropdown-menu list-unstyled msg_list animated fadeInDown" role="menu">
                                    <li>
                                        <a>
                                            <span class="image">
                                        <img src="<%=request.getContextPath()%>/static/images/img.jpg" alt="Profile Image" />
                                    </span>
                                            <span>
                                        <span>John Smith</span>
                                            <span class="time">3 mins ago</span>
                                            </span>
                                            <span class="message">
                                        Film festivals used to be do-or-die moments for movie makers. They were where... 
                                    </span>
                                        </a>
                                    </li>
                                   
                                    <li>
                                        <div class="text-center">
                                            <a>
                                                <strong><a href="inbox.html">Afficher tout</strong>
                                                <i class="fa fa-angle-right"></i>
                                            </a>
                                        </div>
                                    </li>
                                </ul>
                            </li>

                        </ul>
                    </nav>
                </div>

            </div>
            <!-- /top navigation -->
			<!-- page content -->
			<div class="right_col" role="main">
                 <div class="">
                 <div class="page-title">
            <div class="title-left">
           <h3>${param.form_title}</h3>
            </div>
  