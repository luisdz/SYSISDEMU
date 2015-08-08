/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;

import com.isdemu.dao.TB_InventarioDao;

import com.isdemu.model.TbInventario;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jose Eduardo
 */
@Repository
public class TB_InventarioDaoImpl implements TB_InventarioDao {
    
     @Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
        
        @Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		
		TbInventario inventario =(TbInventario)obj;
	        getCurrentSession().save(inventario);
	}
        
        @Override
	public List<TbInventario> getAll() {
		// TODO Auto-generated method stub
            DetachedCriteria dc = DetachedCriteria.forClass(TbInventario.class);
           // System.out.println("criteria="+dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list().get(0));
           // dc.addOrder(Order.asc("codigo_inventario"));
            List<TbInventario> inventario = dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
            return inventario;
	}
        
         @Override
	public List getTop() {
		// TODO Auto-generated method stub
            DetachedCriteria dc = DetachedCriteria.forClass(TbInventario.class);
              dc.addOrder(Order.asc("idInventario"));
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
	}
        
        @Override
        public List LastCodInventario(Serializable id){
            DetachedCriteria dc = DetachedCriteria.forClass(TbInventario.class,"inv");
            dc.createAlias("inv.tbcClaseActivo", "clase");
            dc.add(Restrictions.eq("clase.idClaseActivo", id));
             dc.addOrder(Order.desc("idInventario"));
          
		return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
        }
        
        
        @Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		TbInventario inventario = (TbInventario) getCurrentSession().get(TbInventario.class, id);
		if(inventario!=null)
			getCurrentSession().delete(inventario);
	}
        
        
	@Override
	public Object findByKey(Serializable id) {
		// TODO Auto-generated method stub
		TbInventario inventario = (TbInventario) getCurrentSession().get(TbInventario.class, id);
		return inventario;
	}
        
        @Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
            System.out.println("ingresa antes de enviar con la sesion el objeto para update");
		getCurrentSession().update(obj);
	}
}
