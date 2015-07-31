<%-- 
    Document   : Personal
    Created on : 14-jul-2015, 20:06:09
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
                        <h4 class="panel-title">Formulario de <span class="text-bold">Ingreso Personal</span></h4>
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
                    <h2><i class="fa fa-pencil-square"></i> Personal</h2>
                    <p>
                            Ingreso del Personal de ISDEMU
                    </p>
                    <hr>
              <form:form method="POST" action="${pageContext.request.contextPath}/Persona/add" modelAttribute="persona" >
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
                                                        Unidad<span class="symbol required"></span>
                                                </label>
                                               <form:select path="tbcUnidad.idUnidad" class="form-control" id="dropdown" name="dropdown">
                                                    <form:option value="0"  label="Selecciona unidad"/>       
                                                    <c:forEach var="uni" items="${unidad}">
                                                               <form:option value="${uni.idUnidad}"  label="${uni.nombreUnidad}"/>
                                                            </c:forEach>
                                                 </form:select>
                                                
                                    </div>
                                    <div class="form-group">
                                                <label class="control-label">
                                                        Nombre Persona<span class="symbol required"></span>
                                                </label>
<!--                                                <input type="text" placeholder="Codigo" class="form-control" id="codigo" name="firstname">-->
                                                <form:input path="nombrePersona" type="text" placeholder="Ingrese nombre persona" class="form-control" id="nombre" name="nombre"/>
                
                                    </div>                        
                                                                                
                                </div>
                                <div class="col-md-6">
                                    
                                   <div class="form-group">
                                                <label class="control-label">
                                                        Jefe<span class="symbol required"></span>
                                                </label>
<!--                                                <input type="text" placeholder="Codigo" class="form-control" id="codigo" name="firstname">-->
                                                <form:input path="jefatura" type="text" class="form-control" id="jefe" name="jefe"/>
                
                                    </div> 
                                                <div class="form-group">
                                                <label class="control-label">
                                                        Encargado<span class="symbol required"></span>
                                                </label>
<!--                                                <input type="text" placeholder="Codigo" class="form-control" id="codigo" name="firstname">-->
                                                <form:input path="encargadoAfijo" type="text" class="form-control" id="encargado" name="encargado"/>
                
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