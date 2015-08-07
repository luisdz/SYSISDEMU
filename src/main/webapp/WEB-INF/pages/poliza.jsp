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
                <h2><i class="fa fa-pencil-square"></i> INVENTARIO</h2>
                <p>
                    Esta es la seccion de Ingreso de Activos Fijos
                </p>
                <hr>





                <!--                    <form action="#" role="form" id="form">-->
                <form:form method="POST" action="${pageContext.request.contextPath}/Poliza/insertarPoliza" onsubmit="return valida_envio(event);" modelAttribute="poliza" id="polizaF"  >

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
                                    Nombre<span id="span_nombre" class="symbol "></span>
                                </label>
                                <!--                                                <input type="text" placeholder="Nombre" class="form-control" id="nombre" name="firstname">-->
                                <form:input path="nombrePoliza" type="text" placeholder="Ingrese el nombre de la poliza" class="form-control" id="nombre" name="nombre" onblur="return validaNombre(event);"/>
                                <span for="nombre" class="help-block  no-display" id="span_nombreT">Ingrese un nombre</span>    
                            </div>
                            <div class="form-group">
                                <label class="control-label">
                                    Codigo<span class="symbol"></span>
                                </label>
                                <!--                                                <input type="text" placeholder="Codigo" class="form-control" id="codigo" name="firstname">-->
                                <form:input path="codigoPoliza" type="text" placeholder="Ingrese el codigo de la poliza" class="form-control" id="codigo" name="codigo" onblur="return validaCodigo(event);"/>
                                <span for="codigo" class="help-block  no-display" id="span_codigoT">Ingrese un codigo</span>    
                            
                            </div>



                            <div class="form-group">
                                <p>
                                    Fecha Inicio
                                </p>
                                <div class="input-group">
                                    <form:input path="fechaInicio" type="text" data-date-format="dd-mm-yyyy" data-date-viewmode="years" class="form-control date-picker" id="fechaInicio" onblur="return validaFechaIni(event);"/>
                                    <span class="input-group-addon"> <i class="fa fa-calendar"></i> </span>
                                    <span for="fechaInicio" class="help-block  no-display" id="span_fechaIniT">Ingrese una fecha</span>    
                            
                            
                                </div>
                            </div>

                            <div class="form-group">
                                <p>
                                    Fecha Fin
                                </p>
                                <div class="input-group">
                                    <form:input path="fechaFin" type="text" data-date-format="dd-mm-yyyy" data-date-viewmode="years" id="fechaFin" class="form-control date-picker" onchange="return validaFechaFn(event);" onblur="return validaFechaFn(event);"/>
                                    <span class="input-group-addon"> <i class="fa fa-calendar"></i> </span>
                                    <span for="fechaFin" class="help-block  no-display" id="span_fechaFnT">Ingrese una fecha</span>    
                            
                                </div>
                            </div>

                        </div>
                        <div class="col-md-6">


                        </div>
                        <div class="row">

                            <div class="col-md-4">
                                <button class="btn btn-yellow btn-block" type="submit">
                                    Guardar Activo <i class="fa fa-arrow-circle-right"></i>
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

<script>
    function validaNombre()
    {
        var x = document.forms["polizaF"]["nombre"].value;
        if (x === null || x === "")
        {
            //$('#span_nombre').addClass("symbol required");
            $('#span_nombreT').removeClass("no-display");            
            $('#span_nombreT').closest("div").addClass("has-error");            
             $('#span_nombreT').closest("div").removeClass("has-success");
             
            return false;
        }
        else
        {
            //$('#span_nombre').to("required");
            $('#span_nombreT').addClass("no-display");
             $('#span_nombreT').closest("div").removeClass("has-error");
             $('#span_nombreT').closest("div").addClass("has-success");
        }

    };
    
    function validaCodigo()
    {
        var x = document.forms["polizaF"]["nombre"].value;
        if (x === null || x === "")
        {
            //$('#span_nombre').addClass("symbol required");
            $('#span_codigoT').removeClass("no-display");            
            $('#span_codigoT').closest("div").addClass("has-error");            
             $('#span_codigoT').closest("div").removeClass("has-success");

            return false;
        }
        else
        {
            //$('#span_nombre').to("required");
            $('#span_codigoT').addClass("no-display");
             $('#span_codigoT').closest("div").removeClass("has-error");
             $('#span_codigoT').closest("div").addClass("has-success");
        }

    };
function validaFechaIni()
    {
        var x = document.forms["polizaF"]["fechaInicio"].value;
        if (x === null || x === "")
        {
            //$('#span_nombre').addClass("symbol required");
            $('#span_fechaIniT').removeClass("no-display");            
            $('#span_fechaIniT').closest("div").addClass("has-error");            
             $('#span_fechaIniT').closest("div").removeClass("has-success");

            return false;
        }
        else
        {
            //$('#span_nombre').to("required");
            $('#span_fechaIniT').addClass("no-display");
             $('#span_fechaIniT').closest("div").removeClass("has-error");
             $('#span_fechaIniT').closest("div").addClass("has-success");
        }

    };

function validaFechaFn()
    {
        var x = document.forms["polizaF"]["fechaFin"].value;
        if (x === null || x === "")
        {
            //$('#span_nombre').addClass("symbol required");
            $('#span_fechaFnT').removeClass("no-display");            
            $('#span_fechaFnT').closest("div").addClass("has-error");            
             $('#span_fechaFnT').closest("div").removeClass("has-success");

            return false;
        }
        else
        {
            //$('#span_nombre').to("required");
            $('#span_fechaFnT').addClass("no-display");
             $('#span_fechaFnT').closest("div").removeClass("has-error");
             $('#span_fechaFnT').closest("div").addClass("has-success");
        }

    };


   var  flag=true;

    function valida_envio()
    {
        
        
        if(validaNombre()===false)
        {        
            $('#mensajeErrorForm').removeClass("no-display");
            flag = false;
        }
        if(validaCodigo()===false)
        {
         $('#mensajeErrorForm').removeClass("no-display");
             flag =  false;
        }
        
        if(validaFechaIni()===false)
        {
         $('#mensajeErrorForm').removeClass("no-display");
             flag =  false;
        }
        
        if(validaFechaFn()===false)
        {
         $('#mensajeErrorForm').removeClass("no-display");
             flag =  false;
        }
       return flag;
    };


    $(window).click(function ()
    {
         $('#mensajeErrorForm').addClass("no-display");       
    });
     
    



    $(document).ready(function ()
    {        
        console.log("ready!");
    });


</script>

