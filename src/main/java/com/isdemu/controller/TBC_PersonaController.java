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
import com.isdemu.service.TBC_ClasificacionActivo_Service;
import com.isdemu.service.TBC_Persona_Service;
import com.isdemu.service.TBC_Poliza_Service;
import com.isdemu.service.TBC_Region_Service;
import com.isdemu.service.TB_Inventario_Service;
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
 * @author Walter
 */
@Controller 
 @RequestMapping(value="/Persona")
public class TBC_PersonaController {
    
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
      
     @RequestMapping(value="/list")
	public ModelAndView listOfPaises() {
		ModelAndView modelAndView = new ModelAndView("consultar_personal");

		List personal = tbcPersonaService.getAll();
		modelAndView.addObject("persona", personal);

		return modelAndView;
	}
        
        
        @RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addPaisPage() {
              System.out.println("esntra aqui GETTTT");
		//ModelAndView modelAndView = new ModelAndView("inventario");
               Map<String, Object> myModel = new HashMap<String, Object>();
		
                 
                 List ClasAct = tbClasActService.getAll();
                 List poliza = tbPolizaService.getAll();
                 List persona=tbcPersonaService.getAll();
                 List region=tbcRegionService.getAll();
                 myModel.put("inventario", new TbInventario());
                 myModel.put("poliza",poliza );
                 myModel.put("clasificacionA",ClasAct );
                 myModel.put("persona",persona);
                 myModel.put("region",region);
                
		return new ModelAndView("inventario",myModel);
	}
        
        
        @RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addingPais(@ModelAttribute TbInventario inventario) {
		ModelAndView modelAndView = new ModelAndView("home");
		 System.out.println("esntra aquiPOSTTTT"+inventario);

//               
//            TbcClasificacionActivo activo= new TbcClasificacionActivo();
//               activo.setIdClasificacionActivo(1);
//            inventario.setTbcClasificacionActivo(activo);
//
//
//            TbcPersona pers= new TbcPersona();
//               pers.setIdPersona(1);
//
//            inventario.setTbcPersona(pers);
//
//
//
//            TbcPoliza poli= new TbcPoliza();
//               poli.setIdPoliza(1);
//            inventario.setTbcPoliza(poli);
//
//
//            TbcRegion reg= new TbcRegion();
//               reg.setIdRegion(1);
//            inventario.setTbcRegion(reg);


               inventario.setClaseEquipo("asd");
                inventario.setCodigoInventario("1321");
                 inventario.setValorLibro(BigDecimal.ZERO);
                  inventario.setFechaAdquisicion(new Date());
                 inventario.setValor(BigDecimal.ZERO);
                  inventario.setLocalizacion("local");
                   inventario.setValorLibro(BigDecimal.ZERO);
          
                System.out.println("LO QUE VA EN EL OBJETO INVENTARIO e VALOR;"+inventario.getTbcClasificacionActivo().getIdClasificacionActivo()+"en fecha:"+inventario.getFechaAdquisicion());
               
		tbInventarioService.save(inventario);
		String message = "Pais was successfully added.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
    
}
