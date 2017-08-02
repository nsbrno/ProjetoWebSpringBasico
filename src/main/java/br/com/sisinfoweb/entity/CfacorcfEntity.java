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
@Table(name = "CFACORCF", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_CFACLIFO", "ID_CFACORES"})})
public class CfacorcfEntity {

    @Column(name = "ID_CFACORCF", table = "CFACORCF", nullable = false)
    @Id
    private Integer idCfacorcf;

    @Column(name = "ID_CFACORES", table = "CFACORCF", nullable = false)
    @Basic(optional = false)
    private int idCfacores;

    @Column(name = "ID_CFACLIFO_CONJ", table = "CFACORCF")
    @Basic
    private Integer idCfaclifoConj;

    @Column(name = "ID_CFACLIFO", table = "CFACORCF")
    @Basic
    private Integer idCfaclifo;

    @Column(name = "GUID", table = "CFACORCF", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "CFACORCF", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CFACORCF")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "CFACORCF")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "CFACORCF")
    @Basic
    private Integer ctInteg;

    public Integer getIdCfacorcf() {
        return this.idCfacorcf;
    }

    public void setIdCfacorcf(Integer idCfacorcf) {
        this.idCfacorcf = idCfacorcf;
    }

    public int getIdCfacores() {
        return this.idCfacores;
    }

    public void setIdCfacores(int idCfacores) {
        this.idCfacores = idCfacores;
    }

    public Integer getIdCfaclifoConj() {
        return this.idCfaclifoConj;
    }

    public void setIdCfaclifoConj(Integer idCfaclifoConj) {
        this.idCfaclifoConj = idCfaclifoConj;
    }

    public Integer getIdCfaclifo() {
        return this.idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
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
