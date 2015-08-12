/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 function validaTema()
    {
        
        var x = document.forms["prestamoE"]["tema"].value;
        if (x === null || x === "")
        {
             
            $('#span_nombreT').removeClass("no-display");            
            $('#span_nombreT').closest("div").addClass("has-error");            
             $('#span_nombreT').closest("div").removeClass("has-success");
             
            return false;
        }
        else
        {
            
            $('#span_nombreT').addClass("no-display");
             $('#span_nombreT').closest("div").removeClass("has-error");
             $('#span_nombreT').closest("div").addClass("has-success");
        }

    };
    
    function validaNumero()
    {
        var x = document.forms["prestamoE"]["numero"].value;
        if (x === null || x === "")
        {
             
            $('#span_numeroT').removeClass("no-display");            
            $('#span_numeroT').closest("div").addClass("has-error");            
             $('#span_numeroT').closest("div").removeClass("has-success");
             
            return false;
        }
        else
        {
            
            $('#span_numeroT').addClass("no-display");
             $('#span_numeroT').closest("div").removeClass("has-error");
             $('#span_numeroT').closest("div").addClass("has-success");
        }

    };
    
    function validaPersona()
    {
        var x = document.forms["prestamoE"]["persona"].value;
        if (x === null || x === "")
        {
             
            $('#span_personaT').removeClass("no-display");            
            $('#span_personaT').closest("div").addClass("has-error");            
             $('#span_personaT').closest("div").removeClass("has-success");
             
            return false;
        }
        else
        {
            
            $('#span_personaT').addClass("no-display");
             $('#span_personaT').closest("div").removeClass("has-error");
             $('#span_personaT').closest("div").addClass("has-success");
        }

    };
    
    function validaDestino()
    {
        var x = document.forms["prestamoE"]["destino"].value;
        if (x === null || x === "")
        {
             
            $('#span_destinoT').removeClass("no-display");            
            $('#span_destinoT').closest("div").addClass("has-error");            
             $('#span_destinoT').closest("div").removeClass("has-success");
             
            return false;
        }
        else
        {
            
            $('#span_destinoT').addClass("no-display");
             $('#span_destinoT').closest("div").removeClass("has-error");
             $('#span_destinoT').closest("div").addClass("has-success");
        }

    };
    
    function validaFechaSolicitud()
    {
        var x = document.forms["prestamoE"]["fecha_sol"].value;
        if (x === null || x === "")
        {
            //$('#span_nombre').addClass("symbol required");
            $('#span_fechaSol').removeClass("no-display");            
            $('#span_fechaSol').closest("div").addClass("has-error");            
             $('#span_fechaSol').closest("div").removeClass("has-success");

            return false;
        }
        else
        {
            //$('#span_nombre').to("required");
            $('#span_fechaSol').addClass("no-display");
             $('#span_fechaSol').closest("div").removeClass("has-error");
             $('#span_fechaSol').closest("div").addClass("has-success");
        }

    };
    
    function validaFechaReservacion()
    {
        var x = document.forms["prestamoE"]["fecha_pres"].value;
        if (x === null || x === "")
        {
            //$('#span_nombre').addClass("symbol required");
            $('#span_fechaRes').removeClass("no-display");            
            $('#span_fechaRes').closest("div").addClass("has-error");            
             $('#span_fechaRes').closest("div").removeClass("has-success");

            return false;
        }
        else
        {
            //$('#span_nombre').to("required");
            $('#span_fechaRes').addClass("no-display");
             $('#span_fechaRes').closest("div").removeClass("has-error");
             $('#span_fechaRes').closest("div").addClass("has-success");
        }

    };
      
 var  flag=true;

    function valida_envio()
    {
         
        flag=false;        
        
        
        if(validaTema()===false)
        {        
            $('#mensajeErrorForm').removeClass("no-display");
            flag = true;
        }
        
        if(validaNumero()===false)
        {        
            $('#mensajeErrorForm').removeClass("no-display");
            flag = true;
        }
        
        if(validaPersona()===false)
        {        
            $('#mensajeErrorForm').removeClass("no-display");
            flag = true;
        }
        
        if(validaDestino()===false)
        {        
            $('#mensajeErrorForm').removeClass("no-display");
            flag = true;
        }
        
        if(validaFechaSolicitud()===false)
        {        
            $('#mensajeErrorForm').removeClass("no-display");
            flag = true;
        }
        
        if(validaFechaReservacion()===false)
        {        
            $('#mensajeErrorForm').removeClass("no-display");
            flag = true;
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


