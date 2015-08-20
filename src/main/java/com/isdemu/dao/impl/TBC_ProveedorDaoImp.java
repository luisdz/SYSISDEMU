/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;

import com.isdemu.dao.TBC_ProveedorDao;
import com.isdemu.model.TbcPoliza;
import com.isdemu.model.TbcProveedor;
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
public class TBC_ProveedorDaoImp implements TBC_ProveedorDao{
    
      @Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
    }

        
    @Override
    public void save(Object obj) {
        TbcProveedor proveedor =(TbcProveedor)obj;
	        getCurrentSession().save(proveedor);
    }

    @Override
    public List getAll() {
        
     System.out.println("Llega al dao implements");
            DetachedCriteria dc = DetachedCriteria.forClass(TbcProveedor.class);
           
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
    }

    @Override
    public void delete(Serializable id) {
        TbcProveedor proveedor = (TbcProveedor) getCurrentSession().get(TbcProveedor.class, id);
		if(proveedor!=null)
			getCurrentSession().delete(proveedor);
    }

    @Override
    public Object findByKey(Serializable id) {
        TbcProveedor proveedor = (TbcProveedor) getCurrentSession().get(TbcProveedor.class, id);
		return proveedor;
    }

    @Override
    public void update(Object obj) {
      getCurrentSession().update(obj);  
    }
    
}
