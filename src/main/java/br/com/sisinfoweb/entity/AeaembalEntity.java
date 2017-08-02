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
@Table(name = "AEAEMBAL", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_AEAPRODU", "ID_AEAUNVEN"})})
public class AeaembalEntity {

    @Column(name = "ID_AEAEMBAL", table = "AEAEMBAL", nullable = false)
    @Id
    private Integer idAeaembal;

    @Column(name = "ID_AEAPRODU", table = "AEAEMBAL", nullable = false)
    @Basic(optional = false)
    private int idAeaprodu;

    @Column(name = "ID_AEAUNVEN", table = "AEAEMBAL", nullable = false)
    @Basic(optional = false)
    private int idAeaunven;

    @Column(name = "GUID", table = "AEAEMBAL", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEAEMBAL", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "AEAEMBAL")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "AEAEMBAL")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "AEAEMBAL")
    @Basic
    private Integer ctInteg;

    @Column(name = "PRINCIPAL", table = "AEAEMBAL")
    @Basic
    private Character principal;

    @Column(name = "DESCRICAO", table = "AEAEMBAL", length = 40)
    @Basic
    private String descricao;

    @Column(name = "FATOR_CONVERSAO", table = "AEAEMBAL", nullable = false)
    @Basic(optional = false)
    private double fatorConversao;

    @Column(name = "FATOR_PRECO", table = "AEAEMBAL", nullable = false)
    @Basic(optional = false)
    private double fatorPreco;

    @Column(name = "MODULO", table = "AEAEMBAL", nullable = false)
    @Basic(optional = false)
    private int modulo;

    @Column(name = "DECIMAIS", table = "AEAEMBAL", nullable = false)
    @Basic(optional = false)
    private int decimais;

    @Column(name = "ATIVO", table = "AEAEMBAL", nullable = false)
    @Basic(optional = false)
    private Character ativo;

    @Column(name = "CODIGO_BARRAS", table = "AEAEMBAL", length = 20)
    @Basic
    private String codigoBarras;

    @Column(name = "REFERENCIA", table = "AEAEMBAL", length = 20)
    @Basic
    private String referencia;

    public Integer getIdAeaembal() {
        return this.idAeaembal;
    }

    public void setIdAeaembal(Integer idAeaembal) {
        this.idAeaembal = idAeaembal;
    }

    public int getIdAeaprodu() {
        return this.idAeaprodu;
    }

    public void setIdAeaprodu(int idAeaprodu) {
        this.idAeaprodu = idAeaprodu;
    }

    public int getIdAeaunven() {
        return this.idAeaunven;
    }

    public void setIdAeaunven(int idAeaunven) {
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

    public Character getPrincipal() {
        return this.principal;
    }

    public void setPrincipal(Character principal) {
        this.principal = principal;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getFatorConversao() {
        return this.fatorConversao;
    }

    public void setFatorConversao(double fatorConversao) {
        this.fatorConversao = fatorConversao;
    }

    public double getFatorPreco() {
        return this.fatorPreco;
    }

    public void setFatorPreco(double fatorPreco) {
        this.fatorPreco = fatorPreco;
    }

    public int getModulo() {
        return this.modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    public int getDecimais() {
        return this.decimais;
    }

    public void setDecimais(int decimais) {
        this.decimais = decimais;
    }

    public Character getAtivo() {
        return this.ativo;
    }

    public void setAtivo(Character ativo) {
        this.ativo = ativo;
    }

    public String getCodigoBarras() {
        return this.codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getReferencia() {
        return this.referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

}
