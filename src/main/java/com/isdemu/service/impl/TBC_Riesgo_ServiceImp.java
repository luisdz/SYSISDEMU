/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.service.impl;

import com.isdemu.dao.TBC_ProveedorDao;
import com.isdemu.dao.TBC_RiesgoDao;
import com.isdemu.service.TBC_Riesgo_Service;
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
public class TBC_Riesgo_ServiceImp implements TBC_Riesgo_Service {

     @Autowired
	private TBC_RiesgoDao tbcRiesgoDao;
    
    @Override
    public void save(Object obj) {
       tbcRiesgoDao.save(obj);
    }

    @Override
    public List getAll() {
        return tbcRiesgoDao.getAll();
    }

    @Override
    public void delete(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object findByKey(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
