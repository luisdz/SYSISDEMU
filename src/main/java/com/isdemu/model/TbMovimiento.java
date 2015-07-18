/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jose Eduardo
 */

@Entity
@Table(name="TB_MOVIMIENTO"
    ,schema="dbo"
   
)
public class TbMovimiento {
     private int idMovimiento;
     private Date fechaMovimiento;
     private String razonCambio;
     private Integer userInsert;
     private Date fechaInsert;
     private Integer userUpdate;
     private Date fechaUpdate;
     
     
     
      @Id 

    
    @Column(name="ID_MOVIMIENTO", unique=true, nullable=false)
    public int getIdMovimiento() {
        return this.idMovimiento;
    }
    
    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHA_MOVIMIENTO", nullable=false, length=23)
    public Date getFechaMovimiento() {
        return this.fechaMovimiento;
    }
    
    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    
    @Column(name="RAZON_CAMBIO", nullable=false, length=1024)
    public String getRazonCambio() {
        return this.razonCambio;
    }
    
    public void setRazonCambio(String razonCambio) {
        this.razonCambio = razonCambio;
    }

    
    @Column(name="USER_INSERT")
    public Integer getUserInsert() {
        return this.userInsert;
    }
    
    public void setUserInsert(Integer userInsert) {
        this.userInsert = userInsert;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHA_INSERT", length=23)
    public Date getFechaInsert() {
        return this.fechaInsert;
    }
    
    public void setFechaInsert(Date fechaInsert) {
        this.fechaInsert = fechaInsert;
    }

    
    @Column(name="USER_UPDATE")
    public Integer getUserUpdate() {
        return this.userUpdate;
    }
    
    public void setUserUpdate(Integer userUpdate) {
        this.userUpdate = userUpdate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHA_UPDATE", length=23)
    public Date getFechaUpdate() {
        return this.fechaUpdate;
    }
    
    public void setFechaUpdate(Date fechaUpdate) {
        this.fechaUpdate = fechaUpdate;
    }
}
