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
@Table(name = "CFAFERIA", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"DESCRICAO"})})
public class CfaferiaEntity {

    @Column(name = "ID_CFAFERIA", table = "CFAFERIA", nullable = false)
    @Id
    private Integer idCfaferia;

    @Column(name = "GUID", table = "CFAFERIA", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "CFAFERIA", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CFAFERIA")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "CFAFERIA")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "CFAFERIA")
    @Basic
    private Integer ctInteg;

    @Column(name = "DESCRICAO", table = "CFAFERIA", nullable = false, length = 40)
    @Basic(optional = false)
    private String descricao;

    @Column(name = "DATA", table = "CFAFERIA", nullable = false)
    @Basic(optional = false)
    @Temporal(TemporalType.DATE)
    private Date data;

    @Column(name = "TIPO", table = "CFAFERIA", nullable = false)
    @Basic(optional = false)
    private Character tipo;

    @Column(name = "ABRANGENCIA", table = "CFAFERIA", nullable = false)
    @Basic(optional = false)
    private Character abrangencia;

    public Integer getIdCfaferia() {
        return this.idCfaferia;
    }

    public void setIdCfaferia(Integer idCfaferia) {
        this.idCfaferia = idCfaferia;
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

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Character getTipo() {
        return this.tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public Character getAbrangencia() {
        return this.abrangencia;
    }

    public void setAbrangencia(Character abrangencia) {
        this.abrangencia = abrangencia;
    }

}
