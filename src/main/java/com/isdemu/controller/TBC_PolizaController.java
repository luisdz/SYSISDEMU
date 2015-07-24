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
import com.isdemu.service.TBC_Poliza_Service;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author AlejandroPC
 */


@Controller 
 @RequestMapping(value="/Poliza")
public class TBC_PolizaController {
    
    @Autowired
	private TBC_Poliza_Service tbPolizaService;
    
    
    //************consultar*********************
    @RequestMapping(value="/consultarPoli")
	public ModelAndView consultarPolizas() 
        {
		ModelAndView modelAndView = new ModelAndView("consultar_poliza");

		List poliza = tbPolizaService.getAll();
		modelAndView.addObject("poliza", poliza);

		return modelAndView;
	}
        
        
     //*************Insertar**************
        @RequestMapping(value="/insertarPoliza", method=RequestMethod.GET)
	public ModelAndView addPoliza() {
              System.out.println("esntra aqui GET poliza");
		//ModelAndView modelAndView = new ModelAndView("inventario");
               Map<String, Object> myModel = new HashMap<String, Object>();
		
                 
                 //List ClasAct = tbClasActService.getAll();
                /// List poliza = tbPolizaService.getAll();
                 //List persona=tbcPersonaService.getAll();
                 //List region=tbcRegionService.getAll();
                 myModel.put("poliza", new TbcPoliza());
                // myModel.put("poliza",poliza );
                // myModel.put("clasificacionA",ClasAct );
                // myModel.put("persona",persona);
                // myModel.put("region",region);
                
		return new ModelAndView("poliza",myModel);
	}
        
        
        @RequestMapping(value="/insertarPoliza", method=RequestMethod.POST)
	public ModelAndView addingPoliza(@ModelAttribute TbcPoliza poliza) {
		ModelAndView modelAndView = new ModelAndView("home");
		 System.out.println("esntra aquiPOST poliza"+poliza);


                 poliza.setNombrePoliza("asd");
                 poliza.setFechaFin(new Date());
                 poliza.setFechaInicio(new Date());
                 poliza.setCodigoPoliza("1234");
//               inventario.setClaseEquipo("asd");
//                inventario.setCodigoInventario("1321");
//                 inventario.setValorLibro(BigDecimal.ZERO);
//                  inventario.setFechaAdquisicion(new Date());
//                 inventario.setValor(BigDecimal.ZERO);
//                  inventario.setLocalizacion("local");
//                   inventario.setValorLibro(BigDecimal.ZERO);
          
               // System.out.println("LO QUE VA EN EL OBJETO INVENTARIO e VALOR;"+inventario.getTbcClasificacionActivo().getIdClasificacionActivo()+"en fecha:"+inventario.getFechaAdquisicion());
               
		tbPolizaService.save(poliza);
		String message = "Poliza was successfully added.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
        
        
    
}