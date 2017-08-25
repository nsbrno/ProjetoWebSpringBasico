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
@Table(name = "CFAMOEDA", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"SIGLA"})})
public class CfamoedaEntity {

    @Column(name = "ID_CFAMOEDA", table = "CFAMOEDA", nullable = false)
    @Id
    private Integer idCfamoeda;

    @Column(name = "GUID", table = "CFAMOEDA", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "CFAMOEDA", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CFAMOEDA")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "CFAMOEDA")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "CFAMOEDA")
    @Basic
    private Integer ctInteg;

    @Column(name = "SIGLA", table = "CFAMOEDA", nullable = false, length = 5)
    @Basic(optional = false)
    private String sigla;

    @Column(name = "DESCRICAO", table = "CFAMOEDA", nullable = false, length = 40)
    @Basic(optional = false)
    private String descricao;

    @Column(name = "PLURAL", table = "CFAMOEDA", nullable = false, length = 40)
    @Basic(optional = false)
    private String plural;

    public Integer getIdCfamoeda() {
        return this.idCfamoeda;
    }

    public void setIdCfamoeda(Integer idCfamoeda) {
        this.idCfamoeda = idCfamoeda;
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

    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPlural() {
        return this.plural;
    }

    public void setPlural(String plural) {
        this.plural = plural;
    }

}
