/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.service;

import java.util.List;
import java.io.Serializable;
/**
 *
 * @author Jose Eduardo
 */
public interface TBC_Region_Service {
    public void save(Object obj);
    public List getAll();
    public void delete(Serializable id);
    public Object findByKey(Serializable id);
}
