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
@Table(name = "CPAESPEC")
public class CpaespecEntity {

    @Column(name = "ID_CPAESPEC", table = "CPAESPEC", nullable = false)
    @Id
    private Integer idCpaespec;

    @Column(name = "US_CAD", table = "CPAESPEC", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CPAESPEC")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "CPAESPEC")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "CPAESPEC")
    @Basic
    private Integer ctInteg;

    @Column(name = "GUID", table = "CPAESPEC", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "CODIGO", table = "CPAESPEC", nullable = false, length = 3)
    @Basic(optional = false)
    private String codigo;

    @Column(name = "DESCRICAO", table = "CPAESPEC", nullable = false, length = 40)
    @Basic(optional = false)
    private String descricao;

    public Integer getIdCpaespec() {
        return this.idCpaespec;
    }

    public void setIdCpaespec(Integer idCpaespec) {
        this.idCpaespec = idCpaespec;
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

    public String getGuid() {
        return this.guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
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

}