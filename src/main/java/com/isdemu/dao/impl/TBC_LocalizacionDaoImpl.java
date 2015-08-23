/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;

import com.isdemu.dao.TBC_LocalizacionDao;

import com.isdemu.model.TbcLocalizacion;
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
public class TBC_LocalizacionDaoImpl implements  TBC_LocalizacionDao{
    @Autowired
	private SessionFactory sessionFactory;
    
    private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
    
        @Override
	public List getAll() {
		// TODO Auto-generated method stub
            DetachedCriteria dc = DetachedCriteria.forClass(TbcLocalizacion.class);
           
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
	}
        
        @Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("esntra aqui GET dao ");
		TbcLocalizacion localizacion =(TbcLocalizacion)obj;
	        getCurrentSession().save(localizacion);
	}
        
        @Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		TbcLocalizacion localizacion = (TbcLocalizacion) getCurrentSession().get(TbcLocalizacion.class, id);
		if(localizacion!=null)
			getCurrentSession().delete(localizacion);
                        
	}
        
        @Override
	public Object findByKey(Serializable id) {
		// TODO Auto-generated method stub
		TbcLocalizacion clasA = (TbcLocalizacion) getCurrentSession().get(TbcLocalizacion.class, id);
		return clasA;
	}
        
        @Override
        public List getAllidClasi(Serializable id){
        	
            DetachedCriteria dc = DetachedCriteria.forClass(TbcLocalizacion.class,"localizacion");            
            
            dc.createAlias("localizacion.tbcClasificacionLocalizacion", "clasi");
            dc.add(Restrictions.eq("clasi.idClasificacionLocalizacion", id));         
             
           return  dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
        }
        
          @Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
            System.out.println("ingresa antes de enviar con la sesion el objeto para update");
		getCurrentSession().update(obj);
	}
}
