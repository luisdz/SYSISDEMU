/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

import com.isdemu.model.TbDescargo;
import com.isdemu.model.TbInventario; 
import com.isdemu.model.TbcEstadoInventario;
import com.isdemu.service.TBC_EstadoInventario_Service;

import com.isdemu.service.TB_Descargo_Service;
import com.isdemu.service.TB_Inventario_Service;
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
@RequestMapping(value = "/Descargo")
//@Configuration
//@ComponentScan("com.isdemu.service")
public class TB_DescargoController {

    @Autowired
    private TB_Descargo_Service tbdescargoService;
    @Autowired
    private TB_Inventario_Service tbInventarioService;
     @Autowired
    private TBC_EstadoInventario_Service tbcEstdoService;
//    

    @RequestMapping(value = "/consultarDescargo")
    public ModelAndView consultarDescargo() {
        ModelAndView modelAndView = new ModelAndView("consultar_descargo");

        List descargo = tbdescargoService.getAll();
        modelAndView.addObject("descargo", descargo);

        return modelAndView;
    }

    @RequestMapping(value = "/insertarDescargo", method = RequestMethod.GET)
    public ModelAndView addDescargo() 
    {
        System.out.println("esntra aqui GETT descargo");
        Map<String, Object> myModel = new HashMap<String, Object>();
        List invent = tbInventarioService.getAll();
        myModel.put("descargo", new TbDescargo());
        myModel.put("inventario", invent);
        return new ModelAndView("descargo", myModel);
    }

    @RequestMapping(value = "/insertarDescargo", method = RequestMethod.POST)
    public @ResponseBody String addingDescargo(@RequestBody String desc) {
       // ModelAndView modelAndView = new ModelAndView("home");
        System.out.println("esntra aquiPOST movimiento" + desc);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
       // desc.setIdNumeroDescargo(1);
        TbDescargo descargo = new TbDescargo();
        System.out.println("post codigo" + desc);
        
        JSONObject array = new JSONObject(desc);

        JSONArray arrayDes = array.getJSONArray("Descargo");
        JSONObject objectDes = arrayDes.getJSONObject(0);
        
        String comentario =  objectDes.getString("comentario");

        String date = (objectDes.getString("fecha"));
        Date fecha=new Date();
        try {
          fecha = formatter.parse(date);
        } catch (ParseException ex) {
        }
         JSONArray objectInv = array.getJSONArray("Inventario");
         
        for (int i = 0; i < objectInv.length(); i++) 
        {
            JSONObject object2 = objectInv.getJSONObject(i);            
            String id = object2.getString("idInv");            
            TbDescargo des = new TbDescargo();            
            TbInventario tempInv =(TbInventario)tbInventarioService.findByKey(Integer.parseInt(id)); 
            tempInv.setTbcEstadoInventario((TbcEstadoInventario)tbcEstdoService.findByKey(2));            
            des.setTbInventario(tempInv);
            des.setComentario(comentario);
            des.setFecha(fecha);             
            tbdescargoService.save(des);
            tbInventarioService.update(tempInv);            
            System.out.println("Id Json : " + id);
        }
        
        String message = "descargo was successfully added.";
        //modelAndView.addObject("message", message);
        return "1h" ;
    }
    
    
    

    @RequestMapping(value = "/deleteDescargo/{id}", method = RequestMethod.GET)
    public ModelAndView deleteDes(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("home");
        
        TbDescargo des=(TbDescargo)tbdescargoService.findByKey(id);
        TbInventario inv= (TbInventario)tbInventarioService.findByKey(des.getTbInventario().getIdInventario());
        inv.setTbcEstadoInventario((TbcEstadoInventario)tbcEstdoService.findByKey(1));
        tbInventarioService.update(inv);
        tbdescargoService.delete(id);
        System.out.println("descargo eliminado ");
        String message = "descargo was successfully deleted.";
        modelAndView.addObject("message", message);
        return consultarDescargo();
    }

    @RequestMapping(value = "/editDescargo/{id}", method = RequestMethod.GET)
    public ModelAndView editDescargoPage(@PathVariable Integer id) {
        TbDescargo descargo = (TbDescargo) tbdescargoService.findByKey(id);
        List invent = tbInventarioService.getAll();
        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("descargo", descargo);
        myModel.put("inventario", invent);

        return new ModelAndView("actualizar_descargo", myModel);
    }

    @RequestMapping(value = "/editDescargo/{id}", method = RequestMethod.POST)
    public ModelAndView edditingUnidad(@ModelAttribute TbDescargo descarg, @PathVariable Integer id) {

        TbDescargo descargoActual = (TbDescargo) tbdescargoService.findByKey(id);
        ModelAndView modelAndView = new ModelAndView("home");

        descargoActual.setIdNumeroDescargo(descarg.getIdNumeroDescargo());
        descargoActual.setComentario(descarg.getComentario());
        descargoActual.setFecha(descarg.getFecha());
        descargoActual.setTbInventario(descarg.getTbInventario());

        tbdescargoService.update(descargoActual);

        String message = "descargo was successfully edited.";
        modelAndView.addObject("message", message);

        return consultarDescargo();
    }

    @RequestMapping(value = "/agregarInventario", method = RequestMethod.POST)
    public @ResponseBody
    List<TbInventario> addingInvMovimiento(@RequestBody String cod) {
        //ModelAndView modelAndView = new ModelAndView("descargo");
        System.out.println("codigo inv " + cod);
        Map<String, Object> myModel = new HashMap<String, Object>();
        List<TbInventario> list_invent= tbInventarioService.findBycodigo(cod);        
        System.out.println("list inv " + list_invent);
        //return new ModelAndView("descargo", myModel);
                
        return list_invent;    
    }

}
