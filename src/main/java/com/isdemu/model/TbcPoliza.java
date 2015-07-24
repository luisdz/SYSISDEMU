/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import java.util.Date;
import java.util.HashSet;
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
     private Set<TbInventario> tbInventarios = new HashSet<TbInventario>(0);

     
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHA_INICIO", nullable=false, length=23)
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHA_FIN", nullable=false, length=23)
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbcPoliza")
    public Set<TbInventario> getTbInventarios() {
        return this.tbInventarios;
    }
    
    public void setTbInventarios(Set<TbInventario> tbInventarios) {
        this.tbInventarios = tbInventarios;
    }



}
