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
@Table(name = "AEALOCES", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_SMAEMPRE", "DESCRICAO"})})
public class AealocesEntity {

    @Column(name = "ID_AEALOCES", table = "AEALOCES", nullable = false)
    @Id
    private Integer idAealoces;

    @Column(name = "ID_SMAEMPRE", table = "AEALOCES", nullable = false)
    @Basic(optional = false)
    private int idSmaempre;

    @Column(name = "GUID", table = "AEALOCES", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEALOCES", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "AEALOCES")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "AEALOCES")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "AEALOCES")
    @Basic
    private Integer ctInteg;

    @Column(name = "CODIGO", table = "AEALOCES", nullable = false)
    @Basic(optional = false)
    private int codigo;

    @Column(name = "DESCRICAO", table = "AEALOCES", nullable = false, length = 40)
    @Basic(optional = false)
    private String descricao;

    @Column(name = "ATIVO", table = "AEALOCES", nullable = false)
    @Basic(optional = false)
    private Character ativo;

    @Column(name = "IMPRESSORA", table = "AEALOCES", length = 128)
    @Basic
    private String impressora;

    @Column(name = "TIPO_VENDA", table = "AEALOCES")
    @Basic
    private Character tipoVenda;

    public Integer getIdAealoces() {
        return this.idAealoces;
    }

    public void setIdAealoces(Integer idAealoces) {
        this.idAealoces = idAealoces;
    }

    public int getIdSmaempre() {
        return this.idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
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

    public Character getAtivo() {
        return this.ativo;
    }

    public void setAtivo(Character ativo) {
        this.ativo = ativo;
    }

    public String getImpressora() {
        return this.impressora;
    }

    public void setImpressora(String impressora) {
        this.impressora = impressora;
    }

    public Character getTipoVenda() {
        return this.tipoVenda;
    }

    public void setTipoVenda(Character tipoVenda) {
        this.tipoVenda = tipoVenda;
    }

}
