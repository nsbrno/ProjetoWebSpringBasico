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
@Table(name = "CCAORGAO")
public class CcaorgaoEntity {

    @Column(name = "ID_CCAORGAO", table = "CCAORGAO", nullable = false)
    @Id
    private Integer idCcaorgao;

    @Column(name = "ID_CFACIDAD", table = "CCAORGAO")
    @Basic
    private Integer idCfacidad;

    @Column(name = "ID_CFAESTAD", table = "CCAORGAO")
    @Basic
    private Integer idCfaestad;

    @Column(name = "US_CAD", table = "CCAORGAO", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CCAORGAO")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "CCAORGAO")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "CCAORGAO")
    @Basic
    private Integer ctInteg;

    @Column(name = "GUID", table = "CCAORGAO", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "CODIGO", table = "CCAORGAO")
    @Basic
    private Integer codigo;

    @Column(name = "NOME", table = "CCAORGAO", length = 60)
    @Basic
    private String nome;

    public Integer getIdCcaorgao() {
        return this.idCcaorgao;
    }

    public void setIdCcaorgao(Integer idCcaorgao) {
        this.idCcaorgao = idCcaorgao;
    }

    public Integer getIdCfacidad() {
        return this.idCfacidad;
    }

    public void setIdCfacidad(Integer idCfacidad) {
        this.idCfacidad = idCfacidad;
    }

    public Integer getIdCfaestad() {
        return this.idCfaestad;
    }

    public void setIdCfaestad(Integer idCfaestad) {
        this.idCfaestad = idCfaestad;
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

    public Integer getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
