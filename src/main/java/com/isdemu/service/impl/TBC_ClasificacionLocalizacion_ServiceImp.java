/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.service.impl;

import com.isdemu.dao.TBC_ClasificacionLocalizacionDao;
import com.isdemu.service.TBC_ClasificacionLocalizacion_Service;
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
public class TBC_ClasificacionLocalizacion_ServiceImp implements TBC_ClasificacionLocalizacion_Service {
 
    @Autowired
	private TBC_ClasificacionLocalizacionDao tbClasiDao;
    
    
    @Override
    public void save(Object obj) {
        tbClasiDao.save(obj);
    }

    @Override
    public List getAll() {
        return tbClasiDao.getAll();
    }

    @Override
    public void delete(Serializable id) {
        tbClasiDao.delete(id);
    }

    @Override
    public Object findByKey(Serializable id) {
        return tbClasiDao.findByKey(id);
    }

    @Override
    public void update(Object obj) {
         tbClasiDao.update(obj);
    }
    
}
