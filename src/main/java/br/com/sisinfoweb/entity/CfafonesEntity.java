/**
 * This file was generated by the Jeddict
 */
package br.com.sisinfoweb.entity;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CFAFONES")
public class CfafonesEntity {

    @Column(name = "ID_CFAFONES", table = "CFAFONES", nullable = false)
    @Id
    private Integer idCfafones;

    @Column(name = "ID_SMAEMPRE", table = "CFAFONES")
    @Basic
    private Integer idSmaempre;

    @Column(name = "ID_CFADEPEN", table = "CFAFONES")
    @Basic
    private Integer idCfadepen;

    @Column(name = "ID_CFACONTA", table = "CFAFONES")
    @Basic
    private Integer idCfaconta;

    @Column(name = "ID_CFACLIFO", table = "CFAFONES")
    @Basic
    private Integer idCfaclifo;

    @Column(name = "ID_CFASOCPA", table = "CFAFONES")
    @Basic
    private Integer idCfasocpa;

    @Column(name = "ID_CFAREFCL", table = "CFAFONES")
    @Basic
    private Integer idCfarefcl;

    @Column(name = "ID_CFAREFER", table = "CFAFONES")
    @Basic
    private Integer idCfarefer;

    @Column(name = "GUID", table = "CFAFONES", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "CFAFONES", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CFAFONES")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "CFAFONES")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "CFAFONES")
    @Basic
    private Integer ctInteg;

    @Column(name = "TIPO", table = "CFAFONES", nullable = false)
    @Basic(optional = false)
    private Character tipo;

    @Column(name = "MODELO", table = "CFAFONES", length = 5)
    @Basic
    private String modelo;

    @Column(name = "DDD", table = "CFAFONES")
    @Basic
    private Integer ddd;

    @Column(name = "FONE", table = "CFAFONES", nullable = false, length = 10)
    @Basic(optional = false)
    private String fone;

    @Column(name = "FC_DDD_FONE", table = "CFAFONES", length = 0)
    @Basic
    private String fcDddFone;

    @Column(name = "COMENTARIO", table = "CFAFONES")
    @Lob
    @Basic
    private byte[] comentario;

    @Column(name = "RAMAL", table = "CFAFONES", nullable = false)
    @Basic(optional = false)
    private int ramal;

    public Integer getIdCfafones() {
        return this.idCfafones;
    }

    public void setIdCfafones(Integer idCfafones) {
        this.idCfafones = idCfafones;
    }

    public Integer getIdSmaempre() {
        return this.idSmaempre;
    }

    public void setIdSmaempre(Integer idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdCfadepen() {
        return this.idCfadepen;
    }

    public void setIdCfadepen(Integer idCfadepen) {
        this.idCfadepen = idCfadepen;
    }

    public Integer getIdCfaconta() {
        return this.idCfaconta;
    }

    public void setIdCfaconta(Integer idCfaconta) {
        this.idCfaconta = idCfaconta;
    }

    public Integer getIdCfaclifo() {
        return this.idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdCfasocpa() {
        return this.idCfasocpa;
    }

    public void setIdCfasocpa(Integer idCfasocpa) {
        this.idCfasocpa = idCfasocpa;
    }

    public Integer getIdCfarefcl() {
        return this.idCfarefcl;
    }

    public void setIdCfarefcl(Integer idCfarefcl) {
        this.idCfarefcl = idCfarefcl;
    }

    public Integer getIdCfarefer() {
        return this.idCfarefer;
    }

    public void setIdCfarefer(Integer idCfarefer) {
        this.idCfarefer = idCfarefer;
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

    public Character getTipo() {
        return this.tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getDdd() {
        return this.ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public String getFone() {
        return this.fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFcDddFone() {
        return this.fcDddFone;
    }

    public void setFcDddFone(String fcDddFone) {
        this.fcDddFone = fcDddFone;
    }

    public byte[] getComentario() {
        return this.comentario;
    }

    public void setComentario(byte[] comentario) {
        this.comentario = comentario;
    }

    public int getRamal() {
        return this.ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

}
