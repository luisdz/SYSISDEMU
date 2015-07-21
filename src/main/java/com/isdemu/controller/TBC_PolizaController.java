/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

import com.isdemu.service.TBC_Poliza_Service;
import com.isdemu.service.TBC_Unidad_Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
    
    @RequestMapping(value="/consultarPoli")
	public ModelAndView consultarPolizas() {
		ModelAndView modelAndView = new ModelAndView("consultar_poliza");

		List poliza = tbPolizaService.getAll();
		modelAndView.addObject("poliza", poliza);

		return modelAndView;
	}   
    
}