/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Jose Eduardo
 */
@Entity
@Table(name="TBH_VERIFICAR_INVENTARIO"
    ,schema="dbo"
    
)
public class TbhVerificarInventario {
     private int idVerificarInventarior;
     private TbVerificarInventario tbVerificarInventario;
     private String codigoInventario;
     private Integer faltante;
     
     
     @Id 

     @GeneratedValue
    @Column(name="ID_VERIFICAR_INVENTARIOR", unique=true, nullable=false)
    public int getIdVerificarInventarior() {
        return this.idVerificarInventarior;
    }
    
    public void setIdVerificarInventarior(int idVerificarInventarior) {
        this.idVerificarInventarior = idVerificarInventarior;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_VERIFICAR_INVENTARIO", nullable=false)
    public TbVerificarInventario getTbVerificarInventario() {
        return this.tbVerificarInventario;
    }
    
    public void setTbVerificarInventario(TbVerificarInventario tbVerificarInventario) {
        this.tbVerificarInventario = tbVerificarInventario;
    }

    
    @Column(name="CODIGO_INVENTARIO", nullable=false, length=1024)
    public String getCodigoInventario() {
        return this.codigoInventario;
    }
    
    public void setCodigoInventario(String codigoInventario) {
        this.codigoInventario = codigoInventario;
    }

    
    @Column(name="FALTANTE")
    public Integer getFaltante() {
        return this.faltante;
    }
    
    public void setFaltante(Integer faltante) {
        this.faltante = faltante;
    }



}
