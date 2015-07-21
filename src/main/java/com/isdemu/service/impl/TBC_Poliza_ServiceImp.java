/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.service.impl;

import com.isdemu.dao.TBC_PolizaDao;
import com.isdemu.service.TBC_Poliza_Service;
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
public class TBC_Poliza_ServiceImp implements TBC_Poliza_Service {
    
    @Autowired
	private TBC_PolizaDao tbPolizaDao;
    
    
    @Override
	public List getAll() {
             System.out.println("service impl");
		// TODO Auto-generated method stub
		return tbPolizaDao.getAll();
	}
}