/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.service.impl;
 
import com.isdemu.dao.TBC_UnidadDao;
import com.isdemu.service.TBC_Unidad_Service; 
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author AlejandroPC
 */
 

@Service
@Transactional
public class TBC_Unidad_ServiceImp implements TBC_Unidad_Service {
    
    @Autowired
	private TBC_UnidadDao tbcUnidadDao;
    
    
    @Override
	public List getAll() {
             System.out.println("service impl");
		// TODO Auto-generated method stub
		return tbcUnidadDao.getAll();
	}
        
          @Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		tbcUnidadDao.save(obj);
	}
}