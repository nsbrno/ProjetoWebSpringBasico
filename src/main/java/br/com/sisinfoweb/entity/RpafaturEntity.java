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
@Table(name = "RPAFATUR", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_CFATPFAT", "NUMERO"})})
public class RpafaturEntity {

    @Column(name = "ID_RPAFATUR", table = "RPAFATUR", nullable = false)
    @Id
    private Integer idRpafatur;

    @Column(name = "ID_SMAEMPRE", table = "RPAFATUR", nullable = false)
    @Basic(optional = false)
    private int idSmaempre;

    @Column(name = "ID_CFATPFAT_VENDA", table = "RPAFATUR")
    @Basic
    private Integer idCfatpfatVenda;

    @Column(name = "ID_CFATPFAT", table = "RPAFATUR", nullable = false)
    @Basic(optional = false)
    private int idCfatpfat;

    @Column(name = "ID_AEAFORMA", table = "RPAFATUR")
    @Basic
    private Integer idAeaforma;

    @Column(name = "ID_CBAPLCTA_CTA_TRANS", table = "RPAFATUR", nullable = false)
    @Basic(optional = false)
    private int idCbaplctaCtaTrans;

    @Column(name = "ID_CBAPLCTA", table = "RPAFATUR", nullable = false)
    @Basic(optional = false)
    private int idCbaplcta;

    @Column(name = "ID_AEANFSAI", table = "RPAFATUR")
    @Basic
    private Integer idAeanfsai;

    @Column(name = "ID_CFACLIFO", table = "RPAFATUR")
    @Basic
    private Integer idCfaclifo;

    @Column(name = "ID_CFACLIFO_CONVENIO", table = "RPAFATUR")
    @Basic
    private Integer idCfaclifoConvenio;

    @Column(name = "GUID", table = "RPAFATUR", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "RPAFATUR", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "RPAFATUR")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "RPAFATUR")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "RPAFATUR")
    @Basic
    private Integer ctInteg;

    @Column(name = "ORIGEM", table = "RPAFATUR")
    @Basic
    private Character origem;

    @Column(name = "TIPO", table = "RPAFATUR", nullable = false)
    @Basic(optional = false)
    private Character tipo;

    @Column(name = "ATAC_VAREJO", table = "RPAFATUR")
    @Basic
    private Character atacVarejo;

    @Column(name = "NUMERO_VENDA", table = "RPAFATUR")
    @Basic
    private Integer numeroVenda;

    @Column(name = "NUMERO", table = "RPAFATUR", nullable = false)
    @Basic(optional = false)
    private int numero;

    @Column(name = "DT_IMPORTACAO", table = "RPAFATUR")
    @Basic
        private String dtImportacao;

    @Column(name = "DT_ABERTURA", table = "RPAFATUR", nullable = false)
    @Basic(optional = false)
        private String dtAbertura;

    @Column(name = "DT_EMISSAO", table = "RPAFATUR")
    @Basic
        private String dtEmissao;

    @Column(name = "DT_BAIXA", table = "RPAFATUR")
    @Basic
        private String dtBaixa;

    @Column(name = "DT_PAGAMENTO", table = "RPAFATUR")
    @Basic
        private String dtPagamento;

    @Column(name = "DT_CANCEL", table = "RPAFATUR")
    @Basic
        private String dtCancel;

    @Column(name = "SITUACAO", table = "RPAFATUR", nullable = false)
    @Basic(optional = false)
    private short situacao;

    @Column(name = "VL_FATURA", table = "RPAFATUR", nullable = false)
    @Basic(optional = false)
    private double vlFatura;

    @Column(name = "VL_DIF_VENCTO", table = "RPAFATUR", nullable = false)
    @Basic(optional = false)
    private double vlDifVencto;

    @Column(name = "VL_COMP_FATURA", table = "RPAFATUR", nullable = false)
    @Basic(optional = false)
    private double vlCompFatura;

    @Column(name = "FC_VL_TOTAL_FATURA", table = "RPAFATUR", precision = 15)
    @Basic
    private Double fcVlTotalFatura;

    @Column(name = "VL_FATURADO", table = "RPAFATUR", nullable = false)
    @Basic(optional = false)
    private double vlFaturado;

    @Column(name = "VL_PAGO", table = "RPAFATUR", nullable = false)
    @Basic(optional = false)
    private double vlPago;

    @Column(name = "VL_DESCONTO", table = "RPAFATUR", nullable = false)
    @Basic(optional = false)
    private double vlDesconto;

    @Column(name = "VL_JUROS", table = "RPAFATUR", nullable = false)
    @Basic(optional = false)
    private double vlJuros;

    @Column(name = "VL_JUROS_PRORROG", table = "RPAFATUR", nullable = false)
    @Basic(optional = false)
    private double vlJurosProrrog;

    @Column(name = "VL_ANEXADO", table = "RPAFATUR", nullable = false)
    @Basic(optional = false)
    private double vlAnexado;

    @Column(name = "FC_VL_TOTAL_PAGO", table = "RPAFATUR", precision = 15)
    @Basic
    private Double fcVlTotalPago;

    @Column(name = "FC_VL_RESTANTE", table = "RPAFATUR", precision = 15)
    @Basic
    private Double fcVlRestante;

    @Column(name = "NUM_PARCELAS", table = "RPAFATUR", nullable = false)
    @Basic(optional = false)
    private short numParcelas;

    @Column(name = "AGUARDA_FATURAMENTO", table = "RPAFATUR", nullable = false)
    @Basic(optional = false)
    private Character aguardaFaturamento;

    @Column(name = "FATURADO", table = "RPAFATUR")
    @Basic
    private Character faturado;

    @Column(name = "OBS", table = "RPAFATUR")
    @Lob
    @Basic
    private byte[] obs;

    @Column(name = "A_S", table = "RPAFATUR")
    @Basic
    private Character analiticoSintetico;

    public Integer getIdRpafatur() {
        return this.idRpafatur;
    }

    public void setIdRpafatur(Integer idRpafatur) {
        this.idRpafatur = idRpafatur;
    }

    public int getIdSmaempre() {
        return this.idSmaempre;
    }

    public void setIdSmaempre(int idSmaempre) {
        this.idSmaempre = idSmaempre;
    }

    public Integer getIdCfatpfatVenda() {
        return this.idCfatpfatVenda;
    }

    public void setIdCfatpfatVenda(Integer idCfatpfatVenda) {
        this.idCfatpfatVenda = idCfatpfatVenda;
    }

    public int getIdCfatpfat() {
        return this.idCfatpfat;
    }

    public void setIdCfatpfat(int idCfatpfat) {
        this.idCfatpfat = idCfatpfat;
    }

    public Integer getIdAeaforma() {
        return this.idAeaforma;
    }

    public void setIdAeaforma(Integer idAeaforma) {
        this.idAeaforma = idAeaforma;
    }

    public int getIdCbaplctaCtaTrans() {
        return this.idCbaplctaCtaTrans;
    }

    public void setIdCbaplctaCtaTrans(int idCbaplctaCtaTrans) {
        this.idCbaplctaCtaTrans = idCbaplctaCtaTrans;
    }

    public int getIdCbaplcta() {
        return this.idCbaplcta;
    }

    public void setIdCbaplcta(int idCbaplcta) {
        this.idCbaplcta = idCbaplcta;
    }

    public Integer getIdAeanfsai() {
        return this.idAeanfsai;
    }

    public void setIdAeanfsai(Integer idAeanfsai) {
        this.idAeanfsai = idAeanfsai;
    }

    public Integer getIdCfaclifo() {
        return this.idCfaclifo;
    }

    public void setIdCfaclifo(Integer idCfaclifo) {
        this.idCfaclifo = idCfaclifo;
    }

    public Integer getIdCfaclifoConvenio() {
        return this.idCfaclifoConvenio;
    }

    public void setIdCfaclifoConvenio(Integer idCfaclifoConvenio) {
        this.idCfaclifoConvenio = idCfaclifoConvenio;
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

    public Character getOrigem() {
        return this.origem;
    }

    public void setOrigem(Character origem) {
        this.origem = origem;
    }

    public Character getTipo() {
        return this.tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public Character getAtacVarejo() {
        return this.atacVarejo;
    }

    public void setAtacVarejo(Character atacVarejo) {
        this.atacVarejo = atacVarejo;
    }

    public Integer getNumeroVenda() {
        return this.numeroVenda;
    }

    public void setNumeroVenda(Integer numeroVenda) {
        this.numeroVenda = numeroVenda;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDtImportacao() {
        return this.dtImportacao;
    }

    public void setDtImportacao(String dtImportacao) {
        this.dtImportacao = dtImportacao;
    }

    public String getDtAbertura() {
        return this.dtAbertura;
    }

    public void setDtAbertura(String dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

    public String getDtEmissao() {
        return this.dtEmissao;
    }

    public void setDtEmissao(String dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public String getDtBaixa() {
        return this.dtBaixa;
    }

    public void setDtBaixa(String dtBaixa) {
        this.dtBaixa = dtBaixa;
    }

    public String getDtPagamento() {
        return this.dtPagamento;
    }

    public void setDtPagamento(String dtPagamento) {
        this.dtPagamento = dtPagamento;
    }

    public String getDtCancel() {
        return this.dtCancel;
    }

    public void setDtCancel(String dtCancel) {
        this.dtCancel = dtCancel;
    }

    public short getSituacao() {
        return this.situacao;
    }

    public void setSituacao(short situacao) {
        this.situacao = situacao;
    }

    public double getVlFatura() {
        return this.vlFatura;
    }

    public void setVlFatura(double vlFatura) {
        this.vlFatura = vlFatura;
    }

    public double getVlDifVencto() {
        return this.vlDifVencto;
    }

    public void setVlDifVencto(double vlDifVencto) {
        this.vlDifVencto = vlDifVencto;
    }

    public double getVlCompFatura() {
        return this.vlCompFatura;
    }

    public void setVlCompFatura(double vlCompFatura) {
        this.vlCompFatura = vlCompFatura;
    }

    public Double getFcVlTotalFatura() {
        return this.fcVlTotalFatura;
    }

    public void setFcVlTotalFatura(Double fcVlTotalFatura) {
        this.fcVlTotalFatura = fcVlTotalFatura;
    }

    public double getVlFaturado() {
        return this.vlFaturado;
    }

    public void setVlFaturado(double vlFaturado) {
        this.vlFaturado = vlFaturado;
    }

    public double getVlPago() {
        return this.vlPago;
    }

    public void setVlPago(double vlPago) {
        this.vlPago = vlPago;
    }

    public double getVlDesconto() {
        return this.vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public double getVlJuros() {
        return this.vlJuros;
    }

    public void setVlJuros(double vlJuros) {
        this.vlJuros = vlJuros;
    }

    public double getVlJurosProrrog() {
        return this.vlJurosProrrog;
    }

    public void setVlJurosProrrog(double vlJurosProrrog) {
        this.vlJurosProrrog = vlJurosProrrog;
    }

    public double getVlAnexado() {
        return this.vlAnexado;
    }

    public void setVlAnexado(double vlAnexado) {
        this.vlAnexado = vlAnexado;
    }

    public Double getFcVlTotalPago() {
        return this.fcVlTotalPago;
    }

    public void setFcVlTotalPago(Double fcVlTotalPago) {
        this.fcVlTotalPago = fcVlTotalPago;
    }

    public Double getFcVlRestante() {
        return this.fcVlRestante;
    }

    public void setFcVlRestante(Double fcVlRestante) {
        this.fcVlRestante = fcVlRestante;
    }

    public short getNumParcelas() {
        return this.numParcelas;
    }

    public void setNumParcelas(short numParcelas) {
        this.numParcelas = numParcelas;
    }

    public Character getAguardaFaturamento() {
        return this.aguardaFaturamento;
    }

    public void setAguardaFaturamento(Character aguardaFaturamento) {
        this.aguardaFaturamento = aguardaFaturamento;
    }

    public Character getFaturado() {
        return this.faturado;
    }

    public void setFaturado(Character faturado) {
        this.faturado = faturado;
    }

    public byte[] getObs() {
        return this.obs;
    }

    public void setObs(byte[] obs) {
        this.obs = obs;
    }

    public Character getAnaliticoSintetico() {
        return this.analiticoSintetico;
    }

    public void setAnaliticoSintetico(Character analiticoSintetico) {
        this.analiticoSintetico = analiticoSintetico;
    }

}
