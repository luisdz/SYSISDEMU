/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import static org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder.controller;

/**
 *
 * @author Jose Eduardo
 */
 @Controller 
 @RequestMapping(value="/llamar")
 
public class micontroller {
     
     @RequestMapping(value="/irFormulario")
        public ModelAndView redireccion(){
       
		
		return new ModelAndView("inventario");
             }
        
        
        @RequestMapping(value="/consultarInventario")
        public ModelAndView ConsultarInventa(){
       
		
		return new ModelAndView("consultar_inventario");
             }
        
        
          @RequestMapping(value="/insertarMovimiento")
        public ModelAndView insertarMovimiento(){
       
		
		return new ModelAndView("movimiento");
             }
        
        @RequestMapping(value="/insertarUnidad")
        public ModelAndView insertarUnidad(){
       
		
		return new ModelAndView("unidad");
             }
        
        @RequestMapping(value="/insertarPoliza")
        public ModelAndView insertarPoliza(){
       
		
		return new ModelAndView("poliza");
             }
        
        @RequestMapping(value="/insertarPersonal")
        public ModelAndView insertarPersonal(){
       
		
		return new ModelAndView("Personal");
             }
        
        @RequestMapping(value="/insertarRegiones")
        public ModelAndView insertarRegiones(){
       
		
		return new ModelAndView("regiones");
             }
        
        @RequestMapping(value="/consultarMovimiento")
        public ModelAndView consultarMovimiento(){
       
		System.out.println("micontroller");
		return new ModelAndView("consultar_movimiento");
             }
        
        @RequestMapping(value="/consultarUnidad")
        public ModelAndView consultarUnidad(){
       
		
		return new ModelAndView("consultar_unidad");
             }
        @RequestMapping(value="/consultarPoliza")
        public ModelAndView consultarPoliza(){
       
		
		return new ModelAndView("consultar_poliza");
             }
        
        @RequestMapping(value="/consultarPersonal")
        public ModelAndView consultarPersonal(){
       
		
		return new ModelAndView("consultar_personal");
             }
        @RequestMapping(value="/consultarRegiones")
        public ModelAndView consultarRegiones(){
       
		
		return new ModelAndView("consultar_regiones");
             }
        
}
