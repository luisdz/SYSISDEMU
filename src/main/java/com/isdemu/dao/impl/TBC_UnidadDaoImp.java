/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;

import com.isdemu.dao.TBC_UnidadDao;
import com.isdemu.model.TbInventario;
import com.isdemu.model.TbcUnidad;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author AlejandroPC
 */
 

@Repository
public class TBC_UnidadDaoImp implements TBC_UnidadDao {
    
     @Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
        
        
        @Override
	public List getAll() {
		// TODO Auto-generated method stub
            DetachedCriteria dc = DetachedCriteria.forClass(TbcUnidad.class);
           // System.out.println("criteria="+dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list().get(0));
           // dc.addOrder(Order.asc("codigo_inventario"));
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
	}
        
        @Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		
		TbcUnidad unidad =(TbcUnidad)obj;
	        getCurrentSession().save(unidad);
	}
        
        @Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		TbcUnidad unidad = (TbcUnidad) getCurrentSession().get(TbcUnidad.class, id);
		if(unidad!=null)
			getCurrentSession().delete(unidad);
	}
        
        @Override
	public Object findByKey(Serializable id) {
		// TODO Auto-generated method stub
		TbcUnidad unidad = (TbcUnidad) getCurrentSession().get(TbcUnidad.class, id);
		return unidad;
	}
}