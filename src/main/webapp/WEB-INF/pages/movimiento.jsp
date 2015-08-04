<%-- 
    Document   : movimiento
    Created on : 12-jul-2015, 11:15:45
    Author     : Luis diaz
--%>




<%@include file="header.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
						<!-- start: PAGE CONTENT -->
		                                                
<!--    <script src="//code.jquery.com/jquery-1.9.1.js"></script>
  <script src="//ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js"></script>
  -->
               
  
  <!-- jQuery Form Validation code -->
  
                                                
                                                
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
                    <h2><i class="fa fa-pencil-square"></i> Movimientos</h2>
                    <p>
                            Esta es la seccion de Ingreso de Activos Fijos
                    </p>
                    <hr>
                     <form:form method="POST" action="${pageContext.request.contextPath}/Movimiento/insertarMovimiento" modelAttribute="movimiento" >
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
                                        <p>
                                                Fecha 
                                        </p>
                                        <div class="input-group">
                                                <form:input path="fechaMovimiento" type="text" data-date-format="dd-mm-yyyy" data-date-viewmode="years" class="form-control date-picker"/>
                                                <span class="input-group-addon"> <i class="fa fa-calendar"></i> </span>
                                        </div>
                                   </div>
                         
                                    
                                    <br>

                                          

                                        <div class="form-group">
                                                <label class="control-label">
                                                        Razon de cambio<span class="symbol required"></span>
                                                </label>
                                            <form:input path="razonCambio" type="text" placeholder="Ingrese el nombre" class="form-control" id="lastname" name="lastname"/>
                
                                        </div>
                                     <br>
                                     
                                         <div class="form-group">
                                            <label for="form-field-select-3">
                                                    Inventario
                                            </label>

                                              <form:select path="" class="form-control" id="dropdown" name="dropdown">
                                                  <form:option value="0"  label="Selecciona un elemento"/>
                                                        <c:forEach var="inv" items="${inventario}">
                                                            <form:option value="${inv.idInventario}"  label="${inv.claseEquipo}"/>
                                                         </c:forEach>
                                              </form:select>
                                     </div>
                                     
                                     <br>

                                          

                                        <div class="form-group">
                                                <label class="control-label">
                                                        Codigo inventario<span class="symbol required"></span>
                                                </label>
                                            <form:input path="" type="text" placeholder="Ingrese el nombre" class="form-control" id="codigo" name="lastname"/>
                
                                        </div>
                                      
                                      
                                       </div>
                            
                            <div class="col-md-6">
                                
                                 
 
                                
                                
                                
                            </div>
                               
                        </div>
                        <div class="row">
                                <div class="col-md-12">
                                        <div>
                                                <span class="symbol required"></span>Campos Requeridos
                                                <hr>
                                        </div>
                                </div>
                        </div>
                        <div class="row">
                                <div class="col-md-8">

                                </div>
                                <div class="col-md-4">
                                    <button class="btn btn-yellow btn-block"  id="btnAgregarInv" type="button" value="Agregar">
                                                Ingresar <i class="fa fa-arrow-circle-right"></i>
                                        </button>
                                </div>
                        </div>
                    </form:form>
                    
                    
                    <div class="table-responsive">
                        <table class="table table-striped table-hover" id="sample-table-2">
                                <thead>
                                        <tr>
                                             <th>id mov inv</th>
                                               <th>ID movimiento</th>
                                                <th>ID inventario</th>
                                               
                                                <th>razon</th>
                                                <th>marca</th>
                                                <th>Delete</th>
                                        </tr>
                                </thead>
                                <tbody id="tablabody" name="tablabody">

                              	
                                          

                                </tbody>
                        </table>
                </div>
                    
<!--                    validation-->
                   
<!--                    fin validation-->
                    

                </div>
            </div>
            <!-- end: FORM VALIDATION 1 PANEL -->
        </div>
    </div>
						
						<!-- end: PAGE CONTENT-->
                                                        
                                                
                                                
<%@include file="footer.jsp" %>		

<script>
$("#btnAgregarInv").click(function () {
   var conceptName = $("#codigo").val(); // define the variable
    //var conceptName = 1;
    alert(conceptName);
    
    
    
   $.ajax({ 
                url: "${pageContext.request.contextPath}/Movimiento/agregarInvMov", 
                type: 'POST', 
                dataType: 'json', 
                contentType: 'application/json',
                mimeType: 'application/json',
                
                
                data: conceptName, 
                
               success: function(data) 
            { 
                   var html = '';
                   var len = data.length;
                    
                    alert("devuelve algo: "+data);
                                       
                   
//                        $('#tablabody').empty();
                        data.forEach(function(entry) 
                            {
                                 console.log(entry);
                                 html = '';
                                 html+="<tr>";
                                 html+="<td>"+entry.idInventario+"</td>";
                                 html+="<td>"+entry.marca+"</td>";
                                 html+="<td>"+entry.modelo+"</td>";
                                 html+="</tr>";
                                 
                                
                                 $('#tablabody').append(html);                      
                                
                          });
                            
                         },    
                error:function(data,status,er) 
                { 
                    alert("error: "+data+" status: "+status+" er:"+er);
                    
                    
                }
            });
   
       
    });
 </script>