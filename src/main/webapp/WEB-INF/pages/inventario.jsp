<%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DGII_TEST - Agregar Nuevo Pais</title>
</head>
<body>
<h1>Agregar Nueva informaci&oacute;n de Pa&iacute;s</h1>
<form:form method="POST" action="${pageContext.request.contextPath}/Inventario/add" modelAttribute="inventario">

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
                                Clase de Equipo <span class="symbol required"></span>
                        </label>
                        <form:input path="claseEquipo" type="text" placeholder="Insert your Last Name" class="form-control" id="lastname" name="lastname"/>
            </div>

                <div class="form-group">
                        <label class="control-label">
                                Marca <span class="symbol required"></span>
                        </label>
                        <form:input path="marca" type="text" placeholder="Insert your Last Name" class="form-control" id="lastname" name="lastname"/>
                </div>
              





        </div>
        <div class="col-md-6">

              
            <div class="form-group">
                        <label class="control-label">
                                Descripcion<span class="symbol required"></span>
                        </label>
                        <form:input path="descripcion" type="text" placeholder="Insert your Last Name" class="form-control" id="lastname" name="lastname"/>
                </div>

           



        </div>
</div>

<input value="Guardar" type="submit">
</form:form>


</body>
</html>