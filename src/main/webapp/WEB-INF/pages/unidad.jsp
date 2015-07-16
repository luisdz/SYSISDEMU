<%-- 
    Document   : unidad
    Created on : 12-jul-2015, 11:43:54
    Author     : Luis diaz
--%>

<%@include file="header.jsp" %>
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
                    <form action="#" role="form" id="form">
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
                                                        Nombre<span class="symbol required"></span>
                                                </label>
                                                <input type="text" placeholder="Nombre" class="form-control" id="firstname" name="firstname">
                                        </div>
                                    
                                     <div class="form-group">
                                                <label class="control-label">
                                                        Descripcion<span class="symbol required"></span>
                                                </label>
                                                <input type="text" placeholder="Descripcion" class="form-control" id="firstname" name="firstname">
                                        </div>
                                       
                                       
                                         

                                         

                                        

                                        

                


                                       
                                        
                                        
                                </div>
                                <div class="col-md-6">
<!--                                        <div class="form-group connected-group">
                                                <label class="control-label">
                                                        Date of Birth <span class="symbol required"></span>
                                                </label>
                                                <div class="row">
                                                        <div class="col-md-3">
                                                                <select name="dd" id="dd" class="form-control" >
                                                                        <option value="">DD</option>
                                                                        <option value="01">1</option>
                                                                        <option value="02">2</option>
                                                                        <option value="03">3</option>
                                                                        <option value="04">4</option>
                                                                        <option value="05">5</option>
                                                                        <option value="06">6</option>
                                                                        <option value="07">7</option>
                                                                        <option value="08">8</option>
                                                                        <option value="09">9</option>
                                                                        <option value="10">10</option>
                                                                        <option value="11">11</option>
                                                                        <option value="12">12</option>
                                                                        <option value="13">13</option>
                                                                        <option value="14">14</option>
                                                                        <option value="15">15</option>
                                                                        <option value="16">16</option>
                                                                        <option value="17">17</option>
                                                                        <option value="18">18</option>
                                                                        <option value="19">19</option>
                                                                        <option value="20">20</option>
                                                                        <option value="21">21</option>
                                                                        <option value="22">22</option>
                                                                        <option value="23">23</option>
                                                                        <option value="24">24</option>
                                                                        <option value="25">25</option>
                                                                        <option value="26">26</option>
                                                                        <option value="27">27</option>
                                                                        <option value="28">28</option>
                                                                        <option value="29">29</option>
                                                                        <option value="30">30</option>
                                                                        <option value="31">31</option>
                                                                </select>
                                                        </div>
                                                        <div class="col-md-3">
                                                                <select name="mm" id="mm" class="form-control" >
                                                                        <option value="">MM</option>
                                                                        <option value="01">1</option>
                                                                        <option value="02">2</option>
                                                                        <option value="03">3</option>
                                                                        <option value="04">4</option>
                                                                        <option value="05">5</option>
                                                                        <option value="06">6</option>
                                                                        <option value="07">7</option>
                                                                        <option value="08">8</option>
                                                                        <option value="09">9</option>
                                                                        <option value="10">10</option>
                                                                        <option value="11">11</option>
                                                                        <option value="12">12</option>
                                                                </select>
                                                        </div>
                                                        <div class="col-md-3">
                                                                <input type="text" placeholder="YYYY" id="yyyy" name="yyyy" class="form-control">
                                                        </div>
                                                </div>
                                        </div>
                                        <div class="form-group">
                                                <label class="control-label">
                                                        Gender <span class="symbol required"></span>
                                                </label>
                                                <div>
                                                        <label class="radio-inline">
                                                                <input type="radio" class="grey" value="" name="gender" id="gender_female">
                                                                Female
                                                        </label>
                                                        <label class="radio-inline">
                                                                <input type="radio" class="grey" value="" name="gender"  id="gender_male">
                                                                Male
                                                        </label>
                                                </div>
                                        </div>
                                       -->
                                       
                                </div>
                        </div>
                        <div class="row">
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
                    </form>
                </div>
            </div>
            <!-- end: FORM VALIDATION 1 PANEL -->
        </div>
    </div>
						
						<!-- end: PAGE CONTENT-->
<%@include file="footer.jsp" %>		