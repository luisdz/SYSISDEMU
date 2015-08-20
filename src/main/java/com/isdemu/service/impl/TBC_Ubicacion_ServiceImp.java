/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.service.impl;

import com.isdemu.dao.TBC_UbicacionDao;
import com.isdemu.service.TBC_Ubicacion_Service;
import java.util.List;
import java.io.Serializable;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Walter
 */
@Service
@Transactional
public class TBC_Ubicacion_ServiceImp implements TBC_Ubicacion_Service{
    
     @Autowired
       private TBC_UbicacionDao tbUbicacionDao;

    @Override
	public void save(Object obj) {
             System.out.println("esntra aqui GET service");
		// TODO Auto-generated method stub
		tbUbicacionDao.save(obj);
	}
        
    @Override
       public List getAll() {
            System.out.println("service impl");
               // TODO Auto-generated method stub
               return tbUbicacionDao.getAll();
       }
        
   @Override
   public void delete(Serializable id) {
           // TODO Auto-generated method stub
           tbUbicacionDao.delete(id);
   }

   @Override
   public Object findByKey(Serializable id) {
           // TODO Auto-generated method stub
           return tbUbicacionDao.findByKey(id);
   }
    
}
