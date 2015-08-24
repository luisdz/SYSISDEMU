/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jose Eduardo
 */
@Entity
@Table(name="TB_VERIFICAR_INVENTARIO"
    ,schema="dbo"
 
)
public class TbVerificarInventario {
     private int idVerificarInventario;
     private int idLocalizacion;
     private Date fechaVerificacion;
     private String observacion;
     
     
      @Id 

     @GeneratedValue
    @Column(name="ID_VERIFICAR_INVENTARIO", unique=true, nullable=false)
    public int getIdVerificarInventario() {
        return this.idVerificarInventario;
    }
    
    public void setIdVerificarInventario(int idVerificarInventario) {
        this.idVerificarInventario = idVerificarInventario;
    }

    
    @Column(name="ID_LOCALIZACION", nullable=false)
    public int getIdLocalizacion() {
        return this.idLocalizacion;
    }
    
    public void setIdLocalizacion(int idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_VERIFICACION", nullable=false, length=10)
    public Date getFechaVerificacion() {
        return this.fechaVerificacion;
    }
    
    public void setFechaVerificacion(Date fechaVerificacion) {
        this.fechaVerificacion = fechaVerificacion;
    }

    
    @Column(name="OBSERVACION", length=1024)
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

}
