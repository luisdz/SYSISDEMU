/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.service.impl;

import com.isdemu.dao.TB_PrestamoDao;
import com.isdemu.service.TB_Prestamo_Service;
import java.util.List;
import java.io.Serializable;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miranda
 */
@Service
@Transactional
public class TB_Prestamo_ServiceImpl implements TB_Prestamo_Service {
    
     @Autowired
       private TB_PrestamoDao tbPrestamoDao;

    @Override
	public void save(Object obj) {
             System.out.println("esntra aqui GET service");
		// TODO Auto-generated method stub
		tbPrestamoDao.save(obj);
	}
        
    @Override
       public List getAll() {
            System.out.println("service impl");
               // TODO Auto-generated method stub
               return tbPrestamoDao.getAll();
       }
        
   @Override
   public void delete(Serializable id) {
           // TODO Auto-generated method stub
           tbPrestamoDao.delete(id);
   }

   @Override
   public Object findByKey(Serializable id) {
           // TODO Auto-generated method stub
           return tbPrestamoDao.findByKey(id);
   }
}
