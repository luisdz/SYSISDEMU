/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

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
@Table(name="TBC_POLIZA"
    ,schema="dbo"

)
public class TbcPoliza {
    
     private int idPoliza;
     private String nombrePoliza;
     private String codigoPoliza;
     private Date fechaInicio;
     private Date fechaFin;
    // private Set<TbcClasificacionActivo> tbcClasificacionActivos = new HashSet<TbcClasificacionActivo>(0);

     
       @Id 

    @GeneratedValue
    @Column(name="ID_POLIZA", unique=true, nullable=false)
    public int getIdPoliza() {
        return this.idPoliza;
    }
    
   public void setIdPoliza(int idPoliza) {
        this.idPoliza = idPoliza;
    }

    
    @Column(name="NOMBRE_POLIZA", nullable=false, length=1024)
    public String getNombrePoliza() {
        return this.nombrePoliza;
    }
    
    public void setNombrePoliza(String nombrePoliza) {
        this.nombrePoliza = nombrePoliza;
    }

    
    @Column(name="CODIGO_POLIZA", nullable=false, length=1024)
    public String getCodigoPoliza() {
        return this.codigoPoliza;
    }
    
    public void setCodigoPoliza(String codigoPoliza) {
        this.codigoPoliza = codigoPoliza;
    }

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    @Column(name="FECHA_INICIO", nullable=false, length=23)
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    @Column(name="FECHA_FIN", nullable=false, length=23)
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

//@OneToMany(fetch=FetchType.EAGER, mappedBy="tbcPoliza")
//    public Set<TbcClasificacionActivo> getTbcClasificacionActivos() {
//        return this.tbcClasificacionActivos;
//    }
//    
//    public void setTbcClasificacionActivos(Set<TbcClasificacionActivo> tbcClasificacionActivos) {
//        this.tbcClasificacionActivos = tbcClasificacionActivos;
//    }




}


