/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

 
import com.isdemu.model.TbcRiesgo;
import com.isdemu.service.TBC_Riesgo_Service;
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
 * @author Luis
 */
@Controller 
 @RequestMapping(value="/Riesgo")
public class TBC_RiesgoController {
    
    @Autowired
	private TBC_Riesgo_Service tbcRiesgoService;
    
    @RequestMapping(value="/insertarRiesgo", method=RequestMethod.GET)
	public ModelAndView addProveedor(String b) 
        {
              System.out.println("esntra aqui GET riesgo");
		//ModelAndView modelAndView = new ModelAndView("inventario");
               Map<String, Object> myModel = new HashMap<String, Object>();		
               
                 myModel.put("riesgo", new TbcRiesgo());                 
		String message = b;
                 myModel.put("message", message);                
		return new ModelAndView("riesgo",myModel);
	}
        
        
        @RequestMapping(value="/insertarRiesgo", method=RequestMethod.POST)
	public ModelAndView addingRiesgo(@ModelAttribute TbcRiesgo riesgo) {
		ModelAndView modelAndView = new ModelAndView("home");
		 System.out.println("entra aqui POST poliza"+riesgo);


    
		tbcRiesgoService.save(riesgo);
		String message = "proveedr was successfully added.";
		modelAndView.addObject("message", message);
		return addProveedor("1");
	}
        
        //************consultar*********************
    @RequestMapping(value="/consultarRiesgo")
	public ModelAndView consultarRiesgos() 
        {
		ModelAndView modelAndView = new ModelAndView("consultar_riesgo");

		List riesgo = tbcRiesgoService.getAll();
		modelAndView.addObject("riesgo", riesgo);

		return modelAndView;
	}
        
        @RequestMapping(value="/deleteRiesgo/{id}", method=RequestMethod.GET)
	public ModelAndView deleteRiesgos(@PathVariable Integer id) 
        {
		ModelAndView modelAndView = new ModelAndView("home");
		tbcRiesgoService.delete(id);
		String message = "riesgo was successfully deleted.";
		modelAndView.addObject("message", message);
		return consultarRiesgos();
	}
        
        
        @RequestMapping(value="/editRiesgo/{id}", method=RequestMethod.GET)
	public ModelAndView editRiesgoPage(@PathVariable Integer id) {
		 
		TbcRiesgo riesgo = (TbcRiesgo) tbcRiesgoService.findByKey(id);
                  
                  Map<String, Object> myModel = new HashMap<String, Object>();
                  
                   myModel.put("riesgo",riesgo );  
		return new ModelAndView("actualizar_riesgo",myModel);
	}

	@RequestMapping(value="/editRiesgo/{id}", method=RequestMethod.POST)
	public ModelAndView edditingRiesgo(@ModelAttribute TbcRiesgo riesgo, @PathVariable Integer id) {
            
		TbcRiesgo riesgoActual = (TbcRiesgo) tbcRiesgoService.findByKey(id);
		ModelAndView modelAndView = new ModelAndView("home");
                
                riesgoActual.setNombreRiesgo(riesgo.getNombreRiesgo());  
		tbcRiesgoService.update(riesgoActual); 
		String message = "poliza was successfully edited.";
		modelAndView.addObject("message", message); 
		return consultarRiesgos();
	}
    
}
