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
@Table(name="TBC_CLASIFICACION_LOCALIZACION"
    ,schema="dbo"
   
)
public class TbcClasificacionLocalizacion {
    
     private int idClasificacionLocalizacion;
     private String nombreClasificacion;
     
     @Id 
     @GeneratedValue
    
    @Column(name="ID_CLASIFICACION_LOCALIZACION", unique=true, nullable=false)
    public int getIdClasificacionLocalizacion() {
        return this.idClasificacionLocalizacion;
    }
    
    public void setIdClasificacionLocalizacion(int idClasificacionLocalizacion) {
        this.idClasificacionLocalizacion = idClasificacionLocalizacion;
    }

    
    @Column(name="NOMBRE_CLASIFICACION", nullable=false, length=1024)
    public String getNombreClasificacion() {
        return this.nombreClasificacion;
    }
    
    public void setNombreClasificacion(String nombreClasificacion) {
        this.nombreClasificacion = nombreClasificacion;
    }
    
}
