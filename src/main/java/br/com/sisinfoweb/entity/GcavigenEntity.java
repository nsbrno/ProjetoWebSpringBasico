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
@Table(name = "GCAVIGEN")
public class GcavigenEntity {

    @Column(name = "ID_GCAVIGEN", table = "GCAVIGEN", nullable = false)
    @Id
    private Integer idGcavigen;

    @Column(name = "ID_GCATPLOC", table = "GCAVIGEN")
    @Basic
    private Integer idGcatploc;

    @Column(name = "ID_GCACONTR", table = "GCAVIGEN")
    @Basic
    private Integer idGcacontr;

    @Column(name = "ID_CFACLIFO_VENDEDOR", table = "GCAVIGEN")
    @Basic
    private Integer idCfaclifoVendedor;

    @Column(name = "US_CAD", table = "GCAVIGEN", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "GCAVIGEN")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "GCAVIGEN")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "GCAVIGEN")
    @Basic
    private Integer ctInteg;

    @Column(name = "GUID", table = "GCAVIGEN", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "DATA_INICIO", table = "GCAVIGEN")
    @Basic
        private String dataInicio;

    @Column(name = "DATA_TERMINO", table = "GCAVIGEN")
    @Basic
    private String dataTermino;

    @Column(name = "VL_VIGENCIA", table = "GCAVIGEN", nullable = false)
    @Basic(optional = false)
    private double vlVigencia;

    @Column(name = "TIPO", table = "GCAVIGEN")
    @Basic
    private Character tipo;

    @Column(name = "SITUACAO", table = "GCAVIGEN", nullable = false)
    @Basic(optional = false)
    private short situacao;

    @Column(name = "STATUS", table = "GCAVIGEN", nullable = false)
    @Basic(optional = false)
    private int status;

    @Column(name = "QUANTIDADE", table = "GCAVIGEN", nullable = false)
    @Basic(optional = false)
    private double quantidade;

    public Integer getIdGcavigen() {
        return this.idGcavigen;
    }

    public void setIdGcavigen(Integer idGcavigen) {
        this.idGcavigen = idGcavigen;
    }

    public Integer getIdGcatploc() {
        return this.idGcatploc;
    }

    public void setIdGcatploc(Integer idGcatploc) {
        this.idGcatploc = idGcatploc;
    }

    public Integer getIdGcacontr() {
        return this.idGcacontr;
    }

    public void setIdGcacontr(Integer idGcacontr) {
        this.idGcacontr = idGcacontr;
    }

    public Integer getIdCfaclifoVendedor() {
        return this.idCfaclifoVendedor;
    }

    public void setIdCfaclifoVendedor(Integer idCfaclifoVendedor) {
        this.idCfaclifoVendedor = idCfaclifoVendedor;
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

    public String getDataInicio() {
        return this.dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return this.dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public double getVlVigencia() {
        return this.vlVigencia;
    }

    public void setVlVigencia(double vlVigencia) {
        this.vlVigencia = vlVigencia;
    }

    public Character getTipo() {
        return this.tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public short getSituacao() {
        return this.situacao;
    }

    public void setSituacao(short situacao) {
        this.situacao = situacao;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

}
