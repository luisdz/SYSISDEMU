/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.service.impl;


import com.isdemu.dao.TB_MovimientoDao;
import com.isdemu.service.TB_Movimiento_Service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author AlejandroPC
 */

@Service
@Transactional
public class TB_MovimientoServiceImp implements TB_Movimiento_Service {
    
    @Autowired
	private TB_MovimientoDao tbMovimientoDao;
    
    
    @Override
	public List getAll() {
             System.out.println("service impl");
		// TODO Auto-generated method stub
		return tbMovimientoDao.getAll();
	}
}