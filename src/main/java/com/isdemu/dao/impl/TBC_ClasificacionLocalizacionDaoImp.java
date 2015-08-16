/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;

import com.isdemu.dao.TBC_ClasificacionLocalizacionDao;
import com.isdemu.model.TbcClasificacionLocalizacion;
import com.isdemu.model.TbcClasificacionLocalizacion;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Luis
 */@Repository

public class TBC_ClasificacionLocalizacionDaoImp implements TBC_ClasificacionLocalizacionDao {
 @Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
    }
    @Override
    public void save(Object obj) {
        TbcClasificacionLocalizacion claslocal =(TbcClasificacionLocalizacion)obj;
	        getCurrentSession().save(claslocal); }

    @Override
    public List getAll() {
      System.out.println("Llega al dao implements");
            DetachedCriteria dc = DetachedCriteria.forClass(TbcClasificacionLocalizacion.class);
           
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();  
    }

    @Override
    public void delete(Serializable id) {
        TbcClasificacionLocalizacion claslocal = (TbcClasificacionLocalizacion) getCurrentSession().get(TbcClasificacionLocalizacion.class, id);
		if(claslocal!=null)
			getCurrentSession().delete(claslocal);
    }

    @Override
    public Object findByKey(Serializable id) {
       TbcClasificacionLocalizacion claslocal = (TbcClasificacionLocalizacion) getCurrentSession().get(TbcClasificacionLocalizacion.class, id);
		return claslocal;  
    
    }

    @Override
    public void update(Object obj) {
        getCurrentSession().update(obj);  
    }
    
}
