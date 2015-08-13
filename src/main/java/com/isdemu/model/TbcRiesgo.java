/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jose Eduardo
 */
@Entity
@Table(name="TBC_RIESGO"
    ,schema="dbo"

)
public class TbcRiesgo {
    private int idRiesgo;
     private String nombreRiesgo;
     
    @Id 

    @GeneratedValue
    @Column(name="ID_RIESGO", unique=true, nullable=false)
    public int getIdRiesgo() {
        return this.idRiesgo;
    }
    
    public void setIdRiesgo(int idRiesgo) {
        this.idRiesgo = idRiesgo;
    }

    
    @Column(name="NOMBRE_RIESGO", nullable=false, length=1024)
    public String getNombreRiesgo() {
        return this.nombreRiesgo;
    }
    
    public void setNombreRiesgo(String nombreRiesgo) {
        this.nombreRiesgo = nombreRiesgo;
    }
 
     
}
