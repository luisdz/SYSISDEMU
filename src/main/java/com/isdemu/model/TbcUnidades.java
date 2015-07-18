/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jose Eduardo
 */

@Entity
@Table(name="TBC_UNIDADES"
    ,schema="dbo"
   
)
public class TbcUnidades {
    
     private int idUnidad;
     private String nombreUnidad;
     private String descripcion;
     
     
      @Id 

    
    @Column(name="ID_UNIDAD", unique=true, nullable=false)
    public int getIdUnidad() {
        return this.idUnidad;
    }
    
    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
    }

    
    @Column(name="NOMBRE_UNIDAD", nullable=false, length=1024)
    public String getNombreUnidad() {
        return this.nombreUnidad;
    }
    
    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    
    @Column(name="DESCRIPCION", length=1024)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
