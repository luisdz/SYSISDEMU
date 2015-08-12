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

        
                         
                         
                   
        
        
<form:form method="POST" action="${pageContext.request.contextPath}/Inventario/add" onsubmit="return valida_envio();" modelAttribute="inventario" id="inventarioF">

<div class="row">
        <div class="col-md-12">
            <div class="errorHandler alert alert-danger no-display" id="mensajeErrorForms">

                <i class="fa fa-times-sign"></i> Se encontraron errores, favor verificarlos.
            </div>
            <div class="successHandler alert alert-success no-display">
                <i class="fa fa-ok"></i> Validacion exitosa!
            </div>
        </div>
        <div class="col-md-6">
              <div class="form-group">
                    <label for="form-field-select-3">
                            Clasificacion Activo<span id="span_clasi" class="symbol "></span>
                    </label>
                   
                      <form:select path="" class="form-control" id="dropdown1" name="dropdown1" onchange="return validaClasificacion(event);">
                          <form:option value="0"  label="Selecciona una clasificacion"/>
                                <c:forEach var="clasi" items="${clasificacionA}">
                                    <form:option value="${clasi.idClasificacionActivo}"  label="${clasi.nombreClasificacion}"/>
                                 </c:forEach>
                      </form:select>
                      <span for="clasifi" class="help-block  no-display" id="span_dropdownT">Seleccione una Clasificacion</span>
            </div>
            
            <div class="form-group">
                    <label for="form-field-select-3">
                            Clase de Activo<span id="span_clase" class="symbol "></span>
                    </label>
                   
                      <form:select path="TbcClaseActivo.idClaseActivo" class="form-control" id="dropdown2" name="dropdown" onchange="return validaClase(event);">
                          <form:option value="0"  label="Selecciona una clasificacion"/>
                         
                      </form:select>
                    <span for="clasifi" class="help-block  no-display" id="span_dropdown2T">Seleccione una Clase de Activo</span>
            </div>
            
             
         
            
          
             <div class="form-group">
                    <label for="form-field-select-3">
                            En custodia de<span id="span_persona" class="symbol "></span>
                    </label>
                     <form:select path="tbcPersona.idPersona" class="form-control" id="dropdown3" name="dropdown" onchange="return validaCustodia(event);">
                         <form:option value="0"  label="Selecciona la persona encargada del Activo"/>       
                       <c:forEach var="pers" items="${persona}">
                                    <form:option value="${pers.idPersona}"  label="${pers.nombrePersona}"/>
                        </c:forEach> 
                      </form:select>
                    <span for="clasifi" class="help-block  no-display" id="span_personaT">Seleccione una Persona</span>
            </div>
           
            <div class="form-group">
                    <label for="form-field-select-3">
                            Localizacion<span id="span_local" class="symbol "></span>
                    </label>
                     <form:select path="TbcLocalizacion.idLocalizacion" class="form-control" id="dropdown4" name="dropdown" onchange="return validaLocalizacion(event);">
                         <form:option value="0"  label="Selecciona la persona encargada del Activo"/>       
                        <c:forEach var="loca" items="${lozalizacion}">
                                    <form:option value="${loca.idLocalizacion}"  label="${loca.nombreLocalizacion}"/>
                                 </c:forEach> 
                      </form:select>
                    <span for="clasifi" class="help-block  no-display" id="span_localizacionT">Seleccione una Persona</span>
            </div>
          
               
            <div class="form-group">
                        <label class="control-label">
                                Marca<span id="span_marca" class="symbol"></span>
                        </label>
                        <form:input path="marca" type="text" placeholder="Ingrese la marca del equipo" class="form-control" id="marca" name="marca" onblur="return validaMarca(event);"/>
                        <span for="marca" class="help-block  no-display" id="span_marcaT">Ingrese una Marca</span> 
                </div>
                
                <div class="form-group">
                        <label class="control-label">
                                Modelo<span id="span_modelo" class="symbol"></span>
                        </label>
                        <form:input path="modelo" type="text" placeholder="Ingrese el modelo del equipo" class="form-control" id="modelo" name="modelo" onblur="return validaModelo(event);"/>
                        <span for="modelo" class="help-block  no-display" id="span_modeloT">Ingrese un Modelo</span> 
                </div>
                </div>  
