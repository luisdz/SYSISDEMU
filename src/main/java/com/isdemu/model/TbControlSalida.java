/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
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
@Table(name="TB_CONTROL_SALIDA"
    ,schema="dbo"
    
)
public class TbControlSalida {
     private int idControlSalida;
     private TbInventario tbInventario;
     private int NControlSalida;
     private String solicitante;
     private Date fechaSalida;
     private String observacion;
     private String destino;
     private Date fechaTentativaDevolucion;
     private Integer userInsert;
     private Date fechaInsert;
     private Integer userUpdate;
     private Date fechaUpdate;
     
    @Id 
    @GeneratedValue
    
    @Column(name="ID_CONTROL_SALIDA", unique=true, nullable=false)
    public int getIdControlSalida() {
        return this.idControlSalida;
    }
    
    public void setIdControlSalida(int idControlSalida) {
        this.idControlSalida = idControlSalida;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_INVENTARIO", nullable=false)
    public TbInventario getTbInventario() {
        return this.tbInventario;
    }
    
    public void setTbInventario(TbInventario tbInventario) {
        this.tbInventario = tbInventario;
    }

    
    @Column(name="N_CONTROL_SALIDA", nullable=false)
    public int getNControlSalida() {
        return this.NControlSalida;
    }
    
    public void setNControlSalida(int NControlSalida) {
        this.NControlSalida = NControlSalida;
    }

    
    @Column(name="SOLICITANTE", nullable=false, length=1024)
    public String getSolicitante() {
        return this.solicitante;
    }
    
    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }
    
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    @Column(name="FECHA_SALIDA", nullable=false, length=23)
    public Date getFechaSalida() {
        return this.fechaSalida;
    }
    
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    
    @Column(name="OBSERVACION", length=1024)
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    
    @Column(name="DESTINO", nullable=false, length=1024)
    public String getDestino() {
        return this.destino;
    }
    
    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    @Column(name="FECHA_TENTATIVA_DEVOLUCION", length=23)
    public Date getFechaTentativaDevolucion() {
        return this.fechaTentativaDevolucion;
    }
    
    public void setFechaTentativaDevolucion(Date fechaTentativaDevolucion) {
        this.fechaTentativaDevolucion = fechaTentativaDevolucion;
    }

    
    @Column(name="USER_INSERT")
    public Integer getUserInsert() {
        return this.userInsert;
    }
    
    public void setUserInsert(Integer userInsert) {
        this.userInsert = userInsert;
    }

    @Temporal(TemporalType.DATE)
     @DateTimeFormat(pattern = "dd-mm-yyyy")
    @Column(name="FECHA_INSERT", length=23)
    public Date getFechaInsert() {
        return this.fechaInsert;
    }
    
    public void setFechaInsert(Date fechaInsert) {
        this.fechaInsert = fechaInsert;
    }

    
    @Column(name="USER_UPDATE")
    public Integer getUserUpdate() {
        return this.userUpdate;
    }
    
    public void setUserUpdate(Integer userUpdate) {
        this.userUpdate = userUpdate;
    }

    @Temporal(TemporalType.DATE)
     @DateTimeFormat(pattern = "dd-mm-yyyy")
    @Column(name="FECHA_UPDATE", length=23)
    public Date getFechaUpdate() {
        return this.fechaUpdate;
    }
    
    public void setFechaUpdate(Date fechaUpdate) {
        this.fechaUpdate = fechaUpdate;
    }


}
