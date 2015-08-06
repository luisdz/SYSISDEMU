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
@Table(name="TBR_CONTROL_SALIDA_INVENTARIO"
    ,schema="dbo"
    
)
public class TbrControlSalidaInventario {
    
    
     private int idControlSalidaInventario;
     private TbControlSalida tbControlSalida;
     private TbInventario tbInventario;
     
    @Id 

    @GeneratedValue
    @Column(name="ID_CONTROL_SALIDA_INVENTARIO", unique=true, nullable=false)
    public int getIdControlSalidaInventario() {
        return this.idControlSalidaInventario;
    }
    
    public void setIdControlSalidaInventario(int idControlSalidaInventario) {
        this.idControlSalidaInventario = idControlSalidaInventario;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="ID_CONTROL_SALIDA", nullable=false)
    public TbControlSalida getTbControlSalida() {
        return this.tbControlSalida;
    }
    
    public void setTbControlSalida(TbControlSalida tbControlSalida) {
        this.tbControlSalida = tbControlSalida;
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


