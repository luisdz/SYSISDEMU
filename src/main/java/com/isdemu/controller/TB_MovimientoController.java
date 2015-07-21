/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

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
 @RequestMapping(value="/Movimiento")
public class TB_MovimientoController {
    
    @Autowired
	private TB_Movimiento_Service tbMovimientoService;
    
    @RequestMapping(value="/consultarMov")
	public ModelAndView consultarMovimientos() {
		ModelAndView modelAndView = new ModelAndView("consultar_movimiento");

		List movimiento = tbMovimientoService.getAll();
		modelAndView.addObject("movimiento", movimiento);

		return modelAndView;
	}   
    
}
