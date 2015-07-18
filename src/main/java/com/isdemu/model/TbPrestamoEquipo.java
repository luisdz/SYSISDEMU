/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jose Eduardo
 */

@Entity
@Table(name="TB_PRESTAMO_EQUIPO"
    ,schema="dbo"
 
)
public class TbPrestamoEquipo {
    
     private int idPrestamoEquipo;
     private Date fechaSolicitud;
     private Date fechaReservacion;
     private Date horaInicio;
     private Date horaFin;
     private String temaImpartir;
     private String personaImpartir;
     private String destino;

     
      
     @Id 

    
    @Column(name="ID_PRESTAMO_EQUIPO", unique=true, nullable=false)
    public int getIdPrestamoEquipo() {
        return this.idPrestamoEquipo;
    }
    
    public void setIdPrestamoEquipo(int idPrestamoEquipo) {
        this.idPrestamoEquipo = idPrestamoEquipo;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHA_SOLICITUD", nullable=false, length=23)
    public Date getFechaSolicitud() {
        return this.fechaSolicitud;
    }
    
    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHA_RESERVACION", nullable=false, length=23)
    public Date getFechaReservacion() {
        return this.fechaReservacion;
    }
    
    public void setFechaReservacion(Date fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="HORA_INICIO", nullable=false, length=23)
    public Date getHoraInicio() {
        return this.horaInicio;
    }
    
    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="HORA_FIN", nullable=false, length=23)
    public Date getHoraFin() {
        return this.horaFin;
    }
    
    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    
    @Column(name="TEMA_IMPARTIR", length=1024)
    public String getTemaImpartir() {
        return this.temaImpartir;
    }
    
    public void setTemaImpartir(String temaImpartir) {
        this.temaImpartir = temaImpartir;
    }

    
    @Column(name="PERSONA_IMPARTIR", length=1024)
    public String getPersonaImpartir() {
        return this.personaImpartir;
    }
    
    public void setPersonaImpartir(String personaImpartir) {
        this.personaImpartir = personaImpartir;
    }

    
    @Column(name="DESTINO", nullable=false, length=1024)
    public String getDestino() {
        return this.destino;
    }
    
    public void setDestino(String destino) {
        this.destino = destino;
    }

}
