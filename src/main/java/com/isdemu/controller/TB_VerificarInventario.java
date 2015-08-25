/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

import com.isdemu.model.TbInventario;
import com.isdemu.service.TBC_ClasificacionLocalizacion_Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Jose Eduardo
 */
@Controller 
 @RequestMapping(value="/VerificarInventario")
public class TB_VerificarInventario {
     @Autowired
        private TBC_ClasificacionLocalizacion_Service tbcClasificacionLocalizacionService;
     
        @RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView VInventario() {
             
		//ModelAndView modelAndView = new ModelAndView("inventario");
                 Map<String, Object> myModel = new HashMap<String, Object>();
		List clasiLocalizacion=tbcClasificacionLocalizacionService.getAll();
                 myModel.put("verificarInventario", new TbInventario());
                 myModel.put("clasiLocalizacion",clasiLocalizacion);
                 
                
		return new ModelAndView("verificarInventario",myModel);
	}
}
