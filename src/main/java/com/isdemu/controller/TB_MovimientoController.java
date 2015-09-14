/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

import com.isdemu.model.TbInventario;
import com.isdemu.model.TbMovimiento;
import com.isdemu.model.TbcPersona;
import com.isdemu.model.TbhMovimiento;
import com.isdemu.model.TbrMovimientoInventario;
import com.isdemu.service.TBC_ClasificacionLocalizacion_Service;
import com.isdemu.service.TBC_Persona_Service;
import com.isdemu.service.TBH_Movimiento_Service;
import com.isdemu.service.TBR_MovimientoInventario_Service;
import com.isdemu.service.TB_Inventario_Service;
import com.isdemu.service.TB_Movimiento_Service; 
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
 * @author AlejandroPC
 */
@Controller
@RequestMapping(value = "/Movimiento")
public class TB_MovimientoController {

    @Autowired
    private TB_Movimiento_Service tbMovimientoService;
    @Autowired
    private TB_Inventario_Service tbInventarioService;
    @Autowired
    private TBR_MovimientoInventario_Service tbrMovimientoInvService;
    @Autowired
    private TBC_Persona_Service tbcPersonaService;
    @Autowired
    private TBH_Movimiento_Service tbhMovimientoService;
    @Autowired
        private TBC_ClasificacionLocalizacion_Service tbcClasificacionLocalizacionService;

    
    @RequestMapping(value = "/consultarMov")
    public ModelAndView consultarMovimientos() {
        ModelAndView modelAndView = new ModelAndView("consultar_movimiento");        
        List movimientoR = tbrMovimientoInvService.getAll(); 
         List movimiento = tbMovimientoService.getAll();
         List movimientoI = tbMovimientoService.getAllInvPer();
         
         int a = 0;
         int b = a +2;
         
        modelAndView.addObject("movimiento", movimientoI);
        return modelAndView;
    }
    
    
    @RequestMapping(value = "/consultarHistorialMov")
    public ModelAndView consultarHistorialMov() {
        ModelAndView modelAndView = new ModelAndView("historial_movimientos");
        List movimiento = tbhMovimientoService.getAll();        
        //movimiento.        
        modelAndView.addObject("movimiento", movimiento);
        return modelAndView;
    }

    
    @RequestMapping(value = "/insertarMovimiento", method = RequestMethod.GET)
    public ModelAndView addMovimiento() {
        System.out.println("esntra aqui GETT movimiento");
        Map<String, Object> myModel = new HashMap<String, Object>();
        List Invent = tbInventarioService.getAll();
        List persona = tbcPersonaService.getAll();        
        List clasiLocalizacion=tbcClasificacionLocalizacionService.getAll();
        myModel.put("persona", persona);
        myModel.put("movimiento", new TbMovimiento());
        myModel.put("inventario", Invent);        
        myModel.put("clasiLocalizacion",clasiLocalizacion);
        return new ModelAndView("movimiento", myModel);
    }

    @RequestMapping(value = "/insertarMovimiento", method = RequestMethod.POST)
    public @ResponseBody
    String addingMovimiento(@RequestBody String movi) {
        ModelAndView modelAndView = new ModelAndView("home");
        System.out.println("esntra aqui POST movimiento insertar" + movi);

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        TbMovimiento mov = new TbMovimiento();
        System.out.println("String Json:" + movi);
        JSONObject array = new JSONObject(movi);
        JSONArray arrayMov = array.getJSONArray("Movimiento");
        JSONObject objectMov = arrayMov.getJSONObject(0);
        String date = (objectMov.getString("fecha"));
        Date fecha=new Date();
        try {
          fecha = formatter.parse(date);
        } catch (ParseException ex) {
        }
     
        mov.setFechaMovimiento(fecha);
        mov.setNMovimiento(1);
        mov.setRazonCambio(objectMov.getString("razon"));
        mov.setIdPersonaNueva(Integer.parseInt(objectMov.getString("idpersona")));
        
        System.out.println("String codigo inv:" + objectMov.getString("codigo"));

        tbMovimientoService.save(mov);
        TbMovimiento UltMov =(TbMovimiento) tbMovimientoService.LastIdMovimiento().get(0);
        int idMov = UltMov.getIdMovimiento();
               

        JSONArray object = array.getJSONArray("Inventario");
        
        
        for (int i = 0; i < object.length(); i++) 
        {
            int len = object.length();
            JSONObject object2 = object.getJSONObject(i);            
            String id = object2.getString("idInv");            
            TbrMovimientoInventario MovInv= new TbrMovimientoInventario();            
            
            MovInv.setTbMovimiento(UltMov);            
            TbInventario tempInv =(TbInventario)tbInventarioService.findByKey(Integer.parseInt(id));
            MovInv.setTbInventario(tempInv);  
            MovInv.setIdPersonaAnterior(tempInv.getTbcPersona().getIdPersona());
            MovInv.setIdPersonaNueva(Integer.parseInt(objectMov.getString("idpersona")));
             
            
            List<TbrMovimientoInventario> tbrMov =  tbrMovimientoInvService.findByInv(tempInv.getIdInventario());
            
            //Eliminar anteriores
            for (TbrMovimientoInventario tbrMov1 : tbrMov) 
            {
            tbrMovimientoInvService.delete(tbrMov1.getIdMovimientoInventario());
            }
            //-------------------
            tbrMovimientoInvService.save(MovInv);            
            System.out.println("Id Json:" + id);
            //historial
            TbhMovimiento TbhMov = new TbhMovimiento();
            TbhMov.setCodigoInventario(tempInv.getCodigoInventario());
            TbhMov.setFechaMovimiento(fecha);
            TbhMov.setIdMovimientoh(idMov);
            TbhMov.setPersonaActual(objectMov.getString("persona"));
            TbhMov.setPersonaAnterior(tempInv.getTbcPersona().getNombrePersona());
            tbhMovimientoService.save(TbhMov);
            //historial
            System.out.println("Id persona:" + objectMov.getString("idpersona"));            
            TbcPersona tbcpersona = (TbcPersona)tbcPersonaService.findByKey(Integer.parseInt(objectMov.getString("idpersona")));
            System.out.println("tbc persona:" + tbcpersona);
            tempInv.setTbcPersona(tbcpersona);
            tbInventarioService.update(tempInv);
        }

        //tbMovimientoService.save(movi);
        String message = "Movimiento was successfully added.";
        modelAndView.addObject("message", message);
        return "22";
    }

    
    
