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
@Table(name = "AEATBPRO", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"CODIGO"})})
public class AeatbproEntity {

    @Column(name = "ID_AEATBPRO", table = "AEATBPRO", nullable = false)
    @Id
    private Integer idAeatbpro;

    @Column(name = "GUID", table = "AEATBPRO", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEATBPRO", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "AEATBPRO")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "AEATBPRO")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "AEATBPRO")
    @Basic
    private Integer ctInteg;

    @Column(name = "CODIGO", table = "AEATBPRO", nullable = false)
    @Basic(optional = false)
    private int codigo;

    @Column(name = "DESCRICAO", table = "AEATBPRO", nullable = false, length = 40)
    @Basic(optional = false)
    private String descricao;

    @Column(name = "DT_INICIO", table = "AEATBPRO")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtInicio;

    @Column(name = "DT_FIM", table = "AEATBPRO")
    @Basic
    @Temporal(TemporalType.DATE)
    private Date dtFim;

    @Column(name = "DIAS", table = "AEATBPRO", length = 18)
    @Basic
    private String dias;

    @Column(name = "ATIVO", table = "AEATBPRO", nullable = false)
    @Basic(optional = false)
    private Character ativo;

    @Column(name = "VISTA_PRAZO", table = "AEATBPRO", nullable = false)
    @Basic(optional = false)
    private Character vistaPrazo;

    public Integer getIdAeatbpro() {
        return this.idAeatbpro;
    }

    public void setIdAeatbpro(Integer idAeatbpro) {
        this.idAeatbpro = idAeatbpro;
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

    public Date getDtInicio() {
        return this.dtInicio;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Date getDtFim() {
        return this.dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    public String getDias() {
        return this.dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public Character getAtivo() {
        return this.ativo;
    }

    public void setAtivo(Character ativo) {
        this.ativo = ativo;
    }

    public Character getVistaPrazo() {
        return this.vistaPrazo;
    }

    public void setVistaPrazo(Character vistaPrazo) {
        this.vistaPrazo = vistaPrazo;
    }

}
