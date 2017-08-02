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
@Table(name = "AEAIMCFO")
public class AeaimcfoEntity {

    @Column(name = "ID_AEAIMCFO", table = "AEAIMCFO", nullable = false)
    @Id
    private Integer idAeaimcfo;

    @Column(name = "ID_AEAITMFI", table = "AEAIMCFO", nullable = false)
    @Basic(optional = false)
    private int idAeaitmfi;

    @Column(name = "ID_CFANATOP", table = "AEAIMCFO", nullable = false)
    @Basic(optional = false)
    private int idCfanatop;

    @Column(name = "GUID", table = "AEAIMCFO", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEAIMCFO", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_ALT", table = "AEAIMCFO")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "AEAIMCFO")
    @Basic
    private Integer ctInteg;

    @Column(name = "DT_CAD", table = "AEAIMCFO")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "PROD_SERV", table = "AEAIMCFO")
    @Basic
    private Character prodServ;

    @Column(name = "TIPO", table = "AEAIMCFO")
    @Basic
    private Character tipo;

    @Column(name = "PERCENTUAL", table = "AEAIMCFO", nullable = false)
    @Basic(optional = false)
    private double percentual;

    @Column(name = "VL_BASE_CALC", table = "AEAIMCFO", nullable = false)
    @Basic(optional = false)
    private double vlBaseCalc;

    @Column(name = "VALOR", table = "AEAIMCFO", nullable = false)
    @Basic(optional = false)
    private double valor;

    public Integer getIdAeaimcfo() {
        return this.idAeaimcfo;
    }

    public void setIdAeaimcfo(Integer idAeaimcfo) {
        this.idAeaimcfo = idAeaimcfo;
    }

    public int getIdAeaitmfi() {
        return this.idAeaitmfi;
    }

    public void setIdAeaitmfi(int idAeaitmfi) {
        this.idAeaitmfi = idAeaitmfi;
    }

    public int getIdCfanatop() {
        return this.idCfanatop;
    }

    public void setIdCfanatop(int idCfanatop) {
        this.idCfanatop = idCfanatop;
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

    public Date getDtCad() {
        return this.dtCad;
    }

    public void setDtCad(Date dtCad) {
        this.dtCad = dtCad;
    }

    public Character getProdServ() {
        return this.prodServ;
    }

    public void setProdServ(Character prodServ) {
        this.prodServ = prodServ;
    }

    public Character getTipo() {
        return this.tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public double getPercentual() {
        return this.percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getVlBaseCalc() {
        return this.vlBaseCalc;
    }

    public void setVlBaseCalc(double vlBaseCalc) {
        this.vlBaseCalc = vlBaseCalc;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
