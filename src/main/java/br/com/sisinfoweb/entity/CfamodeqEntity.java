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
@Table(name = "CFAMODEQ")
public class CfamodeqEntity {

    @Column(name = "ID_CFAMODEQ", table = "CFAMODEQ", nullable = false)
    @Id
    private Integer idCfamodeq;

    @Column(name = "US_CAD", table = "CFAMODEQ", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CFAMODEQ")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "CFAMODEQ")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "CFAMODEQ")
    @Basic
    private Integer ctInteg;

    @Column(name = "GUID", table = "CFAMODEQ", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "DESCRICAO", table = "CFAMODEQ", length = 40)
    @Basic
    private String descricao;

    public Integer getIdCfamodeq() {
        return this.idCfamodeq;
    }

    public void setIdCfamodeq(Integer idCfamodeq) {
        this.idCfamodeq = idCfamodeq;
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

    public String getGuid() {
        return this.guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
