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
@Table(name="TBC_LOCALIZACION"
    ,schema="dbo"
    
)
public class TbcLocalizacion {
   
     private int idLocalizacion;
     private TbcClasificacionLocalizacion tbcClasificacionLocalizacion;
     private TbcRiesgo tbcRiesgo;
     private int idRegion;
     private String nombreLocalizacion;
     
       @Id 
@GeneratedValue
    
    @Column(name="ID_LOCALIZACION", unique=true, nullable=false)
    public int getIdLocalizacion() {
        return this.idLocalizacion;
    }
    
    public void setIdLocalizacion(int idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="ID_CLASIFICACION_LOCALIZACION", nullable=false)
    public TbcClasificacionLocalizacion getTbcClasificacionLocalizacion() {
        return this.tbcClasificacionLocalizacion;
    }
    
    public void setTbcClasificacionLocalizacion(TbcClasificacionLocalizacion tbcClasificacionLocalizacion) {
        this.tbcClasificacionLocalizacion = tbcClasificacionLocalizacion;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="ID_RIESGO")
    public TbcRiesgo getTbcRiesgo() {
        return this.tbcRiesgo;
    }
    
    public void setTbcRiesgo(TbcRiesgo tbcRiesgo) {
        this.tbcRiesgo = tbcRiesgo;
    }

    
    @Column(name="ID_REGION", nullable=false)
    public int getIdRegion() {
        return this.idRegion;
    }
    
    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    
    @Column(name="NOMBRE_LOCALIZACION", nullable=false, length=1024)
    public String getNombreLocalizacion() {
        return this.nombreLocalizacion;
    }
    
    public void setNombreLocalizacion(String nombreLocalizacion) {
        this.nombreLocalizacion = nombreLocalizacion;
    }






}


