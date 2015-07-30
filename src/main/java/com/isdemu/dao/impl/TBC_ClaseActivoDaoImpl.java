/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;

import com.isdemu.dao.TBC_ClaseActivoDao;

import com.isdemu.model.TbcClaseActivo;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jose Eduardo
 */
@Repository
public class TBC_ClaseActivoDaoImpl implements TBC_ClaseActivoDao{
     @Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
        
        @Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		
		TbcClaseActivo claseActivo =(TbcClaseActivo)obj;
	        getCurrentSession().save(claseActivo);
	}
        
        @Override
	public List getAll() {
		// TODO Auto-generated method stub
            DetachedCriteria dc = DetachedCriteria.forClass(TbcClaseActivo.class);
           // System.out.println("criteria="+dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list().get(0));
           // dc.addOrder(Order.asc("codigo_inventario"));
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
	}
        
         @Override
	public List getTop() {
		// TODO Auto-generated method stub
            DetachedCriteria dc = DetachedCriteria.forClass(TbcClaseActivo.class);
              
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
	}
        
        
        @Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		TbcClaseActivo claseActivo = (TbcClaseActivo) getCurrentSession().get(TbcClaseActivo.class, id);
		if(claseActivo!=null)
			getCurrentSession().delete(claseActivo);
	}
        
        
	@Override
	public Object findByKey(Serializable id) {
		// TODO Auto-generated method stub
		TbcClaseActivo claseActivo = (TbcClaseActivo) getCurrentSession().get(TbcClaseActivo.class, id);
		return claseActivo;
	}
        
        @Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
            System.out.println("ingresa antes de enviar con la sesion el objeto para update");
		getCurrentSession().update(obj);
	}
}
