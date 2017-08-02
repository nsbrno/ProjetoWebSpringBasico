/**
 * This file was generated by the Jeddict
 */
package br.com.sisinfoweb.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "CFAESTAD", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"UF"})})
public class CfaestadEntity {

    @Column(name = "ID_CFAESTAD", table = "CFAESTAD", nullable = false)
    @Id
    private Integer idCfaestad;

    @Column(name = "GUID", table = "CFAESTAD", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "CFAESTAD", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CFAESTAD")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "CFAESTAD")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "CFAESTAD")
    @Basic
    private Integer ctInteg;

    @Column(name = "ID_CFAPAISE", table = "CFAESTAD")
    @Basic
    private Integer idCfapaise;

    @Column(name = "UF", table = "CFAESTAD", nullable = false, length = 2)
    @Basic(optional = false)
    private String uf;

    @Column(name = "DESCRICAO", table = "CFAESTAD", nullable = false, length = 40)
    @Basic(optional = false)
    private String descricao;

    @Column(name = "DDD", table = "CFAESTAD")
    @Basic
    private Integer ddd;

    @Column(name = "ICMS_ENT", table = "CFAESTAD", nullable = false)
    @Basic(optional = false)
    private double icmsEnt;

    @Column(name = "ICMS_SAI", table = "CFAESTAD", nullable = false)
    @Basic(optional = false)
    private double icmsSai;

    @Column(name = "TIPO_IPI_ENT", table = "CFAESTAD")
    @Basic
    private Character tipoIpiEnt;

    @Column(name = "TIPO_IPI_SAI", table = "CFAESTAD")
    @Basic
    private Character tipoIpiSai;

    @Column(name = "IPI_ENT", table = "CFAESTAD", nullable = false)
    @Basic(optional = false)
    private double ipiEnt;

    @Column(name = "IPI_SAI", table = "CFAESTAD", nullable = false)
    @Basic(optional = false)
    private double ipiSai;

    @Column(name = "COD_IBGE", table = "CFAESTAD")
    @Basic
    private Integer codIbge;

    public Integer getIdCfaestad() {
        return this.idCfaestad;
    }

    public void setIdCfaestad(Integer idCfaestad) {
        this.idCfaestad = idCfaestad;
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

    public Integer getIdCfapaise() {
        return this.idCfapaise;
    }

    public void setIdCfapaise(Integer idCfapaise) {
        this.idCfapaise = idCfapaise;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getDdd() {
        return this.ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public double getIcmsEnt() {
        return this.icmsEnt;
    }

    public void setIcmsEnt(double icmsEnt) {
        this.icmsEnt = icmsEnt;
    }

    public double getIcmsSai() {
        return this.icmsSai;
    }

    public void setIcmsSai(double icmsSai) {
        this.icmsSai = icmsSai;
    }

    public Character getTipoIpiEnt() {
        return this.tipoIpiEnt;
    }

    public void setTipoIpiEnt(Character tipoIpiEnt) {
        this.tipoIpiEnt = tipoIpiEnt;
    }

    public Character getTipoIpiSai() {
        return this.tipoIpiSai;
    }

    public void setTipoIpiSai(Character tipoIpiSai) {
        this.tipoIpiSai = tipoIpiSai;
    }

    public double getIpiEnt() {
        return this.ipiEnt;
    }

    public void setIpiEnt(double ipiEnt) {
        this.ipiEnt = ipiEnt;
    }

    public double getIpiSai() {
        return this.ipiSai;
    }

    public void setIpiSai(double ipiSai) {
        this.ipiSai = ipiSai;
    }

    public Integer getCodIbge() {
        return this.codIbge;
    }

    public void setCodIbge(Integer codIbge) {
        this.codIbge = codIbge;
    }

}
