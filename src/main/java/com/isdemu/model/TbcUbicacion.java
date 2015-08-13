/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Jose Eduardo
 */

@Entity
@Table(name="TBC_UBICACION"
    ,schema="dbo"
   
)
public class TbcUbicacion {
     private int idUbicacion;
     private TbcLocalizacion tbcLocalizacion;
     private String nombreUbicacion;
     
     
     @Id 

    @GeneratedValue
    @Column(name="ID_UBICACION", unique=true, nullable=false)
    public int getIdUbicacion() {
        return this.idUbicacion;
    }
    
    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="ID_LOCALIZACION", nullable=false)
    public TbcLocalizacion getTbcLocalizacion() {
        return this.tbcLocalizacion;
    }
    
    public void setTbcLocalizacion(TbcLocalizacion tbcLocalizacion) {
        this.tbcLocalizacion = tbcLocalizacion;
    }

    
    @Column(name="NOMBRE_UBICACION", nullable=false, length=1024)
    public String getNombreUbicacion() {
        return this.nombreUbicacion;
    }
    
    public void setNombreUbicacion(String nombreUbicacion) {
        this.nombreUbicacion = nombreUbicacion;
    }

}
