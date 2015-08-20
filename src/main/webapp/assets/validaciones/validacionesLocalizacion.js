/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validaRiesgo()
    {
       
        var x = document.forms["localizacionF"]["dropdown"].value;
        if (x === null || x === "" || x === "0")
        {
             
            $('#span_dropdownT').removeClass("no-display");            
            $('#span_dropdownT').closest("div").addClass("has-error");            
             $('#span_dropdownT').closest("div").removeClass("has-success");
            
            return false;
        }
        else
        {
         
            $('#span_dropdownT').addClass("no-display");
             $('#span_dropdownT').closest("div").removeClass("has-error");
             $('#span_dropdownT').closest("div").addClass("has-success");
        }

    };
    
    
    function validaClasificacion()
    {
       
        var x = document.forms["localizacionF"]["dropdown1"].value;
        if (x === null || x === "" || x === "0")
        {
             
            $('#span_dropdown1T').removeClass("no-display");            
            $('#span_dropdown1T').closest("div").addClass("has-error");            
            $('#span_dropdown1T').closest("div").removeClass("has-success");
            
            return false;
        }
        else
        {
         
            $('#span_dropdown1T').addClass("no-display");
            $('#span_dropdown1T').closest("div").removeClass("has-error");
            $('#span_dropdown1T').closest("div").addClass("has-success");
        }

    };
    
    function validaLocalizacion()
    {
        var x = document.forms["localizacionF"]["localizacion"].value;
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
       
 //Envio descargo     
 var  flag=true;

    function valida_envio()
    {
         
        flag=true;        
        
        
        if(validaRiesgo()===false)
        {        
            $('#mensajeErrorForm').removeClass("no-display");
            flag = false;
        }
        if(validaClasificacion()===false)
        {        
            $('#mensajeErrorForm').removeClass("no-display");
            flag = false;
        }
        if(validaLocalizacion()===false)
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



