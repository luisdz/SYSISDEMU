<%-- 
    Document   : actualizar_unidad
    Created on : 07-27-2015, 07:02:48 PM
    Author     : Zero
--%>

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
                <h2><i class="fa fa-pencil-square"></i> UNIDAD</h2>
                <p>
                    Esta es la seccion de Ingreso de Activos Fijos
                </p>
                <hr>


                <form:form method="POST" action="${pageContext.request.contextPath}/Unidad/editUnidad/${unidad.idUnidad}" modelAttribute="unidad" >





                    <div class="form-group">
                        <label class="control-label">
                            Nombre<span class="symbol"></span>
                        </label>
                        <form:input path="nombreUnidad" type="text" placeholder="${unidad.nombreUnidad}" class="form-control" id="lastname" name="lastname"/>
                    </div>
                    <div class="form-group">
                        <label class="control-label">
                            Descripcion<span class="symbol"></span>
                        </label>
                        <form:input path="descripcion" type="text" placeholder="${unidad.descripcion}" class="form-control" id="lastname" name="lastname"/>
                    </div>
                    <div class="form-group" >
                        <label class="control-label">
                            Region<span class="symbol "></span>
                        </label>
                        <form:select path="TbcRegion.idRegion"  id="dropdown" name="dropdown">
                            <form:option value="0"  label="Selecciona una region"/>
                            <c:forEach var="reg" items="${region}">
                                <form:option value="${reg.idRegion}"  label="${reg.nombreRegion}"/>
                            </c:forEach>
                        </form:select>

                    </div>   


                    <div class="row">

                        <div class="col-md-4">
                            <button class="btn btn-yellow btn-block" type="submit">
                                Actualizar <i class="fa fa-arrow-circle-right"></i>
                            </button>
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