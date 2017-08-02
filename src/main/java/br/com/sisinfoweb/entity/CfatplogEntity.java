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
@Table(name = "CFATPLOG", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"SIGLA"})})
public class CfatplogEntity {

    @Column(name = "ID_CFATPLOG", table = "CFATPLOG", nullable = false)
    @Id
    private Integer idCfatplog;

    @Column(name = "GUID", table = "CFATPLOG", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "CFATPLOG", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CFATPLOG")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "CFATPLOG")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "CFATPLOG")
    @Basic
    private Integer ctInteg;

    @Column(name = "DESCRICAO", table = "CFATPLOG", length = 40)
    @Basic
    private String descricao;

    @Column(name = "SIGLA", table = "CFATPLOG", length = 18)
    @Basic
    private String sigla;

    @Column(name = "TIPO", table = "CFATPLOG")
    @Basic
    private Character tipo;

    public Integer getIdCfatplog() {
        return this.idCfatplog;
    }

    public void setIdCfatplog(Integer idCfatplog) {
        this.idCfatplog = idCfatplog;
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

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Character getTipo() {
        return this.tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

}
