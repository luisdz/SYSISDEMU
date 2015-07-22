/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.service.impl;

import com.isdemu.dao.TBC_RegionDao;
import com.isdemu.dao.TB_InventarioDao;
import com.isdemu.service.TBC_Region_Service;
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
public class TBC_Region_ServiceImp implements TBC_Region_Service {
     @Autowired
	private TBC_RegionDao tbcRegionDao;
     
     
      @Override
	public List getAll() {
             System.out.println("service impl");
		// TODO Auto-generated method stub
		return tbcRegionDao.getAll();
	}
}
