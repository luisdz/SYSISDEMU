/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;

import com.isdemu.dao.TBR_PrestamoInventarioDao;
import com.isdemu.model.TbrPrestamoEquipoInventario;
import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 *
 * @author Walter
 */
@Repository
public class TBR_PrestamoInventarioDaoImp implements TBR_PrestamoInventarioDao  {
    
    @Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
        
        @Override
	public void save(Object obj) 
        {
		// TODO Auto-generated method stub
		
		 TbrPrestamoEquipoInventario prestamo =(TbrPrestamoEquipoInventario)obj;
	        getCurrentSession().save(prestamo);
	} 
    
        @Override
    public Object findByKey(Serializable id) {
        
        
        TbrPrestamoEquipoInventario prestamo = (TbrPrestamoEquipoInventario) getCurrentSession().get(TbrPrestamoEquipoInventario.class, id);
		return prestamo;
        
    }
}
