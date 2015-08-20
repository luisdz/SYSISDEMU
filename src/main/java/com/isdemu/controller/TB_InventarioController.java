/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.isdemu.model.TbDescargo;
import com.isdemu.model.TbInventario;
import com.isdemu.model.TbMovimiento;
import com.isdemu.model.TbcClaseActivo;
import com.isdemu.model.TbcClasificacionActivo;
import com.isdemu.model.TbcPersona;
import com.isdemu.model.TbcPoliza;

import com.isdemu.service.TBC_ClaseActivo_Service;
import com.isdemu.service.TBC_ClasificacionActivo_Service;
import com.isdemu.service.TBC_Localizacion_Service;
import com.isdemu.service.TBC_Persona_Service;
import com.isdemu.service.TBC_Poliza_Service;

import com.isdemu.service.TB_Descargo_Service;
import com.isdemu.service.TB_Inventario_Service;
import com.isdemu.service.TB_Movimiento_Service;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.json.Json;
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
 * @author Jose Eduardo
 */

@Controller 
 @RequestMapping(value="/Inventario")
public class TB_InventarioController {
    public static String CodigoClasificacion="";
    
    @Autowired
	private TB_Inventario_Service tbInventarioService;
 
    @Autowired
        private TBC_ClasificacionActivo_Service tbClasActService;
    
     @Autowired
        private TBC_Persona_Service tbcPersonaService;
     
      @Autowired
        private TBC_Localizacion_Service tbcLocalizacionService;
    
      @Autowired
        private TBC_ClaseActivo_Service tbcClaseActivoService;
      
       
     
     
     
    
    @RequestMapping(value="/list")
	public ModelAndView listOfPaises() {
		ModelAndView modelAndView = new ModelAndView("consultar_inventario");

		List inventario = tbInventarioService.getAll();
		modelAndView.addObject("inventario", inventario);

		return modelAndView;
	}
        
        
       @RequestMapping(value="/listaClaseA", method=RequestMethod.POST)
	public @ResponseBody  List<TbcClaseActivo> ClaseA(@RequestBody String clasi) {
		int idClasi= Integer.parseInt(clasi);
                
              
                System.out.println("INGRESA CONTROLLER LISTA CLASE---");
		System.out.println(idClasi);
                //obtener el codigo de la clasificacion del activo seleccionado y guardarlo en una variable local
                TbcClasificacionActivo clasificacionActivo = (TbcClasificacionActivo) tbClasActService.findByKey(idClasi);
                CodigoClasificacion=clasificacionActivo.getCodigoClasificacion();
                System.out.println("Variable con ocidgo Clasificacion;"+CodigoClasificacion);
                //
                
                 List<TbcClaseActivo> movi = tbcClaseActivoService.getAllidClasi(idClasi);
              
                
               
                return movi;
                 
	}
        
