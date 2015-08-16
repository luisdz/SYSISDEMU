/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    
    function validaNombreEstado()
    {
        var x = document.forms["estadoF"]["nombre"].value;
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
    
    function validaDesc()
    {
        var x = document.forms["estadoF"]["desc"].value;
        if (x === null || x === "")
        {
            //$('#span_nombre').addClass("symbol required");
            $('#span_descT').removeClass("no-display");            
            $('#span_descT').closest("div").addClass("has-error");            
             $('#span_descT').closest("div").removeClass("has-success");

            return false;
        }
        else
        {
            //$('#span_nombre').to("required");
            $('#span_descT').addClass("no-display");
             $('#span_descT').closest("div").removeClass("has-error");
             $('#span_descT').closest("div").addClass("has-success");
        }

    };
       
 //Envio descargo     
 var  flag=true;

    function valida_envio()
    {
         
        flag=true;        
        
        if(validaNombreEstado()===false)
        {        
            $('#mensajeErrorForm').removeClass("no-display");
            flag = false;
        }
        if(validaDesc()===false)
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





