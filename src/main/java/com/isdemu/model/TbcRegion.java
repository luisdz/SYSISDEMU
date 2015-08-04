/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Jose Eduardo
 */

@Entity
@Table(name="TBC_REGION"
    ,schema="dbo"
  
)
public class TbcRegion {
    
     private int idRegion;
     private String nombreRegion;
     private String direccion;
     private String descripcion;
     private Set<TbcUnidad> tbcUnidads = new HashSet<TbcUnidad>(0);
//     private Set<TbcLocalizacion> tbcLocalizacions = new HashSet<TbcLocalizacion>(0);

     
    @Id 
    @GeneratedValue
    
    @Column(name="ID_REGION", unique=true, nullable=false)
    public int getIdRegion() {
        return this.idRegion;
    }
    
    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    
    @Column(name="NOMBRE_REGION", nullable=false, length=1024)
    public String getNombreRegion() {
        return this.nombreRegion;
    }
    
    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    
    @Column(name="DIRECCION", nullable=false, length=1024)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Column(name="DESCRIPCION", length=1024)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

@OneToMany(fetch=FetchType.EAGER, mappedBy="tbcRegion")
    public Set<TbcUnidad> getTbcUnidads() {
        return this.tbcUnidads;
    }
    
    public void setTbcUnidads(Set<TbcUnidad> tbcUnidads) {
        this.tbcUnidads = tbcUnidads;
    }

//@OneToMany(fetch=FetchType.EAGER, mappedBy="tbcRegion")
//    public Set<TbcLocalizacion> getTbcLocalizacions() {
//        return this.tbcLocalizacions;
//    }
//    
//    public void setTbcLocalizacions(Set<TbcLocalizacion> tbcLocalizacions) {
//        this.tbcLocalizacions = tbcLocalizacions;
//    }




}