<!--     Cierre div izquiero-->
        <div class="col-md-6">
             <div class="form-group">
                        <label class="control-label">
                                Serie<span id="span_serie" class="symbol"></span>
                        </label>
                        <form:input path="serie" type="text" placeholder="Ingrese el numero de serie" class="form-control" id="serie" name="serie" onblur="return validaSerie(event);"/>
                        <span for="serie" class="help-block  no-display" id="span_serieT">Ingrese una Serie</span> 
                </div>

            

              


            
               <div class="form-group">
                   <label class="control-label">
                            Fecha Adquisicion<span id="span_adq" class="symbol"></span>
                   </label>
                    <div class="input-group">
                            <form:input path="fechaAdquisicion" type="text" id="fecha_adq" name="fecha_adq" data-date-format="dd-mm-yyyy" data-date-viewmode="years" class="form-control date-picker" onchange="return validaFechaAdq(event);" onblur="return validaFechaAdq(event);"/>
                            <span class="input-group-addon"> <i class="fa fa-calendar"></i></span><span for="fecha_adq" class="help-block  no-display" id="span_fechaAdq">Ingrese Fecha Adquisicion</span>
                    </div>
               </div>
                
            
                
                
                
                            
               <div class="form-group">
                        <label class="control-label">
                                Valor<span id="span_valor" class="symbol"></span>
                        </label>
                        <form:input path="valor" type="text" placeholder="Ingrese el valor en $ del equipo" class="form-control" id="valor" name="valor" onkeypress="return valideKey(event);" onblur="return validaValor(event);"/>
                        <span for="valor" class="help-block  no-display" id="span_valorT">Ingrese Valor</span> 
                </div>
                
                
                
                  <div class="form-group">
                        <label class="control-label">
                                N Factura<span id="span_factura" class="symbol"></span>
                        </label>
                        <form:input path="NFactura" type="text" placeholder="Ingrese el numero de factura" class="form-control" id="factura" name="factura" onblur="return validaFactura(event);"/>
                        <span for="factura" class="help-block  no-display" id="span_facturaT">Ingrese numero factura</span> 
                </div>
                
                
                
                  <div class="form-group">
                        <label class="control-label">
                                Financiamiento<span id="span_finan" class="symbol"></span>
                        </label>
                        <form:input path="financiamiento" type="text" placeholder="Ingrese el tipo de financiamiento del equipo" class="form-control" id="financiamiento" name="financiamiento" onblur="return validaFinanciamiento(event);"/>
                        <span for="financiamiento" class="help-block  no-display" id="span_financiamientoT">Ingrese un Financiamiento</span> 
                </div>
                
                 
              
          

           



        </div>
                
                <div class="row">
                                <div class="col-md-12">
                                    <div class="col-md-8">
                                    </div>
                                <div class="col-md-4">
                                        <button class="btn btn-yellow btn-block" type="submit">
                                                Guardar Activo <i class="fa fa-arrow-circle-right"></i>
                                        </button>
                                </div>
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

<script src="${pageContext.request.contextPath}/assets/validaciones/validacionesInventario.js"></script>
           
<script>
$("#dropdown1").change(function () {
   var conceptName = $('#dropdown1 :selected').val(); // define the variable
   // alert(conceptName);
    
    
    
   $.ajax({ 
                url: "${pageContext.request.contextPath}/Inventario/listaClaseA", 
                type: 'POST', 
                dataType: 'json', 
                contentType: 'application/json',
                mimeType: 'application/json',
                
                
                data: conceptName, 
                
               success: function(data) { 
                   var html = '';
                   var len = data.length;
                    //alert("devuelve algo"+data);
                            $('#dropdown2').empty();
                            html= '<option value="0"  label="Selecciona una clasificacion"/>';
                            data.forEach(function(entry) 
                            {
                                    console.log(entry);
                                   // alert("foreach :"+entry.nombreClase );
                                   html += '<option value="' + entry.idClaseActivo + '">' + entry.nombreClase + '</option>';
                            });
                            $('#dropdown2').append(html);
                   // alert("devuelve algo: "+data);
                },
                error:function(data,status,er) { 
                    alert("error: "+data+" status: "+status+" er:"+er);
                    
                    
                }
            });
   
       
    });
    
    
    //AJAX PARA QUE APAREZCA LA REGION EN LA QUE SE VA INGRESAR EL INVENTARIO AL SELECCIONAR LA PERSONA
    $("#dropdown3").change(function () {
   var conceptName = $('#dropdown3 :selected').val(); // define the variable
    //alert(conceptName);
    
    
    
//   $.ajax({ 
//                url: "${pageContext.request.contextPath}/Inventario/listaClaseA", 
//                type: 'POST', 
//                dataType: 'json', 
//                contentType: 'application/json',
//                mimeType: 'application/json',
//                
//                
//                data: conceptName, 
//                
//               success: function(data) { 
//                   var html = '';
//                   var len = data.length;
//                    //alert("devuelve algo"+data);
//                            $('#dropdown2').empty();
//                            html= '<option value="0"  label="Selecciona una clasificacion"/>';
//                            data.forEach(function(entry) 
//                            {
//                                    console.log(entry);
//                                   // alert("foreach :"+entry.nombreClase );
//                                   html += '<option value="' + entry.idClaseActivo + '">' + entry.nombreClase + '</option>';
//                            });
//                            $('#dropdown2').append(html);
//                   // alert("devuelve algo: "+data);
//                },
//                error:function(data,status,er) { 
//                    alert("error: "+data+" status: "+status+" er:"+er);
//                    
//                    
//                }
//            });
//   
   });
   
   function valideKey(evt)
		    {
		        var code = (evt.which) ? evt.which : evt.keyCode;
		            if(code==8)
		            {
		                //backspace
		                return true;
		            }
		            else if(code>=48 && code<=57)
		            {
		                //is a number
		                return true;
		            }
		            else
		            {
		                return false;
		            }
		    };
 </script>
