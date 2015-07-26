/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;

import com.isdemu.dao.TB_DescargoDao;
import com.isdemu.dao.TB_MovimientoDao;
import com.isdemu.model.TbDescargo;
import com.isdemu.model.TbInventario;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author AlejandroPC
 */
public class TB_DescargoDaoImp implements TB_DescargoDao {
    
     @Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
        
        
        @Override
	public List getAll() {
		// TODO Auto-generated method stub
            DetachedCriteria dc = DetachedCriteria.forClass(TbDescargo.class);
           // System.out.println("criteria="+dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list().get(0));
           // dc.addOrder(Order.asc("codigo_inventario"));
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
	}
        
        @Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		
		TbDescargo descargo =(TbDescargo)obj;
	        getCurrentSession().save(descargo);
	}
        
        @Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		TbDescargo descargo = (TbDescargo) getCurrentSession().get(TbDescargo.class, id);
		if(descargo!=null)
			getCurrentSession().delete(descargo);
	}
        
        @Override
	public Object findByKey(Serializable id) {
		// TODO Auto-generated method stub
		TbDescargo descargo = (TbDescargo) getCurrentSession().get(TbDescargo.class, id);
		return descargo;
	}
}
