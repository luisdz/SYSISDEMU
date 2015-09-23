/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

import com.isdemu.model.TbMovimiento;
import com.isdemu.service.TBC_ClasificacionLocalizacion_Service;
import com.isdemu.service.TBC_Persona_Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Luis
 */
@Controller
@RequestMapping(value = "/Reportes")
public class ReportesActivos 
{
     @Autowired
    private TBC_Persona_Service tbcPersonaService;
     
      @Autowired
        private TBC_ClasificacionLocalizacion_Service tbcClasificacionLocalizacionService;
    
   @RequestMapping(value = "/reporteAsignadoa")
    public ModelAndView reporteAsignadoaPage() 
    {
        ModelAndView modelAndView = new ModelAndView("reporte_activo_asignado");        
               
       Map<String, Object> myModel = new HashMap<String, Object>();
       
        List persona = tbcPersonaService.getAll();
        List clasiLocalizacion=tbcClasificacionLocalizacionService.getAll();        
        myModel.put("clasiLocalizacion",clasiLocalizacion);
        myModel.put("persona", persona);        
        myModel.put("movimiento", new TbMovimiento());        
         return new ModelAndView("reporte_activo_asignado", myModel);
    }
    
     @RequestMapping(value = "/reporteAsignadoa", method = RequestMethod.POST)
    public @ResponseBody
    int reporteAsignadoa(@RequestBody String movi) 
    {
        ModelAndView modelAndView = new ModelAndView("home");
        System.out.println("esntra aqui POST reporte asignado" + movi);
               
       
        System.out.println("String Json:" + movi);
        JSONObject array = new JSONObject(movi);
        JSONArray arrayPer = array.getJSONArray("Persona");
         
        JSONObject objectPer = arrayPer.getJSONObject(0);         
        int persona=Integer.parseInt(objectPer.getString("id"));
         
        JSONArray arrayPar = array.getJSONArray("Inventario");
         
        JSONObject objectPar = arrayPar.getJSONObject(0);         
        int param01=Integer.parseInt(objectPar.getString("para01"));
                       
        
        System.out.println("parametro: " +  param01 + " persona: " + persona );
        //tbMovimientoService.save(movi);
        String message = "Movimiento was successfully added.";
               
            
        return 1;
    }
}
