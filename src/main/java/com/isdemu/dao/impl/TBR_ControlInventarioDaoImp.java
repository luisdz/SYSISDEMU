/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;

import com.isdemu.dao.TBR_ControlInventarioDao;
import com.isdemu.model.TbrControlSalidaInventario;
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
public class TBR_ControlInventarioDaoImp  implements TBR_ControlInventarioDao {
    
    @Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
        
        @Override
	public void save(Object obj) 
        {
		// TODO Auto-generated method stub
		
		 TbrControlSalidaInventario control =(TbrControlSalidaInventario)obj;
	        getCurrentSession().save(control);
	} 
    
        @Override
    public Object findByKey(Serializable id) {
        
        
        TbrControlSalidaInventario control = (TbrControlSalidaInventario) getCurrentSession().get(TbrControlSalidaInventario.class, id);
		return control;
        
    }
}