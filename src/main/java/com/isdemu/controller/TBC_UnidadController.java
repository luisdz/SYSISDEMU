/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

import com.isdemu.model.TbInventario;
import com.isdemu.model.TbcPoliza;
import com.isdemu.model.TbcRegion;
import com.isdemu.model.TbcUnidad;
import com.isdemu.service.TBC_Region_Service;
import com.isdemu.service.TBC_Unidad_Service;
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
 @RequestMapping(value="/Unidad")
public class TBC_UnidadController {
    
    @Autowired
	private TBC_Unidad_Service tbUnidadService;
    
    @Autowired
	private TBC_Region_Service tbRegionService;
    
    @RequestMapping(value="/consultarUni")
	public ModelAndView consultarUnidades() 
        {
		ModelAndView modelAndView = new ModelAndView("consultar_unidad");

		List unidad = tbUnidadService.getAll();
		modelAndView.addObject("unidad", unidad);

		return modelAndView;
	}
        
//        
//        
        @RequestMapping(value="/insertarUnidad", method=RequestMethod.GET)
	public ModelAndView addUnidad() {
              System.out.println("esntra aqui GETT Unidad");
		//ModelAndView modelAndView = new ModelAndView("inventario");
               Map<String, Object> myModel = new HashMap<String, Object>();
		
                 
                 List regi = tbRegionService.getAll();
                
                                   
                   
                 myModel.put("unidad", new TbcUnidad());
                
                 myModel.put("region",regi ); 
               
                
		return new ModelAndView("unidad",myModel);
	}
        
        
        @RequestMapping(value="/insertarUnidad", method=RequestMethod.POST)
	public ModelAndView addingUnidad(@ModelAttribute TbcUnidad unidad) {
		ModelAndView modelAndView = new ModelAndView("home");
		 System.out.println("esntra aquiPOST unidad"+unidad);


     
		tbUnidadService.save(unidad);
		String message = "unidad was successfully added.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
        
         @RequestMapping(value="/deleteUnidad/{id}", method=RequestMethod.GET)
	public ModelAndView deleteUnidad(@PathVariable Integer id) 
        {
		ModelAndView modelAndView = new ModelAndView("home");
		tbUnidadService.delete(id);
		String message = "unidad was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
        
        
         @RequestMapping(value="/editUnidad/{id}", method=RequestMethod.GET)
	public ModelAndView editUnidadPage(@PathVariable Integer id) {
		//ModelAndView modelAndView = new ModelAndView("actualizar_inventario");
		TbcUnidad unidad = (TbcUnidad) tbUnidadService.findByKey(id);
               // TbcRegion activo = (TbcRegion) tbRegionService.findByKey(unidad.getTbcRegion().getIdRegion());
                 List regi = tbRegionService.getAll();
                  Map<String, Object> myModel = new HashMap<String, Object>();
                   //List ClasAct = tbClasActService.getAll();
                  myModel.put("region",regi);
                   myModel.put("unidad",unidad ); 
                 // myModel.put("clasificacionA",activo );
                  //myModel.put("AllclasificacionA",ClasAct );
                
                  
                   
                //System.out.println("A ver el combo:"+inventario.getTbcClasificacionActivo().getIdClasificacionActivo()+activo.getNombreClasificacion());
		//modelAndView.addObject("inventario",inventario);
		return new ModelAndView("actualizar_unidad",myModel);
	}

	@RequestMapping(value="/editUnidad/{id}", method=RequestMethod.POST)
	public ModelAndView edditingUnidad(@ModelAttribute TbcUnidad unidad, @PathVariable Integer id) {
            
		TbcUnidad unidadActual = (TbcUnidad) tbUnidadService.findByKey(id);
		ModelAndView modelAndView = new ModelAndView("home");
                
                unidadActual.setNombreUnidad(unidad.getNombreUnidad());
//                polizaActual.setFechaInicio(poliza.getFechaInicio());
//                polizaActual.setFechaFin(poliza.getFechaFin());
                unidadActual.setDescripcion(unidad.getDescripcion());
                
		                
		tbUnidadService.update(unidadActual);

		String message = "unidad was successfully edited.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}
        
    
}