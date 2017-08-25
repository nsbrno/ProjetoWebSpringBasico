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
@Table(name = "CFACORES", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"DESCRICAO"})})
public class CfacoresEntity {

    @Column(name = "ID_CFACORES", table = "CFACORES", nullable = false)
    @Id
    private Integer idCfacores;

    @Column(name = "GUID", table = "CFACORES", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "CFACORES", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CFACORES")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "CFACORES")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "CFACORES")
    @Basic
    private Integer ctInteg;

    @Column(name = "DESCRICAO", table = "CFACORES", nullable = false, length = 40)
    @Basic(optional = false)
    private String descricao;

    public Integer getIdCfacores() {
        return this.idCfacores;
    }

    public void setIdCfacores(Integer idCfacores) {
        this.idCfacores = idCfacores;
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

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
