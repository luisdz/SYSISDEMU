/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;

import com.isdemu.dao.TBR_MovimientoInventarioDao;
import com.isdemu.model.TbMovimiento;
import com.isdemu.model.TbrMovimientoInventario;
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
 * @author AlejandroPC
 */
@Repository
public class TBR_MovimientoInventarioDaoImp implements TBR_MovimientoInventarioDao  {
    
    @Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
        
        @Override
	public void save(Object obj) 
        {
		// TODO Auto-generated method stub
		
		 TbrMovimientoInventario movimiento =(TbrMovimientoInventario)obj;
	        getCurrentSession().save(movimiento);
	} 

    @Override
    public void delete(Serializable id) {
        TbrMovimientoInventario movimiento = (TbrMovimientoInventario) getCurrentSession().get(TbrMovimientoInventario.class, id);
		if(movimiento!=null)
			getCurrentSession().delete(movimiento);
    }
    
    @Override
    public List findByInv(Serializable id) {
        DetachedCriteria dc = DetachedCriteria.forClass(TbrMovimientoInventario.class,"movimientoInventario");            
            
            dc.createAlias("movimientoInventario.tbInventario", "inv");
            dc.add(Restrictions.eq("inv.idInventario", id));       
             
           return  dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
    }

    @Override
    public Object findByKey(Serializable id) {
        
        
        TbrMovimientoInventario movimiento = (TbrMovimientoInventario) getCurrentSession().get(TbrMovimientoInventario.class, id);
		return movimiento;
        
    }
    
    @Override
	public List getAll() {
		// TODO Auto-generated method stub
            DetachedCriteria dc = DetachedCriteria.forClass(TbrMovimientoInventario.class);
           // System.out.println("criteria="+dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list().get(0));
           // dc.addOrder(Order.asc("codigo_inventario"));
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
	}
    
}
