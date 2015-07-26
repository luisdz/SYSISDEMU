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
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
        @RequestMapping(value="/insertarPoliza", method=RequestMethod.GET)
	public ModelAndView addPoliza() {
              System.out.println("esntra aqui GET poliza");
		//ModelAndView modelAndView = new ModelAndView("inventario");
               Map<String, Object> myModel = new HashMap<String, Object>();
		
               
                 myModel.put("poliza", new TbcPoliza());
               
                
		return new ModelAndView("poliza",myModel);
	}
        
        
        @RequestMapping(value="/insertarPoliza", method=RequestMethod.POST)
	public ModelAndView addingPoliza(@ModelAttribute TbcPoliza poliza) {
		ModelAndView modelAndView = new ModelAndView("home");
		 System.out.println("entra aqui POST poliza"+poliza);


    
		tbPolizaService.save(poliza);
		String message = "Poliza was successfully added.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
        
        @RequestMapping(value="/deletePoliza/{id}", method=RequestMethod.GET)
	public ModelAndView deletePoliz(@PathVariable Integer id) 
        {
		ModelAndView modelAndView = new ModelAndView("home");
		tbPolizaService.delete(id);
		String message = "poliza was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
        
        
    
}