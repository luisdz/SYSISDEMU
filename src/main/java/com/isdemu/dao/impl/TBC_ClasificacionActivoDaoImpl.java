/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;

import com.isdemu.dao.TbcClasificacionActivoDao;
import com.isdemu.model.TbInventario;
import com.isdemu.model.TbcClasificacionActivo;
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
public class TBC_ClasificacionActivoDaoImpl implements TbcClasificacionActivoDao{
    
    @Autowired
	private SessionFactory sessionFactory;
    
    private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
    
        @Override
	public List getAll() {
		// TODO Auto-generated method stub
            DetachedCriteria dc = DetachedCriteria.forClass(TbcClasificacionActivo.class);
            dc.add(Restrictions.ne("idClasificacionActivo", 1));
                    
            
           // System.out.println("criteria="+dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list().get(0));
           // dc.addOrder(Order.asc("codigo_inventario"));
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
	}
        
        
        @Override
	public Object findByKey(Serializable id) {
		// TODO Auto-generated method stub
		TbcClasificacionActivo clasA = (TbcClasificacionActivo) getCurrentSession().get(TbcClasificacionActivo.class, id);
		return clasA;
	}
}
