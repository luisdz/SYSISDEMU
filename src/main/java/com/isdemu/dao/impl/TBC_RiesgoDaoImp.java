/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;

import com.isdemu.dao.TBC_RiesgoDao;
import com.isdemu.model.TbcProveedor;
import com.isdemu.model.TbcRiesgo;
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
 */
@Repository
public class TBC_RiesgoDaoImp implements TBC_RiesgoDao{
 @Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
    }
    @Override
    public void save(Object obj) {
    TbcRiesgo proveedor =(TbcRiesgo)obj;
	        getCurrentSession().save(proveedor);    
    }

    @Override
    public List getAll() 
    {
        System.out.println("Llega al dao implements");
            DetachedCriteria dc = DetachedCriteria.forClass(TbcRiesgo.class);
           
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
    }

    @Override
    public void delete(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object findByKey(Serializable id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
