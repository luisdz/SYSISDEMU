/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

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
     private TbInventario tbInventario;
     private int NPrestamo;
     private Date fechaSolicitud;
     private Date fechaReservacion;
     private Date horaInicio;
     private Date horaFin;
     private String temaImpartir;
     private String personaImpartir;
     private String destino;
     private Integer userInsert;
     private Date fechaInsert;
     private Integer userUpdate;
     private Date fechaUpdate;

     
      
    @Id 
    @GeneratedValue
    
    @Column(name="ID_PRESTAMO_EQUIPO", unique=true, nullable=false)
    public int getIdPrestamoEquipo() {
        return this.idPrestamoEquipo;
    }
    
    public void setIdPrestamoEquipo(int idPrestamoEquipo) {
        this.idPrestamoEquipo = idPrestamoEquipo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_INVENTARIO", nullable=false)
    public TbInventario getTbInventario() {
        return this.tbInventario;
    }
    
    public void setTbInventario(TbInventario tbInventario) {
        this.tbInventario = tbInventario;
    }

    
    @Column(name="N_PRESTAMO", nullable=false)
    public int getNPrestamo() {
        return this.NPrestamo;
    }
    
    public void setNPrestamo(int NPrestamo) {
        this.NPrestamo = NPrestamo;
    }

    @Temporal(TemporalType.DATE)
     @DateTimeFormat(pattern = "dd-mm-yyyy")
    @Column(name="FECHA_SOLICITUD", nullable=false, length=23)
    public Date getFechaSolicitud() {
        return this.fechaSolicitud;
    }
    
    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    @Temporal(TemporalType.DATE)
     @DateTimeFormat(pattern = "dd-mm-yyyy")
    @Column(name="FECHA_RESERVACION", nullable=false, length=23)
    public Date getFechaReservacion() {
        return this.fechaReservacion;
    }
    
    public void setFechaReservacion(Date fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }

    @Temporal(TemporalType.DATE)
     @DateTimeFormat(pattern = "dd-mm-yyyy")
    @Column(name="HORA_INICIO", nullable=false, length=23)
    public Date getHoraInicio() {
        return this.horaInicio;
    }
    
    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    @Temporal(TemporalType.DATE)
     @DateTimeFormat(pattern = "dd-mm-yyyy")
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

    
    @Column(name="DESTINO", length=1024)
    public String getDestino() {
        return this.destino;
    }
    
    public void setDestino(String destino) {
        this.destino = destino;
    }

    
    @Column(name="USER_INSERT")
    public Integer getUserInsert() {
        return this.userInsert;
    }
    
    public void setUserInsert(Integer userInsert) {
        this.userInsert = userInsert;
    }

    @Temporal(TemporalType.DATE)
     @DateTimeFormat(pattern = "dd-mm-yyyy")
    @Column(name="FECHA_INSERT", length=10)
    public Date getFechaInsert() {
        return this.fechaInsert;
    }
    
    public void setFechaInsert(Date fechaInsert) {
        this.fechaInsert = fechaInsert;
    }

    
    @Column(name="USER_UPDATE")
    public Integer getUserUpdate() {
        return this.userUpdate;
    }
    
    public void setUserUpdate(Integer userUpdate) {
        this.userUpdate = userUpdate;
    }

    @Temporal(TemporalType.DATE)
     @DateTimeFormat(pattern = "dd-mm-yyyy")
    @Column(name="FECHA_UPDATE", length=10)
    public Date getFechaUpdate() {
        return this.fechaUpdate;
    }
    
    public void setFechaUpdate(Date fechaUpdate) {
        this.fechaUpdate = fechaUpdate;
    }



}
