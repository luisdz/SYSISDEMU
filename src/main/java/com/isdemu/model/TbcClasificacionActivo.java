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
@Table(name="TBC_CLASIFICACION_ACTIVO"
    ,schema="dbo"
  
)
public class TbcClasificacionActivo {
  
private int idClasificacionActivo;
     private TbcPoliza tbcPoliza;
     private String nombreClasificacion;
     private String codigoClasificacion;
     private String descripcionClasificacion;
     //private Set<TbcClaseActivo> tbcClaseActivos = new HashSet<TbcClaseActivo>(0);

       @Id 

    
    @Column(name="ID_CLASIFICACION_ACTIVO", unique=true, nullable=false)
    public int getIdClasificacionActivo() {
        return this.idClasificacionActivo;
    }
    
    public void setIdClasificacionActivo(int idClasificacionActivo) {
        this.idClasificacionActivo = idClasificacionActivo;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="ID_POLIZA", nullable=false)
    public TbcPoliza getTbcPoliza() {
        return this.tbcPoliza;
    }
    
    public void setTbcPoliza(TbcPoliza tbcPoliza) {
        this.tbcPoliza = tbcPoliza;
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

//@OneToMany(fetch=FetchType.EAGER, mappedBy="tbcClasificacionActivo")
//    public Set<TbcClaseActivo> getTbcClaseActivos() {
//        return this.tbcClaseActivos;
//    }
//    
//    public void setTbcClaseActivos(Set<TbcClaseActivo> tbcClaseActivos) {
//        this.tbcClaseActivos = tbcClaseActivos;
//    }




}


