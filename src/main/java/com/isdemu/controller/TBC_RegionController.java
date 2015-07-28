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
 * @author Miranda
 */
@Controller 
 @RequestMapping(value="/Region")
public class TBC_RegionController {
       
     @Autowired
	private TB_Inventario_Service tbInventarioService;
    @Autowired
        private TBC_Poliza_Service tbPolizaService;
    
    @Autowired
        private TBC_ClasificacionActivo_Service tbClasActService;
    
     @Autowired
        private TBC_Persona_Service tbcPersonaService;
     
      @Autowired
        private TBC_Region_Service tbcRegionService;
      
    @Autowired
      private TBC_Unidad_Service tbcUnidadService;
      
    @RequestMapping(value="/list")
       public ModelAndView listOfPaises() {
               ModelAndView modelAndView = new ModelAndView("consultar_regiones");

               List region = tbcRegionService.getAll();
               modelAndView.addObject("region", region);
                System.out.println("region list");
               return modelAndView;
       }
       
          @RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addPaisPage() {
              System.out.println("esntra aqui GET persona");
		//ModelAndView modelAndView = new ModelAndView("inventario");
               Map<String, Object> myModel = new HashMap<String, Object>();
		
                 
                 //List ClasAct = tbClasActService.getAll();
                /// List poliza = tbPolizaService.getAll();
                 //List region=tbcRegionService.getAll();
                 myModel.put("region", new TbcRegion());
                // myModel.put("poliza",poliza );
                // myModel.put("clasificacionA",ClasAct );
                // myModel.put("persona",persona);
                // myModel.put("region",region);
                System.out.println("esntra aqui GET persona");
		return new ModelAndView("region",myModel);
	}      
        
        @RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addingPais(@ModelAttribute TbcRegion region) {
		ModelAndView modelAndView = new ModelAndView("home");
		 System.out.println("entra aqui POST persona"+region);
                 
                tbcRegionService.save(region);
		String message = "Persona was successfully added.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
        
       
    @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
     public ModelAndView deletePais(@PathVariable Integer id) {
         System.out.println(id);
             ModelAndView modelAndView = new ModelAndView("home");
             tbcRegionService.delete(id);
             System.out.println("delete list");
             String message = "Pais was successfully deleted.";
             modelAndView.addObject("message", message);
             return modelAndView;
     }
        
    
}
