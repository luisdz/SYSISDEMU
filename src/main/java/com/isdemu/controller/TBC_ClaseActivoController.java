/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

import com.isdemu.model.TbcClaseActivo;
import com.isdemu.model.TbcClasificacionActivo;
import com.isdemu.service.TBC_ClaseActivo_Service;
import com.isdemu.service.TBC_ClasificacionActivo_Service;
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
 * @author Jose Eduardo
 */
@Controller 
 @RequestMapping(value="/ClaseActivo")
public class TBC_ClaseActivoController {
    
    //DECLARACION DE VARIABLES
     @Autowired
      private TBC_ClasificacionActivo_Service tbcClasificacionAService;
     
     @Autowired
      private TBC_ClaseActivo_Service tbcClaseAService;
     
      @RequestMapping(value="/insertarClase", method=RequestMethod.GET)
      public ModelAndView IngresarClase() {
        
            Map<String, Object> myModel = new HashMap<String, Object>();
            List ClasificacionAct = tbcClasificacionAService.getAll();
            myModel.put("claseA", new TbcClaseActivo());
            myModel.put("clasificacionA",ClasificacionAct );
        
              return new ModelAndView("clase_activo",myModel);
        }
      
      
      @RequestMapping(value="/insertarClase", method=RequestMethod.POST)
      public ModelAndView IngresandoClase(@ModelAttribute TbcClaseActivo ClaseActivo) {
        
            ModelAndView modelAndView = new ModelAndView("home");
            
            tbcClaseAService.save(ClaseActivo);
        
              return  modelAndView;
        }
      
      
      
    @RequestMapping(value="/listaClase")
	public ModelAndView ConsultarClase() {
        
            ModelAndView modelAndView = new ModelAndView("consultar_claseactivo");
            List ClasesActivos =tbcClaseAService.getAll();
            modelAndView.addObject("claseA", ClasesActivos);
        
            return modelAndView;
        }
        
        
    @RequestMapping(value="/eliminarClase/{id}", method=RequestMethod.GET)
	public ModelAndView eliminarClase(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("home");
		tbcClaseAService.delete(id);
		String message = "Pais was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
        
        
    @RequestMapping(value="/actualizar/{id}", method=RequestMethod.GET)
	public ModelAndView editPaisPage(@PathVariable Integer id) {
		
                TbcClaseActivo claseactivo = (TbcClaseActivo) tbcClaseAService.findByKey(id);

                 Map<String, Object> myModel = new HashMap<String, Object>();
                 List ClasAct = tbcClasificacionAService.getAll();  
                 myModel.put("claseA",claseactivo ); 
                 myModel.put("AllclasificacionA",ClasAct );
                 return new ModelAndView("actualizar_claseactivo",myModel);
	}
        
        
    @RequestMapping(value="/actualizar/{id}", method=RequestMethod.POST)
	public ModelAndView edditingPais(@ModelAttribute TbcClaseActivo claseA, @PathVariable Integer id) {
		 TbcClaseActivo claseactivoActual = (TbcClaseActivo) tbcClaseAService.findByKey(id);
		ModelAndView modelAndView = new ModelAndView("home");
                claseactivoActual.setNombreClase(claseA.getNombreClase());
                claseactivoActual.setCodigoClase(claseA.getCodigoClase());
                claseactivoActual.setTbcClasificacionActivo(claseA.getTbcClasificacionActivo());
		tbcClaseAService.update(claseactivoActual);
                String message = "Pais was successfully edited.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}
  }