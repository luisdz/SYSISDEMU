/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validaUnidad()
    {
       
        var x = document.forms["personaF"]["dropdown"].value;
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
    
    function validaNombrePersona()
    {
        var x = document.forms["personaF"]["nombre"].value;
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
function validaJefe()
    {
        var x = document.forms["personaF"]["jefe"].value;
        if (x === null || x === "")
        {
            //$('#span_nombre').addClass("symbol required");
            $('#span_jefeT').removeClass("no-display");            
            $('#span_jefeT').closest("div").addClass("has-error");            
             $('#span_jefeT').closest("div").removeClass("has-success");

            return false;
        }
        else
        {
            //$('#span_nombre').to("required");
            $('#span_jefeT').addClass("no-display");
             $('#span_jefeT').closest("div").removeClass("has-error");
             $('#span_jefeT').closest("div").addClass("has-success");
        }

    };

function validaEncargado()
    {
        var x = document.forms["personaF"]["encargado"].value;
        if (x === null || x === "")
        {
            //$('#span_nombre').addClass("symbol required");
            $('#span_encargadoT').removeClass("no-display");            
            $('#span_encargadoT').closest("div").addClass("has-error");            
             $('#span_encargadoT').closest("div").removeClass("has-success");

            return false;
        }
        else
        {
            //$('#span_nombre').to("required");
            $('#span_encargadoT').addClass("no-display");
             $('#span_encargadoT').closest("div").removeClass("has-error");
             $('#span_encargadoT').closest("div").addClass("has-success");
        }

    };
       
 //Envio descargo     
 var  flag=true;

    function valida_envio()
    {
         
        flag=true;        
        
        
        if(validaUnidad()===false)
        {        
            $('#mensajeErrorForm').removeClass("no-display");
            flag = false;
        }
        if(validaNombrePersona()===false)
        {        
            $('#mensajeErrorForm').removeClass("no-display");
            flag = false;
        } 
        if(validaJefe()===false)
        {        
            $('#mensajeErrorForm').removeClass("no-display");
            flag = false;
        } 
        if(validaEncargado()===false)
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



