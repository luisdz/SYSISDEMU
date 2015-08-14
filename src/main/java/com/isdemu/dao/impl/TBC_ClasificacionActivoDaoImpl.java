/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;

import com.isdemu.dao.TbcClasificacionActivoDao;
import com.isdemu.model.TbInventario;
import com.isdemu.model.TbcClasificacionActivo;
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
 * @author Jose Eduardo
 */
@Repository
public class TBC_ClasificacionActivoDaoImpl implements TbcClasificacionActivoDao{
    
    @Autowired
	private SessionFactory sessionFactory;
    
    private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
    
     @Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		
		TbcClasificacionActivo clasiActivo =(TbcClasificacionActivo)obj;
	        getCurrentSession().save(clasiActivo);
	}
        @Override
	public List getAll() {
		// TODO Auto-generated method stub
            DetachedCriteria dc = DetachedCriteria.forClass(TbcClasificacionActivo.class);
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
	}
        
        
        @Override
	public Object findByKey(Serializable id) {
		// TODO Auto-generated method stub
		TbcClasificacionActivo clasA = (TbcClasificacionActivo) getCurrentSession().get(TbcClasificacionActivo.class, id);
		return clasA;
	}
        
        
        @Override
	public List getTop() {
		// TODO Auto-generated method stub
            DetachedCriteria dc = DetachedCriteria.forClass(TbcClasificacionActivo.class);
              
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
	}
        
        @Override
        public List getAllidClasi(Serializable id){
        	
            DetachedCriteria dc = DetachedCriteria.forClass(TbcClasificacionActivo.class,"clase");            
            
           // dc.createAlias("clase.tbcClasificacionActivo", "clasi");
            //dc.add(Restrictions.eq("clasi.idClasificacionActivo", id));         
             
           return  dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
        }
        
        @Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		TbcClasificacionActivo clasiActivo = (TbcClasificacionActivo) getCurrentSession().get(TbcClasificacionActivo.class, id);
		if(clasiActivo!=null)
			getCurrentSession().delete(clasiActivo);
	}
        
         @Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
            System.out.println("ingresa antes de enviar con la sesion el objeto para update");
		getCurrentSession().update(obj);
	}
}
