/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.service.impl;

import com.isdemu.dao.TBC_PersonaDao;
import com.isdemu.service.TBC_Persona_Service;
import java.util.List;
import java.io.Serializable;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Eduardo
 */
@Service
@Transactional
public class TBC_Persona_ServiceImp implements TBC_Persona_Service{
    @Autowired
       private TBC_PersonaDao tbPersonaDao;

    @Override
	public void save(Object obj) {
             System.out.println("esntra aqui GET service");
		// TODO Auto-generated method stub
		tbPersonaDao.save(obj);
	}
        
    @Override
       public List getAll() {
            System.out.println("service impl");
               // TODO Auto-generated method stub
               return tbPersonaDao.getAll();
       }
        
   @Override
   public void delete(Serializable id) {
           // TODO Auto-generated method stub
           tbPersonaDao.delete(id);
   }

   @Override
   public Object findByKey(Serializable id) {
           // TODO Auto-generated method stub
           return tbPersonaDao.findByKey(id);
   }
   
    @Override
         public List getAllidUbicacion(Serializable id){
         return tbPersonaDao.getAllidUbicacion(id);
         }
         
    @Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		tbPersonaDao.update(obj);
	}
    
}
