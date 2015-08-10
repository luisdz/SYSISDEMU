/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.isdemu.model.TbInventario;
import com.isdemu.model.TbcClasificacionActivo;
import com.isdemu.model.TbcPersona;
import com.isdemu.model.TbcPoliza;
import com.isdemu.model.TbcRegion;
import com.isdemu.model.TbcUnidad;
import com.isdemu.model.TbPrestamoEquipo;
import com.isdemu.model.TbControlSalida;
import com.isdemu.service.TBC_ClasificacionActivo_Service;
import com.isdemu.service.TBC_Poliza_Service;
import com.isdemu.service.TB_Control_Service;
import com.isdemu.service.TB_Prestamo_Service;
import com.isdemu.service.TB_Inventario_Service;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
 @RequestMapping(value="/Prestamo")
public class TB_PrestamoController {
    
    @Autowired
	private TB_Inventario_Service tbInventarioService;
    @Autowired
        private TBC_Poliza_Service tbPolizaService;
    
    @Autowired
        private TB_Prestamo_Service tbPrestamoService;
    
      
     @RequestMapping(value="/list")
	public ModelAndView listOfPaises() {
		ModelAndView modelAndView = new ModelAndView("consultar_prestamo");
                System.out.println("esntra aqui GET prestamo");
		List prestamo = tbPrestamoService.getAll();
		modelAndView.addObject("prestamo", prestamo);

		return modelAndView;
	}
        
       @RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addPaisPage() {
              System.out.println("esntra aqui GET persona");
		//ModelAndView modelAndView = new ModelAndView("inventario");
               Map<String, Object> myModel = new HashMap<String, Object>();
		
                 
                 //List ClasAct = tbClasActService.getAll();
                /// List poliza = tbPolizaService.getAll();
                List inventario= tbInventarioService.getAll();
                 //List region=tbcRegionService.getAll();
                 myModel.put("prestamo", new TbPrestamoEquipo());
                 myModel.put("inventario",inventario);
                // myModel.put("poliza",poliza );
                // myModel.put("clasificacionA",ClasAct );
                // myModel.put("persona",persona);
                // myModel.put("region",region);
                System.out.println("esntra aqui GET persona");
		return new ModelAndView("prestamo",myModel);
	}
        
        
        @RequestMapping(value="/add", method=RequestMethod.POST)
	public @ResponseBody String addingPais(@RequestBody String prestamo) throws ParseException {
		ModelAndView modelAndView = new ModelAndView("home");
		 System.out.println("String Json:"+prestamo);
                 
                TbPrestamoEquipo prestamoEquipo = null;
                
                
                JSONObject array2 = new JSONObject(prestamo);
                JSONArray object3 = array2.getJSONArray("Prestamo");
                
                JSONObject objectNumero = object3.getJSONObject(0);
                String nPrestamo = objectNumero.getString("nPrestamo");
                String destino = objectNumero.getString("destino");
                String hora_inicio = objectNumero.getString("hora_inicio");
                String hora_fin = objectNumero.getString("hora_fin");
                String fecha_solic = objectNumero.getString("fecha_solic");
                String fecha_reser = objectNumero.getString("fecha_reser");
                
                System.out.println("nPrestamo Json:"+nPrestamo);
                System.out.println("Numero Json:"+destino);
                System.out.println("hora_inicio Json:"+hora_inicio);
                System.out.println("hora_fin Json:"+hora_fin);
                System.out.println("fecha_solic Json:"+fecha_solic);
                System.out.println("fecha_reser Json:"+fecha_reser);
                /* DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date hora_ini = formatter.parse(hora_inicio);
                Date hora_fi = formatter.parse(hora_fin);
                //Date fecha_sol = formatter.parse(fecha_solic);
                //Date fecha_res = formatter.parse(fecha_reser);

                
                prestamoEquipo.setNPrestamo(Integer.parseInt(nPrestamo));
                prestamoEquipo.setHoraInicio(hora_ini);
                prestamoEquipo.setHoraFin(hora_fi);
                //prestamoEquipo.setFechaSolicitud(fecha_sol);
                //prestamoEquipo.setFechaReservacion(fecha_res);
                
                */
                 
                 JSONObject array = new JSONObject(prestamo);
                 JSONArray object = array.getJSONArray("Inventario");
                 for(int i=0;i<=array.length();i++)
                 {
                    JSONObject object2 = object.getJSONObject(i);
                  
                     //JSONArray object = array.getJSONArray("Inventario");
                    String id = object2.getString("idInv");
                    System.out.println("Id Json:"+id);
                   
                }
                 
                
                
                //tbPrestamoService.save(prestamoEquipo);
            
		//tbMovimientoService.save(movi);
		String message = "Prestamo was successfully added.";
		modelAndView.addObject("message", message);
		return "22";
	}
        
      @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deletePais(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("home");
                System.out.println(id);
		tbPrestamoService.delete(id);
		String message = "Pais was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
        
        @RequestMapping(value="/editPrestamo2/{id}", method=RequestMethod.GET)
	public ModelAndView editControlInventarioPage(@PathVariable Integer id) 
        {
                System.out.println("Entra actualiza1");
		//ModelAndView modelAndView = new ModelAndView("actualizar_inventario");
            
                TbPrestamoEquipo pres = (TbPrestamoEquipo) tbPrestamoService.findByKey(id);
                System.out.println("Entra actualiza5");
		List pre = tbPrestamoService.getPreInv(id);
               // TbcRegion activo = (TbcRegion) tbRegionService.findByKey(unidad.getTbcRegion().getIdRegion());
                System.out.println("Entra actualiza2");
                  Map<String, Object> myModel = new HashMap<String, Object>();
                   //List ClasAct = tbClasActService.getAll();  
                   myModel.put("prestamoInv",pre ); 
                   myModel.put("prestamo",pres);
                 // myModel.put("clasificacionA",activo );
                  //myModel.put("AllclasificacionA",ClasAct );
                
                  
                   System.out.println("Entra actualiza");
                //System.out.println("A ver el combo:"+inventario.getTbcClasificacionActivo().getIdClasificacionActivo()+activo.getNombreClasificacion());
		//modelAndView.addObject("inventario",inventario);
		return new ModelAndView("actualizar_prestamo",myModel);
	}
        
        
        @RequestMapping(value="/editPrestamo2/{id}", method=RequestMethod.POST)
	public ModelAndView edditingControlInventario(@ModelAttribute TbControlSalida con, @PathVariable Integer id) {
            
		TbPrestamoEquipo preActual = (TbPrestamoEquipo) tbPrestamoService.findByKey(id);
                
		ModelAndView modelAndView = new ModelAndView("home");
                
                //conActual.setRazonCambio(con.getRazonCambio());
//                polizaActual.setFechaInicio(poliza.getFechaInicio());
//                polizaActual.setFechaFin(poliza.getFechaFin());
                //conActual.setNControl(con.getNMovimiento());
                
		                
		tbPrestamoService.update(preActual);

		String message = "prestamo was successfully edited.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}
    
}
