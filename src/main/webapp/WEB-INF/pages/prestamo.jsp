<%-- 
    Document   : prestamo
    Created on : 26-jul-2015, 21:30:38
    Author     : Miranda
--%>

<%@include file="header.jsp" %>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!-- start: BREADCRUMB -->
<div class="row">
        <div class="col-md-12">
                <ol class="breadcrumb">
                        <li>
                                <a href="#">
                                        Prestamo Equipo
                                </a>
                        </li>
                        <li class="active">
                                Ingreso Prestamo Equipo
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
                        <h4 class="panel-title">Formulario de <span class="text-bold">Ingreso Prestamo de Equipo</span></h4>
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
                    <h2><i class="fa fa-pencil-square"></i> Prestamo Equipo</h2>
                    <p>
                            Ingreso de Prestamo Equipo de ISDEMU
                    </p>
                    <hr>
              <form:form method="POST" action="${pageContext.request.contextPath}/Prestamo/add" modelAttribute="prestamo" >
                        <div class="row">
                                <div class="col-md-12">
                                        <div class="errorHandler alert alert-danger no-display">
                                                <i class="fa fa-times-sign"></i> Tu tienes algunos errores. Favor verificar antes.
                                        </div>
                                        <div class="successHandler alert alert-success no-display">
                                                <i class="fa fa-ok"></i> Tu formulario esta listo!
                                        </div>
                                </div>
                                <div class="col-md-6">
    
                                    <div class="form-group">
                                                <label class="control-label">
                                                        Inventario<span class="symbol required"></span>
                                                </label>
                                               <form:select path="tbInventario.idInventario" class="form-control" id="dropdown" name="dropdown">
                                                    <form:option value="0"  label="Seleccione inventario"/>       
                                                    <c:forEach var="inv" items="${inventario}">
                                                               <form:option value="${inv.idInventario}"  label="${inv.codigoInventario}"/>
                                                            </c:forEach>
                                                 </form:select>
                                                
                                    </div>
                                    <div class="form-group">
                                                <label class="control-label">
                                                        N Prestamo<span class="symbol required"></span>
                                                </label>
<!--                                                <input type="text" placeholder="Codigo" class="form-control" id="codigo" name="firstname">-->
                                                <form:input path="NPrestamo" type="text" placeholder="Numero" class="form-control" id="numero" name="numero"/>
                
                                    </div>
                                    <div class="form-group">
                                                <label class="control-label">
                                                        Tema Impartir<span class="symbol required"></span>
                                                </label>
<!--                                                <input type="text" placeholder="Codigo" class="form-control" id="codigo" name="firstname">-->
                                                <form:input path="temaImpartir" type="text" placeholder="Tema" class="form-control" id="tema" name="tema"/>
                
                                    </div>
                                    <div class="form-group">
                                                <label class="control-label">
                                                        Persona a Impartir<span class="symbol required"></span>
                                                </label>
<!--                                                <input type="text" placeholder="Codigo" class="form-control" id="codigo" name="firstname">-->
                                                <form:input path="personaImpartir" type="text" placeholder="persona" class="form-control" id="persona" name="persona"/>
                
                                    </div>
                                    <div class="form-group">
                                            <label class="control-label">
                                                    Destino<span class="symbol required"></span>
                                            </label>
<!--                                                <input type="text" placeholder="Codigo" class="form-control" id="codigo" name="firstname">-->
                                            <form:input path="destino" type="text" placeholder="destino" class="form-control" id="destino" name="destino"/>
                
                                    </div>
                                                                                
                                </div>
                                <div class="col-md-6">
                                    
                                   <div class="form-group">
                                        <label class="control-label">
                                                Fecha Solicitud<span class="symbol required"></span>
                                        </label>
<!--                                                <input type="text" placeholder="Codigo" class="form-control" id="codigo" name="firstname">-->
                                        <form:input path="fechaSolicitud" type="text" id="fecha_sol" name="fecha_sol" data-date-format="dd-mm-yyyy" data-date-viewmode="years" class="form-control date-picker"/>

                                    </div>
                                    <div class="form-group">
                                        <label class="control-label">
                                                Fecha Reservacion<span class="symbol required"></span>
                                        </label>
<!--                                                <input type="text" placeholder="Codigo" class="form-control" id="codigo" name="firstname">-->
                                        <form:input path="fechaReservacion" type="text" id="fecha_pres" name="fecha_pres" data-date-format="dd-mm-yyyy" data-date-viewmode="years" class="form-control date-picker"/>

                                    </div>
                                    <div class="form-group">
                                        <label class="control-label">
                                                Hora Inicio<span class="symbol required"></span>
                                        </label>
    <!--                                                <input type="text" placeholder="Codigo" class="form-control" id="codigo" name="firstname">-->
                                        <form:input path="horaInicio" type="text" id="hora_inicio" name="hora_inicio" data-date-format="dd-mm-yyyy" data-date-viewmode="years" class="form-control date-picker"/>

                                    </div>
                                    <div class="form-group">
                                        <label class="control-label">
                                                Hora Fin<span class="symbol required"></span>
                                        </label>
    <!--                                                <input type="text" placeholder="Codigo" class="form-control" id="codigo" name="firstname">-->
                                        <form:input path="horaFin" type="text" id="hora_fin" name="hora_fin" data-date-format="dd-mm-yyyy" data-date-viewmode="years" class="form-control date-picker"/>

                                    </div> 
                                    
                                   
                                </div>                                       
                             </div>
                      
                        
                        <div class="row">
                                <div class="col-md-8">
                                       
                                </div>
                                <div class="col-md-4">
                                        <button class="btn btn-yellow btn-block" type="submit">
                                                Guardar <i class="fa fa-arrow-circle-right"></i>
                                        </button>
                                </div>
                        </div>
                   
                        </form:form>
                   </div>
                </div>
            </div>
            <!-- end: FORM VALIDATION 1 PANEL -->
        </div>

<%@include file="footer.jsp" %>	