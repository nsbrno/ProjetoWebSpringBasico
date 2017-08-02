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
@Table(name = "CFANATOP", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"CODIGO"})})
public class CfanatopEntity {

    @Column(name = "ID_CFANATOP", table = "CFANATOP", nullable = false)
    @Id
    private Integer idCfanatop;

    @Column(name = "ID_AEAOBSPR", table = "CFANATOP")
    @Basic
    private Integer idAeaobspr;

    @Column(name = "ID_CFANATOP_DEV", table = "CFANATOP")
    @Basic
    private Integer idCfanatopDev;

    @Column(name = "ID_AEATBPER", table = "CFANATOP")
    @Basic
    private Integer idAeatbper;

    @Column(name = "GUID", table = "CFANATOP", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "CFANATOP", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CFANATOP")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "CFANATOP")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "CFANATOP")
    @Basic
    private Integer ctInteg;

    @Column(name = "E_S", table = "CFANATOP", nullable = false)
    @Basic(optional = false)
    private Character eS;

    @Column(name = "CODIGO", table = "CFANATOP", nullable = false, length = 5)
    @Basic(optional = false)
    private String codigo;

    @Column(name = "DESCRICAO", table = "CFANATOP", nullable = false, length = 40)
    @Basic(optional = false)
    private String descricao;

    @Column(name = "ATUALIZA_CUSTO", table = "CFANATOP", nullable = false)
    @Basic(optional = false)
    private Character atualizaCusto;

    @Column(name = "ATUALIZA_PRECO", table = "CFANATOP", nullable = false)
    @Basic(optional = false)
    private Character atualizaPreco;

    @Column(name = "DESTACA_IMPOSTO", table = "CFANATOP")
    @Basic
    private Character destacaImposto;

    public Integer getIdCfanatop() {
        return this.idCfanatop;
    }

    public void setIdCfanatop(Integer idCfanatop) {
        this.idCfanatop = idCfanatop;
    }

    public Integer getIdAeaobspr() {
        return this.idAeaobspr;
    }

    public void setIdAeaobspr(Integer idAeaobspr) {
        this.idAeaobspr = idAeaobspr;
    }

    public Integer getIdCfanatopDev() {
        return this.idCfanatopDev;
    }

    public void setIdCfanatopDev(Integer idCfanatopDev) {
        this.idCfanatopDev = idCfanatopDev;
    }

    public Integer getIdAeatbper() {
        return this.idAeatbper;
    }

    public void setIdAeatbper(Integer idAeatbper) {
        this.idAeatbper = idAeatbper;
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

    public Character getES() {
        return this.eS;
    }

    public void setES(Character eS) {
        this.eS = eS;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Character getAtualizaCusto() {
        return this.atualizaCusto;
    }

    public void setAtualizaCusto(Character atualizaCusto) {
        this.atualizaCusto = atualizaCusto;
    }

    public Character getAtualizaPreco() {
        return this.atualizaPreco;
    }

    public void setAtualizaPreco(Character atualizaPreco) {
        this.atualizaPreco = atualizaPreco;
    }

    public Character getDestacaImposto() {
        return this.destacaImposto;
    }

    public void setDestacaImposto(Character destacaImposto) {
        this.destacaImposto = destacaImposto;
    }

}
