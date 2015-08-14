/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Jose Eduardo
 */

@Entity
@Table(name="TBC_CLASE_ACTIVO"
    ,schema="dbo"
    
)
public class TbcClaseActivo {
    
    
     private int idClaseActivo;
     private TbcClasificacionActivo tbcClasificacionActivo;
     private String nombreClase;
     private String codigoClase;

     @Id 
      @GeneratedValue
    @Column(name="ID_CLASE_ACTIVO", unique=true, nullable=false)
    public int getIdClaseActivo() {
        return this.idClaseActivo;
    }
    
    public void setIdClaseActivo(int idClaseActivo) {
        this.idClaseActivo = idClaseActivo;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="ID_CLASIFICACION_ACTIVO", nullable=false)
    public TbcClasificacionActivo getTbcClasificacionActivo() {
        return this.tbcClasificacionActivo;
    }
    
    public void setTbcClasificacionActivo(TbcClasificacionActivo tbcClasificacionActivo) {
        this.tbcClasificacionActivo = tbcClasificacionActivo;
    }

    
    @Column(name="NOMBRE_CLASE", nullable=false, length=1024)
    public String getNombreClase() {
        return this.nombreClase;
    }
    
    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    
    @Column(name="CODIGO_CLASE", length=1024)
    public String getCodigoClase() {
        return this.codigoClase;
    }
    
    public void setCodigoClase(String codigoClase) {
        this.codigoClase = codigoClase;
    }




}


