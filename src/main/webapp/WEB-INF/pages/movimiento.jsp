<%-- 
    Document   : movimiento
    Created on : 12-jul-2015, 11:15:45
    Author     : Luis diaz
--%>




<%@include file="header.jsp" %>
						<!-- start: PAGE CONTENT -->
		                                                
<!--    <script src="//code.jquery.com/jquery-1.9.1.js"></script>
  <script src="//ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js"></script>
  -->
  <script src="${pageContext.request.contextPath}/assets/plugins/jQuery/jquery-2.1.1.min.js"></script>
  <script src="${pageContext.request.contextPath}/assets/plugins/jquery-validation/dist/jquery.validate.min.js"></script>
  
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
                    <form action="#" role="form" id="form2" >
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
                                     <label class="control-label">
                                                Fecha<span class="symbol required"></span>
                                      </label>   
                                    <div class="input-group">
                                        
                                        
                                        <input type="text" data-date-format="dd-mm-yyyy" data-date-viewmode="years" class="form-control date-picker">
                                        <span class="input-group-addon"> <i class="fa fa-calendar"></i> </span>
                                        
				    </div>
                                    
                                    <br>

                                          

                                        <div class="form-group">
                                                <label class="control-label">
                                                        Razon de cambio<span class="symbol required"></span>
                                                </label>
                                            <input type="text" placeholder="Razon de cambio" class="form-control" id="razon" name="razon" >
                                                 </div>
                                     <br>
                                     
                                        <div class="form-group">
                                                <label class="control-label">
                                                        Inventario <span class="symbol required"></span>
                                                </label>
                                                <select name="inventario" id="inventario" class="form-control"  >
                                                                        <option value="">Seleccionar</option>
                                                                        <option value="01">1</option>
                                                                        <option value="02">2</option>
                                                                        <option value="03">3</option>
                                                </select>
                                        </div>
                                       
                                      
                                       </div>
                            
                            <div class="col-md-6">
                                
                                 <div class="form-group">
                                                <label class="control-label">
                                                        Nuevo responsable <span class="symbol required"></span>
                                                </label>
                                                <select name="nuevo_responsable" id="nuevo_responsable" class="form-control" required >
                                                                        <option value="">Responsable</option>
                                                                        <option value="01">1</option>
                                                                        <option value="02">2</option>
                                                                        <option value="03">3</option>
                                                </select>
                                        
                                        </div>
 
                                
                                  <div class="form-group">
                                                <label class="control-label">
                                                        Jefatura solicitante<span class="symbol required"></span>
                                                </label>
                                                <select name="jefatura" id="jefatura" class="form-control" >
                                                                        <option value="">Seleccionar</option>
                                                                        <option value="01">1</option>
                                                                        <option value="02">2</option>
                                                                        <option value="03">3</option>
                                                </select>
                                        </div>
                                
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
                                        <button class="btn btn-yellow btn-block"   type="submit" value="Submit">
                                                Ingresar <i class="fa fa-arrow-circle-right"></i>
                                        </button>
                                </div>
                        </div>
                    </form>
                    
<!--                    validation-->
                    <script>
          
    $(function() {
    // Setup form validation on the #register-form element
    $("#form2").validate({
    
        // Specify the validation rules
        rules: {
            
            razon: {required:true,
                    minleght: 2
                    },
            inventario: "required"
            
        },
        
        // Specify the validation error messages
        messages: {
            razon:{ required:"Please enter your first name"},
            inventario: "Please enter your last name"
        }
               
       });
   });

  
    </script>
<!--                    fin validation-->
                    

                </div>
            </div>
            <!-- end: FORM VALIDATION 1 PANEL -->
        </div>
    </div>
						
						<!-- end: PAGE CONTENT-->
                                                        
                                                
                                                
<%@include file="footer.jsp" %>		