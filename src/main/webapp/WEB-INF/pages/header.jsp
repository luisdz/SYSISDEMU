<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<!DOCTYPE html>
<!-- Template Name: Rapido - Responsive Admin Template build with Twitter Bootstrap 3.x Version: 1.0 Author: ClipTheme -->
<!--[if IE 8]><html class="ie8" lang="en"><![endif]-->
<!--[if IE 9]><html class="ie9" lang="en"><![endif]-->
<!--[if !IE]><!-->
<html lang="en">
	<!--<![endif]-->
	<!-- start: HEAD -->
	<head>
		<title>ISDEMU---SISTEMA ACTIVOS FIJOS</title>
		<!-- start: META -->
		<meta charset="utf-8" />
		<!--[if IE]><meta http-equiv='X-UA-Compatible' content="IE=edge,IE=9,IE=8,chrome=1" /><![endif]-->
		<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<meta content="" name="description" />
		<meta content="" name="author" />
		<!-- end: META -->
		<!-- start: MAIN CSS -->
		<link href='http://fonts.googleapis.com/css?family=Raleway:400,300,500,600,700,200,100,800' rel='stylesheet' type='text/css'>
                <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/bootstrap/css/bootstrap.min.css">
                
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/iCheck/skins/all.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/perfect-scrollbar/src/perfect-scrollbar.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/animate.css/animate.min.css">
		<!-- end: MAIN CSS -->
		<!-- start: CSS REQUIRED FOR SUBVIEW CONTENTS -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/owl-carousel/owl-carousel/owl.carousel.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/owl-carousel/owl-carousel/owl.theme.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/owl-carousel/owl-carousel/owl.transitions.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/summernote/dist/summernote.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/fullcalendar/fullcalendar/fullcalendar.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/toastr/toastr.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/bootstrap-select/bootstrap-select.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/bootstrap-switch/dist/css/bootstrap3/bootstrap-switch.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/DataTables/media/css/DT_bootstrap.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/bootstrap-fileupload/bootstrap-fileupload.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/bootstrap-daterangepicker/daterangepicker-bs3.css">
		<!-- end: CSS REQUIRED FOR THIS SUBVIEW CONTENTS-->
		<!-- start: CSS REQUIRED FOR THIS PAGE ONLY -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/weather-icons/css/weather-icons.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/nvd3/nv.d3.min.css">
		<!-- end: CSS REQUIRED FOR THIS PAGE ONLY -->
                
                <!-- start: CSS REQUIRED FOR THIS PAGE ONLY -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/select2/select2.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/datepicker/css/datepicker.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/bootstrap-timepicker/css/bootstrap-timepicker.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/bootstrap-colorpicker/css/bootstrap-colorpicker.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/bootstrap-colorpalette/css/bootstrap-colorpalette.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/jQuery-Tags-Input/jquery.tagsinput.css">
		<!-- end: CSS REQUIRED FOR THIS PAGE ONLY -->
                
                
                
                
		<!-- start: CORE CSS -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/styles.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/styles-responsive.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/plugins.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/themes/theme-default.css" type="text/css" id="skin_color">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/print.css" type="text/css" media="print"/>
		<!-- end: CORE CSS -->
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/favicon.ico" />
	
        
        
        </head>
	<!-- end: HEAD -->
	<!-- start: BODY -->
	<body>
		<!-- start: SLIDING BAR (SB) -->
		<div id="slidingbar-area">
			<div id="slidingbar">
				<div class="row">
					<!-- start: SLIDING BAR FIRST COLUMN -->
					<div class="col-md-4 col-sm-4">
						<h2>My Options</h2>
						<div class="row">
							
							<div class="col-xs-6 col-lg-3">
								<button class="btn btn-icon btn-block space10">
									<i class="fa fa-calendar-o"></i>
									Usuarios <span class="badge badge-info partition-blue"> 5 </span>
								</button>
							</div>
							<div class="col-xs-6 col-lg-3">
								<button class="btn btn-icon btn-block space10">
									<i class="fa fa-bell-o"></i>
									Notificaciones <span class="badge badge-info partition-red"> 9 </span>
								</button>
							</div>
						</div>
					</div>
					<!-- end: SLIDING BAR FIRST COLUMN -->
					<!-- start: SLIDING BAR SECOND COLUMN -->
					<div class="col-md-4 col-sm-4">
						<h2></h2>
						
					</div>
					<!-- end: SLIDING BAR SECOND COLUMN -->
					<!-- start: SLIDING BAR THIRD COLUMN -->
					<div class="col-md-4 col-sm-4">
						<h2>Mi Informacion</h2>
						<address class="margin-bottom-40">
							Usuario 
							<br>
							12345 Street Name, City Name, United States
							<br>
							P: (641)-734-4763
							<br>
							Email:
							<a href="#">
								peter.clark@example.com
							</a>
						</address>
						<a class="btn btn-transparent-white" href="#">
							<i class="fa fa-pencil"></i> Editar
						</a>
					</div>
					<!-- end: SLIDING BAR THIRD COLUMN -->
				</div>
				<div class="row">
					<!-- start: SLIDING BAR TOGGLE BUTTON -->
					<div class="col-md-12 text-center">
						<a href="#" class="sb_toggle"><i class="fa fa-chevron-up"></i></a>
					</div>
					<!-- end: SLIDING BAR TOGGLE BUTTON -->
				</div>
			</div>
		</div>
		<!-- end: SLIDING BAR -->
		<div class="main-wrapper">
			<!-- start: TOPBAR -->
			<header class="topbar navbar navbar-inverse navbar-fixed-top inner">
				<!-- start: TOPBAR CONTAINER -->
				<div class="container">
					<div class="navbar-header">
						<a class="sb-toggle-left hidden-md hidden-lg" href="#main-navbar">
							<i class="fa fa-bars"></i>
						</a>
						<!-- start: LOGO -->
						<a class="navbar-brand" href="index.html">
							<img src="${pageContext.request.contextPath}/assets/images/logo.png" alt="Rapido"/>
						</a>
						<!-- end: LOGO -->
					</div>
					<div class="topbar-tools">
						<!-- start: TOP NAVIGATION MENU -->
						<ul class="nav navbar-right">
							<!-- start: USER DROPDOWN -->
							<li class="dropdown current-user">
								<a data-toggle="dropdown" data-hover="dropdown" class="dropdown-toggle" data-close-others="true" href="#">
									<img src="${pageContext.request.contextPath}/assets/images/avatar-1-small.jpg" class="img-circle" alt=""> <span class="username hidden-xs">Usuario </span> <i class="fa fa-caret-down "></i>
								</a>
								<ul class="dropdown-menu dropdown-dark">
									<li>
										<a href="pages_user_profile.html">
											My Profile
										</a>
									</li>
									<li>
										<a href="pages_calendar.html">
											My Calendar
										</a>
									</li>
									<li>
										<a href="pages_messages.html">
											My Messages (3)
										</a>
									</li>
									<li>
										<a href="login_lock_screen.html">
											Lock Screen
										</a>
									</li>
									<li>
										<a href="login_login.html">
											Log Out
										</a>
									</li>
								</ul>
							</li>
							
					</div>
				</div>
				<!-- end: TOPBAR CONTAINER -->
			</header>
			<!-- end: TOPBAR -->
			<!-- start: PAGESLIDE LEFT -->
			<a class="closedbar inner hidden-sm hidden-xs" href="#">
			</a>
			<nav id="pageslide-left" class="pageslide inner">
				<div class="navbar-content">
					<!-- start: SIDEBAR -->
					<div class="main-navigation left-wrapper transition-left">
						<div class="navigation-toggler hidden-sm hidden-xs">
							<a href="#main-navbar" class="sb-toggle-left">
							</a>
						</div>
						<div class="user-profile border-top padding-horizontal-10 block">
							<div class="inline-block">
								<img src="${pageContext.request.contextPath}/assets/images/avatar-1.jpg" alt="">
							</div>
							<div class="inline-block">
								<h5 class="no-margin"> Bienvenido</h5>
								<h4 class="no-margin"> Usuario  </h4>
								<a class="btn user-options sb_toggle">
									<i class="fa fa-cog"></i>
								</a>
							</div>
						</div>
						<!-- start: MAIN NAVIGATION MENU -->
						<ul class="main-navigation-menu">
							<li class="active open">
								<a href="index.html"><i class="fa fa-home"></i> <span class="title"> Principal </span><span class="label label-default pull-right ">Accesos</span> </a>
							</li>
					
							
						<li>
								<a href="javascript:;" class="active">
									<i class="fa fa-folder"></i> <span class="title"> Inventario </span> <i class="icon-arrow"></i>
								</a>
								<ul class="sub-menu">
									<li>
										<a href="${pageContext.request.contextPath}/Inventario/add.html">
											Ingresar Inventario <i class="icon-arrow"></i>
										</a>
										
									</li>
									<li>
										<a href="${pageContext.request.contextPath}/Inventario/list.html">
											Consultar Inventario<i class="icon-arrow"></i>
										</a>
										
									</li>
									<li>
										<a href="#">
											Pre Carga de Inventario
										</a>
									</li>
								</ul>
							</li>


						<li>
								<a href="javascript:;" class="active">
									<i class="fa fa-folder"></i> <span class="title"> Verificacion de Inventario </span> <i class="icon-arrow"></i>
								</a>
								<ul class="sub-menu">
									<li>
										<a href="javascript:;">
											Verificar Inventario <i class="icon-arrow"></i>
										</a>
										
									</li>
									<li>
										<a href="javascript:;">
											Consultar Verificaciones<i class="icon-arrow"></i>
										</a>
										
									</li>
								
								</ul>
							</li>	


						<li>
								<a href="javascript:;" class="active">
									<i class="fa fa-folder"></i> <span class="title"> Descargo de Inventario </span> <i class="icon-arrow"></i>
								</a>
								<ul class="sub-menu">
									<li>
										<a href="javascript:;">
											Realizar Descargo <i class="icon-arrow"></i>
										</a>
										
									</li>
									<li>
										<a href="javascript:;">
											Consultar Descarga<i class="icon-arrow"></i>
										</a>
										
									</li>
									
								</ul>
							</li>

							<li>
								<a href="javascript:;" class="active">
									<i class="fa fa-folder"></i> <span class="title"> Movimientos</span> <i class="icon-arrow"></i>
								</a>
								<ul class="sub-menu">
									<li>
										<a href="${pageContext.request.contextPath}/llamar/insertarMovimiento.html">
											Realizar Movimiento<i class="icon-arrow"></i>
										</a>
									</li>
									<li>
										<a href="${pageContext.request.contextPath}/Movimiento/consultarMov.html">
											Consultar Movimiento <i class="icon-arrow"></i>
										</a>
										
									</li>
									
								</ul>
							</li>

							<li>
								<a href="javascript:;" class="active">
									<i class="fa fa-folder"></i> <span class="title"> Control de Salida </span> <i class="icon-arrow"></i>
								</a>
								<ul class="sub-menu">
									<li>
										<a href="javascript:;">
											Realizar Control <i class="icon-arrow"></i>
										</a>
										
									</li>
									<li>
										<a href="javascript:;">
											Cosultar Control <i class="icon-arrow"></i>
										</a>
									
									</li>
									
								</ul>
							</li>
							<li>
								<a href="javascript:;">
									<i class="fa fa-folder-open"></i> <span class="title"> Prestamo de Equipo </span><i class="icon-arrow"></i> <span class="arrow "></span>
								</a>
								<ul class="sub-menu">
									<li>
										<a href="javascript:;">
											Registrar Prestamo <i class="icon-arrow"></i>
										</a>
										
									</li>
									<li>
										<a href="javascript:;">
											Consultar Prestamos <i class="icon-arrow"></i>
										</a>
										
									</li>
									
								</ul>
							</li>

							<li>
								<a href="javascript:void(0)"><i class="fa fa-user"></i> <span class="title">Catalogo</span><i class="icon-arrow"></i> </a>
								<ul class="sub-menu">
									<li>
										<a href="${pageContext.request.contextPath}/llamar/insertarPersonal.html">
											<span class="title"> Personal </span>
										</a>
									</li>
                                                                        <li>
										<a href="${pageContext.request.contextPath}/llamar/consultarPersonal.html">
											<span class="title"> Consultar Personal </span>
										</a>
									</li>
									<li>
										<a  href="${pageContext.request.contextPath}/llamar/insertarUnidad.html">
											<span class="title"> Unidades</span>
										</a>
									</li>
                                                                        <li>
										<a href="${pageContext.request.contextPath}/Unidad/consultarUni.html">
											Consultar Unidad <i class="icon-arrow"></i>
										</a>
										
									</li>
									<li>
										<a href="${pageContext.request.contextPath}/llamar/insertarRegiones.html">
											<span class="title">Regiones</span>
										</a>
									</li>
                                                                        <li>
										<a href="${pageContext.request.contextPath}/llamar/consultarRegiones.html">
											<span class="title">Consultar Regiones</span>
										</a>
									</li>
									<li>
										<a  href="${pageContext.request.contextPath}/llamar/insertarPoliza.html">
											<span class="title">Poliza</span>
										</a>
									</li>
                                                                        <li>
										<a href="${pageContext.request.contextPath}/Poliza/consultarPoli.html">
											Consultar Poliza <i class="icon-arrow"></i>
										</a>
										
									</li>
								</ul>
							</li>
							
							<li>
								<a href="javascript:void(0)"><i class="fa fa-user"></i> <span class="title">Login</span><i class="icon-arrow"></i> </a>
								<ul class="sub-menu">
									<li>
										<a href="login_login.html">
											<span class="title"> Login Form </span>
										</a>
									</li>
									<li>
										<a href="login_login.html?box=register">
											<span class="title"> Registration Form </span>
										</a>
									</li>
									<li>
										<a href="login_login.html?box=forgot">
											<span class="title"> Forgot Password Form </span>
										</a>
									</li>
									<li>
										<a href="login_lock_screen.html">
											<span class="title">Lock Screen</span>
										</a>
									</li>
								</ul>
							</li>
						
						
							
						</ul>
						<!-- end: MAIN NAVIGATION MENU -->
					</div>
					<!-- end: SIDEBAR -->
				</div>
				<div class="slide-tools">
					<div class="col-xs-6 text-left no-padding">
						<a class="btn btn-sm status" href="#">
							Estado <i class="fa fa-dot-circle-o text-green"></i> <span>En Linea</span>
						</a>
					</div>
					<div class="col-xs-6 text-right no-padding">
						<a class="btn btn-sm log-out text-right" href="login_login.html">
							<i class="fa fa-power-off"></i> Cerrar Sesion
						</a>
					</div>
				</div>
			</nav>
			<!-- end: PAGESLIDE LEFT -->
			
			<!-- start: MAIN CONTAINER -->
			<div class="main-container inner">
				<!-- start: PAGE -->
				<div class="main-content">
					
					<div class="container">
						<!-- start: PAGE HEADER -->
						<!-- start: TOOLBAR -->
						<div class="toolbar row">
							<div class="col-sm-6 hidden-xs">
								<div class="page-header">
									<h1>ISDEMU <small>Sistema de Activos Fijos</small></h1>
								</div>
							</div>
							<div class="col-sm-6 col-xs-12">
								<a href="#" class="back-subviews">
									<i class="fa fa-chevron-left"></i> BACK
								</a>
								<a href="#" class="close-subviews">
									<i class="fa fa-times"></i> CLOSE
								</a>
								<div class="toolbar-tools pull-right">
									<!-- start: TOP NAVIGATION MENU -->
									<ul class="nav navbar-right">
										<!-- start: TO-DO DROPDOWN -->
										
										<li class="dropdown">
											<a data-toggle="dropdown" data-hover="dropdown" class="dropdown-toggle" data-close-others="true" href="#">
												<span class="messages-count badge badge-default hide">3</span> <i class="fa fa-envelope"></i> MENSAJES
											</a>
											<ul class="dropdown-menu dropdown-light dropdown-messages">
												<li>
													<span class="dropdown-header"> You have 9 messages</span>
												</li>
												<li>
													<div class="drop-down-wrapper ps-container">
														<ul>
															<li class="unread">
																<a href="javascript:;" class="unread">
																	<div class="clearfix">
																		<div class="thread-image">
																			<img src="./assets/images/avatar-2.jpg" alt="">
																		</div>
																		<div class="thread-content">
																			<span class="author">Nicole Bell</span>
																			<span class="preview">Duis mollis, est non commodo luctus, nisi erat porttitor ligula...</span>
																			<span class="time"> Just Now</span>
																		</div>
																	</div>
																</a>
															</li>
															<li>
																<a href="javascript:;" class="unread">
																	<div class="clearfix">
																		<div class="thread-image">
																			<img src="./assets/images/avatar-3.jpg" alt="">
																		</div>
																		<div class="thread-content">
																			<span class="author">Steven Thompson</span>
																			<span class="preview">Duis mollis, est non commodo luctus, nisi erat porttitor ligula...</span>
																			<span class="time">8 hrs</span>
																		</div>
																	</div>
																</a>
															</li>
															<li>
																<a href="javascript:;">
																	<div class="clearfix">
																		<div class="thread-image">
																			<img src="./assets/images/avatar-5.jpg" alt="">
																		</div>
																		<div class="thread-content">
																			<span class="author">Kenneth Ross</span>
																			<span class="preview">Duis mollis, est non commodo luctus, nisi erat porttitor ligula...</span>
																			<span class="time">14 hrs</span>
																		</div>
																	</div>
																</a>
															</li>
														</ul>
													</div>
												</li>
												<li class="view-all">
													<a href="pages_messages.html">
														See All
													</a>
												</li>
											</ul>
										</li>
										<li class="menu-search">
											<a href="#">
												<i class="fa fa-search"></i> BUSCAR
											</a>
											<!-- start: SEARCH POPOVER -->
											<div class="popover bottom search-box transition-all">
												<div class="arrow"></div>
												<div class="popover-content">
													<!-- start: SEARCH FORM -->
													<form class="" id="searchform" action="#">
														<div class="input-group">
															<input type="text" class="form-control" placeholder="Search">
															<span class="input-group-btn">
																<button class="btn btn-main-color btn-squared" type="button">
																	<i class="fa fa-search"></i>
																</button> </span>
														</div>
													</form>
													<!-- end: SEARCH FORM -->
												</div>
											</div>
											<!-- end: SEARCH POPOVER -->
										</li>
									</ul>
									<!-- end: TOP NAVIGATION MENU -->
								</div>
							</div>
						</div>
						<!-- end: TOOLBAR -->
						<!-- end: PAGE HEADER -->
						
