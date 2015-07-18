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
     private Date fecha;
     private String comentario;
     private Set<TbInventario> tbInventarios = new HashSet<TbInventario>(0);
     
      @Id 
    @Column(name="ID_DESCARGO", unique=true, nullable=false)
    public int getIdDescargo() {
        return this.idDescargo;
    }
    
    public void setIdDescargo(int idDescargo) {
        this.idDescargo = idDescargo;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbDescargo")
    public Set<TbInventario> getTbInventarios() {
        return this.tbInventarios;
    }
    
    public void setTbInventarios(Set<TbInventario> tbInventarios) {
        this.tbInventarios = tbInventarios;
    }


}
