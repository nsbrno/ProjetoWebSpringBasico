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
@Table(name = "SMADEPTO", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"CODIGO"})})
public class SmadeptoEntity {

    @Column(name = "ID_SMADEPTO", table = "SMADEPTO", nullable = false)
    @Id
    private Integer idSmadepto;

    @Column(name = "GUID", table = "SMADEPTO", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "SMADEPTO", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "SMADEPTO")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "SMADEPTO")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "SMADEPTO")
    @Basic
    private Integer ctInteg;

    @Column(name = "CODIGO", table = "SMADEPTO", nullable = false)
    @Basic(optional = false)
    private int codigo;

    @Column(name = "DESCRICAO", table = "SMADEPTO", nullable = false, length = 40)
    @Basic(optional = false)
    private String descricao;

    @Column(name = "TIPO_TEMPO", table = "SMADEPTO")
    @Basic
    private Character tipoTempo;

    public Integer getIdSmadepto() {
        return this.idSmadepto;
    }

    public void setIdSmadepto(Integer idSmadepto) {
        this.idSmadepto = idSmadepto;
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

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Character getTipoTempo() {
        return this.tipoTempo;
    }

    public void setTipoTempo(Character tipoTempo) {
        this.tipoTempo = tipoTempo;
    }

}