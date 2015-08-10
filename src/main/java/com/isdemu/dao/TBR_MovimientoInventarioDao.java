/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao;

import java.io.Serializable;

/**
 *
 * @author AlejandroPC
 */
public interface TBR_MovimientoInventarioDao {
    
    public void save(Object obj);
    public void delete(Serializable id);
    public Object findByKey(Serializable id);
}
