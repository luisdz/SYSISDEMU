/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;

import com.isdemu.dao.TB_DescargoDao;
import com.isdemu.dao.TB_MovimientoDao;
import com.isdemu.model.TbDescargo;
import com.isdemu.model.TbInventario;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
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
public class TB_DescargoDaoImp implements TB_DescargoDao {
    
     @Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
        
        
        @Override
	public List getAll() {
             System.out.println("dao impl descargo getall");
		// TODO Auto-generated method stub
            DetachedCriteria dc = DetachedCriteria.forClass(TbDescargo.class);
           // System.out.println("criteria="+dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list().get(0));
           // dc.addOrder(Order.asc("codigo_inventario"));
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
	}
        
        @Override
	public List getTop() {
         DetachedCriteria dc = DetachedCriteria.forClass(TbDescargo.class);
          Date fecha_finalHoy = new Date();
           Date fecha_inicial = new Date();
           
           //restar dias a la fecha
            Calendar calendar = Calendar.getInstance();	
            calendar.setTime(fecha_finalHoy);
            calendar.add(Calendar.DAY_OF_YEAR, -7);  // numero de días a añadir, o restar en caso de días<0
            fecha_inicial=calendar.getTime();
            
           dc.add(Restrictions.between("fecha",fecha_inicial, fecha_finalHoy));
            System.out.println("fecha inicial:"+fecha_inicial+"fecha final:"+fecha_finalHoy);

            
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
        }
        
        @Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		
		TbDescargo descargo =(TbDescargo)obj;
	        getCurrentSession().save(descargo);
	}
        
        @Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		TbDescargo descargo = (TbDescargo) getCurrentSession().get(TbDescargo.class, id);
		if(descargo!=null)
			getCurrentSession().delete(descargo);
	}
        
        @Override
	public Object findByKey(Serializable id) {
		// TODO Auto-generated method stub
		TbDescargo descargo = (TbDescargo) getCurrentSession().get(TbDescargo.class, id);
		return descargo;
	}
        
        
        @Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
            System.out.println("ingresa antes de enviar con la sesion el objeto para update");
		getCurrentSession().update(obj);
	}
}
