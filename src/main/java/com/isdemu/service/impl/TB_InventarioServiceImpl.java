/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.service.impl;

import com.isdemu.dao.TB_InventarioDao;
import com.isdemu.service.TB_Inventario_Service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Eduardo
 */

@Service
@Transactional
public class TB_InventarioServiceImpl implements TB_Inventario_Service {
    
    @Autowired
	private TB_InventarioDao tbInventarioDao;
    
    
    @Override
	public List getAll() {
		// TODO Auto-generated method stub
		return tbInventarioDao.getAll();
	}
}
