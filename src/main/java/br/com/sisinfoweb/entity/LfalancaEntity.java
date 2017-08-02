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
@Table(name = "LFALANCA")
public class LfalancaEntity {

    @Column(name = "ID_LFALANCA", table = "LFALANCA", nullable = false)
    @Id
    private Integer idLfalanca;

    @Column(name = "ID_CFACLIFO", table = "LFALANCA")
    @Basic
    private Integer idCfaclifo;

    @Column(name = "US_CAD", table = "LFALANCA", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "LFALANCA")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "LFALANCA")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "LFALANCA")
    @Basic
    private Integer ctInteg;

    @Column(name = "GUID", table = "LFALANCA", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "TIPO", table = "LFALANCA")
    @Basic
    private Character tipo;

    @Column(name = "A_E", table = "LFALANCA")
    @Basic
    private Character aE;

    @Column(name = "NUMERO", table = "LFALANCA")
    @Basic
    private Integer numero;

    @Column(name = "NUMERO_INI", table = "LFALANCA")
    @Basic
    private Integer numeroIni;

    @Column(name = "DT_EMISSAO", table = "LFALANCA")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;

    @Column(name = "DT_ENTRADA", table = "LFALANCA")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtEntrada;

    @Column(name = "IE_RG", table = "LFALANCA", length = 18)
    @Basic
    private String ieRg;

    @Column(name = "CPF_CGC", table = "LFALANCA", length = 18)
    @Basic
    private String cpfCgc;

    @Column(name = "ALIQUOTA_IPI", table = "LFALANCA", nullable = false)
    @Basic(optional = false)
    private double aliquotaIpi;

    @Column(name = "ALIQUOTA_ICMS", table = "LFALANCA", nullable = false)
    @Basic(optional = false)
    private double aliquotaIcms;

    @Column(name = "VL_CONT_IPI", table = "LFALANCA", nullable = false)
    @Basic(optional = false)
    private double vlContIpi;

    @Column(name = "VL_BASE_CALC_IPI", table = "LFALANCA", nullable = false)
    @Basic(optional = false)
    private double vlBaseCalcIpi;

    @Column(name = "VL_IMP_IPI", table = "LFALANCA", nullable = false)
    @Basic(optional = false)
    private double vlImpIpi;

    @Column(name = "VL_ISE_IPI", table = "LFALANCA", nullable = false)
    @Basic(optional = false)
    private double vlIseIpi;

    @Column(name = "VL_OUT_IPI", table = "LFALANCA", nullable = false)
    @Basic(optional = false)
    private double vlOutIpi;

    @Column(name = "VL_EXT_IPI", table = "LFALANCA", nullable = false)
    @Basic(optional = false)
    private double vlExtIpi;

    @Column(name = "VL_CONT_ICMS", table = "LFALANCA", nullable = false)
    @Basic(optional = false)
    private double vlContIcms;

    @Column(name = "VL_BASE_CALC_ICMS", table = "LFALANCA", nullable = false)
    @Basic(optional = false)
    private double vlBaseCalcIcms;

    @Column(name = "VL_IMP_ICMS", table = "LFALANCA", nullable = false)
    @Basic(optional = false)
    private double vlImpIcms;

    @Column(name = "VL_ISE_ICMS", table = "LFALANCA", nullable = false)
    @Basic(optional = false)
    private double vlIseIcms;

    @Column(name = "VL_OUT_ICMS", table = "LFALANCA", nullable = false)
    @Basic(optional = false)
    private double vlOutIcms;

    @Column(name = "VL_EXT_ICMS", table = "LFALANCA", nullable = false)
    @Basic(optional = false)
    private double vlExtIcms;

    @Column(name = "FECHADO", table = "LFALANCA")
    @Basic
    private Character fechado;

    @Column(name = "OBS", table = "LFALANCA")
    @Lob
    @Basic
    private byte[] obs;

    public Integer getIdLfalanca() {
        return this.idLfalanca;
    }

    public void setIdLfalanca(Integer idLfalanca) {
        this.idLfalanca = idLfalanca;
    }

    public Integer getIdCfaclifo() {
        return this.idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
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

    public Character getTipo() {
        return this.tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public Character getAE() {
        return this.aE;
    }

    public void setAE(Character aE) {
        this.aE = aE;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumeroIni() {
        return this.numeroIni;
    }

    public void setNumeroIni(Integer numeroIni) {
        this.numeroIni = numeroIni;
    }

    public Date getDtEmissao() {
        return this.dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public Date getDtEntrada() {
        return this.dtEntrada;
    }

    public void setDtEntrada(Date dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public String getIeRg() {
        return this.ieRg;
    }

    public void setIeRg(String ieRg) {
        this.ieRg = ieRg;
    }

    public String getCpfCgc() {
        return this.cpfCgc;
    }

    public void setCpfCgc(String cpfCgc) {
        this.cpfCgc = cpfCgc;
    }

    public double getAliquotaIpi() {
        return this.aliquotaIpi;
    }

    public void setAliquotaIpi(double aliquotaIpi) {
        this.aliquotaIpi = aliquotaIpi;
    }

    public double getAliquotaIcms() {
        return this.aliquotaIcms;
    }

    public void setAliquotaIcms(double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public double getVlContIpi() {
        return this.vlContIpi;
    }

    public void setVlContIpi(double vlContIpi) {
        this.vlContIpi = vlContIpi;
    }

    public double getVlBaseCalcIpi() {
        return this.vlBaseCalcIpi;
    }

    public void setVlBaseCalcIpi(double vlBaseCalcIpi) {
        this.vlBaseCalcIpi = vlBaseCalcIpi;
    }

    public double getVlImpIpi() {
        return this.vlImpIpi;
    }

    public void setVlImpIpi(double vlImpIpi) {
        this.vlImpIpi = vlImpIpi;
    }

    public double getVlIseIpi() {
        return this.vlIseIpi;
    }

    public void setVlIseIpi(double vlIseIpi) {
        this.vlIseIpi = vlIseIpi;
    }

    public double getVlOutIpi() {
        return this.vlOutIpi;
    }

    public void setVlOutIpi(double vlOutIpi) {
        this.vlOutIpi = vlOutIpi;
    }

    public double getVlExtIpi() {
        return this.vlExtIpi;
    }

    public void setVlExtIpi(double vlExtIpi) {
        this.vlExtIpi = vlExtIpi;
    }

    public double getVlContIcms() {
        return this.vlContIcms;
    }

    public void setVlContIcms(double vlContIcms) {
        this.vlContIcms = vlContIcms;
    }

    public double getVlBaseCalcIcms() {
        return this.vlBaseCalcIcms;
    }

    public void setVlBaseCalcIcms(double vlBaseCalcIcms) {
        this.vlBaseCalcIcms = vlBaseCalcIcms;
    }

    public double getVlImpIcms() {
        return this.vlImpIcms;
    }

    public void setVlImpIcms(double vlImpIcms) {
        this.vlImpIcms = vlImpIcms;
    }

    public double getVlIseIcms() {
        return this.vlIseIcms;
    }

    public void setVlIseIcms(double vlIseIcms) {
        this.vlIseIcms = vlIseIcms;
    }

    public double getVlOutIcms() {
        return this.vlOutIcms;
    }

    public void setVlOutIcms(double vlOutIcms) {
        this.vlOutIcms = vlOutIcms;
    }

    public double getVlExtIcms() {
        return this.vlExtIcms;
    }

    public void setVlExtIcms(double vlExtIcms) {
        this.vlExtIcms = vlExtIcms;
    }

    public Character getFechado() {
        return this.fechado;
    }

    public void setFechado(Character fechado) {
        this.fechado = fechado;
    }

    public byte[] getObs() {
        return this.obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

}
