/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;

import com.isdemu.dao.TBC_PolizaDao;

import com.isdemu.model.TbInventario;
import com.isdemu.model.TbcPoliza;

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
public class TBC_PolizaDaoImp implements TBC_PolizaDao {
    
     @Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
        
         @Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		
		TbcPoliza poliza =(TbcPoliza)obj;
	        getCurrentSession().save(poliza);
	}
        
        @Override
	public List getAll() {
		
             System.out.println("Llega al dao implements");
            DetachedCriteria dc = DetachedCriteria.forClass(TbcPoliza.class);
           
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
	}
        
        @Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		TbcPoliza poliza = (TbcPoliza) getCurrentSession().get(TbcPoliza.class, id);
		if(poliza!=null)
			getCurrentSession().delete(poliza);
	}
        
        @Override
	public Object findByKey(Serializable id) {
		// TODO Auto-generated method stub
		TbcPoliza poliza = (TbcPoliza) getCurrentSession().get(TbcPoliza.class, id);
		return poliza;
	}
        
        @Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
            System.out.println("ingresa antes de enviar con la sesion el objeto para update");
		getCurrentSession().update(obj);
	}
}
