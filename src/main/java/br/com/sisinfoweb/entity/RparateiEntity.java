/**
 * This file was generated by the Jeddict
 */
package br.com.sisinfoweb.entity;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "RPARATEI")
public class RparateiEntity {

    @Column(name = "ID_RPARATEI", table = "RPARATEI", nullable = false)
    @Id
    private Integer idRparatei;

    @Column(name = "GUID", table = "RPARATEI", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "RPARATEI", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "RPARATEI")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "RPARATEI")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "RPARATEI")
    @Basic
    private Integer ctInteg;

    @Column(name = "DT_MOVIMENTO", table = "RPARATEI")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Column(name = "DC", table = "RPARATEI")
    @Basic
    private Character dc;

    @Column(name = "VL_RATEADO", table = "RPARATEI", nullable = false)
    @Basic(optional = false)
    private double vlRateado;

    public Integer getIdRparatei() {
        return this.idRparatei;
    }

    public void setIdRparatei(Integer idRparatei) {
        this.idRparatei = idRparatei;
    }

    public String getGuid() {
        return this.guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getUsCad() {
        return this.usCad;
    }

    public void setUsCad(String usCad) {
        this.usCad = usCad;
    }

    public Date getDtCad() {
        return this.dtCad;
    }

    public void setDtCad(Date dtCad) {
        this.dtCad = dtCad;
    }

    public Date getDtAlt() {
        return this.dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }

    public Integer getCtInteg() {
        return this.ctInteg;
    }

    public void setCtInteg(Integer ctInteg) {
        this.ctInteg = ctInteg;
    }

    public Date getDtMovimento() {
        return this.dtMovimento;
    }

    public void setDtMovimento(Date dtMovimento) {
        this.dtMovimento = dtMovimento;
    }

    public Character getDc() {
        return this.dc;
    }

    public void setDc(Character dc) {
        this.dc = dc;
    }

    public double getVlRateado() {
        return this.vlRateado;
    }

    public void setVlRateado(double vlRateado) {
        this.vlRateado = vlRateado;
    }

}