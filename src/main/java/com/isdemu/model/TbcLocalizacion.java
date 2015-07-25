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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Jose Eduardo
 */
@Entity
@Table(name="TBC_LOCALIZACION"
    ,schema="dbo"
    
)
public class TbcLocalizacion {
     private int idLocalizacion;
     private TbcRegion tbcRegion;
     private String nombreLocalizacion;
     private Set<TbInventario> tbInventarios = new HashSet<TbInventario>(0);

     
       @Id 

    
    @Column(name="ID_LOCALIZACION", unique=true, nullable=false)
    public int getIdLocalizacion() {
        return this.idLocalizacion;
    }
    
    public void setIdLocalizacion(int idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_REGION", nullable=false)
    public TbcRegion getTbcRegion() {
        return this.tbcRegion;
    }
    
    public void setTbcRegion(TbcRegion tbcRegion) {
        this.tbcRegion = tbcRegion;
    }

    
    @Column(name="NOMBRE_LOCALIZACION", nullable=false)
    public String getNombreLocalizacion() {
        return this.nombreLocalizacion;
    }
    
    public void setNombreLocalizacion(String nombreLocalizacion) {
        this.nombreLocalizacion = nombreLocalizacion;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbcLocalizacion")
    public Set<TbInventario> getTbInventarios() {
        return this.tbInventarios;
    }
    
    public void setTbInventarios(Set<TbInventario> tbInventarios) {
        this.tbInventarios = tbInventarios;
    }

}
