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
                Clase de Activo
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
                <h2><i class="fa fa-pencil-square"></i> CLASE DE ACTIVOS</h2>
                <p>
                    Esta es la seccion de Ingreso de Clases de Activos
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
                                <label class="control-label">
                                    Marca<span id="span_marca" class="symbol"></span>
                                </label>
                                <form:input path="marca" type="text" placeholder="Ingrese la marca del equipo" class="form-control" id="marca" name="marca" onblur="return validaMarca(event);"/>
                                <span for="marca" class="help-block  no-display" id="span_marcaT">Ingrese una Marca</span> 
                            </div>

                           
                        </div>  
                        <!--     Cierre div izquiero-->
                        <div class="col-md-6">
                            <div class="form-group">
                                <label class="control-label">
                                    Serie<span id="span_serie" class="symbol"></span>
                                </label>
                                <form:input path="serie" type="text" placeholder="Ingrese el numero de serie" class="form-control" id="serie" name="serie" onblur="return validaSerie(event);"/>
                                <span for="serie" class="help-block  no-display" id="span_serieT">Ingrese el numero de Serie</span> 
                            </div>

                             


                        </div>

                        <div class="row">
                            <div class="col-md-12">
                                <div class="col-md-8">
                                </div>
                                <div class="col-md-4">
                                    <button class="btn btn-yellow btn-block" type="submit">
                                        Guardar <i class="fa fa-arrow-circle-right"></i>
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


