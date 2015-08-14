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
@Table(name="TBC_PERSONA"
    ,schema="dbo"
 )
public class TbcPersona {
    
    
  private int idPersona;
     private TbcLocalizacion tbcLocalizacion;
     private String nombrePersona;
     private String jefatura;
     private String encargadoAfijo;
     
    @Id 
    @GeneratedValue
    
    @Column(name="ID_PERSONA", unique=true, nullable=false)
    public int getIdPersona() {
        return this.idPersona;
    }
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="ID_LOCALIZACION", nullable=false)
    public TbcLocalizacion getTbcLocalizacion() {
        return this.tbcLocalizacion;
    }
    
    public void setTbcLocalizacion(TbcLocalizacion tbcLocalizacion) {
        this.tbcLocalizacion = tbcLocalizacion;
    }
    
    @Column(name="NOMBRE_PERSONA", nullable=false, length=1024)
    public String getNombrePersona() {
        return this.nombrePersona;
    }
    
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    
    @Column(name="JEFATURA", length=10)
    public String getJefatura() {
        return this.jefatura;
    }
    
    public void setJefatura(String jefatura) {
        this.jefatura = jefatura;
    }

    
    @Column(name="ENCARGADO_AFIJO", length=10)
    public String getEncargadoAfijo() {
        return this.encargadoAfijo;
    }
    
    public void setEncargadoAfijo(String encargadoAfijo) {
        this.encargadoAfijo = encargadoAfijo;
    }



}


