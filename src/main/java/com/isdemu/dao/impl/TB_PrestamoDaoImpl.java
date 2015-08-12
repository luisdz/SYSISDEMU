/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao.impl;

import com.isdemu.dao.TB_PrestamoDao;
import com.isdemu.model.TbPrestamoEquipo;
import com.isdemu.model.TbrPrestamoEquipoInventario;
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
 * @author Miranda
 */
@Repository
public class TB_PrestamoDaoImpl implements TB_PrestamoDao {
    
     @Autowired
	private SessionFactory sessionFactory;
    
    private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

    
    @Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("esntra aqui GET dao ");
		TbPrestamoEquipo prestamo =(TbPrestamoEquipo)obj;
	        getCurrentSession().save(prestamo);
	}
        
        
     @Override
	public List getAll() {
		// TODO Auto-generated method stub
            DetachedCriteria dc = DetachedCriteria.forClass(TbPrestamoEquipo.class);
           // System.out.println("criteria="+dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list().get(0));
           // dc.addOrder(Order.asc("codigo_inventario"));
            return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
	}
                
        @Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		TbPrestamoEquipo prestamo = (TbPrestamoEquipo) getCurrentSession().get(TbPrestamoEquipo.class, id);
		if(prestamo!=null)
			getCurrentSession().delete(prestamo);
                        
	}
        
        
	@Override
	public Object findByKey(Serializable id) {
		// TODO Auto-generated method stub
		TbPrestamoEquipo prestamo = (TbPrestamoEquipo) getCurrentSession().get(TbPrestamoEquipo.class, id);
		return prestamo;
	}
        
        @Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
            System.out.println("ingresa antes de enviar con la sesion el objeto para update");
		getCurrentSession().update(obj);
	}
        
        
        @Override
	public List getPreInv(Serializable id) {
            
		System.out.println("Entra actualiza3");
            DetachedCriteria dc = DetachedCriteria.forClass(TbrPrestamoEquipoInventario.class,"prestamoInventario");            
            
            dc.createAlias("prestamoInventario.tbPrestamoEquipo", "pres");
            dc.add(Restrictions.eq("pres.idPrestamoEquipo", id));         
             System.out.println("Entra actualiza4");
           return  dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
          
            }
        
        @Override
    public List LastIdPrestamo() {
        DetachedCriteria dc = DetachedCriteria.forClass(TbPrestamoEquipo.class,"pre");
            
             dc.addOrder(Order.desc("idPrestamoEquipo"));
          
		return dc.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
    }
    
}
