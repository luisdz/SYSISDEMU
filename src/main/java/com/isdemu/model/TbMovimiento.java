/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

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
     private TbInventario tbInventario;
     private int NMovimiento;
     private Date fechaMovimiento;
     private String razonCambio;
     private Integer userInsert;
     private Date fechaInsert;
     private int userUpdate;
     private Date fechaUpdate;
     
     
      @Id 

    @GeneratedValue
    @Column(name="ID_MOVIMIENTO", unique=true, nullable=false)
    public int getIdMovimiento() {
        return this.idMovimiento;
    }
    
    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_INVENTARIO", nullable=false)
    public TbInventario getTbInventario() {
        return this.tbInventario;
    }
    
    public void setTbInventario(TbInventario tbInventario) {
        this.tbInventario = tbInventario;
    }

    
    @Column(name="N_MOVIMIENTO", nullable=false)
    public int getNMovimiento() {
        return this.NMovimiento;
    }
    
    public void setNMovimiento(int NMovimiento) {
        this.NMovimiento = NMovimiento;
    }

     @Temporal(TemporalType.DATE)
     @DateTimeFormat(pattern = "dd-mm-yyyy")
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

    
    @Column(name="USER_UPDATE", nullable=false)
    public int getUserUpdate() {
        return this.userUpdate;
    }
    
    public void setUserUpdate(int userUpdate) {
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
