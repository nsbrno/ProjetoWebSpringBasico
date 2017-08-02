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
@Table(name = "CFACTSPC")
public class CfactspcEntity {

    @Column(name = "ID_CFACTSPC", table = "CFACTSPC", nullable = false)
    @Id
    private Integer idCfactspc;

    @Column(name = "ID_AEAORCAM", table = "CFACTSPC")
    @Basic
    private Integer idAeaorcam;

    @Column(name = "ID_AEASAIDA", table = "CFACTSPC")
    @Basic
    private Integer idAeasaida;

    @Column(name = "ID_AEANFSAI", table = "CFACTSPC")
    @Basic
    private Integer idAeanfsai;

    @Column(name = "ID_RPAPARCE", table = "CFACTSPC")
    @Basic
    private Integer idRpaparce;

    @Column(name = "GUID", table = "CFACTSPC", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "CFACTSPC", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CFACTSPC")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "CFACTSPC")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "CFACTSPC")
    @Basic
    private Integer ctInteg;

    @Column(name = "RESULTADO", table = "CFACTSPC")
    @Lob
    @Basic
    private byte[] resultado;

    @Column(name = "ID_CFAHISTO", table = "CFACTSPC")
    @Basic
    private Integer idCfahisto;

    public Integer getIdCfactspc() {
        return this.idCfactspc;
    }

    public void setIdCfactspc(Integer idCfactspc) {
        this.idCfactspc = idCfactspc;
    }

    public Integer getIdAeaorcam() {
        return this.idAeaorcam;
    }

    public void setIdAeaorcam(Integer idAeaorcam) {
        this.idAeaorcam = idAeaorcam;
    }

    public Integer getIdAeasaida() {
        return this.idAeasaida;
    }

    public void setIdAeasaida(Integer idAeasaida) {
        this.idAeasaida = idAeasaida;
    }

    public Integer getIdAeanfsai() {
        return this.idAeanfsai;
    }

    public void setIdAeanfsai(Integer idAeanfsai) {
        this.idAeanfsai = idAeanfsai;
    }

    public Integer getIdRpaparce() {
        return this.idRpaparce;
    }

    public void setIdRpaparce(Integer idRpaparce) {
        this.idRpaparce = idRpaparce;
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

    public byte[] getResultado() {
        return this.resultado;
    }

    public void setResultado(byte[] resultado) {
        this.resultado = resultado;
    }

    public Integer getIdCfahisto() {
        return this.idCfahisto;
    }

    public void setIdCfahisto(Integer idCfahisto) {
        this.idCfahisto = idCfahisto;
    }

}