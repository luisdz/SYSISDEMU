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
                    <form:form method="POST"  action="${pageContext.request.contextPath}/Movimiento/insertarMovimiento" modelAttribute="movimiento" id="movF" >
                       <div class="row">
                                <div class="col-md-12">
                                        <div class="errorHandler alert alert-danger no-display" id="mensajeErrorFormM"  >
                                                <i class="fa fa-times-sign"></i> You have some form errors. Please check below.
                                        </div>
                                        <div class="successHandler alert alert-success no-display">
                                                <i class="fa fa-ok"></i> Your form validation is successful!
                                        </div>
                                </div>
                                <div class="col-md-6">
                                     <div class="form-group">
                                        <label class="control-label">
                                                        Fecha<span class="symbol "></span>
                                                </label>
                                        <div class="input-group">
                                            <form:input path="fechaMovimiento" type="text" data-date-format="dd-mm-yyyy" id="fecha" data-date-viewmode="years" class="form-control date-picker"/>
                                                <span class="input-group-addon"> <i class="fa fa-calendar"></i> </span>
                                        </div>
                                   </div>
                         
                                    
                                    <br>

                                          

                                        <div class="form-group">
                                                <label class="control-label">
                                                        Razon de cambio<span class="symbol "></span>
                                                </label>
                                            <form:input path="razonCambio" type="text" placeholder="Ingrese el nombre" class="form-control" id="razon" name="lastname"/>
                
                                        </div>
                                     <br>
                                      </div>
                                      <div class="col-md-6">
                                         <div class="form-group">
                                                <label class="control-label">
                                                        Inventario<span class="symbol"></span>
                                                </label>
                                               <form:select  multiple="single" path=""  cssStyle="width: 100%"  id="dropdown" name="dropdown">
                                                    <form:option value="0" label="Seleccione inventario" />  
                                                    <form:options items="${inventario}" itemValue="idInventario"  itemLabel="codigoInventario"/>                                                    
                                                 </form:select>
                                             
                                    </div>
                                     <br>
                                     <div class="form-group">
                                                <label class="control-label">
                                                        Nuevo Responsable<span class="symbol"></span>
                                                </label>
                                                <form:select  multiple="single" path="" cssStyle="width: 100%" id="dropdown2" name="dropdown2">
                                                    <form:option value="0" label="Seleccione responsable"/>  
                                                    <form:options items="${persona}" itemValue="idPersona"  itemLabel="nombrePersona"/>                                                    
                                                 </form:select>
                                             
                                    </div>
                                     
                                     <br>
                                       </div>
                            
                            <div class="col-md-6">
                                
                                 
 
                                
                                
                                
                            </div>
                               
                        </div>
                        <div class="row  no-display">
                                <div class="col-md-12">
                                        <div>
                                                <span class="symbol required"></span>Campos Requeridos
                                                <hr>
                                        </div>
                                </div>
                        </div>
                        
                    </form:form>
                    <div class="col-md-12 text-center">
                                   <button type="button" class="btn btn-default" onclick="agregarInventario();" >Agregar</button>     
                            </div>
                            <div class="col-md-12 text-center">
                                &nbsp;<br/>
                            </div>  
                     <hr>
                     <h4 class="panel-title"><span class="text-bold">Inventario</span></h4>
                   
                    <div class="table-responsive">
                        <table class="table table-striped table-hover" id="tabla_prueba">
                                <thead>
                                        <tr>
                                               <th>id</th>
                                               <th>codigo</th>                            
                                                <th>Delete</th>
                                        </tr>
                                </thead>
                                <tbody id="tablabody" name="tablabody">

                              	
                                          

                                </tbody>
                        </table>
                </div>
                    
                    <div class="row">
                                <div class="col-md-8">
                                       
                                </div>
                                <div class="col-md-4">
                                    <button class="btn btn-yellow btn-block" type="button" id="btnEnviar" onclick="return enviarMov(event);">
                                                Guardar <i class="fa fa-arrow-circle-right"></i>
                                        </button>
                                </div>
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
 <script src="${pageContext.request.contextPath}/assets/validaciones/validacionesISDEMU-01.js"></script>
<script>
    
    
    
    function agregarInventario(){ 
                 
               // alert("entra "+ $("#dropdown").inv.marca);
               
               if($("#dropdown").val() != 0)
               {
                  var id = $("#dropdown").val();
                  
                  var codigo = $('#dropdown option:selected').text();
//                 alert(idInv);
                 var idInv=id.toString();
                      $('#tabla_prueba').append('<tr  id="' + idInv + '">'+'<td>' + idInv + '</td>'+'<td>' + codigo + '</td><td class="eliminar"><a href="" onclick="return deleteElement('+"'"+ idInv +"'"+ ');"><span class="glyphicon glyphicon-remove"></span></a></td></tr>');
                  }
              };

    function deleteElement(id)
    {
        var el = document.getElementById(id);
        el.parentNode.removeChild(el);
        return false; 
        };
        
    function enviarMov()
    {
         //alert("enviar");
        
        if($('#tabla_prueba tr').size()>1)
        {
        $('#mensajeErrorFormM').addClass("no-display");   
        var fechaM=$("#fecha").val();
        var razonM=$("#razon").val();
       
       
       
         var jsonArray="{";
         
         jsonArray+="\"Movimiento\":[{\"fecha\":\""+fechaM+"\",\"razon\":\" "+razonM+"\""  +"}],";
         
         jsonArray+="\"Inventario\":[";
        
        
        var l=0;
    
        $('#tabla_prueba tr').each(function(index, element){

        var id = $(element).find("td").eq(0).html();
      
        if(l!=0)
        {
            jsonArray=jsonArray+"{\"idInv\":"+'"'+id+'"'+"},";
                    
          }

        l=1;

    });


    jsonArray=jsonArray.substring(0,jsonArray.length-1);
    jsonArray=jsonArray+"]}";
    //alert(jsonArray);
         $.ajax({
           type: "POST",
           url: "${pageContext.request.contextPath}/Movimiento/insertarMovimiento",
           dataType: "json",
           contentType: 'application/json',
           success: function (msg) {
               //alert("entra");
           },
           data: jsonArray
       });
       }
       else
       {
       
        //$('#mensajeErrorFormM').removeClass("no-display");
       return false;
       }
       
       };
       
    
                    
                    
    $( document ).ready(function() {


           $('#dropdown').select2();
           $('#dropdown2').select2();


       }); 
       
       
</script>