    @RequestMapping(value = "/deleteMovimiento/{id}", method = RequestMethod.GET)
    public ModelAndView deleteMov(@PathVariable Integer id) 
    {
        
        ModelAndView modelAndView = new ModelAndView("home");
        TbrMovimientoInventario tbmov=(TbrMovimientoInventario) tbrMovimientoInvService.findByKey(id);
        
        TbInventario inv=(TbInventario) tbInventarioService.findByKey(tbmov.getTbInventario().getIdInventario());        
        TbcPersona pers=(TbcPersona) tbcPersonaService.findByKey(tbmov.getIdPersonaAnterior());
        inv.setTbcPersona(pers);
        tbInventarioService.update(inv);        
        tbrMovimientoInvService.delete(id);
        
        String message = "movimiento was successfully deleted.";
        modelAndView.addObject("message", message);
        return modelAndView;
    }
    
    
    @RequestMapping(value = "/deleteInvMovimiento/{id}", method = RequestMethod.GET)
    public ModelAndView deleteIMov(@PathVariable Integer id) 
    {
        ModelAndView modelAndView = new ModelAndView("home");
        tbrMovimientoInvService.delete(id);
        String message = "movimiento was successfully deleted.";
        modelAndView.addObject("message", message);
        return modelAndView;
    }

    @RequestMapping(value = "/editMovimiento/{id}", method = RequestMethod.GET)
    public ModelAndView editMovimientoPage(@PathVariable Integer id) {
        TbMovimiento mov = (TbMovimiento) tbMovimientoService.findByKey(id);

        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("movimiento", mov);
        return new ModelAndView("actualizar_movimiento", myModel);
    }

    @RequestMapping(value = "/editMovimiento/{id}", method = RequestMethod.POST)
    public ModelAndView edditingMovimiento(@ModelAttribute TbMovimiento mov, @PathVariable Integer id) {

        TbMovimiento movActual = (TbMovimiento) tbMovimientoService.findByKey(id);
        ModelAndView modelAndView = new ModelAndView("home");

        movActual.setRazonCambio(mov.getRazonCambio());
//                polizaActual.setFechaInicio(poliza.getFechaInicio());
//                polizaActual.setFechaFin(poliza.getFechaFin());
        movActual.setNMovimiento(mov.getNMovimiento());

        tbMovimientoService.update(movActual);

        String message = "unidad was successfully edited.";
        modelAndView.addObject("message", message);

        return modelAndView;
    }

    @RequestMapping(value = "/editMovimientoI/{id}", method = RequestMethod.GET)
    public ModelAndView editMovimientoInventarioPage(@PathVariable Integer id) {
        //ModelAndView modelAndView = new ModelAndView("actualizar_inventario");

        TbMovimiento movi = (TbMovimiento) tbMovimientoService.findByKey(id);
        List mov = tbMovimientoService.getMovInv(id);
        // TbcRegion activo = (TbcRegion) tbRegionService.findByKey(unidad.getTbcRegion().getIdRegion());

        Map<String, Object> myModel = new HashMap<String, Object>();
        //List ClasAct = tbClasActService.getAll();  
        myModel.put("movimientoInv", mov);
        myModel.put("movimiento", movi);
        return new ModelAndView("actualizar_movimiento", myModel);
    }

    @RequestMapping(value = "/editMovimientoI/{id}", method = RequestMethod.POST)
    public ModelAndView edditingMovimientoInventario(@ModelAttribute TbMovimiento mov, @PathVariable Integer id) {

        TbMovimiento movActual = (TbMovimiento) tbMovimientoService.findByKey(id);

        ModelAndView modelAndView = new ModelAndView("home");

        movActual.setRazonCambio(mov.getRazonCambio());
//                polizaActual.setFechaInicio(poliza.getFechaInicio());
//                polizaActual.setFechaFin(poliza.getFechaFin());
        movActual.setNMovimiento(mov.getNMovimiento());

        tbMovimientoService.update(movActual);

        String message = "unidad was successfully edited.";
        modelAndView.addObject("message", message);

        return modelAndView;
    }

    

    
    @RequestMapping(value = "/agregarInventarioM", method = RequestMethod.POST)
    public @ResponseBody
    List<TbInventario> addingInvDescargo(@RequestBody String cod) {
        //ModelAndView modelAndView = new ModelAndView("descargo");
        System.out.println("codigo inv " + cod);
        Map<String, Object> myModel = new HashMap<String, Object>();
        List<TbInventario> list_invent= tbInventarioService.findBycodigo(cod);        
        System.out.println("list inv " + list_invent);
        //return new ModelAndView("descargo", myModel);
        //prueba        
        return list_invent;    
    }

}
