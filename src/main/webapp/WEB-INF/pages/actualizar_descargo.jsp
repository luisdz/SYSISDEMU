<%-- 
    Document   : actualizar_descargo
    Created on : 07-28-2015, 10:20:59 AM
    Author     : Zero
--%>

<%@include file="header.jsp"%>


<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!-- start: BREADCRUMB -->
						<div class="row">
							<div class="col-md-12">
								<ol class="breadcrumb">
									<li>
										<a href="#">
											Descargo
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
										<h2><i class="fa fa-pencil-square"></i> POLIZA</h2>
										<p>
											Esta es la seccion de Ingreso de Activos Fijos
										</p>
									<hr>


<form:form method="POST" action="${pageContext.request.contextPath}/Descargo/editDescargo/${descargo.idDescargo}" modelAttribute="descargo" >
    
       
                
    
        
           
                <div class="form-group">
                        <label class="control-label">
                                Comentario<span class="symbol required"></span>
                        </label>
                        <form:input path="comentario" type="text" placeholder="${descargo.comentario}" class="form-control" id="lastname" name="lastname"/>
                </div>
                
                        <div class="form-group">
                                <p>
                                    Fecha 
                                </p>
                                <div class="input-group">
                                    <form:input path="fecha" placeholder="${descargo.fecha}" type="text" data-date-format="dd-mm-yyyy" data-date-viewmode="years" class="form-control date-picker"/>
                                    <span class="input-group-addon"> <i class="fa fa-calendar"></i> </span>
                                </div>
                            </div>
                                    
                    <div class="form-group" >
                                <label class="control-label">
                                    Inventario<span class="symbol required"></span>
                                </label>
                                <form:select path="TbInventario.idInventario"  id="dropdown" name="dropdown" >
                                    <form:option value="0"   label="Seleccione inventario"/>       
                                    <c:forEach var="inv" items="${inventario}">
                                        <form:option value="${inv.idInventario}"  label="${inv.codigoInventario}"/>
                                    </c:forEach>
                                </form:select>

                            </div>                

                        
                            <div class="row">
                                
                                <div class="col-md-4">
                                        <button class="btn btn-yellow btn-block" type="submit">
                                                Actualizar <i class="fa fa-arrow-circle-right"></i>
                                        </button>
                                </div>
  </div>
</form:form>


</div>

 
</div>
								</div>
								<!-- end: FORM VALIDATION 1 PANEL -->
							</div>
						</div>
						
						<!-- end: PAGE CONTENT-->
				<%@include file="footer.jsp" %>	
                                
                                <script>
    $(document).ready(function () {


        $('#dropdown').select2();


    });
</script>