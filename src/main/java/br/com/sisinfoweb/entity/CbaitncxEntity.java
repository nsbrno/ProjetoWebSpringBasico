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
@Table(name = "CBAITNCX", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_CBANUMCX", "ID_CBAPLCTA"})})
public class CbaitncxEntity {

    @Column(name = "ID_CBAITNCX", table = "CBAITNCX", nullable = false)
    @Id
    private Integer idCbaitncx;

    @Column(name = "ID_CBANUMCX", table = "CBAITNCX", nullable = false)
    @Basic(optional = false)
    private int idCbanumcx;

    @Column(name = "ID_CBAPLCTA", table = "CBAITNCX", nullable = false)
    @Basic(optional = false)
    private int idCbaplcta;

    @Column(name = "GUID", table = "CBAITNCX", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "CBAITNCX", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CBAITNCX")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "CBAITNCX")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "CBAITNCX")
    @Basic
    private Integer ctInteg;

    public Integer getIdCbaitncx() {
        return this.idCbaitncx;
    }

    public void setIdCbaitncx(Integer idCbaitncx) {
        this.idCbaitncx = idCbaitncx;
    }

    public int getIdCbanumcx() {
        return this.idCbanumcx;
    }

    public void setIdCbanumcx(int idCbanumcx) {
        this.idCbanumcx = idCbanumcx;
    }

    public int getIdCbaplcta() {
        return this.idCbaplcta;
    }

    public void setIdCbaplcta(int idCbaplcta) {
        this.idCbaplcta = idCbaplcta;
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
