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
@Table(name="TBT_VERIFICAR_INVENTARIO"
    ,schema="dbo"
 
)
public class TbtVerificarInventario {
    
    private int idTverificarInventario;
     private String codigoInventario;
     private int idLocalizacion;
     
     
        @Id 

     @GeneratedValue
    @Column(name="ID_TVERIFICAR_INVENTARIO", unique=true, nullable=false)
    public int getIdTverificarInventario() {
        return this.idTverificarInventario;
    }
    
    public void setIdTverificarInventario(int idTverificarInventario) {
        this.idTverificarInventario = idTverificarInventario;
    }

    
    @Column(name="CODIGO_INVENTARIO", nullable=false, length=1024)
    public String getCodigoInventario() {
        return this.codigoInventario;
    }
    
    public void setCodigoInventario(String codigoInventario) {
        this.codigoInventario = codigoInventario;
    }

    
    @Column(name="ID_LOCALIZACION", nullable=false)
    public int getIdLocalizacion() {
        return this.idLocalizacion;
    }
    
    public void setIdLocalizacion(int idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }


}
