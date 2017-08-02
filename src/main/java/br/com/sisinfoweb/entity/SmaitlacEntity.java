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

@Entity
@Table(name = "SMAITLAC")
public class SmaitlacEntity {

    @Column(name = "ID_SMAITLAC", table = "SMAITLAC", nullable = false)
    @Id
    private Integer idSmaitlac;

    @Column(name = "ID_SMALOGAC", table = "SMAITLAC")
    @Basic
    private Integer idSmalogac;

    @Column(name = "DT_ALT", table = "SMAITLAC")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "ID_ARQUIVO", table = "SMAITLAC")
    @Basic
    private Integer idArquivo;

    @Column(name = "GUID", table = "SMAITLAC", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "ACAO", table = "SMAITLAC")
    @Basic
    private Character acao;

    @Column(name = "ARQUIVO", table = "SMAITLAC", length = 12)
    @Basic
    private String arquivo;

    public Integer getIdSmaitlac() {
        return this.idSmaitlac;
    }

    public void setIdSmaitlac(Integer idSmaitlac) {
        this.idSmaitlac = idSmaitlac;
    }

    public Integer getIdSmalogac() {
        return this.idSmalogac;
    }

    public void setIdSmalogac(Integer idSmalogac) {
        this.idSmalogac = idSmalogac;
    }

    public Date getDtAlt() {
        return this.dtAlt;
    }

    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }

    public Integer getIdArquivo() {
        return this.idArquivo;
    }

    public void setIdArquivo(Integer idArquivo) {
        this.idArquivo = idArquivo;
    }

    public String getGuid() {
        return this.guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Character getAcao() {
        return this.acao;
    }

    public void setAcao(Character acao) {
        this.acao = acao;
    }

    public String getArquivo() {
        return this.arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

}
