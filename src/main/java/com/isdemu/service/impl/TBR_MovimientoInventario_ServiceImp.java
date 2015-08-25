/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.service.impl;

import com.isdemu.dao.TBR_MovimientoInventarioDao;
import com.isdemu.dao.TB_MovimientoDao;
import com.isdemu.service.TBR_MovimientoInventario_Service;
import java.io.Serializable;
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
public class TBR_MovimientoInventario_ServiceImp implements TBR_MovimientoInventario_Service{
    
     @Autowired
	private TBR_MovimientoInventarioDao tbrMovimientoInventarioDao;
     
     
     @Override
	public List getAll() {
             System.out.println("service impl");
		// TODO Auto-generated method stub
		return tbrMovimientoInventarioDao.getAll();
	}

    @Override
    public void save(Object obj) {
        tbrMovimientoInventarioDao.save(obj);
    }

    @Override
    public void delete(Serializable id) {
        tbrMovimientoInventarioDao.delete(id);
    }

    @Override
    public Object findByKey(Serializable id) {
        return tbrMovimientoInventarioDao.findByKey(id);
    }
    
    
}
