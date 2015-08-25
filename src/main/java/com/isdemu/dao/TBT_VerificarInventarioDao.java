/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.dao;


import com.isdemu.model.TbtVerificarInventario;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Jose Eduardo
 */
public interface TBT_VerificarInventarioDao {
    public void save(Object obj);
    public List<TbtVerificarInventario> getAll();
    public void delete(Serializable id);
    public List<TbtVerificarInventario> getInventarioSobrante(Serializable id);
    public List<TbtVerificarInventario> getInventarioFaltante(Serializable id);
}
