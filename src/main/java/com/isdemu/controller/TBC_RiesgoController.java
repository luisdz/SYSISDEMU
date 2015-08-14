/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

import com.isdemu.model.TbcProveedor;
import com.isdemu.model.TbcRiesgo;
import com.isdemu.service.TBC_Riesgo_Service;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Luis
 */
@Controller 
 @RequestMapping(value="/Riesgo")
public class TBC_RiesgoController {
    
    @Autowired
	private TBC_Riesgo_Service tbcRiesgoService;
    
    @RequestMapping(value="/insertarRiesgo", method=RequestMethod.GET)
	public ModelAndView addProveedor() 
        {
              System.out.println("esntra aqui GET riesgo");
		//ModelAndView modelAndView = new ModelAndView("inventario");
               Map<String, Object> myModel = new HashMap<String, Object>();		
               
                 myModel.put("riesgo", new TbcRiesgo());               
                
		return new ModelAndView("riesgo",myModel);
	}
        
        
        @RequestMapping(value="/insertarRiesgo", method=RequestMethod.POST)
	public ModelAndView addingRiesgo(@ModelAttribute TbcRiesgo riesgo) {
		ModelAndView modelAndView = new ModelAndView("home");
		 System.out.println("entra aqui POST poliza"+riesgo);


    
		tbcRiesgoService.save(riesgo);
		String message = "proveedr was successfully added.";
		modelAndView.addObject("message", message);
		return addProveedor();
	}
    
}
