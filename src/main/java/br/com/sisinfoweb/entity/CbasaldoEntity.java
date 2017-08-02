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
@Table(name = "CBASALDO", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_SMAEMPRE", "ID_CBAPLCTA", "DT_MOVIMENTO"})})
public class CbasaldoEntity {

    @Column(name = "ID_CBASALDO", table = "CBASALDO", nullable = false)
    @Id
    private Integer idCbasaldo;

    @Column(name = "ID_SMAEMPRE", table = "CBASALDO")
    @Basic
    private Integer idSmaempre;

    @Column(name = "ID_CBAPLCTA", table = "CBASALDO", nullable = false)
    @Basic(optional = false)
    private int idCbaplcta;

    @Column(name = "GUID", table = "CBASALDO", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "CBASALDO", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CBASALDO")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "CBASALDO")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "CBASALDO")
    @Basic
    private Integer ctInteg;

    @Column(name = "DT_MOVIMENTO", table = "CBASALDO", nullable = false)
    @Basic(optional = false)
    @Temporal(TemporalType.DATE)
    private Date dtMovimento;

    @Column(name = "VL_ANTERIOR", table = "CBASALDO", nullable = false)
    @Basic(optional = false)
    private double vlAnterior;

    @Column(name = "VL_CREDITO", table = "CBASALDO", nullable = false)
    @Basic(optional = false)
    private double vlCredito;

    @Column(name = "VL_DEBITO", table = "CBASALDO", nullable = false)
    @Basic(optional = false)
    private double vlDebito;

    @Column(name = "VL_CON_ANTERIOR", table = "CBASALDO", nullable = false)
    @Basic(optional = false)
    private double vlConAnterior;

    @Column(name = "VL_CON_CREDITO", table = "CBASALDO", nullable = false)
    @Basic(optional = false)
    private double vlConCredito;

    @Column(name = "VL_CON_DEBITO", table = "CBASALDO", nullable = false)
    @Basic(optional = false)
    private double vlConDebito;

    public Integer getIdCbasaldo() {
        return this.idCbasaldo;
    }

    public void setIdCbasaldo(Integer idCbasaldo) {
        this.idCbasaldo = idCbasaldo;
    }

    public Integer getIdSmaempre() {
        return this.idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
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

    public Date getDtMovimento() {
        return this.dtMovimento;
    }

    public void setDtMovimento(Date dtMovimento) {
        this.dtMovimento = dtMovimento;
    }

    public double getVlAnterior() {
        return this.vlAnterior;
    }

    public void setVlAnterior(double vlAnterior) {
        this.vlAnterior = vlAnterior;
    }

    public double getVlCredito() {
        return this.vlCredito;
    }

    public void setVlCredito(double vlCredito) {
        this.vlCredito = vlCredito;
    }

    public double getVlDebito() {
        return this.vlDebito;
    }

    public void setVlDebito(double vlDebito) {
        this.vlDebito = vlDebito;
    }

    public double getVlConAnterior() {
        return this.vlConAnterior;
    }

    public void setVlConAnterior(double vlConAnterior) {
        this.vlConAnterior = vlConAnterior;
    }

    public double getVlConCredito() {
        return this.vlConCredito;
    }

    public void setVlConCredito(double vlConCredito) {
        this.vlConCredito = vlConCredito;
    }

    public double getVlConDebito() {
        return this.vlConDebito;
    }

    public void setVlConDebito(double vlConDebito) {
        this.vlConDebito = vlConDebito;
    }

}
