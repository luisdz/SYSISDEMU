/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

import com.isdemu.model.TbInventario;
import com.isdemu.model.TbMovimiento;
import com.isdemu.service.TB_Inventario_Service;
import com.isdemu.service.TB_Movimiento_Service;
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
 @RequestMapping(value="/Movimiento")
public class TB_MovimientoController {
    
    @Autowired
	private TB_Movimiento_Service tbMovimientoService;
    @Autowired
       private TB_Inventario_Service tbInventarioService;
    
    @RequestMapping(value="/consultarMov")
	public ModelAndView consultarMovimientos() {
		ModelAndView modelAndView = new ModelAndView("consultar_movimiento");

		List movimiento = tbMovimientoService.getAll();
		modelAndView.addObject("movimiento", movimiento);

		return modelAndView;
	}
        
        
        
         @RequestMapping(value="/insertarMovimiento", method=RequestMethod.GET)
	public ModelAndView addMovimiento() {
              System.out.println("esntra aqui GETT movimiento");
		//ModelAndView modelAndView = new ModelAndView("inventario");
               Map<String, Object> myModel = new HashMap<String, Object>();
		
                 
                 List Invent = tbInventarioService.getAll();
                
                  
                 myModel.put("movimiento", new TbMovimiento());
                
                 myModel.put("inventario",Invent );
                  
               
                
		return new ModelAndView("movimiento",myModel);
	}
        
        
        @RequestMapping(value="/insertarMovimiento", method=RequestMethod.POST)
	public ModelAndView addingMovimiento(@ModelAttribute TbMovimiento movi) {
		ModelAndView modelAndView = new ModelAndView("home");
		 System.out.println("esntra aquiPOST movimiento"+movi);


               movi.setFechaMovimiento(new Date());
                movi.setNMovimiento(2);
                 movi.setRazonCambio("asdfasf");
                  
                
              
            
		tbMovimientoService.save(movi);
		String message = "Movimiento was successfully added.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
        
         @RequestMapping(value="/deleteMovimiento/{id}", method=RequestMethod.GET)
	public ModelAndView deleteMov(@PathVariable Integer id) 
        {
		ModelAndView modelAndView = new ModelAndView("home");
		tbMovimientoService.delete(id);
		String message = "movimiento was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
        
        
    
}
