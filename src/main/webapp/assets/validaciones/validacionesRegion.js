/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

  function validaNombre()
    {
       
        var x = document.forms["regionF"]["nombre"].value;
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
function validaDireccion()
    {
        var x = document.forms["regionF"]["direccion"].value;
        if (x === null || x === "")
        {
            //$('#span_nombre').addClass("symbol required");
            $('#span_direccionT').removeClass("no-display");            
            $('#span_direccionT').closest("div").addClass("has-error");            
             $('#span_direccionT').closest("div").removeClass("has-success");

            return false;
        }
        else
        {
            //$('#span_nombre').to("required");
            $('#span_direccionT').addClass("no-display");
             $('#span_direccionT').closest("div").removeClass("has-error");
             $('#span_direccionT').closest("div").addClass("has-success");
        }

    };

function validaDescripcion()
    {
        var x = document.forms["regionF"]["description"].value;
        if (x === null || x === "")
        {
            //$('#span_nombre').addClass("symbol required");
            $('#span_descripcionT').removeClass("no-display");            
            $('#span_descripcionT').closest("div").addClass("has-error");            
             $('#span_descripcionT').closest("div").removeClass("has-success");

            return false;
        }
        else
        {
            //$('#span_nombre').to("required");
            $('#span_descripcionT').addClass("no-display");
             $('#span_descripcionT').closest("div").removeClass("has-error");
             $('#span_descripcionT').closest("div").addClass("has-success");
        }

    };
       
 //Envio descargo     
 var  flag=true;

    function valida_envio()
    {
         
        flag=true;        
        
        if(validaNombre()===false)
        {        
            $('#mensajeErrorForm').removeClass("no-display");
            flag = false;
        } 
        if(validaDireccion()===false)
        {        
            $('#mensajeErrorForm').removeClass("no-display");
            flag = false;
        } 
        if(validaDescripcion()===false)
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
