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
@Table(name="TBC_CLASIFICACION_ACTIVO"
    ,schema="dbo"
  
)
class TbcClasificacionActivo {
     private int idClasificacionActivo;
     private String nombreClasificacion;
     private String codigoClasificacion;
     private String descripcionClasificacion;
     private Set<TbInventario> tbInventarios = new HashSet<TbInventario>(0);

     
      @Id 

    
    @Column(name="ID_CLASIFICACION_ACTIVO", unique=true, nullable=false)
    public int getIdClasificacionActivo() {
        return this.idClasificacionActivo;
    }
    
    public void setIdClasificacionActivo(int idClasificacionActivo) {
        this.idClasificacionActivo = idClasificacionActivo;
    }

    
    @Column(name="NOMBRE_CLASIFICACION", nullable=false, length=1024)
    public String getNombreClasificacion() {
        return this.nombreClasificacion;
    }
    
    public void setNombreClasificacion(String nombreClasificacion) {
        this.nombreClasificacion = nombreClasificacion;
    }

    
    @Column(name="CODIGO_CLASIFICACION", nullable=false, length=1024)
    public String getCodigoClasificacion() {
        return this.codigoClasificacion;
    }
    
    public void setCodigoClasificacion(String codigoClasificacion) {
        this.codigoClasificacion = codigoClasificacion;
    }

    
    @Column(name="DESCRIPCION_CLASIFICACION", length=1024)
    public String getDescripcionClasificacion() {
        return this.descripcionClasificacion;
    }
    
    public void setDescripcionClasificacion(String descripcionClasificacion) {
        this.descripcionClasificacion = descripcionClasificacion;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbcClasificacionActivo")
    public Set<TbInventario> getTbInventarios() {
        return this.tbInventarios;
    }
    
    public void setTbInventarios(Set<TbInventario> tbInventarios) {
        this.tbInventarios = tbInventarios;
    }

}
