<%-- 
    Document   : unidad
    Created on : 12-jul-2015, 11:43:54
    Author     : Luis diaz
--%>

<%@include file="header.jsp" %>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
                <h2><i class="fa fa-pencil-square"></i> Unidad</h2>
                <p>
                    Esta es la seccion de Ingreso de Unidades
                </p>
                <hr>

                <form:form method="POST" action="${pageContext.request.contextPath}/Unidad/insertarUnidad" modelAttribute="unidad" >
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
                                <label class="control-label">
                                    Region
                                </label>
                                <form:select path="TbcRegion.idRegion"  id="dropdown" name="dropdown">
                                    <form:option value="0"  label="Selecciona una region"/>
                                    <c:forEach var="reg" items="${region}">
                                        <form:option value="${reg.idRegion}"  label="${reg.nombreRegion}"/>
                                    </c:forEach>
                                </form:select>
                            </div>




                            <div class="form-group">
                                <label class="control-label">
                                    Nombre<span class="symbol "></span>
                                </label>
                                <form:input path="nombreUnidad" type="text" placeholder="Ingrese el nombre" class="form-control" id="lastname" name="lastname"/>

                            </div>

                            <div class="form-group">
                                <label class="control-label">
                                    Descripcion<span class="symbol "></span>
                                </label>
                                <form:input path="descripcion" type="text" placeholder="Ingrese la descripcion" class="form-control" id="lastname" name="lastname"/>
                            </div>





                        </div>
                        <div class="col-md-6">


                        </div>
                    </div>
                    <div class="row no-display">
                        <div class="col-md-12">
                            <div>
                                <span class="symbol required"></span>Required Fields
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

<!-- end: PAGE CONTENT-->
<%@include file="footer.jsp" %>	

<script>
    $(document).ready(function () {


        $('#dropdown').select2();


    });
</script>