        //METODO PARA DEVOLVER LA REGION DEL INVENTARIO
         @RequestMapping(value="/regionPersona", method=RequestMethod.POST)
	public @ResponseBody  String regPersona(@RequestBody String idPersona) {
		int idClasi= Integer.parseInt(idPersona);
                
              
                System.out.println("INGRESA CONTROLLER LISTA CLASE---");
		System.out.println(idClasi);
                //obtener el codigo de la clasificacion del activo seleccionado y guardarlo en una variable local
                TbcClasificacionActivo clasificacionActivo = (TbcClasificacionActivo) tbClasActService.findByKey(idClasi);
                CodigoClasificacion=clasificacionActivo.getCodigoClasificacion();
                System.out.println("Variable con ocidgo Clasificacion;"+CodigoClasificacion);
                //
                
                 List<TbcClaseActivo> movi = tbcClaseActivoService.getAllidClasi(idClasi);
              
                
               
                return "";
                 
	}
        
        
        @RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addPaisPage() {
             
		//ModelAndView modelAndView = new ModelAndView("inventario");
               Map<String, Object> myModel = new HashMap<String, Object>();
		
                 
                 List ClasAct = tbClasActService.getAll();
                 List persona=tbcPersonaService.getAll();
                 List lozalizacion=tbcLocalizacionService.getAll();
                 //List ClaseActivo=tbcClaseActivoService.getAll();
                 
                 
                 List ClaseActivo=tbcClaseActivoService.getTop();
                 
                 myModel.put("inventario", new TbInventario());
                
                 myModel.put("clasificacionA",ClasAct );
                 myModel.put("claseActivo",ClaseActivo );
                 myModel.put("persona",persona);
                 myModel.put("lozalizacion",lozalizacion);
               
                
		return new ModelAndView("inventario",myModel);
	}
        
        
        @RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addingPais(@ModelAttribute TbInventario inventario) {
		ModelAndView modelAndView = new ModelAndView("home");
		inventario.setValor(BigDecimal.ZERO);
                inventario.setValorLibro(BigDecimal.ZERO);
                inventario.setFechaInsert(new Date());
                //obtener el codigo de la clase seleccionada para armar el codigo de inventario
                TbcClaseActivo codigoClaseA = (TbcClaseActivo)tbcClaseActivoService.findByKey(inventario.getTbcClaseActivo().getIdClaseActivo());
                String CodigoClase=codigoClaseA.getCodigoClase();
                //ir a inventario y consultar el ultimo codigo con la clase que se ingreso devolver el codigo, convertilo a int y sumarle uno
                List<TbInventario> LastInv=tbInventarioService.LastCodInventario(inventario.getTbcClaseActivo().getIdClaseActivo());
                String Correlativo="";
                if(LastInv.size()!=0){
                    //extraer los ultimos digitos convertitlo a int, sumarle uno y luego concatenarlo con CodigoInventario
                    String LastCodInv=LastInv.get(0).getCodigoInventario();
                    int LongLastCod=LastCodInv.length();
                    String CodIncrement=LastCodInv.substring(7,LongLastCod);
                    System.out.println("ULTIMOS DIGITOS DEL CODIGO;"+CodIncrement);
                    int CodIncrementInt=Integer.parseInt(CodIncrement);
                    int Increment=CodIncrementInt+1;
                    System.out.println("YA INCREMENTADO;"+Increment);
                    if(Increment<99)
                    {
                       Correlativo="00"+Increment;
                    }
                    else
                       Correlativo=String.valueOf(Increment);
                    
                }
                else{
                     Correlativo="001";
                }
                 
                String CodigoInventario=CodigoClasificacion+CodigoClase+Correlativo;
                System.out.println("codigo inventario a ingresar:"+CodigoInventario);
                inventario.setCodigoInventario(CodigoInventario);
                tbInventarioService.save(inventario);
                String message = "Pais was successfully added.";
                modelAndView.addObject("message", message);
                return modelAndView;
	}
        
        
        //agregar por lotes
        @RequestMapping(value="/add/lotes", method=RequestMethod.POST)
	public ModelAndView InsertandoPorLotes(@ModelAttribute TbInventario inventario) {
		ModelAndView modelAndView = new ModelAndView("home");
		inventario.setValor(BigDecimal.ZERO);
                //uso valor libro para obtener temporalmente la cantidad de elementos a ingresar por lotes
                int cantidadlotes= Integer.parseInt(inventario.getValorLibro().toString());
                //inventario.setValorLibro(BigDecimal.ZERO);
                inventario.setFechaInsert(new Date());
                //obtener el codigo de la clase seleccionada para armar el codigo de inventario
                TbcClaseActivo codigoClaseA = (TbcClaseActivo)tbcClaseActivoService.findByKey(inventario.getTbcClaseActivo().getIdClaseActivo());
                String CodigoClase=codigoClaseA.getCodigoClase();
                //ir a inventario y consultar el ultimo codigo con la clase que se ingreso devolver el codigo, convertilo a int y sumarle uno
                List<TbInventario> LastInv=tbInventarioService.LastCodInventario(inventario.getTbcClaseActivo().getIdClaseActivo());
                String Correlativo="";
                if(LastInv.size()!=0){
                    //extraer los ultimos digitos convertitlo a int, sumarle uno y luego concatenarlo con CodigoInventario
                    String LastCodInv=LastInv.get(0).getCodigoInventario();
                    int LongLastCod=LastCodInv.length();
                    String CodIncrement=LastCodInv.substring(7,LongLastCod);
                
                    int CodIncrementInt=Integer.parseInt(CodIncrement);
                    int Increment=CodIncrementInt+1;
              
                    if(Increment<99)
                    {
                       Correlativo="00"+Increment;
                    }
                    else
                       Correlativo=String.valueOf(Increment);
                    
                }
                else{
                     Correlativo="001";
                }
                 
                String CodigoInventario=CodigoClasificacion+CodigoClase+Correlativo;
                
                //Convertir correlativo a int
                int Icorrelativo=Integer.parseInt(Correlativo);
                Icorrelativo=Icorrelativo-1;
                             
                for(int i=0;i<cantidadlotes;i++){
                    Icorrelativo=Icorrelativo+1;
                     if(Icorrelativo<99)
                    {
                       Correlativo="00"+Icorrelativo;
                    }
                    else
                       Correlativo=String.valueOf(Icorrelativo);
                     
                    
                    CodigoInventario=CodigoClasificacion+CodigoClase+Correlativo;
                    inventario.setCodigoInventario(CodigoInventario);
                    tbInventarioService.save(inventario);
                }
               
                String message = "Pais was successfully added.";
                modelAndView.addObject("message", message);
                return modelAndView;
	}
        
