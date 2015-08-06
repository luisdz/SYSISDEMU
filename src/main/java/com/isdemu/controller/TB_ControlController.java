/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

import com.isdemu.model.TbControlSalida;
import com.isdemu.service.TBC_Poliza_Service;
import com.isdemu.service.TB_Control_Service;
import com.isdemu.service.TB_Inventario_Service;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.isdemu.model.TbInventario;
import com.isdemu.model.TbMovimiento;
import com.isdemu.model.TbcClaseActivo;
import com.isdemu.model.TbcUnidad;
import com.isdemu.model.TbControlSalida;
import com.isdemu.service.TB_Inventario_Service;
import com.isdemu.service.TB_Movimiento_Service;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
/**
 *
 * @author Miranda
 */
@Controller 
 @RequestMapping(value="/Control")
public class TB_ControlController {
    
    @Autowired
	private TB_Inventario_Service tbInventarioService;
    @Autowired
        private TBC_Poliza_Service tbPolizaService;
    
    @Autowired
        private TB_Control_Service tbControlService;
    
      
     @RequestMapping(value="/list")
	public ModelAndView listOfPaises() {
		ModelAndView modelAndView = new ModelAndView("control_consultar");

		List control = tbControlService.getAll();
		modelAndView.addObject("control", control);

		return modelAndView;
	}
        
       @RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addPaisPage() {
              System.out.println("esntra aqui GET control");
		//ModelAndView modelAndView = new ModelAndView("inventario");
               Map<String, Object> myModel = new HashMap<String, Object>();
		
                 
                 //List ClasAct = tbClasActService.getAll();
                /// List poliza = tbPolizaService.getAll();
                List inventario= tbInventarioService.getAll();
                 //List region=tbcRegionService.getAll();
                 myModel.put("control", new TbControlSalida());
                 myModel.put("inventario",inventario);
                // myModel.put("poliza",poliza );
                // myModel.put("clasificacionA",ClasAct );
                // myModel.put("persona",persona);
                // myModel.put("region",region);
		return new ModelAndView("control",myModel);
	}
        
        
        @RequestMapping(value="/add", method=RequestMethod.POST)
	public @ResponseBody String addingPais(@RequestBody String control) {
		ModelAndView modelAndView = new ModelAndView("home");
//                JSONObject jsonObj = new JSONObject(control);
		//System.out.println("entra aqui POST persona"+control.get(0).getIdControlSalida());
                 System.out.println("String Json:"+control);
                 
                 JSONObject array = new JSONObject(control);
                 JSONArray object = array.getJSONArray("Inventario");
                 for(int i=0;i<array.length();i++)
                 {
                    JSONObject object2 = object.getJSONObject(i);
                  
                     //JSONArray object = array.getJSONArray("Inventario");
                    String id = object2.getString("idInv");
                    System.out.println("Id Json:"+id);
                   
                }
                
              
            
		//tbMovimientoService.save(movi);
		String message = "Constrol was successfully added.";
		modelAndView.addObject("message", message);
		return "22";
	}
        
      @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deletePais(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("home");
                System.out.println(id);
		tbControlService.delete(id);
		String message = "Pais was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
        
        @RequestMapping(value="/editControl1/{id}", method=RequestMethod.GET)
	public ModelAndView editControlInventarioPage(@PathVariable Integer id) 
        {
                System.out.println("Entra actualiza1");
		//ModelAndView modelAndView = new ModelAndView("actualizar_inventario");
            
                TbControlSalida cont = (TbControlSalida) tbControlService.findByKey(id);
                System.out.println("Entra actualiza5");
		List con = tbControlService.getConInv(id);
               // TbcRegion activo = (TbcRegion) tbRegionService.findByKey(unidad.getTbcRegion().getIdRegion());
                System.out.println("Entra actualiza2");
                  Map<String, Object> myModel = new HashMap<String, Object>();
                   //List ClasAct = tbClasActService.getAll();  
                   myModel.put("controlInv",con ); 
                   myModel.put("control",cont);
                 // myModel.put("clasificacionA",activo );
                  //myModel.put("AllclasificacionA",ClasAct );
                
                  
                   System.out.println("Entra actualiza");
                //System.out.println("A ver el combo:"+inventario.getTbcClasificacionActivo().getIdClasificacionActivo()+activo.getNombreClasificacion());
		//modelAndView.addObject("inventario",inventario);
		return new ModelAndView("actualizar_control",myModel);
	}
        
        
        @RequestMapping(value="/editControl1/{id}", method=RequestMethod.POST)
	public ModelAndView edditingControlInventario(@ModelAttribute TbControlSalida con, @PathVariable Integer id) {
            
		TbControlSalida conActual = (TbControlSalida) tbControlService.findByKey(id);
                
		ModelAndView modelAndView = new ModelAndView("home");
                
                //conActual.setRazonCambio(con.getRazonCambio());
//                polizaActual.setFechaInicio(poliza.getFechaInicio());
//                polizaActual.setFechaFin(poliza.getFechaFin());
                //conActual.setNControl(con.getNMovimiento());
                
		                
		tbControlService.update(conActual);

		String message = "unidad was successfully edited.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}
        
        
    
}
