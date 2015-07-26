/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.service.impl;

import com.isdemu.dao.TB_MovimientoDao;
import com.isdemu.service.TB_Movimiento_Service;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author AlejandroPC
 */
public class TB_Descargo_ServiceImp implements TB_Movimiento_Service {
    
    @Autowired
	private TB_MovimientoDao tbDescargoDao;
    
    
    @Override
	public List getAll() {
             System.out.println("service impl descargo");
		// TODO Auto-generated method stub
		return tbDescargoDao.getAll();
	}
        
          @Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		tbDescargoDao.save(obj);
	}
        
        @Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		tbDescargoDao.delete(id);
	}
        
        @Override
	public Object findByKey(Serializable id) {
		// TODO Auto-generated method stub
		return tbDescargoDao.findByKey(id);
	}
}