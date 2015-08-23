/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.service.impl;

import com.isdemu.dao.TBC_EstadoInventarioDao;
import com.isdemu.service.TBC_EstadoInventario_Service;
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
public class TBC_EstadoInventario_ServiceImp implements TBC_EstadoInventario_Service {
    
     @Autowired
       private TBC_EstadoInventarioDao tbEstadoInventarioDao;

    @Override
	public void save(Object obj) {
             System.out.println("esntra aqui GET service");
		// TODO Auto-generated method stub
		tbEstadoInventarioDao.save(obj);
	}
        
    @Override
       public List getAll() {
            System.out.println("service impl");
               // TODO Auto-generated method stub
               return tbEstadoInventarioDao.getAll();
       }
        
   @Override
   public void delete(Serializable id) {
           // TODO Auto-generated method stub
           tbEstadoInventarioDao.delete(id);
   }

   @Override
   public Object findByKey(Serializable id) {
           // TODO Auto-generated method stub
           return tbEstadoInventarioDao.findByKey(id);
   }
   
      @Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		tbEstadoInventarioDao.update(obj);
	}
    
    
}
