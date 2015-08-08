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
import javax.persistence.GeneratedValue;

/**
 *
 * @author Jose Eduardo
 */
@Entity
@Table(name="TBR_PRESTAMO_EQUIPO_INVENTARIO"
    ,schema="dbo"
   
)
public class TbrPrestamoEquipoInventario {

     private int idPrestamoEquipoInventario;
     private TbPrestamoEquipo tbPrestamoEquipo;
     private TbInventario tbInventario;
    
    @Id 
    @GeneratedValue    
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

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="ID_INVENTARIO") 
   // @Column(name="ID_INVENTARIO")
    public TbInventario getTbInventario() {
        return this.tbInventario;
    }
    
    public void setTbInventario(TbInventario tbInventario) {
        this.tbInventario = tbInventario;
    }


}


