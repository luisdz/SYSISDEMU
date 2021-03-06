<%-- 
    Document   : actualizar_ubicacion
    Created on : 23-ago-2015, 15:50:37
    Author     : Miranda
--%>

<%@include file="header.jsp"%>


<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!-- start: BREADCRUMB -->
<div class="row">
    <div class="col-md-12">
        <ol class="breadcrumb">
            <li>
                <a href="#">
                    Catalogo
                </a>
            </li>
            <li class="active">
                Actualizar Ubicacion
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
                <h4 class="panel-title"><span class="text-bold">Actualizacion</span></h4>
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
                <h2><i class="fa fa-pencil-square"></i>Ubicacion</h2>
                
                <hr>

                <form:form method="POST" action="${pageContext.request.contextPath}/Ubicacion/edit/${ubicacion.idUbicacion}" onsubmit="return valida_envio();" modelAttribute="ubicacion" id="ubiacionF">

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
                                                        Localizacion<span id="span_nombre" class="symbol "></span>
                                                </label>
                                               <form:select path="TbcLocalizacion.idLocalizacion" class="form-control" id="dropdown" name="dropdown" onchange="return validaLocalizacion(event);">
                                                    <form:option value="0"  label="Selecciona localizacion"/>       
                                                    <c:forEach var="loc" items="${localizacion}">
                                                               <form:option value="${loc.idLocalizacion}"  label="${loc.nombreLocalizacion}"/>
                                                            </c:forEach>
                                                 </form:select>
                                                <span for="nombre" class="help-block  no-display" id="span_localizacionT">Ingrese una localizacion</span>    
                                    </div>                                                                                
                                </div>
                                <div class="col-md-6">
                                    
                                   <div class="form-group">
                                                <label class="control-label">
                                                        Nombre Ubicacion<span id="span_jefe" class="symbol"></span>
                                                </label>
<!--                                                <input type="text" placeholder="Codigo" class="form-control" id="codigo" name="firstname">-->
                                                <form:input path="nombreUbicacion" type="text" class="form-control" id="ubicacion" name="ubicacion" onblur="return validaUbicacion(event);"/>
                                                <span for="jefe" class="help-block  no-display" id="span_ubiacionT">Ingrese un Nombre Ubicacion</span> 
                
                                    </div>                                     
                                   
                                </div> 

                        <div class="row">
                            <div class="col-md-12">
                                <div class="col-md-8">
                                </div>
                                <div class="col-md-4">
                                    <button class="btn btn-yellow btn-block" type="submit">
                                        Actuaizar <i class="fa fa-arrow-circle-right"></i>
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
<script src="${pageContext.request.contextPath}/assets/validaciones/validacionesUbicacion.js"></script>
