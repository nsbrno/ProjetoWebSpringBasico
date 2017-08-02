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
@Table(name = "CBAHIPAD")
public class CbahipadEntity {

    @Column(name = "ID_CBAHIPAD", table = "CBAHIPAD", nullable = false)
    @Id
    private Integer idCbahipad;

    @Column(name = "GUID", table = "CBAHIPAD", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "CBAHIPAD", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CBAHIPAD")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "CBAHIPAD")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "CBAHIPAD")
    @Basic
    private Integer ctInteg;

    @Column(name = "CODIGO", table = "CBAHIPAD", nullable = false)
    @Basic(optional = false)
    private int codigo;

    @Column(name = "DESCRICAO", table = "CBAHIPAD")
    @Lob
    @Basic
    private byte[] descricao;

    public Integer getIdCbahipad() {
        return this.idCbahipad;
    }

    public void setIdCbahipad(Integer idCbahipad) {
        this.idCbahipad = idCbahipad;
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

    public byte[] getDescricao() {
        return this.descricao;
    }

    public void setDescricao(byte[] descricao) {
        this.descricao = descricao;
    }

}
