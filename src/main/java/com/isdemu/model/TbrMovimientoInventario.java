/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Jose Eduardo
 */

@Entity
@Table(name="TBR_MOVIMIENTO_INVENTARIO"
    ,schema="dbo"
   
)
public class TbrMovimientoInventario {
    private int idMovimientoInventario;
     private TbMovimiento tbMovimiento;
     private Integer idInventario;
     
     
 @Id 

    
    @Column(name="ID_MOVIMIENTO_INVENTARIO", unique=true, nullable=false)
    public int getIdMovimientoInventario() {
        return this.idMovimientoInventario;
    }
    
    public void setIdMovimientoInventario(int idMovimientoInventario) {
        this.idMovimientoInventario = idMovimientoInventario;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="ID_MOVIMIENTO")
    public TbMovimiento getTbMovimiento() {
        return this.tbMovimiento;
    }
    
    public void setTbMovimiento(TbMovimiento tbMovimiento) {
        this.tbMovimiento = tbMovimiento;
    }

    
    @Column(name="ID_INVENTARIO")
    public Integer getIdInventario() {
        return this.idInventario;
    }
    
    public void setIdInventario(Integer idInventario) {
        this.idInventario = idInventario;
    }




}


