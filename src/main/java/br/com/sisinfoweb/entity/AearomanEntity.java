/**
 * This file was generated by the Jeddict
 */
package br.com.sisinfoweb.entity;


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
@Table(name = "AEAROMAN", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_SMAEMPRE", "NUMERO"})})
public class AearomanEntity {

    @Column(name = "ID_AEAROMAN", table = "AEAROMAN", nullable = false)
    @Id
    private Integer idAearoman;

    @Column(name = "ID_SMAEMPRE", table = "AEAROMAN", nullable = false)
    @Basic(optional = false)
    private int idSmaempre;

    @Column(name = "ID_CFAAREAS", table = "AEAROMAN")
    @Basic
    private Integer idCfaareas;

    @Column(name = "ID_CFAEQUIP", table = "AEAROMAN")
    @Basic
    private Integer idCfaequip;

    @Column(name = "ID_CFACLIFO", table = "AEAROMAN")
    @Basic
    private Integer idCfaclifo;

    @Column(name = "GUID", table = "AEAROMAN", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEAROMAN", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "AEAROMAN")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "AEAROMAN")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "AEAROMAN")
    @Basic
    private Integer ctInteg;

    @Column(name = "NUMERO", table = "AEAROMAN", nullable = false)
    @Basic(optional = false)
    private int numero;

    @Column(name = "DT_ROMANEIO", table = "AEAROMAN", nullable = false)
    @Basic(optional = false)
        private String dtRomaneio;

    @Column(name = "DT_EMISSAO", table = "AEAROMAN")
    @Basic
        private String dtEmissao;

    @Column(name = "DT_SAIDA", table = "AEAROMAN")
    @Basic
        private String dtSaida;

    @Column(name = "DT_FECHAMENTO", table = "AEAROMAN")
    @Basic
        private String dtFechamento;

    @Column(name = "VALOR", table = "AEAROMAN", nullable = false)
    @Basic(optional = false)
    private double valor;

    @Column(name = "OBS", table = "AEAROMAN")
    @Lob
    @Basic
    private byte[] obs;

    @Column(name = "SITUACAO", table = "AEAROMAN")
    @Basic
    private Character situacao;

    public Integer getIdAearoman() {
        return this.idAearoman;
    }

    public void setIdAearoman(Integer idAearoman) {
        this.idAearoman = idAearoman;
    }

    public int getIdSmaempre() {
        return this.idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdCfaareas() {
        return this.idCfaareas;
    }

    public void setIdCfaareas(Integer idCfaareas) {
        this.idCfaareas = idCfaareas;
    }

    public Integer getIdCfaequip() {
        return this.idCfaequip;
    }

    public void setIdCfaequip(Integer idCfaequip) {
        this.idCfaequip = idCfaequip;
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

    public String getDtCad() {
        return this.dtCad;
    }

    public void setDtCad(String dtCad) {
        this.dtCad = dtCad;
    }

    public String getDtAlt() {
        return this.dtAlt;
    }

    public void setDtAlt(String dtAlt) {
        this.dtAlt = dtAlt;
    }

    public Integer getCtInteg() {
        return this.ctInteg;
    }

    public void setCtInteg(Integer ctInteg) {
        this.ctInteg = ctInteg;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDtRomaneio() {
        return this.dtRomaneio;
    }

    public void setDtRomaneio(String dtRomaneio) {
        this.dtRomaneio = dtRomaneio;
    }

    public String getDtEmissao() {
        return this.dtEmissao;
    }

    public void setDtEmissao(String dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public String getDtSaida() {
        return this.dtSaida;
    }

    public void setDtSaida(String dtSaida) {
        this.dtSaida = dtSaida;
    }

    public String getDtFechamento() {
        return this.dtFechamento;
    }

    public void setDtFechamento(String dtFechamento) {
        this.dtFechamento = dtFechamento;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public byte[] getObs() {
        return this.obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public Character getSituacao() {
        return this.situacao;
    }

    public void setSituacao(Character situacao) {
        this.situacao = situacao;
    }

}
