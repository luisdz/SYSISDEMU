<%-- 
    Document   : actualizar_estadoinventario
    Created on : 22-ago-2015, 21:08:59
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
                Actualizar Estado Inventario
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
                <h4 class="panel-title"> <span class="text-bold">Actualizar</span></h4>
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
                <h2><i class="fa fa-pencil-square"></i> Estado Inventario</h2>
                
                <hr>


                <form:form method="POST" action="${pageContext.request.contextPath}/EstadoInventario/edit/${estadoinventario.idEstado}" modelAttribute="estadoinventario" onsubmit="return valida_envio();" id="estadoF" >

                    <div class="row">
                        <div class="col-md-12">
                            <div class="errorHandler alert alert-danger no-display" id="mensajeErrorForm">

                                <i class="fa fa-times-sign"></i> You have some form errors. Please check below.
                            </div>
                            <div class="successHandler alert alert-success no-display">
                                <i class="fa fa-ok"></i> Your form validation is successful!
                            </div>
                        </div>
                        <div class="col-md-6">
                            
                            <div class="form-group">
                                    <label class="control-label">
                                            Nombre Estado<span id="span_nombre" class="symbol"></span>
                                    </label>
    <!--                                                <input type="text" placeholder="Codigo" class="form-control" id="codigo" name="firstname">-->
                                    <form:input path="nombreEstado" type="text" placeholder="Ingrese nombre estado" class="form-control" id="nombre" name="nombre" onblur="return validaNombreEstado(event);"/>
                                    <span for="nombre" class="help-block  no-display" id="span_nombreT">Ingrese un Nombre</span> 
                            </div> 
                             <div class="form-group">
                                        <label class="control-label">
                                                Descripcion<span id="span_desc" class="symbol"></span>
                                        </label>
<!--                                                <input type="text" placeholder="Codigo" class="form-control" id="codigo" name="firstname">-->
                                        <form:textarea path="descripcion" type="text" placeholder="Ingrese descripcion" class="form-control" id="desc" name="desc" onblur="return validaDesc(event);"></form:textarea>
                                        <span for="desc" class="help-block  no-display" id="span_descT">Ingrese una Descripcion</span> 

                            </div> 
                        </div>
                                                      
                         <div class="row">
                                <div class="col-md-8">
                                       
                                </div>
                                <div class="col-md-4">
                                    <button class="btn btn-yellow btn-block" type="submit" >
                                                Actualizar <i class="fa fa-arrow-circle-right"></i>
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
        
        <script src="${pageContext.request.contextPath}/assets/validaciones/validacionesEstadoInv.js"></script>