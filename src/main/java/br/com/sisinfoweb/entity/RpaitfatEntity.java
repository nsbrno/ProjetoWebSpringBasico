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
@Table(name = "RPAITFAT", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_RPAFATUR", "SEQUENCIA"})})
public class RpaitfatEntity {

    @Column(name = "ID_RPAITFAT", table = "RPAITFAT", nullable = false)
    @Id
    private Integer idRpaitfat;

    @Column(name = "ID_RPAFATUR", table = "RPAITFAT", nullable = false)
    @Basic(optional = false)
    private int idRpafatur;

    @Column(name = "ID_AEAPEDID", table = "RPAITFAT")
    @Basic
    private Integer idAeapedid;

    @Column(name = "ID_AEAENTRA", table = "RPAITFAT")
    @Basic
    private Integer idAeaentra;

    @Column(name = "ID_AEASAIDA", table = "RPAITFAT")
    @Basic
    private Integer idAeasaida;

    @Column(name = "ID_AEANFSAI", table = "RPAITFAT")
    @Basic
    private Integer idAeanfsai;

    @Column(name = "ID_AEAFRETE", table = "RPAITFAT")
    @Basic
    private Integer idAeafrete;

    @Column(name = "ID_GCAVIGEN", table = "RPAITFAT")
    @Basic
    private Integer idGcavigen;

    @Column(name = "GUID", table = "RPAITFAT", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "RPAITFAT", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "RPAITFAT")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCad;

    @Column(name = "DT_ALT", table = "RPAITFAT")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAlt;

    @Column(name = "CT_INTEG", table = "RPAITFAT")
    @Basic
    private Integer ctInteg;

    @Column(name = "SEQUENCIA", table = "RPAITFAT", nullable = false)
    @Basic(optional = false)
    private int sequencia;

    @Column(name = "CANCELADO", table = "RPAITFAT", nullable = false)
    @Basic(optional = false)
    private Character cancelado;

    @Column(name = "VL_ITEM_FAT", table = "RPAITFAT", nullable = false)
    @Basic(optional = false)
    private double vlItemFat;

    @Column(name = "COMPLEMENTO", table = "RPAITFAT")
    @Basic
    private Character complemento;

    public Integer getIdRpaitfat() {
        return this.idRpaitfat;
    }

    public void setIdRpaitfat(Integer idRpaitfat) {
        this.idRpaitfat = idRpaitfat;
    }

    public int getIdRpafatur() {
        return this.idRpafatur;
    }

    public void setIdRpafatur(int idRpafatur) {
        this.idRpafatur = idRpafatur;
    }

    public Integer getIdAeapedid() {
        return this.idAeapedid;
    }

    public void setIdAeapedid(Integer idAeapedid) {
        this.idAeapedid = idAeapedid;
    }

    public Integer getIdAeaentra() {
        return this.idAeaentra;
    }

    public void setIdAeaentra(Integer idAeaentra) {
        this.idAeaentra = idAeaentra;
    }

    public Integer getIdAeasaida() {
        return this.idAeasaida;
    }

    public void setIdAeasaida(Integer idAeasaida) {
        this.idAeasaida = idAeasaida;
    }

    public Integer getIdAeanfsai() {
        return this.idAeanfsai;
    }

    public void setIdAeanfsai(Integer idAeanfsai) {
        this.idAeanfsai = idAeanfsai;
    }

    public Integer getIdAeafrete() {
        return this.idAeafrete;
    }

    public void setIdAeafrete(Integer idAeafrete) {
        this.idAeafrete = idAeafrete;
    }

    public Integer getIdGcavigen() {
        return this.idGcavigen;
    }

    public void setIdGcavigen(Integer idGcavigen) {
        this.idGcavigen = idGcavigen;
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

    public int getSequencia() {
        return this.sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public Character getCancelado() {
        return this.cancelado;
    }

    public void setCancelado(Character cancelado) {
        this.cancelado = cancelado;
    }

    public double getVlItemFat() {
        return this.vlItemFat;
    }

    public void setVlItemFat(double vlItemFat) {
        this.vlItemFat = vlItemFat;
    }

    public Character getComplemento() {
        return this.complemento;
    }

    public void setComplemento(Character complemento) {
        this.complemento = complemento;
    }

}