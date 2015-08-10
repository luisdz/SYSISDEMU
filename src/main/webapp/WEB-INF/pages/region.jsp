<%-- 
    Document   : regiones
    Created on : 14-jul-2015, 21:05:15
    Author     : Walter
--%>

<%@include file="header.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!-- start: BREADCRUMB -->
<div class="row">
        <div class="col-md-12">
                <ol class="breadcrumb">
                        <li>
                                <a href="#">
                                        Catalogos
                                </a>
                        </li>
                        <li class="active">
                                Ingreso Personal
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
                        <h4 class="panel-title">Formulario de <span class="text-bold">Ingreso Regiones</span></h4>
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
                    <h2><i class="fa fa-pencil-square"></i> Regiones</h2>
                    <p>
                            Ingreso del Regiones
                    </p>
                    <hr>
                    <form:form method="POST" action="${pageContext.request.contextPath}/Region/add" onsubmit="return valida_envio();" modelAttribute="region" id="regionF" >
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
                                                <label class="control-label">
                                                        Nombre<span id="span_nombre" class="symbol"></span>
                                                </label>
                                        <form:input path="nombreRegion" type="text" placeholder="Nombre" class="form-control" id="nombre" name="nombre" onblur="return validaNombre(event);"/>
                                         <span for="nombre" class="help-block  no-display" id="span_nombreT">Ingrese un Nombre</span>        
                                    </div>
                                    <div class="form-group">
                                                <label class="control-label">
                                                        Direccion<span id="span_direccion" class="symbol"></span>
                                                </label><br/>
                                                <form:input path="direccion" type="text" placeholder="Direccion" class="form-control" id="direccion" name="direccion" onblur="return validaDireccion(event);"/>
                                                <span for="direccion" class="help-block  no-display" id="span_direccionT">Ingrese un Nombre</span> 
                                    </div>
                                    
                                    <div class="form-group">
                                                <label class="control-label">
                                                        Descripcion<span id="span_descripcion" class="symbol"></span>
                                                </label>
                                        <form:input path="descripcion" type="text" placeholder="Descripcion" class="form-control" id="description" name="description" onblur="return validaDescripcion(event);"/>
                                        <span for="descripcion" class="help-block  no-display" id="span_descripcionT">Ingrese un Nombre</span> 
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
                                        <button class="btn btn-yellow btn-block" type="submit">
                                                Ingresar <i class="fa fa-arrow-circle-right"></i>
                                        </button>
                                </div>
                        </div>
                    </form:form>
                </div>
            </div>
            <!-- end: FORM VALIDATION 1 PANEL -->
        </div>
    </div>


<%@include file="footer.jsp" %>	
<script src="${pageContext.request.contextPath}/assets/validaciones/validacionesRegion.js"></script>