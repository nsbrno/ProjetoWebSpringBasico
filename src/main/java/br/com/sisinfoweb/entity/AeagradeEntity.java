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
@Table(name = "AEAGRADE", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_AEATPGRD", "DESCRICAO"})})
public class AeagradeEntity {

    @Column(name = "ID_AEAGRADE", table = "AEAGRADE", nullable = false)
    @Id
    private Integer idAeagrade;

    @Column(name = "ID_AEATPGRD", table = "AEAGRADE", nullable = false)
    @Basic(optional = false)
    private int idAeatpgrd;

    @Column(name = "GUID", table = "AEAGRADE", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEAGRADE", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "AEAGRADE")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "AEAGRADE")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "AEAGRADE")
    @Basic
    private Integer ctInteg;

    @Column(name = "DESCRICAO", table = "AEAGRADE", nullable = false, length = 40)
    @Basic(optional = false)
    private String descricao;

    public Integer getIdAeagrade() {
        return this.idAeagrade;
    }

    public void setIdAeagrade(Integer idAeagrade) {
        this.idAeagrade = idAeagrade;
    }

    public int getIdAeatpgrd() {
        return this.idAeatpgrd;
    }

    public void setIdAeatpgrd(int idAeatpgrd) {
        this.idAeatpgrd = idAeatpgrd;
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

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}