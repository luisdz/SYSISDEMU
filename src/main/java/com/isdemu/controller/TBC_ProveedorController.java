/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

import com.isdemu.model.TbcPoliza;
import com.isdemu.model.TbcProveedor;
import com.isdemu.service.TBC_Proveedor_Service;
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
 @RequestMapping(value="/Proveedor")
public class TBC_ProveedorController {
    
     @Autowired
	private TBC_Proveedor_Service tbcProveedorService;
     
     
     //*************Insertar**************
        @RequestMapping(value="/insertarProveedor", method=RequestMethod.GET)
	public ModelAndView addProveedor() {
              System.out.println("esntra aqui GET proveedor");
		//ModelAndView modelAndView = new ModelAndView("inventario");
               Map<String, Object> myModel = new HashMap<String, Object>();		
               
                 myModel.put("proveedor", new TbcProveedor());               
                
		return new ModelAndView("proveedor",myModel);
	}
        
        
        @RequestMapping(value="/insertarProveedor", method=RequestMethod.POST)
	public ModelAndView addingProveedor(@ModelAttribute TbcProveedor proveedor) {
		ModelAndView modelAndView = new ModelAndView("home");
		 System.out.println("entra aqui POST poliza"+proveedor);


    
		tbcProveedorService.save(proveedor);
		String message = "proveedr was successfully added.";
		modelAndView.addObject("message", message);
		return addProveedor();
	}
        
        @RequestMapping(value="/consultarProveedor")
	public ModelAndView consultarProveedor() 
        {
		ModelAndView modelAndView = new ModelAndView("consultar_proveedor");

		List proveedor = tbcProveedorService.getAll();
		modelAndView.addObject("proveedor", proveedor);

		return modelAndView;
	}
        
        @RequestMapping(value="/editProveedor/{id}", method=RequestMethod.GET)
	public ModelAndView editProveedorPage(@PathVariable Integer id) {
		 
		TbcProveedor proveedor = (TbcProveedor) tbcProveedorService.findByKey(id);
                  
                  Map<String, Object> myModel = new HashMap<String, Object>();
                  
                   myModel.put("proveedor",proveedor );  
		return new ModelAndView("actualizar_proveedor",myModel);
	}

	@RequestMapping(value="/editProveedor/{id}", method=RequestMethod.POST)
	public ModelAndView edditingProveedor(@ModelAttribute TbcProveedor proveedor, @PathVariable Integer id) {
            
		TbcProveedor proveedorActual = (TbcProveedor) tbcProveedorService.findByKey(id);
		ModelAndView modelAndView = new ModelAndView("home");
                
                proveedorActual.setNombreProveedor(proveedor.getNombreProveedor());
                proveedorActual.setDireccion(proveedor.getDireccion());
                proveedorActual.setTelefono(proveedor.getTelefono());  
		tbcProveedorService.update(proveedorActual); 
		String message = "poliza was successfully edited.";
		modelAndView.addObject("message", message); 
		return modelAndView;
	}
        
        @RequestMapping(value="/deleteProveedor/{id}", method=RequestMethod.GET)
	public ModelAndView deleteProveed(@PathVariable Integer id) 
        {
		ModelAndView modelAndView = new ModelAndView("home");
		tbcProveedorService.delete(id);
		String message = "proveedor was successfully deleted.";
		modelAndView.addObject("message", message);
		return consultarProveedor();
	}
    
}
