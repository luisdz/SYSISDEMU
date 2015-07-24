/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

import com.isdemu.model.TbInventario;
import com.isdemu.model.TbcClasificacionActivo;
import com.isdemu.model.TbcPersona;
import com.isdemu.model.TbcPoliza;
import com.isdemu.model.TbcRegion;
import com.isdemu.service.TBC_Poliza_Service;
import com.isdemu.service.TBC_Unidad_Service;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author AlejandroPC
 */


@Controller 
 @RequestMapping(value="/Poliza")
public class TBC_PolizaController {
    
    @Autowired
	private TBC_Poliza_Service tbPolizaService;
    //************consultar*********************
    @RequestMapping(value="/consultarPoli")
	public ModelAndView consultarPolizas() 
        {
		ModelAndView modelAndView = new ModelAndView("consultar_poliza");

		List poliza = tbPolizaService.getAll();
		modelAndView.addObject("poliza", poliza);

		return modelAndView;
	}
        
        
     //*************Insertar**************
        @RequestMapping(value="/insertarPoliza", method=RequestMethod.POST)
	public ModelAndView addingPais(@ModelAttribute TbInventario inventario) {
		ModelAndView modelAndView = new ModelAndView("home");
		 System.out.println("esntra aquiPOSTTTT"+inventario);

               
            TbcClasificacionActivo activo= new TbcClasificacionActivo();
               activo.setIdClasificacionActivo(1);
            inventario.setTbcClasificacionActivo(activo);


            TbcPersona pers= new TbcPersona();
               pers.setIdPersona(1);

            inventario.setTbcPersona(pers);



            TbcPoliza poli= new TbcPoliza();
               poli.setIdPoliza(1);
            inventario.setTbcPoliza(poli);


            TbcRegion reg= new TbcRegion();
               reg.setIdRegion(1);
            inventario.setTbcRegion(reg);


               inventario.setClaseEquipo("asd");
                inventario.setCodigoInventario("1321");
                 inventario.setValorLibro(BigDecimal.ZERO);
                  inventario.setFechaAdquisicion(new Date());
                 inventario.setValor(BigDecimal.ZERO);
                  inventario.setLocalizacion("local");
                   inventario.setValorLibro(BigDecimal.ZERO);
          
                System.out.println("LO QUE VA EN EL OBJETO INVENTARIO e VALOR;"+inventario.getValor());
               
		tbPolizaService.save(inventario);
		String message = "Pais was successfully added.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
        
        
    
}