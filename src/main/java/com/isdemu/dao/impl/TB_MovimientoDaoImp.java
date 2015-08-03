/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;


import com.isdemu.dao.TB_MovimientoDao;
import com.isdemu.model.TbInventario;


import com.isdemu.model.TbMovimiento;
import com.isdemu.model.TbrMovimientoInventario;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 *
 * @author AlejandroPC
 */


@Repository
public class TB_MovimientoDaoImp implements TB_MovimientoDao {
    
     @Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
        
        
        @Override
	public List getAll() {
		// TODO Auto-generated method stub
            DetachedCriteria dc = DetachedCriteria.forClass(TbMovimiento.class);
           // System.out.println("criteria="+dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list().get(0));
           // dc.addOrder(Order.asc("codigo_inventario"));
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
	}
        
        @Override
	public List getTop() {
		// TODO Auto-generated method stub
            DetachedCriteria dc = DetachedCriteria.forClass(TbMovimiento.class,"movimiento");
            dc.setFetchMode("TbrMovimientoInventario", FetchMode.JOIN);
            
           Date highestDate = new Date();
           
            System.out.println("fecha"+highestDate);

            dc.add(Restrictions.ge("fechaMovimiento", highestDate));
           // dc.add(Restrictions.lt("fechaMovimiento", highestDate));
             
      
             
           return  dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
          
            	}
        
        @Override
	public List getMovInv(Serializable id) {
            
		
            DetachedCriteria dc = DetachedCriteria.forClass(TbrMovimientoInventario.class,"movimientoInventario");            
            
            dc.createAlias("movimientoInventario.tbMovimiento", "movi");
            dc.add(Restrictions.eq("movi.idMovimiento", id));         
             
           return  dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
          
            	}
        
        
        @Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		
		TbMovimiento movimiento =(TbMovimiento)obj;
	        getCurrentSession().save(movimiento);
	}
        
        @Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		TbMovimiento movimiento = (TbMovimiento) getCurrentSession().get(TbMovimiento.class, id);
		if(movimiento!=null)
			getCurrentSession().delete(movimiento);
	}
        
        @Override
	public Object findByKey(Serializable id) {
		// TODO Auto-generated method stub
		TbMovimiento movimiento = (TbMovimiento) getCurrentSession().get(TbMovimiento.class, id);
		return movimiento;
	}
        
        @Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
            System.out.println("ingresa antes de enviar con la sesion el objeto para update");
		getCurrentSession().update(obj);
	}
        
}
