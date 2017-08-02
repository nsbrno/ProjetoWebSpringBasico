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
@Table(name = "SMADIRTE")
public class SmadirteEntity {

    @Column(name = "ID_SMADIRTE", table = "SMADIRTE", nullable = false)
    @Id
    private Integer idSmadirte;

    @Column(name = "ID_SMAARQUI", table = "SMADIRTE")
    @Basic
    private Integer idSmaarqui;

    @Column(name = "ID_SMAUSUAR", table = "SMADIRTE")
    @Basic
    private Integer idSmausuar;

    @Column(name = "GUID", table = "SMADIRTE", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "SMADIRTE", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "SMADIRTE")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "SMADIRTE")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "SMADIRTE")
    @Basic
    private Integer ctInteg;

    @Column(name = "CAMPO", table = "SMADIRTE", length = 40)
    @Basic
    private String campo;

    @Column(name = "FORMATO", table = "SMADIRTE")
    @Basic
    private Character formato;

    public Integer getIdSmadirte() {
        return this.idSmadirte;
    }

    public void setIdSmadirte(Integer idSmadirte) {
        this.idSmadirte = idSmadirte;
    }

    public Integer getIdSmaarqui() {
        return this.idSmaarqui;
    }

    public void setIdSmaarqui(Integer idSmaarqui) {
        this.idSmaarqui = idSmaarqui;
    }

    public Integer getIdSmausuar() {
        return this.idSmausuar;
    }

    public void setIdSmausuar(Integer idSmausuar) {
        this.idSmausuar = idSmausuar;
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

    public String getCampo() {
        return this.campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public Character getFormato() {
        return this.formato;
    }

    public void setFormato(Character formato) {
        this.formato = formato;
    }

}