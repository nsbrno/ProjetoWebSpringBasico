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
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "CBAITMOV", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_CBATRANS", "SEQUENCIA"})})
public class CbaitmovEntity {

    @Column(name = "ID_CBAITMOV", table = "CBAITMOV", nullable = false)
    @Id
    private Integer idCbaitmov;

    @Column(name = "ID_CBATRANS", table = "CBAITMOV", nullable = false)
    @Basic(optional = false)
    private int idCbatrans;

    @Column(name = "ID_CBAPLCTA", table = "CBAITMOV", nullable = false)
    @Basic(optional = false)
    private int idCbaplcta;

    @Column(name = "ID_CBAPLCTA_NUMCX", table = "CBAITMOV", nullable = false)
    @Basic(optional = false)
    private int idCbaplctaNumcx;

    @Column(name = "ID_CBAPLCTA_JUROS", table = "CBAITMOV")
    @Basic
    private Integer idCbaplctaJuros;

    @Column(name = "ID_CBAPLCTA_JUROS_DISP", table = "CBAITMOV", nullable = false)
    @Basic(optional = false)
    private int idCbaplctaJurosDisp;

    @Column(name = "ID_CBAPLCTA_DESCONTO", table = "CBAITMOV")
    @Basic
    private Integer idCbaplctaDesconto;

    @Column(name = "ID_RPAPARCE", table = "CBAITMOV")
    @Basic
    private Integer idRpaparce;

    @Column(name = "GUID", table = "CBAITMOV", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "CBAITMOV", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "CBAITMOV")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "CBAITMOV")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "CBAITMOV")
    @Basic
    private Integer ctInteg;

    @Column(name = "D_C", table = "CBAITMOV", nullable = false)
    @Basic(optional = false)
    private Character dC;

    @Column(name = "SEQUENCIA", table = "CBAITMOV", nullable = false)
    @Basic(optional = false)
    private int sequencia;

    @Column(name = "A_S", table = "CBAITMOV", nullable = false)
    @Basic(optional = false)
    private Character analiticoSintetico;

    @Column(name = "VL_CAPITAL", table = "CBAITMOV", nullable = false)
    @Basic(optional = false)
    private double vlCapital;

    @Column(name = "VL_JUROS", table = "CBAITMOV", nullable = false)
    @Basic(optional = false)
    private double vlJuros;

    @Column(name = "VL_DESCONTO", table = "CBAITMOV", nullable = false)
    @Basic(optional = false)
    private double vlDesconto;

    @Column(name = "VL_JUROS_A_PRORROG", table = "CBAITMOV", nullable = false)
    @Basic(optional = false)
    private double vlJurosAProrrog;

    @Column(name = "VL_JUROS_CALC", table = "CBAITMOV", nullable = false)
    @Basic(optional = false)
    private double vlJurosCalc;

    @Column(name = "FC_VL_MOVIMENTO", table = "CBAITMOV", precision = 15)
    @Basic
    private Double fcVlMovimento;

    @Column(name = "COMPLEMENTO", table = "CBAITMOV")
    @Lob
    @Basic
    private byte[] complemento;

    @Column(name = "TIPO", table = "CBAITMOV", nullable = false)
    @Basic(optional = false)
    private Character tipo;

    @Column(name = "AUTENTICADO", table = "CBAITMOV")
    @Basic
    private Character autenticado;

    public Integer getIdCbaitmov() {
        return this.idCbaitmov;
    }

    public void setIdCbaitmov(Integer idCbaitmov) {
        this.idCbaitmov = idCbaitmov;
    }

    public int getIdCbatrans() {
        return this.idCbatrans;
    }

    public void setIdCbatrans(int idCbatrans) {
        this.idCbatrans = idCbatrans;
    }

    public int getIdCbaplcta() {
        return this.idCbaplcta;
    }

    public void setIdCbaplcta(int idCbaplcta) {
        this.idCbaplcta = idCbaplcta;
    }

    public int getIdCbaplctaNumcx() {
        return this.idCbaplctaNumcx;
    }

    public void setIdCbaplctaNumcx(int idCbaplctaNumcx) {
        this.idCbaplctaNumcx = idCbaplctaNumcx;
    }

    public Integer getIdCbaplctaJuros() {
        return this.idCbaplctaJuros;
    }

    public void setIdCbaplctaJuros(Integer idCbaplctaJuros) {
        this.idCbaplctaJuros = idCbaplctaJuros;
    }

    public int getIdCbaplctaJurosDisp() {
        return this.idCbaplctaJurosDisp;
    }

    public void setIdCbaplctaJurosDisp(int idCbaplctaJurosDisp) {
        this.idCbaplctaJurosDisp = idCbaplctaJurosDisp;
    }

    public Integer getIdCbaplctaDesconto() {
        return this.idCbaplctaDesconto;
    }

    public void setIdCbaplctaDesconto(Integer idCbaplctaDesconto) {
        this.idCbaplctaDesconto = idCbaplctaDesconto;
    }

    public Integer getIdRpaparce() {
        return this.idRpaparce;
    }

    public void setIdRpaparce(Integer idRpaparce) {
        this.idRpaparce = idRpaparce;
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

    public Character getDC() {
        return this.dC;
    }

    public void setDC(Character dC) {
        this.dC = dC;
    }

    public int getSequencia() {
        return this.sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public Character getAnaliticoSintetico() {
        return this.analiticoSintetico;
    }

    public void setAnaliticoSintetico(Character analiticoSintetico) {
        this.analiticoSintetico = analiticoSintetico;
    }

    public double getVlCapital() {
        return this.vlCapital;
    }

    public void setVlCapital(double vlCapital) {
        this.vlCapital = vlCapital;
    }

    public double getVlJuros() {
        return this.vlJuros;
    }

    public void setVlJuros(double vlJuros) {
        this.vlJuros = vlJuros;
    }

    public double getVlDesconto() {
        return this.vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public double getVlJurosAProrrog() {
        return this.vlJurosAProrrog;
    }

    public void setVlJurosAProrrog(double vlJurosAProrrog) {
        this.vlJurosAProrrog = vlJurosAProrrog;
    }

    public double getVlJurosCalc() {
        return this.vlJurosCalc;
    }

    public void setVlJurosCalc(double vlJurosCalc) {
        this.vlJurosCalc = vlJurosCalc;
    }

    public Double getFcVlMovimento() {
        return this.fcVlMovimento;
    }

    public void setFcVlMovimento(Double fcVlMovimento) {
        this.fcVlMovimento = fcVlMovimento;
    }

    public byte[] getComplemento() {
        return this.complemento;
    }

    public void setComplemento(byte[] complemento) {
        this.complemento = complemento;
    }

    public Character getTipo() {
        return this.tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public Character getAutenticado() {
        return this.autenticado;
    }

    public void setAutenticado(Character autenticado) {
        this.autenticado = autenticado;
    }

}
