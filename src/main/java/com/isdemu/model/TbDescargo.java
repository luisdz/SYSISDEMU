/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jose Eduardo
 */

@Entity
@Table(name="TB_DESCARGO"
    ,schema="dbo"
  )
class TbDescargo {
    
    
    
     private int idDescargo;
     private TbInventario tbInventario;
     private Date fecha;
     private String comentario;
    
     
       @Id 

    
    @Column(name="ID_DESCARGO", unique=true, nullable=false)
    public int getIdDescargo() {
        return this.idDescargo;
    }
    
    public void setIdDescargo(int idDescargo) {
        this.idDescargo = idDescargo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_INVENTARIO", nullable=false)
    public TbInventario getTbInventario() {
        return this.tbInventario;
    }
    
    public void setTbInventario(TbInventario tbInventario) {
        this.tbInventario = tbInventario;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHA", length=23)
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    @Column(name="COMENTARIO", length=1024)
    public String getComentario() {
        return this.comentario;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }


}
