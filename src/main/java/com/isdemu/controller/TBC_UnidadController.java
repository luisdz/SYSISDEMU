/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

import com.isdemu.service.TBC_Unidad_Service;
import com.isdemu.service.TB_Movimiento_Service;
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
 @RequestMapping(value="/Unidad")
public class TBC_UnidadController {
    
    @Autowired
	private TBC_Unidad_Service tbUnidadService;
    
    @RequestMapping(value="/consultarUni")
	public ModelAndView consultarMovimientos() {
		ModelAndView modelAndView = new ModelAndView("consultar_unidad");

		List unidad = tbUnidadService.getAll();
		modelAndView.addObject("unidad", unidad);

		return modelAndView;
	}   
    
}