        //Agregar varios activos que pertenecesn al mismo codigo
        @RequestMapping(value="/add/mismocodigo", method=RequestMethod.POST)
	public @ResponseBody String InsertandoMismoCodigo(@RequestBody String inventario) {
		ModelAndView modelAndView = new ModelAndView("home");
		System.out.println("String Json:" + inventario);
                 
                JSONObject array = new JSONObject(inventario);
                System.out.println("Object Array:" + array);
                 JSONArray object = array.getJSONArray("Inventario");
                 System.out.println("Object JsonArray:" + object);
                 JSONObject object2 = object.getJSONObject(1);
                  System.out.println("Object2:" + object2);
                 String idClase = object2.getString("idClase");
                
                 //Convertir el idClase a int
                 int idClaseInt=Integer.parseInt(idClase);
                
                 System.out.println("ID CLASE:" + idClase);
                 
               
                //obtener el codigo de la clase seleccionada para armar el codigo de inventario
                TbcClaseActivo codigoClaseA = (TbcClaseActivo)tbcClaseActivoService.findByKey(idClaseInt);
                String CodigoClase=codigoClaseA.getCodigoClase();
                //ir a inventario y consultar el ultimo codigo con la clase que se ingreso devolver el codigo, convertilo a int y sumarle uno
                List<TbInventario> LastInv=tbInventarioService.LastCodInventario(idClaseInt);
                String Correlativo="";
                if(LastInv.size()!=0){
                    //extraer los ultimos digitos convertitlo a int, sumarle uno y luego concatenarlo con CodigoInventario
                    String LastCodInv=LastInv.get(0).getCodigoInventario();
                    int LongLastCod=LastCodInv.length();
                    String CodIncrement=LastCodInv.substring(7,LongLastCod);
                    System.out.println("ULTIMOS DIGITOS DEL CODIGO;"+CodIncrement);
                    int CodIncrementInt=Integer.parseInt(CodIncrement);
                    int Increment=CodIncrementInt+1;
                    System.out.println("YA INCREMENTADO;"+Increment);
                    if(Increment<=99)
                    {
                       
                        if(Increment<=9){
                        Correlativo="00"+Increment;
                        }
                        else
                            Correlativo="0"+Increment;
                    }
                    else{
                       
                        Correlativo=String.valueOf(Increment);
                    }
                       
                    
                }
                else{
                     Correlativo="001";
                }
                 
                String CodigoInventario=CodigoClasificacion+CodigoClase+Correlativo;
                System.out.println("codigo inventario a ingresarCODIGOOOOOOOOO:"+CodigoInventario);
               // inventario.setCodigoInventario(CodigoInventario);
                for (int i = 0; i < object.length(); i++) 
                {
                    JSONObject ObjInv = object.getJSONObject(i);
                    System.out.println("objeto for"+ObjInv);
                    TbInventario inv=new TbInventario();
                    
                    inv.setCodigoInventario(CodigoInventario);
                    
                    inv.setDescripcionEquipo("");
                    
                    String fechaA=ObjInv.getString("fechaA");
                    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                     Date fechaADate=new Date();
                    try {
                      fechaADate = formatter.parse(fechaA);
                    } catch (ParseException ex) {
                    }
                    inv.setFechaAdquisicion(fechaADate);
                   
                    String financiamiento=ObjInv.getString("financiamiento");
                    inv.setFinanciamiento(financiamiento);
                    
                    String idAsignado=ObjInv.getString("idCustodiade");
                    int idAsignadoInt=Integer.parseInt(idAsignado);
                    inv.setIdPersonaAsignado(idAsignadoInt);
                    
                    String marca=ObjInv.getString("marca");
                    inv.setMarca(marca);
                    
                    String modelo=ObjInv.getString("modelo");
                    inv.setModelo(modelo);
                    
                    String factura=ObjInv.getString("factura");
                    inv.setNFactura(factura);
                    
                    String serie=ObjInv.getString("serie");
                    inv.setSerie(serie);
                    
                    //crear obj clase activo para set el id clase
                    TbcClaseActivo clasA=new TbcClaseActivo();
                    clasA.setIdClaseActivo(idClaseInt);
                    inv.setTbcClaseActivo(clasA);
                    
                    //crear obj persona para set el id persona en custodia de
                     String idCustodiad = ObjInv.getString("idCustodiade");
                     int idCustodiadInt=Integer.parseInt(idCustodiad);
                     TbcPersona per=new TbcPersona();
                     per.setIdPersona(idCustodiadInt);
                     inv.setTbcPersona(per);
                     
                    String valor = ObjInv.getString("valor");
                    Double valodD=Double.parseDouble(valor);
                    BigDecimal valorB= BigDecimal.valueOf(valodD);
                    inv.setValor(valorB);
                    
                    inv.setValorLibro(valorB);
                    
                    tbInventarioService.save(inv);
                }
               // tbInventarioService.save(inventario);
                String message = "Pais was successfully added.";
                modelAndView.addObject("message", message);
                return "2";
	}
        
        
        @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deletePais(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("home");
		tbInventarioService.delete(id);
		String message = "Pais was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
        
        
        @RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView editPaisPage(@PathVariable Integer id) {
		//ModelAndView modelAndView = new ModelAndView("actualizar_inventario");
		TbInventario inventario = (TbInventario) tbInventarioService.findByKey(id);
              //  TbcClasificacionActivo activo = (TbcClasificacionActivo) tbClasActService.findByKey(inventario.getTbcClasificacionActivo().getIdClasificacionActivo());
                
                  Map<String, Object> myModel = new HashMap<String, Object>();
                   List ClasAct = tbClasActService.getAll();  
                   myModel.put("inventario",inventario ); 
                 // myModel.put("clasificacionA",activo );
                  myModel.put("AllclasificacionA",ClasAct );
                
                  
                   
                //System.out.println("A ver el combo:"+inventario.getTbcClasificacionActivo().getIdClasificacionActivo()+activo.getNombreClasificacion());
		//modelAndView.addObject("inventario",inventario);
		return new ModelAndView("actualizar_inventario",myModel);
	}

	@RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
	public ModelAndView edditingPais(@ModelAttribute TbInventario inventario, @PathVariable Integer id) {
		TbInventario ActivoActual = (TbInventario) tbInventarioService.findByKey(id);
		ModelAndView modelAndView = new ModelAndView("home");
                ActivoActual.setMarca(inventario.getMarca());
		
                
		tbInventarioService.update(ActivoActual);

		String message = "Pais was successfully edited.";
		modelAndView.addObject("message", message);

		return modelAndView;
	}
    
}
