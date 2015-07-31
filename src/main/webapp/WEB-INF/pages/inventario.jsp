<%@include file="header.jsp"%>


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

        
                         
                         
                   
        
        
<form:form method="POST" action="${pageContext.request.contextPath}/Inventario/add" modelAttribute="inventario" >

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
                   
                      <form:select path="TbcClaseActivo.idClaseActivo" class="form-control" id="dropdown" name="dropdown">
                          <form:option value="0"  label="Selecciona una clasificacion"/>
                                <c:forEach var="clasi" items="${clasificacionA}">
                                    <form:option value="${clasi.idClasificacionActivo}"  label="${clasi.nombreClasificacion}"/>
                                 </c:forEach>
                      </form:select>
            </div>
            
            <div class="form-group">
                    <label for="form-field-select-3">
                            Clase de Activo
                    </label>
                   
                      <form:select path="TbcClaseActivo.idClaseActivo" class="form-control" id="dropdown" name="dropdown">
                          <form:option value="0"  label="Selecciona una clasificacion"/>
                                <c:forEach var="claseA" items="${claseActivo}">
                                    <form:option value="${claseA.idClaseActivo}"  label="${claseA.nombreClase}"/>
                                 </c:forEach>
                      </form:select>
            </div>
          
                
         
            
          
             <div class="form-group">
                    <label for="form-field-select-3">
                            En custodia de
                    </label>
                     <form:select path="tbcPersona.idPersona" class="form-control" id="dropdown" name="dropdown">
                         <form:option value="0"  label="Selecciona la persona encargada del Activo"/>       
                         <c:forEach var="pers" items="${persona}">
                                    <form:option value="${pers.idPersona}"  label="${pers.nombrePersona}"/>
                                 </c:forEach>
                      </form:select>
            </div>
           
            <div class="form-group">
                    <label for="form-field-select-3">
                            Localizacion
                    </label>
                     <form:select path="TbcLocalizacion.idLocalizacion" class="form-control" id="dropdown" name="dropdown">
                         <form:option value="0"  label="Selecciona la persona encargada del Activo"/>       
                         <c:forEach var="loca" items="${lozalizacion}">
                                    <form:option value="${loca.idLocalizacion}"  label="${loca.nombreLocalizacion}"/>
                                 </c:forEach>
                      </form:select>
            </div>
          
               
            <div class="form-group">
                        <label class="control-label">
                                Marca<span class="symbol required"></span>
                        </label>
                        <form:input path="marca" type="text" placeholder="Ingrese la marca del equipo" class="form-control" id="lastname" name="lastname"/>
                </div>
                
                <div class="form-group">
                        <label class="control-label">
                                Modelo<span class="symbol required"></span>
                        </label>
                        <form:input path="modelo" type="text" placeholder="Ingrese el modelo del equipo" class="form-control" id="lastname" name="lastname"/>
                </div>
                
             <div class="form-group">
                        <label class="control-label">
                                Serie<span class="symbol required"></span>
                        </label>
                        <form:input path="serie" type="text" placeholder="Ingrese el numero de serie" class="form-control" id="lastname" name="lastname"/>
                </div>

            

              
</div>  
<!--     Cierre div izquiero-->
        <div class="col-md-6">

            
               <div class="form-group">
                    <p>
                            Fecha Adquisicion
                    </p>
                    <div class="input-group">
                            <form:input path="fechaAdquisicion" type="text" data-date-format="dd-mm-yyyy" data-date-viewmode="years" class="form-control date-picker"/>
                            <span class="input-group-addon"> <i class="fa fa-calendar"></i> </span>
                    </div>
               </div>
                
            
                
                
                
                            
               <div class="form-group">
                        <label class="control-label">
                                Valor<span class="symbol required"></span>
                        </label>
                        <form:input path="valor" type="text" placeholder="Ingrese el valor en $ del equipo" class="form-control" id="lastname" name="lastname"/>
                </div>
                
                
                
                  <div class="form-group">
                        <label class="control-label">
                                N Factura<span class="symbol required"></span>
                        </label>
                        <form:input path="NFactura" type="text" placeholder="Ingrese el numero de factura" class="form-control" id="lastname" name="lastname"/>
                </div>
                
                
                
                  <div class="form-group">
                        <label class="control-label">
                                Financiamiento<span class="symbol required"></span>
                        </label>
                        <form:input path="financiamiento" type="text" placeholder="Ingrese el tipo de financiamiento del equipo" class="form-control" id="lastname" name="lastname"/>
                </div>
                
                 
              
          

           



        </div>
                
                <div class="row">
                                
                                <div class="col-md-4">
                                        <button class="btn btn-yellow btn-block" type="submit">
                                                Guardar Activo <i class="fa fa-arrow-circle-right"></i>
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
$("#dropdown").change(function () {
   var conceptName = $('#dropdown :selected').val(); // define the variable
    alert(conceptName);
    
    
    
   $.ajax({ 
                url: "${pageContext.request.contextPath}/Inventario/listaClaseA", 
                type: 'POST', 
                dataType: 'json', 
                contentType: 'application/json',
                mimeType: 'application/json',
                
                
                data: "{id:" + conceptName + "}", 
                
               success: function(data) { 
                   
                   var len = data.length;
                    //alert("devuelve algo"+data);
                    
                                       data.forEach(function(entry) {
                                    console.log(entry);
                                    alert("foreach :"+entry.nombreClase );
                            });
                    alert("devuelve algo: "+data);
                },
                error:function(data,status,er) { 
                    alert("error: "+data+" status: "+status+" er:"+er);
                    
                    
                }
            });
   
       
    });
 </script>