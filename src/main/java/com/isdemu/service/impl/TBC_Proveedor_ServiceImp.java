/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.service.impl;

import com.isdemu.dao.TBC_ProveedorDao;
import com.isdemu.service.TBC_Proveedor_Service;
import java.io.Serializable;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Luis
 */
@Service
@Transactional
public class TBC_Proveedor_ServiceImp implements TBC_Proveedor_Service {

     @Autowired
	private TBC_ProveedorDao tbcProveedorDao;
    
    @Override
    public void save(Object obj) {
       tbcProveedorDao.save(obj);
    }

    @Override
    public List getAll() {
        return tbcProveedorDao.getAll();
    }

    @Override
    public void delete(Serializable id) {
        tbcProveedorDao.delete(id);
    }

    @Override
    public Object findByKey(Serializable id) {
        return tbcProveedorDao.findByKey(id);
    }

    @Override
    public void update(Object obj) {
       tbcProveedorDao.update(obj);
    }
    
}
