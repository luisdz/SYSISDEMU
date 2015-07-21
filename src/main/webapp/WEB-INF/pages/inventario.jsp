<%@include file="header.jsp"%>

<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/select2/select2.css">
<link rel="stylesheet"  href="${pageContext.request.contextPath}/assets/plugins/jQuery-Tags-Input/jquery.tagsinput.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/plugins/bootstrap-colorpicker/css/bootstrap-colorpicker.css">

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!-- start: BREADCRUMB -->
						<div class="row">
							<div class="col-md-12">
								<ol class="breadcrumb">
									<li>
										<a href="#">
											Inventario
										</a>
									</li>
									<li class="active">
										Ingreso de Activos
									</li>
								</ol>
							</div>
						</div>
						<!-- end: BREADCRUMB -->
                                                
<!-- start: PAGE CONTENT -->
						<div class="row">
							<div class="col-md-12">
								<!-- start: FORM VALIDATION 1 PANEL -->
								<div class="panel panel-white">
								<div class="panel-heading">
										<h4 class="panel-title">Formulario de <span class="text-bold">Ingreso</span></h4>
										<div class="panel-tools">
											<div class="dropdown">
												<a data-toggle="dropdown" class="btn btn-xs dropdown-toggle btn-transparent-grey">
													<i class="fa fa-cog"></i>
												</a>
												<ul class="dropdown-menu dropdown-light pull-right" role="menu">
													<li>
														<a class="panel-collapse collapses" href="#"><i class="fa fa-angle-up"></i> <span>Collapse</span> </a>
													</li>
													<li>
														<a class="panel-refresh" href="#">
															<i class="fa fa-refresh"></i> <span>Refresh</span>
														</a>
													</li>
													<li>
														<a class="panel-config" href="#panel-config" data-toggle="modal">
															<i class="fa fa-wrench"></i> <span>Configurations</span>
														</a>
													</li>
													<li>
														<a class="panel-expand" href="#">
															<i class="fa fa-expand"></i> <span>Fullscreen</span>
														</a>
													</li>
												</ul>
											</div>
											<a class="btn btn-xs btn-link panel-close" href="#">
												<i class="fa fa-times"></i>
											</a>
										</div>
									</div>
										<div class="panel-body">
										<h2><i class="fa fa-pencil-square"></i> INVENTARIO</h2>
										<p>
											Esta es la seccion de Ingreso de Activos Fijos
										</p>
										<hr>

<form:form method="POST" action="${pageContext.request.contextPath}/Inventario/add" modelAttribute="inventario">

<div class="row">
        <div class="col-md-12">
                <div class="errorHandler alert alert-danger no-display">
                        <i class="fa fa-times-sign"></i> You have some form errors. Please check below.
                </div>
                <div class="successHandler alert alert-success no-display">
                        <i class="fa fa-ok"></i> Your form validation is successful!
                </div>
        </div>
        <div class="col-md-6">
            
          
            
            
            
            <div class="form-group">
                    <label for="form-field-select-3">
                            Clasificacion Activo
                    </label>
                    <form:select path="tbcClasificacionActivo"  id="form-field-select-3" class="form-control search-select">
                            <option value="1">Seleccione un valor</option>
                            <option value="2">Activo1</option>
                            <option value="3">Activo2</option>
                            <option value="4">Activo3</option>
                         
                    </form:select>
            </div>
            
             <div class="form-group">
                    <label for="form-field-select-3">
                            Poliza
                    </label>
                     <form:select path="tbcPoliza" id="form-field-select-3" class="form-control search-select">
                            <option value="1">&nbsp;</option>
                            <option value="AL">Alabama</option>
                            <option value="AK">Alaska</option>
                            <option value="AZ">Arizona</option>
                         
                    </form:select>
            </div>
            
             <div class="form-group">
                    <label for="form-field-select-3">
                            Encargado
                    </label>
                    <select id="form-field-select-3" class="form-control search-select">
                            <option value="">&nbsp;</option>
                            <option value="AL">Alabama</option>
                            <option value="AK">Alaska</option>
                            <option value="AZ">Arizona</option>
                         
                    </select>
            </div>
            
             <div class="form-group">
                    <label for="form-field-select-3">
                            Region
                    </label>
                    <select id="form-field-select-3" class="form-control search-select">
                            <option value="">&nbsp;</option>
                            <option value="AL">Alabama</option>
                            <option value="AK">Alaska</option>
                            <option value="AZ">Arizona</option>
                         
                    </select>
            </div>
            
           

            

              
</div>  
<!--     Cierre div izquiero-->
        <div class="col-md-6">

              
            <div class="form-group">
                        <label class="control-label">
                                Descripcion<span class="symbol required"></span>
                        </label>
                        <form:input path="descripcion" type="text" placeholder="Insert your Last Name" class="form-control" id="lastname" name="lastname"/>
                </div>

           



        </div>
</div>

<input value="Guardar" type="submit">
</form:form>
</div>
								</div>
								<!-- end: FORM VALIDATION 1 PANEL -->
							</div>
						</div>
						
						<!-- end: PAGE CONTENT-->
				<%@include file="footer.jsp" %>		