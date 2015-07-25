/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;

import com.isdemu.dao.TBC_LocalizacionDao;

import com.isdemu.model.TbcLocalizacion;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jose Eduardo
 */
@Repository
public class TBC_LocalizacionDaoImpl implements  TBC_LocalizacionDao{
    @Autowired
	private SessionFactory sessionFactory;
    
    private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
    
        @Override
	public List getAll() {
		// TODO Auto-generated method stub
            DetachedCriteria dc = DetachedCriteria.forClass(TbcLocalizacion.class);
           
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
	}
        
        
        @Override
	public Object findByKey(Serializable id) {
		// TODO Auto-generated method stub
		TbcLocalizacion clasA = (TbcLocalizacion) getCurrentSession().get(TbcLocalizacion.class, id);
		return clasA;
	}
}
