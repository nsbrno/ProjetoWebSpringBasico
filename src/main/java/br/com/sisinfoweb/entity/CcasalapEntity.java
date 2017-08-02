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
@Table(name = "CCASALAP")
public class CcasalapEntity {

    @Column(name = "ID_CCASALAP", table = "CCASALAP", nullable = false)
    @Id
    private Integer idCcasalap;

    @Column(name = "ID_CCAESCLA", table = "CCASALAP")
    @Basic
    private Integer idCcaescla;

    @Column(name = "ID_CCACONCU", table = "CCASALAP")
    @Basic
    private Integer idCcaconcu;

    @Column(name = "US_CAD", table = "CCASALAP", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CCASALAP")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "CCASALAP")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "CCASALAP")
    @Basic
    private Integer ctInteg;

    @Column(name = "GUID", table = "CCASALAP", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "LUGARES", table = "CCASALAP")
    @Basic
    private Integer lugares;

    @Column(name = "CODIGO", table = "CCASALAP")
    @Basic
    private Integer codigo;

    public Integer getIdCcasalap() {
        return this.idCcasalap;
    }

    public void setIdCcasalap(Integer idCcasalap) {
        this.idCcasalap = idCcasalap;
    }

    public Integer getIdCcaescla() {
        return this.idCcaescla;
    }

    public void setIdCcaescla(Integer idCcaescla) {
        this.idCcaescla = idCcaescla;
    }

    public Integer getIdCcaconcu() {
        return this.idCcaconcu;
    }

    public void setIdCcaconcu(Integer idCcaconcu) {
        this.idCcaconcu = idCcaconcu;
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

    public Integer getLugares() {
        return this.lugares;
    }

    public void setLugares(Integer lugares) {
        this.lugares = lugares;
    }

    public Integer getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

}
