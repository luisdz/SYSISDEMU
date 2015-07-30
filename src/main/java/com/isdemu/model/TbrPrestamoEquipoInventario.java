/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Jose Eduardo
 */
@Entity
@Table(name="TBR_CONTROL_SALIDA_INVENTARIO"
    ,schema="dbo"
   
)
public class TbrPrestamoEquipoInventario {

     private int idPrestamoEquipoInventario;
     private TbPrestamoEquipo tbPrestamoEquipo;
     private int idInventario;
    @Id 

    
    @Column(name="ID_PRESTAMO_EQUIPO_INVENTARIO", unique=true, nullable=false)
    public int getIdPrestamoEquipoInventario() {
        return this.idPrestamoEquipoInventario;
    }
    
    public void setIdPrestamoEquipoInventario(int idPrestamoEquipoInventario) {
        this.idPrestamoEquipoInventario = idPrestamoEquipoInventario;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="ID_PRESTAMO_EQUIPO", nullable=false)
    public TbPrestamoEquipo getTbPrestamoEquipo() {
        return this.tbPrestamoEquipo;
    }
    
    public void setTbPrestamoEquipo(TbPrestamoEquipo tbPrestamoEquipo) {
        this.tbPrestamoEquipo = tbPrestamoEquipo;
    }

    
    @Column(name="ID_INVENTARIO", nullable=false)
    public int getIdInventario() {
        return this.idInventario;
    }
    
    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }




}


