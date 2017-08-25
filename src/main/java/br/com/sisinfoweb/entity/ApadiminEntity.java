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

@Entity
@Table(name = "APADIMIN")
public class ApadiminEntity {

    @Column(name = "ID_APADIMIN", table = "APADIMIN", nullable = false)
    @Id
    private Integer idApadimin;

    @Column(name = "ID_APADIZIM", table = "APADIMIN")
    @Basic
    private Integer idApadizim;

    @Column(name = "ID_APAMINIS", table = "APADIMIN")
    @Basic
    private Integer idApaminis;

    @Column(name = "ID_CFACLIFO", table = "APADIMIN")
    @Basic
    private Integer idCfaclifo;

    @Column(name = "US_CAD", table = "APADIMIN", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "APADIMIN")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "APADIMIN")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "APADIMIN")
    @Basic
    private Integer ctInteg;

    @Column(name = "GUID", table = "APADIMIN", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "DT_INICIAL", table = "APADIMIN")
    @Basic
    private String dtInicial;

    @Column(name = "DT_FINAL", table = "APADIMIN")
    @Basic
        private String dtFinal;

    public Integer getIdApadimin() {
        return this.idApadimin;
    }

    public void setIdApadimin(Integer idApadimin) {
        this.idApadimin = idApadimin;
    }

    public Integer getIdApadizim() {
        return this.idApadizim;
    }

    public void setIdApadizim(Integer idApadizim) {
        this.idApadizim = idApadizim;
    }

    public Integer getIdApaminis() {
        return this.idApaminis;
    }

    public void setIdApaminis(Integer idApaminis) {
        this.idApaminis = idApaminis;
    }

    public Integer getIdCfaclifo() {
        return this.idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
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

    public String getGuid() {
        return this.guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getDtInicial() {
        return this.dtInicial;
    }

    public void setDtInicial(String dtInicial) {
        this.dtInicial = dtInicial;
    }

    public String getDtFinal() {
        return this.dtFinal;
    }

    public void setDtFinal(String dtFinal) {
        this.dtFinal = dtFinal;
    }

}
