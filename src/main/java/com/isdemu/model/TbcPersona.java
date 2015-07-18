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
@Table(name="TBC_PERSONA"
    ,schema="dbo"
 )
class TbcPersona {
    
    
     private int idPersona;
     private String nombrePersona;
     private Boolean jefatura;
     private Boolean encargadoAfijo;
     private Set<TbInventario> tbInventarios = new HashSet<TbInventario>(0);

       @Id 

    
    @Column(name="ID_PERSONA", unique=true, nullable=false)
    public int getIdPersona() {
        return this.idPersona;
    }
    
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    
    @Column(name="NOMBRE_PERSONA", nullable=false, length=1024)
    public String getNombrePersona() {
        return this.nombrePersona;
    }
    
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    
    @Column(name="JEFATURA")
    public Boolean getJefatura() {
        return this.jefatura;
    }
    
    public void setJefatura(Boolean jefatura) {
        this.jefatura = jefatura;
    }

    
    @Column(name="ENCARGADO_AFIJO")
    public Boolean getEncargadoAfijo() {
        return this.encargadoAfijo;
    }
    
    public void setEncargadoAfijo(Boolean encargadoAfijo) {
        this.encargadoAfijo = encargadoAfijo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbcPersona")
    public Set<TbInventario> getTbInventarios() {
        return this.tbInventarios;
    }
    
    public void setTbInventarios(Set<TbInventario> tbInventarios) {
        this.tbInventarios = tbInventarios;
    }


}
