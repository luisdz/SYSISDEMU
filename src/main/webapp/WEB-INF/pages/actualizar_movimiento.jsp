<%-- 
    Document   : actualizar_movimiento
    Created on : 01-ago-2015, 10:16:36
    Author     : AlejandroPC
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
                <h2><i class="fa fa-pencil-square"></i> Movimientos</h2>
                <p>
                    Esta es la seccion de Ingreso de Activos Fijos
                </p>
                <hr>


                <form:form method="POST" action="${pageContext.request.contextPath}/Movimiento/editMovimientoI/${movimiento.idMovimiento}" modelAttribute="movimiento" >

                      <div class="col-md-6">    
                    <div class="form-group">
                        <label class="control-label">
                            Fecha movimiento<span class="symbol "></span>
                        </label>
                        <form:input path="idMovimiento" type="text" placeholder="${movimiento.fechaMovimiento}" class="form-control" id="id" name="lastname"/>
                    </div>

                       
                    <div class="form-group">
                        <label class="control-label">
                            Razon de cambio<span class="symbol "></span>
                        </label>
                        <form:input path="razonCambio" type="text" placeholder="${movimiento.razonCambio}" class="form-control" id="lastname" name="lastname"/>
                    </div>
                    <div class="row">


                        <!--                                <div class="col-md-4">
                                                            <button class="btn btn-yellow btn-block" id="btnDetalle" type="button">
                                                                        Detalle inventario <i class="fa fa-arrow-circle-right"></i>
                                                                </button>
                                                        </div>-->

                    </div>
                      </div>
                        <div class="row">
                            <div class="col-md-12"> 
                                <div class="col-md-8">
                                </div>
                            <div class="col-md-4">
                                <button class="btn btn-yellow btn-block" type="submit">
                                    Actualizar <i class="fa fa-arrow-circle-right"></i>
                                </button>
                            </div>
                            </div>
                        </div>
                    </form:form>


                </div>
                <div class="table-responsive">
                    <table class="table table-striped table-hover" id="sample-table-2">
                        <thead>
                            <tr>
                                <th>id mov inv</th>
                                <th>ID movimiento</th>
                                <th>ID inventario</th>

                                <th>razon</th>
                                <th>marca</th>
                                <th>Delete</th>
                            </tr>
                        </thead>
                        <tbody id="tablabody" name="tablabody">

                            <c:forEach var="mov" items="${movimientoInv}">
                                <tr align="center">
                                    <td>${mov.idMovimientoInventario}</td>
                                    <td>${mov.tbMovimiento.idMovimiento}</td>
                                    <td>${mov.tbInventario.idInventario}</td>

                                    <td>${mov.tbMovimiento.razonCambio}</td>                                                    
                                    <td>${mov.tbInventario.marca}</td> 
                                    <td><a href=""> Eliminar</a></td>

                                </tr>
                            </c:forEach>	


                        </tbody>
                    </table>
                </div>


            </div>
        </div>
        <!-- end: FORM VALIDATION 1 PANEL -->
    </div>
</div>

<!-- end: PAGE CONTENT-->
<%@include file="footer.jsp" %>		


<script>
    $("#btnDetalle").click(function () {
        var conceptName = $("#id").val(); // define the variable
//var conceptName = 1;
        alert(conceptName);



        $.ajax({
            url: "${pageContext.request.contextPath}/Movimiento/detalleInventarios",
            type: 'POST',
            dataType: 'json',
            contentType: 'application/json',
            mimeType: 'application/json',
            data: "{id:" + conceptName + "}",
            success: function (data)
            {
                var html = '';
                var len = data.length;
//alert("devuelve algo"+data);
//                            $('#dropdown2').empty();
//                            data.forEach(function(entry) 
//                            {
//                                    console.log(entry);
//                                   // alert("foreach :"+entry.nombreClase );
//                                   html += '<option value="' + entry.idClaseActivo + '">' + entry.nombreClase + '</option>';
//                            });
//                            $('#dropdown2').append(html);
                alert("devuelve algo: " + data);

//var tblBody = document.createElement("tbody");

// Crea las celdas
                $('#tablabody').empty();
                data.forEach(function (entry)
                {
                    console.log(entry);
                    html = '';
                    html += "<tr>";
                    html += "<td>" + entry.idInventario + "</td>";
                    html += "<td>" + entry.marca + "</td>";
                    html += "<td>" + entry.modelo + "</td>";
                    html += "</tr>";


                    $('#tablabody').append(html);
//tblBody.appendChild(hilera);

                });

            },
            error: function (data, status, er)
            {
                alert("error: " + data + " status: " + status + " er:" + er);


            }
        });


    });
</script>