/**
 * This file was generated by the Jeddict
 */
package br.com.sisinfoweb.entity;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SMAITREL")
public class SmaitrelEntity {

    @Column(name = "ID_SMAITREL", table = "SMAITREL", nullable = false)
    @Id
    private Integer idSmaitrel;

    @Column(name = "ID_SMARELAT", table = "SMAITREL", nullable = false)
    @Basic(optional = false)
    private int idSmarelat;

    @Column(name = "GUID", table = "SMAITREL", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "SMAITREL", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "SMAITREL")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "SMAITREL")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "SMAITREL")
    @Basic
    private Integer ctInteg;

    @Column(name = "NOME_ARQUIVO", table = "SMAITREL", length = 20)
    @Basic
    private String nomeArquivo;

    @Column(name = "SQL", table = "SMAITREL")
    @Lob
    @Basic
    private byte[] sql;

    public Integer getIdSmaitrel() {
        return this.idSmaitrel;
    }

    public void setIdSmaitrel(Integer idSmaitrel) {
        this.idSmaitrel = idSmaitrel;
    }

    public int getIdSmarelat() {
        return this.idSmarelat;
    }

    public void setIdSmarelat(int idSmarelat) {
        this.idSmarelat = idSmarelat;
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

    public String getNomeArquivo() {
        return this.nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public byte[] getSql() {
        return this.sql;
    }

    public void setSql(byte[] sql) {
        this.sql = sql;
    }

}
