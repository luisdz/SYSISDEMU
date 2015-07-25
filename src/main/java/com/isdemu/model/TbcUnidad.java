/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name="TBC_UNIDAD"
    ,schema="dbo"
    
)
public class TbcUnidad {
    
   
     private int idUnidad;
     private TbcRegion tbcRegion;
     private String nombreUnidad;
     private String descripcion;
     private Set<TbcPersona> tbcPersonas = new HashSet<TbcPersona>(0);

    
     @Id 

    
    @Column(name="ID_UNIDAD", unique=true, nullable=false)
    public int getIdUnidad() {
        return this.idUnidad;
    }
    
    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_REGION", nullable=false)
    public TbcRegion getTbcRegion() {
        return this.tbcRegion;
    }
    
    public void setTbcRegion(TbcRegion tbcRegion) {
        this.tbcRegion = tbcRegion;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbcUnidad")
    public Set<TbcPersona> getTbcPersonas() {
        return this.tbcPersonas;
    }
    
    public void setTbcPersonas(Set<TbcPersona> tbcPersonas) {
        this.tbcPersonas = tbcPersonas;
    }




}


