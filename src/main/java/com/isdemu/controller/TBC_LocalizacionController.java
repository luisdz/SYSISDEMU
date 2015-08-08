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
import com.isdemu.model.TbcUnidad;
import com.isdemu.model.TbcLocalizacion;
import com.isdemu.service.TBC_ClasificacionActivo_Service;
import com.isdemu.service.TBC_Localizacion_Service;
import com.isdemu.service.TBC_Persona_Service;
import com.isdemu.service.TBC_Poliza_Service;
import com.isdemu.service.TBC_Region_Service;
import com.isdemu.service.TBC_Unidad_Service;
import com.isdemu.service.TB_Inventario_Service;
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
 * @author Walter
 */
@Controller 
 @RequestMapping(value="/Localizacion")
public class TBC_LocalizacionController {
    
    
     @Autowired
        private TBC_Persona_Service tbcPersonaService;
     
      @Autowired
        private TBC_Region_Service tbcRegionService;
      
      @Autowired
        private TBC_Localizacion_Service tbcLocalizacionService;
      
    @Autowired
      private TBC_Unidad_Service tbcUnidadService;
      
     @RequestMapping(value="/list")
	public ModelAndView listOfPaises() {
		ModelAndView modelAndView = new ModelAndView("consultar_localizacion");

		List localizacion = tbcLocalizacionService.getAll();
		modelAndView.addObject("localizacion", localizacion);

		return modelAndView;
	}
                    
        @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deletePais(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("home");
		tbcLocalizacionService.delete(id);
		String message = "Pais was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
}
