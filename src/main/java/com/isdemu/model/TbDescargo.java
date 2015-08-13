/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import java.io.Serializable;
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
@Table(name="TB_DESCARGO"
    ,schema="dbo"
  )
public class TbDescargo implements Serializable {
    
    private int idDescargo;
     private TbInventario tbInventario;
     private int idNumeroDescargo;
     private Date fecha;
     private String comentario;
     private Integer userInsert;
     private Date fechaInsert;
     private Integer userUpdate;
     private Date fechaUpdate;
     
      @Id 

    @GeneratedValue
    @Column(name="ID_DESCARGO", unique=true, nullable=false)
    public int getIdDescargo() {
        return this.idDescargo;
    }
      public void setIdDescargo(int idDescargo) {
        this.idDescargo = idDescargo;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="ID_INVENTARIO", nullable=false)
    public TbInventario getTbInventario() {
        return this.tbInventario;
    }
    
    public void setTbInventario(TbInventario tbInventario) {
        this.tbInventario = tbInventario;
    }

    
    @Column(name="ID_NUMERO_DESCARGO", nullable=false)
    public int getIdNumeroDescargo() {
        return this.idNumeroDescargo;
    }
    
    public void setIdNumeroDescargo(int idNumeroDescargo) {
        this.idNumeroDescargo = idNumeroDescargo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA", length=10)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    @Column(name="COMENTARIO", length=1024)
    public String getComentario() {
        return this.comentario;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    
    @Column(name="USER_INSERT")
    public Integer getUserInsert() {
        return this.userInsert;
    }
    
    public void setUserInsert(Integer userInsert) {
        this.userInsert = userInsert;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_INSERT", length=10)
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
    @Column(name="FECHA_UPDATE", length=10)
    public Date getFechaUpdate() {
        return this.fechaUpdate;
    }
    
    public void setFechaUpdate(Date fechaUpdate) {
        this.fechaUpdate = fechaUpdate;
    }




}


