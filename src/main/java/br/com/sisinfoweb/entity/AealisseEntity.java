/**
 * This file was generated by the Jeddict
 */
package br.com.sisinfoweb.entity;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "AEALISSE")
public class AealisseEntity {

    @Column(name = "ID_AEALISSE", table = "AEALISSE", nullable = false)
    @Id
    private Integer idAealisse;

    @Column(name = "GUID", table = "AEALISSE", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEALISSE", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "AEALISSE")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "AEALISSE")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "AEALISSE")
    @Basic
    private Integer ctInteg;

    @Column(name = "CODIGO", table = "AEALISSE", length = 6)
    @Basic
    private String codigo;

    @Column(name = "DESCRICAO", table = "AEALISSE")
    @Lob
    @Basic
    private byte[] descricao;

    public Integer getIdAealisse() {
        return this.idAealisse;
    }

    public void setIdAealisse(Integer idAealisse) {
        this.idAealisse = idAealisse;
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

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public byte[] getDescricao() {
        return this.descricao;
    }

    public void setDescricao(byte[] descricao) {
        this.descricao = descricao;
    }

}