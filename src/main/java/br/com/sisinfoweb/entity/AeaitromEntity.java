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
@Table(name = "AEAITROM", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_AEAROMAN", "SEQUENCIA"})})
public class AeaitromEntity {

    @Column(name = "ID_AEAITROM", table = "AEAITROM", nullable = false)
    @Id
    private Integer idAeaitrom;

    @Column(name = "ID_AEAROMAN", table = "AEAITROM", nullable = false)
    @Basic(optional = false)
    private int idAearoman;

    @Column(name = "ID_AEASAIDA", table = "AEAITROM", nullable = false)
    @Basic(optional = false)
    private int idAeasaida;

    @Column(name = "GUID", table = "AEAITROM", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEAITROM", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "AEAITROM")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "AEAITROM")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "AEAITROM")
    @Basic
    private Integer ctInteg;

    @Column(name = "SEQUENCIA", table = "AEAITROM", nullable = false)
    @Basic(optional = false)
    private int sequencia;

    @Column(name = "VL_SAIDA", table = "AEAITROM", nullable = false)
    @Basic(optional = false)
    private double vlSaida;

    @Column(name = "CONFERIDO", table = "AEAITROM")
    @Basic
    private Character conferido;

    @Column(name = "SITUACAO", table = "AEAITROM", nullable = false)
    @Basic(optional = false)
    private short situacao;

    @Column(name = "OBS", table = "AEAITROM")
    @Lob
    @Basic
    private byte[] obs;

    public Integer getIdAeaitrom() {
        return this.idAeaitrom;
    }

    public void setIdAeaitrom(Integer idAeaitrom) {
        this.idAeaitrom = idAeaitrom;
    }

    public int getIdAearoman() {
        return this.idAearoman;
    }

    public void setIdAearoman(int idAearoman) {
        this.idAearoman = idAearoman;
    }

    public int getIdAeasaida() {
        return this.idAeasaida;
    }

    public void setIdAeasaida(int idAeasaida) {
        this.idAeasaida = idAeasaida;
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

    public int getSequencia() {
        return this.sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public double getVlSaida() {
        return this.vlSaida;
    }

    public void setVlSaida(double vlSaida) {
        this.vlSaida = vlSaida;
    }

    public Character getConferido() {
        return this.conferido;
    }

    public void setConferido(Character conferido) {
        this.conferido = conferido;
    }

    public short getSituacao() {
        return this.situacao;
    }

    public void setSituacao(short situacao) {
        this.situacao = situacao;
    }

    public byte[] getObs() {
        return this.obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

}