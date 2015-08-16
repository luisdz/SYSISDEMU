/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
    function validaLocalizacion()
    {
       
        var x = document.forms["ubiacionF"]["dropdown"].value;
        if (x === null || x === "" || x === "0")
        {
             
            $('#span_localizacionT').removeClass("no-display");            
            $('#span_localizacionT').closest("div").addClass("has-error");            
            $('#span_localizacionT').closest("div").removeClass("has-success");
            
            return false;
        }
        else
        {
         
            $('#span_localizacionT').addClass("no-display");
            $('#span_localizacionT').closest("div").removeClass("has-error");
            $('#span_localizacionT').closest("div").addClass("has-success");
        }

    };
    
    function validaUbicacion()
    {
        var x = document.forms["ubiacionF"]["ubicacion"].value;
        if (x === null || x === "")
        {
            //$('#span_nombre').addClass("symbol required");
            $('#span_ubiacionT').removeClass("no-display");            
            $('#span_ubiacionT').closest("div").addClass("has-error");            
             $('#span_ubiacionT').closest("div").removeClass("has-success");

            return false;
        }
        else
        {
            //$('#span_nombre').to("required");
            $('#span_ubiacionT').addClass("no-display");
             $('#span_ubiacionT').closest("div").removeClass("has-error");
             $('#span_ubiacionT').closest("div").addClass("has-success");
        }

    };
       
 //Envio descargo     
 var  flag=true;

    function valida_envio()
    {
         
        flag=true;        
        
        if(validaLocalizacion()===false)
        {        
            $('#mensajeErrorForm').removeClass("no-display");
            flag = false;
        }
        if(validaUbicacion()===false)
        {        
            $('#mensajeErrorForm').removeClass("no-display");
            flag = false;
        } 
       
       return flag;
       
    };

    //Envio descargo


    $(window).click(function ()
    {
         $('#mensajeErrorForm').addClass("no-display");       
    });  
    



    $(document).ready(function ()
    {        
        console.log("ready!");
    });




