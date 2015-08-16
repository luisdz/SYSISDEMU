/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

import com.isdemu.model.TbcClasificacionLocalizacion;
import com.isdemu.service.TBC_ClasificacionLocalizacion_Service;
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
 @RequestMapping(value="/ClasificacionLocal")
public class TBC_ClasificacionLocalController 
{
     @Autowired
	private TBC_ClasificacionLocalizacion_Service tbcClasLocalService;
     @RequestMapping(value="/insertarClasLocal", method=RequestMethod.GET)
	public ModelAndView addClasLocal() 
        {
              System.out.println("esntra aqui GET claslocal");
		//ModelAndView modelAndView = new ModelAndView("inventario");
               Map<String, Object> myModel = new HashMap<String, Object>();		
               
                 myModel.put("claslocal", new TbcClasificacionLocalizacion());               
                
		return new ModelAndView("clasificacion_localizacion",myModel);
	}
        
        
        @RequestMapping(value="/insertarClasLocal", method=RequestMethod.POST)
	public ModelAndView addingClasLocal(@ModelAttribute TbcClasificacionLocalizacion claslocal) {
		ModelAndView modelAndView = new ModelAndView("home");
		 System.out.println("entra aqui POST poliza"+claslocal);


    
		tbcClasLocalService.save(claslocal);
		String message = "proveedr was successfully added.";
		modelAndView.addObject("message", message);
		return addClasLocal();
	}
        
        //************consultar*********************
    @RequestMapping(value="/consultarClasLocal")
	public ModelAndView consultarClasLocals() 
        {
		ModelAndView modelAndView = new ModelAndView("consultar_clasificacion_localizacion");

		List claslocal = tbcClasLocalService.getAll();
		modelAndView.addObject("claslocal", claslocal);

		return modelAndView;
	}
        
        @RequestMapping(value="/deleteClasLocal/{id}", method=RequestMethod.GET)
	public ModelAndView deleteClasLocals(@PathVariable Integer id) 
        {
		ModelAndView modelAndView = new ModelAndView("home");
		tbcClasLocalService.delete(id);
		String message = "claslocal was successfully deleted.";
		modelAndView.addObject("message", message);
		return consultarClasLocals();
	}
        
        
        @RequestMapping(value="/editClasLocal/{id}", method=RequestMethod.GET)
	public ModelAndView editClasLocalPage(@PathVariable Integer id) {
		 
		TbcClasificacionLocalizacion claslocal = (TbcClasificacionLocalizacion) tbcClasLocalService.findByKey(id);
                  
                  Map<String, Object> myModel = new HashMap<String, Object>();
                  
                   myModel.put("claslocal",claslocal );  
		return new ModelAndView("actualizar_clasificacion_localizacion",myModel);
	}

	@RequestMapping(value="/editClasLocal/{id}", method=RequestMethod.POST)
	public ModelAndView edditingClasLocal(@ModelAttribute TbcClasificacionLocalizacion claslocal, @PathVariable Integer id) {
            
		TbcClasificacionLocalizacion claslocalActual = (TbcClasificacionLocalizacion) tbcClasLocalService.findByKey(id);
		ModelAndView modelAndView = new ModelAndView("home");
                
                claslocalActual.setNombreClasificacion(claslocal.getNombreClasificacion());  
		tbcClasLocalService.update(claslocalActual); 
		String message = "poliza was successfully edited.";
		modelAndView.addObject("message", message); 
		return consultarClasLocals();
	}
    
}
