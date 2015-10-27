/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao;

import java.io.Serializable;
import java.util.List;
/**
 *
 * @author Walter
 */
public interface TBS_UsuarioDao {
    
    public void save(Object obj); 
    public List getAll();
    public void delete(Serializable id);
    public Object findByKey(Serializable id);
    public String getPassword(String usuario);
    public String getRol(String usuario);
    public void update(Object obj);
    
}
