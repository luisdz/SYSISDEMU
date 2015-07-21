<%-- 
    Document   : Personal
    Created on : 14-jul-2015, 20:06:09
    Author     : Walter
--%>

<%@include file="header.jsp" %>

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
                    <form action="validar.jsp" role="form2" id="form2">
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
                                                        Nombre<span class="symbol required"></span>
                                                </label>
                                                <input type="text" placeholder="Nombre" class="form-control" id="firstname2" name="firstname2">
                                    </div>
                                    
                                     <div class="form-group">
                                                <label class="control-label">
                                                        Unidad<span class="symbol required"></span>
                                                </label>
                                         <select class="form-control" id="dropdown" name="dropdown">                                             
                                             <option value="">Select...</option>
                                             <option value="1">Unidad 1</option>
                                             <option value="2">Unidad 2</option>
                                         </select>
                                        </div>
                                        
                                        
                                </div>
                                <div class="col-md-6">
                                    
                                   <div class="form-group">
                                        <label class="control-label">
                                                Services <em>(select at least two)</em> <span class="symbol required"></span>
                                        </label>
                                        <div>
                                                <div class="checkbox">
                                                        <label>
                                                                <input type="checkbox" class="grey" value="" name="services" id="service1">
                                                                Service 1
                                                        </label>
                                                </div>
                                                <div class="checkbox">
                                                        <label>
                                                                <input type="checkbox" class="grey" value="" name="services"  id="service2">
                                                                Service 2
                                                        </label>
                                                </div>
                                                <div class="checkbox">
                                                        <label>
                                                                <input type="checkbox" class="grey" value="" name="services"  id="service3">
                                                                Service 3
                                                        </label>
                                                </div>
                                                <div class="checkbox">
                                                        <label>
                                                                <input type="checkbox" class="grey" value="" name="services"  id="service4">
                                                                Service 4
                                                        </label>
                                                </div>
                                        </div>
                                    </div>                                       
                                </div>
                        </div>
                        
                        <div class="row">
                                <div class="col-md-8">
                                        <p>
                                                By clicking REGISTER, you are agreeing to the Policy and Terms &amp; Conditions.
                                        </p>
                                </div>
                                <div class="col-md-4">
                                        <button class="btn btn-yellow btn-block" type="submit">
                                                Register <i class="fa fa-arrow-circle-right"></i>
                                        </button>
                                </div>
                        </div>
                   
                    </form>
                </div>
            </div>
            <!-- end: FORM VALIDATION 1 PANEL -->
        </div>
    </div>


<%@include file="footer.jsp" %>	