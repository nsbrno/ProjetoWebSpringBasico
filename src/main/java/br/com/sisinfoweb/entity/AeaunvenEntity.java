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
@Table(name = "AEAUNVEN", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"SIGLA"})})
public class AeaunvenEntity {

    @Column(name = "ID_AEAUNVEN", table = "AEAUNVEN", nullable = false)
    @Id
    private Integer idAeaunven;

    @Column(name = "GUID", table = "AEAUNVEN", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEAUNVEN", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "AEAUNVEN")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "AEAUNVEN")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "AEAUNVEN")
    @Basic
    private Integer ctInteg;

    @Column(name = "SIGLA", table = "AEAUNVEN", nullable = false, length = 3)
    @Basic(optional = false)
    private String sigla;

    @Column(name = "DESCRICAO_PLURAL", table = "AEAUNVEN", nullable = false, length = 40)
    @Basic(optional = false)
    private String descricaoPlural;

    @Column(name = "DESCRICAO_SINGULAR", table = "AEAUNVEN", nullable = false, length = 40)
    @Basic(optional = false)
    private String descricaoSingular;

    @Column(name = "DECIMAIS", table = "AEAUNVEN", nullable = false)
    @Basic(optional = false)
    private int decimais;

    public Integer getIdAeaunven() {
        return this.idAeaunven;
    }

    public void setIdAeaunven(Integer idAeaunven) {
        this.idAeaunven = idAeaunven;
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

    public String getDescricaoPlural() {
        return this.descricaoPlural;
    }

    public void setDescricaoPlural(String descricaoPlural) {
        this.descricaoPlural = descricaoPlural;
    }

    public String getDescricaoSingular() {
        return this.descricaoSingular;
    }

    public void setDescricaoSingular(String descricaoSingular) {
        this.descricaoSingular = descricaoSingular;
    }

    public int getDecimais() {
        return this.decimais;
    }

    public void setDecimais(int decimais) {
        this.decimais = decimais;
    }

}
