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
@Table(name = "CFAPAISE", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"DESCRICAO"})})
public class CfapaiseEntity {

    @Column(name = "ID_CFAPAISE", table = "CFAPAISE", nullable = false)
    @Id
    private Integer idCfapaise;

    @Column(name = "GUID", table = "CFAPAISE", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "CFAPAISE", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CFAPAISE")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "CFAPAISE")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "CFAPAISE")
    @Basic
    private Integer ctInteg;

    @Column(name = "DESCRICAO", table = "CFAPAISE", nullable = false, length = 40)
    @Basic(optional = false)
    private String descricao;

    @Column(name = "NACIONALIDADE", table = "CFAPAISE", nullable = false, length = 40)
    @Basic(optional = false)
    private String nacionalidade;

    @Column(name = "COD_BACEN", table = "CFAPAISE", length = 6)
    @Basic
    private String codBacen;

    public Integer getIdCfapaise() {
        return this.idCfapaise;
    }

    public void setIdCfapaise(Integer idCfapaise) {
        this.idCfapaise = idCfapaise;
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

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCodBacen() {
        return this.codBacen;
    }

    public void setCodBacen(String codBacen) {
        this.codBacen = codBacen;
    }

}
