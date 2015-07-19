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
import com.isdemu.service.TB_Inventario_Service;
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
 * @author Jose Eduardo
 */

@Controller 
 @RequestMapping(value="/Inventario")
public class TB_InventarioController {
    
    @Autowired
	private TB_Inventario_Service tbInventarioService;
    
    @RequestMapping(value="/list")
	public ModelAndView listOfPaises() {
		ModelAndView modelAndView = new ModelAndView("consultar_inventario");

		List inventario = tbInventarioService.getAll();
		modelAndView.addObject("inventario", inventario);

		return modelAndView;
	}
        
        
        @RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addPaisPage() {
              System.out.println("esntra aqui GETTTT");
		ModelAndView modelAndView = new ModelAndView("inventario");
		modelAndView.addObject("inventario", new TbInventario());
		return modelAndView;
	}
        
        
        @RequestMapping(value="/add", method=RequestMethod.POST)
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
          
                System.out.println("LO QUE VA EN EL OBJETO INVENTARIO;"+inventario.getMarca()+inventario.getClaseEquipo()+inventario.getLocalizacion());
               
		tbInventarioService.save(inventario);
		String message = "Pais was successfully added.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
    
}
