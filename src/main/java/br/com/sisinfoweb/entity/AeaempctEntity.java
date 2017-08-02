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
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "AEAEMPCT", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_SMAEMPRE", "ID_AEACODST"})})
public class AeaempctEntity {

    @Column(name = "ID_AEAEMPCT", table = "AEAEMPCT", nullable = false)
    @Id
    private Integer idAeaempct;

    @Column(name = "ID_SMAEMPRE", table = "AEAEMPCT")
    @Basic
    private Integer idSmaempre;

    @Column(name = "ID_AEACODST", table = "AEAEMPCT")
    @Basic
    private Integer idAeacodst;

    @Column(name = "ID_AEAOBSPR", table = "AEAEMPCT")
    @Basic
    private Integer idAeaobspr;

    @Column(name = "GUID", table = "AEAEMPCT", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEAEMPCT", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "AEAEMPCT")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "AEAEMPCT")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "AEAEMPCT")
    @Basic
    private Integer ctInteg;

    public Integer getIdAeaempct() {
        return this.idAeaempct;
    }

    public void setIdAeaempct(Integer idAeaempct) {
        this.idAeaempct = idAeaempct;
    }

    public Integer getIdSmaempre() {
        return this.idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdAeacodst() {
        return this.idAeacodst;
    }

    public void setIdAeacodst(Integer idAeacodst) {
        this.idAeacodst = idAeacodst;
    }

    public Integer getIdAeaobspr() {
        return this.idAeaobspr;
    }

    public void setIdAeaobspr(Integer idAeaobspr) {
        this.idAeaobspr = idAeaobspr;
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

}
