/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;

import com.isdemu.dao.TBC_RegionDao;

import com.isdemu.model.TbcRegion;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jose Eduardo
 */
@Repository
public class TBC_RegionDaoImpl implements TBC_RegionDao{
     @Autowired
	private SessionFactory sessionFactory;
     
     private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
     @Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("esntra aqui GET dao ");
		TbcRegion region =(TbcRegion)obj;
	        getCurrentSession().save(region);
	}
        
      @Override
	public List getAll() {
		// TODO Auto-generated method stub
            DetachedCriteria dc = DetachedCriteria.forClass(TbcRegion.class);
           // System.out.println("criteria="+dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list().get(0));
           // dc.addOrder(Order.asc("codigo_inventario"));
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
	}
        
        @Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		TbcRegion region = (TbcRegion) getCurrentSession().get(TbcRegion.class, id);
		if(region!=null)
			getCurrentSession().delete(region);
                        
	}
        
        
	@Override
	public Object findByKey(Serializable id) {
		// TODO Auto-generated method stub
		TbcRegion region = (TbcRegion) getCurrentSession().get(TbcRegion.class, id);
		return region;
	}
}
