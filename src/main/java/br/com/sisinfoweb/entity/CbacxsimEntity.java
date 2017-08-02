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
@Table(name = "CBACXSIM")
public class CbacxsimEntity {

    @Column(name = "ID_CBACXSIM", table = "CBACXSIM", nullable = false)
    @Id
    private Integer idCbacxsim;

    @Column(name = "ID_SMAEMPRE", table = "CBACXSIM", nullable = false)
    @Basic(optional = false)
    private int idSmaempre;

    @Column(name = "ID_CBANUMCX", table = "CBACXSIM", nullable = false)
    @Basic(optional = false)
    private int idCbanumcx;

    @Column(name = "ID_CBAPLCTA", table = "CBACXSIM", nullable = false)
    @Basic(optional = false)
    private int idCbaplcta;

    @Column(name = "ID_CBACTCUS", table = "CBACXSIM")
    @Basic
    private Integer idCbactcus;

    @Column(name = "GUID", table = "CBACXSIM", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "CBACXSIM", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CBACXSIM")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "CBACXSIM")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "CBACXSIM")
    @Basic
    private Integer ctInteg;

    @Column(name = "D_C", table = "CBACXSIM")
    @Basic
    private Character dC;

    @Column(name = "DT_LANCAMENTO", table = "CBACXSIM")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtLancamento;

    @Column(name = "VL_LANCAMENTO", table = "CBACXSIM", nullable = false)
    @Basic(optional = false)
    private double vlLancamento;

    @Column(name = "HISTORICO", table = "CBACXSIM", length = 256)
    @Basic
    private String historico;

    public Integer getIdCbacxsim() {
        return this.idCbacxsim;
    }

    public void setIdCbacxsim(Integer idCbacxsim) {
        this.idCbacxsim = idCbacxsim;
    }

    public int getIdSmaempre() {
        return this.idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
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

    public Integer getIdCbactcus() {
        return this.idCbactcus;
    }

    public void setIdCbactcus(Integer idCbactcus) {
        this.idCbactcus = idCbactcus;
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

    public Character getDC() {
        return this.dC;
    }

    public void setDC(Character dC) {
        this.dC = dC;
    }

    public Date getDtLancamento() {
        return this.dtLancamento;
    }

    public void setDtLancamento(Date dtLancamento) {
        this.dtLancamento = dtLancamento;
    }

    public double getVlLancamento() {
        return this.vlLancamento;
    }

    public void setVlLancamento(double vlLancamento) {
        this.vlLancamento = vlLancamento;
    }

    public String getHistorico() {
        return this.historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

}
