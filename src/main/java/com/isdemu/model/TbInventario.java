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
@Table(name = "TB_INVENTARIO", schema = "dbo")
public class TbInventario {
    
     private int idInventario;
     private TbcClasificacionActivo tbcClasificacionActivo;
     private TbcLocalizacion tbcLocalizacion;
     private TbcPersona tbcPersona;
     private TbcPoliza tbcPoliza;
     private Integer responsableAnterior;
     private String claseEquipo;
     private String codigoInventario;
     private String marca;
     private String modelo;
     private String serie;
     private Date fechaAdquisicion;
     private BigDecimal valor;
     private String NFactura;
     private String financiamiento;
     private String observacion;
     private BigDecimal valorLibro;
     private Integer userInsert;
     private Date fechaInsert;
     private Integer userUpdate;
     private Date fechaUpdate;
     private Set<TbDescargo> tbDescargos = new HashSet<TbDescargo>(0);
     private Set<TbPrestamoEquipo> tbPrestamoEquipos = new HashSet<TbPrestamoEquipo>(0);
     private Set<TbControlSalida> tbControlSalidas = new HashSet<TbControlSalida>(0);
     private Set<TbMovimiento> tbMovimientos = new HashSet<TbMovimiento>(0);

    
      @Id 
 @GeneratedValue
    
    @Column(name="ID_INVENTARIO", unique=true, nullable=false)
    public int getIdInventario() {
        return this.idInventario;
    }
    
    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_CLASIFICACION_ACTIVO", nullable=false)
    public TbcClasificacionActivo getTbcClasificacionActivo() {
        return this.tbcClasificacionActivo;
    }
    
    public void setTbcClasificacionActivo(TbcClasificacionActivo tbcClasificacionActivo) {
        this.tbcClasificacionActivo = tbcClasificacionActivo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_LOCALIZACION", nullable=false)
    public TbcLocalizacion getTbcLocalizacion() {
        return this.tbcLocalizacion;
    }
    
    public void setTbcLocalizacion(TbcLocalizacion tbcLocalizacion) {
        this.tbcLocalizacion = tbcLocalizacion;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_PERSONA", nullable=false)
    public TbcPersona getTbcPersona() {
        return this.tbcPersona;
    }
    
    public void setTbcPersona(TbcPersona tbcPersona) {
        this.tbcPersona = tbcPersona;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_POLIZA")
    public TbcPoliza getTbcPoliza() {
        return this.tbcPoliza;
    }
    
    public void setTbcPoliza(TbcPoliza tbcPoliza) {
        this.tbcPoliza = tbcPoliza;
    }

    
    @Column(name="RESPONSABLE_ANTERIOR")
    public Integer getResponsableAnterior() {
        return this.responsableAnterior;
    }
    
    public void setResponsableAnterior(Integer responsableAnterior) {
        this.responsableAnterior = responsableAnterior;
    }

    
    @Column(name="CLASE_EQUIPO", nullable=false, length=1024)
    public String getClaseEquipo() {
        return this.claseEquipo;
    }
    
    public void setClaseEquipo(String claseEquipo) {
        this.claseEquipo = claseEquipo;
    }

    
    @Column(name="CODIGO_INVENTARIO", nullable=false, length=1024)
    public String getCodigoInventario() {
        return this.codigoInventario;
    }
    
    public void setCodigoInventario(String codigoInventario) {
        this.codigoInventario = codigoInventario;
    }

    
    @Column(name="MARCA", length=1024)
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    @Column(name="MODELO", length=1024)
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    @Column(name="SERIE", length=1024)
    public String getSerie() {
        return this.serie;
    }
    
    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Temporal(TemporalType.DATE)
     @DateTimeFormat(pattern = "dd-mm-yyyy")
    @Column(name="FECHA_ADQUISICION", length=23)
    public Date getFechaAdquisicion() {
        return this.fechaAdquisicion;
    }
    
    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    
    @Column(name="VALOR", nullable=false, scale=4)
    public BigDecimal getValor() {
        return this.valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    
    @Column(name="N_FACTURA", length=1024)
    public String getNFactura() {
        return this.NFactura;
    }
    
    public void setNFactura(String NFactura) {
        this.NFactura = NFactura;
    }

    
    @Column(name="FINANCIAMIENTO", length=1024)
    public String getFinanciamiento() {
        return this.financiamiento;
    }
    
    public void setFinanciamiento(String financiamiento) {
        this.financiamiento = financiamiento;
    }

    
    @Column(name="OBSERVACION", length=1024)
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    
    @Column(name="VALOR_LIBRO", nullable=false, scale=4)
    public BigDecimal getValorLibro() {
        return this.valorLibro;
    }
    
    public void setValorLibro(BigDecimal valorLibro) {
        this.valorLibro = valorLibro;
    }

    
    @Column(name="USER_INSERT")
    public Integer getUserInsert() {
        return this.userInsert;
    }
    
    public void setUserInsert(Integer userInsert) {
        this.userInsert = userInsert;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHA_INSERT", length=23)
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHA_UPDATE", length=23)
    public Date getFechaUpdate() {
        return this.fechaUpdate;
    }
    
    public void setFechaUpdate(Date fechaUpdate) {
        this.fechaUpdate = fechaUpdate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbInventario")
    public Set<TbDescargo> getTbDescargos() {
        return this.tbDescargos;
    }
    
    public void setTbDescargos(Set<TbDescargo> tbDescargos) {
        this.tbDescargos = tbDescargos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbInventario")
    public Set<TbPrestamoEquipo> getTbPrestamoEquipos() {
        return this.tbPrestamoEquipos;
    }
    
    public void setTbPrestamoEquipos(Set<TbPrestamoEquipo> tbPrestamoEquipos) {
        this.tbPrestamoEquipos = tbPrestamoEquipos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbInventario")
    public Set<TbControlSalida> getTbControlSalidas() {
        return this.tbControlSalidas;
    }
    
    public void setTbControlSalidas(Set<TbControlSalida> tbControlSalidas) {
        this.tbControlSalidas = tbControlSalidas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbInventario")
    public Set<TbMovimiento> getTbMovimientos() {
        return this.tbMovimientos;
    }
    
    public void setTbMovimientos(Set<TbMovimiento> tbMovimientos) {
        this.tbMovimientos = tbMovimientos;
    }


}
