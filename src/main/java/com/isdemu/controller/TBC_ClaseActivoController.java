/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

import com.isdemu.model.TbcClaseActivo;
import com.isdemu.service.TBC_ClasificacionActivo_Service;
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
 @RequestMapping(value="/ClaseActivo")
public class TBC_ClaseActivoController {
    
    //DECLARACION DE VARIABLES
     @Autowired
      private TBC_ClasificacionActivo_Service tbcClasificacionAService;
     
      @RequestMapping(value="/insertarClase", method=RequestMethod.GET)
      public ModelAndView addPaisPage() {
        
            Map<String, Object> myModel = new HashMap<String, Object>();
            List ClasificacionAct = tbcClasificacionAService.getAll();
            myModel.put("inventario", new TbcClaseActivo());
            myModel.put("clasificacionA",ClasificacionAct );
        
              return new ModelAndView("clase_activo",myModel);
        }
}
