/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jose Eduardo
 */

@Entity
@Table(name="TBC_ESTADO_INVENTARIO"
    ,schema="dbo"
   
)
public class TbcEstadoInventario {
     private int idEstado;
     private String nombreEstado;
     private String descripcion;
     
      @Id 

    @GeneratedValue
    @Column(name="ID_ESTADO", unique=true, nullable=false)
    public int getIdEstado() {
        return this.idEstado;
    }
    
    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    
    @Column(name="NOMBRE_ESTADO", nullable=false, length=1024)
    public String getNombreEstado() {
        return this.nombreEstado;
    }
    
    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    
    @Column(name="DESCRIPCION")
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
