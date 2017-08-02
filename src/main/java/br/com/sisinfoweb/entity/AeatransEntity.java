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
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "AEATRANS", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_SMAEMPRE", "CODIGO"})})
public class AeatransEntity {

    @Column(name = "ID_AEATRANS", table = "AEATRANS", nullable = false)
    @Id
    private Integer idAeatrans;

    @Column(name = "ID_SMAEMPRE", table = "AEATRANS", nullable = false)
    @Basic(optional = false)
    private int idSmaempre;

    @Column(name = "ID_SMAEMPRE_D", table = "AEATRANS")
    @Basic
    private Integer idSmaempreD;

    @Column(name = "GUID", table = "AEATRANS", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEATRANS", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "AEATRANS")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "AEATRANS")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "AEATRANS")
    @Basic
    private Integer ctInteg;

    @Column(name = "CODIGO", table = "AEATRANS", nullable = false)
    @Basic(optional = false)
    private int codigo;

    @Column(name = "DT_TRANSF", table = "AEATRANS", nullable = false)
    @Basic(optional = false)
    @Temporal(TemporalType.DATE)
    private Date dtTransf;

    @Column(name = "OBS", table = "AEATRANS")
    @Lob
    @Basic
    private byte[] obs;

    @Column(name = "ABERTO", table = "AEATRANS", nullable = false)
    @Basic(optional = false)
    private Character aberto;

    @Column(name = "EST_ORIGEM", table = "AEATRANS")
    @Basic
    private Character estOrigem;

    @Column(name = "EST_DESTINO", table = "AEATRANS")
    @Basic
    private Character estDestino;

    public Integer getIdAeatrans() {
        return this.idAeatrans;
    }

    public void setIdAeatrans(Integer idAeatrans) {
        this.idAeatrans = idAeatrans;
    }

    public int getIdSmaempre() {
        return this.idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdSmaempreD() {
        return this.idSmaempreD;
    }

    public void setIdSmaempreD(Integer idSmaempreD) {
        this.idSmaempreD = idSmaempreD;
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

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDtTransf() {
        return this.dtTransf;
    }

    public void setDtTransf(Date dtTransf) {
        this.dtTransf = dtTransf;
    }

    public byte[] getObs() {
        return this.obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public Character getAberto() {
        return this.aberto;
    }

    public void setAberto(Character aberto) {
        this.aberto = aberto;
    }

    public Character getEstOrigem() {
        return this.estOrigem;
    }

    public void setEstOrigem(Character estOrigem) {
        this.estOrigem = estOrigem;
    }

    public Character getEstDestino() {
        return this.estDestino;
    }

    public void setEstDestino(Character estDestino) {
        this.estDestino = estDestino;
    }

}
