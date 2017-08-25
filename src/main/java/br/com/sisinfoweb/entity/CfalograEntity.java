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
@Table(name = "CFALOGRA")
public class CfalograEntity {

    @Column(name = "ID_CFALOGRA", table = "CFALOGRA", nullable = false)
    @Id
    private Integer idCfalogra;

    @Column(name = "ID_CFACIDAD", table = "CFALOGRA", nullable = false)
    @Basic(optional = false)
    private int idCfacidad;

    @Column(name = "ID_CFABAIRO", table = "CFALOGRA", nullable = false)
    @Basic(optional = false)
    private int idCfabairo;

    @Column(name = "ID_CFATPLOG", table = "CFALOGRA", nullable = false)
    @Basic(optional = false)
    private int idCfatplog;

    @Column(name = "GUID", table = "CFALOGRA", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "CFALOGRA", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CFALOGRA")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "CFALOGRA")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "CFALOGRA")
    @Basic
    private Integer ctInteg;

    @Column(name = "DESCRICAO", table = "CFALOGRA", nullable = false, length = 60)
    @Basic(optional = false)
    private String descricao;

    @Column(name = "CEP", table = "CFALOGRA", nullable = false, length = 9)
    @Basic(optional = false)
    private String cep;

    @Column(name = "DE", table = "CFALOGRA", nullable = false)
    @Basic(optional = false)
    private double de;

    @Column(name = "ATE", table = "CFALOGRA", nullable = false)
    @Basic(optional = false)
    private double ate;

    @Column(name = "PAR_IMPAR", table = "CFALOGRA")
    @Basic
    private Character parImpar;

    @Column(name = "DDD", table = "CFALOGRA")
    @Basic
    private Integer ddd;

    @Column(name = "COMPLEMENTO", table = "CFALOGRA")
    @Lob
    @Basic
    private byte[] complemento;

    public Integer getIdCfalogra() {
        return this.idCfalogra;
    }

    public void setIdCfalogra(Integer idCfalogra) {
        this.idCfalogra = idCfalogra;
    }

    public int getIdCfacidad() {
        return this.idCfacidad;
    }

    public void setIdCfacidad(int idCfacidad) {
        this.idCfacidad = idCfacidad;
    }

    public int getIdCfabairo() {
        return this.idCfabairo;
    }

    public void setIdCfabairo(int idCfabairo) {
        this.idCfabairo = idCfabairo;
    }

    public int getIdCfatplog() {
        return this.idCfatplog;
    }

    public void setIdCfatplog(int idCfatplog) {
        this.idCfatplog = idCfatplog;
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

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public double getDe() {
        return this.de;
    }

    public void setDe(double de) {
        this.de = de;
    }

    public double getAte() {
        return this.ate;
    }

    public void setAte(double ate) {
        this.ate = ate;
    }

    public Character getParImpar() {
        return this.parImpar;
    }

    public void setParImpar(Character parImpar) {
        this.parImpar = parImpar;
    }

    public Integer getDdd() {
        return this.ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public byte[] getComplemento() {
        return this.complemento;
    }

    public void setComplemento(byte[] complemento) {
        this.complemento = complemento;
    }

}
