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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Jose Eduardo
 */

@Entity
@Table(name="TBC_REGIONES"
    ,schema="dbo"
   
)
class TbcRegiones {
    
      private String idRegion;
     private String nombreRegion;
     private String direccion;
     private String descripcion;
     private Set<TbInventario> tbInventarios = new HashSet<TbInventario>(0);
     
     
      @Id 
    @Column(name="ID_REGION", unique=true, nullable=false, length=10)
    public String getIdRegion() {
        return this.idRegion;
    }
    
    public void setIdRegion(String idRegion) {
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbcRegiones")
    public Set<TbInventario> getTbInventarios() {
        return this.tbInventarios;
    }
    
    public void setTbInventarios(Set<TbInventario> tbInventarios) {
        this.tbInventarios = tbInventarios;
    }

}
