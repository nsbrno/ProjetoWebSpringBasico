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
@Table(name = "AEAITSAI", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ID_AEASAIDA", "SEQUENCIA"})})
public class AeaitsaiEntity {

    @Column(name = "ID_AEAITSAI", table = "AEAITSAI", nullable = false)
    @Id
    private Integer idAeaitsai;

    @Column(name = "ID_AEASAIDA", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private int idAeasaida;

    @Column(name = "ID_AEAPLPGT", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private int idAeaplpgt;

    @Column(name = "ID_AEAUNVEN", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private int idAeaunven;

    @Column(name = "ID_AEAESTOQ", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private int idAeaestoq;

    @Column(name = "ID_CFACLIFO_VENDEDOR", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private int idCfaclifoVendedor;

    @Column(name = "ID_AEAITSAI_CONJ", table = "AEAITSAI")
    @Basic
    private Integer idAeaitsaiConj;

    @Column(name = "GUID", table = "AEAITSAI", nullable = false, length = 16)
    @Basic(optional = false)
    private String guid;

    @Column(name = "US_CAD", table = "AEAITSAI", length = 20)
    @Basic
    private String usCad;

    @Column(name = "DT_CAD", table = "AEAITSAI")
    @Basic
    private String dtCad;

    @Column(name = "DT_ALT", table = "AEAITSAI")
    @Basic
    private String dtAlt;

    @Column(name = "CT_INTEG", table = "AEAITSAI")
    @Basic
    private Integer ctInteg;

    @Column(name = "DT_VENDA", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
        private String dtVenda;

    @Column(name = "SEQUENCIA", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private int sequencia;

    @Column(name = "VL_CUSTO", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private double vlCusto;

    @Column(name = "VL_VISTA", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private double vlVista;

    @Column(name = "VL_TABELA", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private double vlTabela;

    @Column(name = "VL_BRUTO", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private double vlBruto;

    @Column(name = "VL_DESCONTO", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private double vlDesconto;

    @Column(name = "QUANTIDADE", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private double quantidade;

    @Column(name = "QTDE_DEVOL", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private double qtdeDevol;

    @Column(name = "QTDE_RETORNO", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private double qtdeRetorno;

    @Column(name = "QTDE_CONFERIDO", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private double qtdeConferido;

    @Column(name = "FC_VL_LIQUIDO", table = "AEAITSAI", precision = 15)
    @Basic
    private Double fcVlLiquido;

    @Column(name = "FC_VISTA_UN", table = "AEAITSAI", precision = 15)
    @Basic
    private Double fcVistaUn;

    @Column(name = "FC_CUSTO_UN", table = "AEAITSAI", precision = 15)
    @Basic
    private Double fcCustoUn;

    @Column(name = "FC_TABELA_UN", table = "AEAITSAI", precision = 15)
    @Basic
    private Double fcTabelaUn;

    @Column(name = "FC_BRUTO_UN", table = "AEAITSAI", precision = 15)
    @Basic
    private Double fcBrutoUn;

    @Column(name = "FC_DESCONTO_UN", table = "AEAITSAI", precision = 15)
    @Basic
    private Double fcDescontoUn;

    @Column(name = "FC_RETORNO", table = "AEAITSAI", precision = 15)
    @Basic
    private Double fcRetorno;

    @Column(name = "COMISSAO", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private double comissao;

    @Column(name = "COMISSAO_EXT", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private double comissaoExt;

    @Column(name = "PROMOCAO", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private Character promocao;

    @Column(name = "TIPO_PRODUTO", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private Character tipoProduto;

    @Column(name = "ATAC_VAREJO", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private Character atacVarejo;

    @Column(name = "TIPO_BAIXA", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private Character tipoBaixa;

    @Column(name = "TIPO_SAIDA", table = "AEAITSAI")
    @Basic
    private Character tipoSaida;

    @Column(name = "COMPLEMENTO", table = "AEAITSAI")
    @Lob
    @Basic
    private byte[] complemento;

    @Column(name = "SEQ_DESCONTO", table = "AEAITSAI", length = 50)
    @Basic
    private String seqDesconto;

    @Column(name = "BAIXA_POR_CONF", table = "AEAITSAI")
    @Basic
    private Character baixaPorConf;

    @Column(name = "VL_ICMS_DESON", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private double vlIcmsDeson;

    @Column(name = "VL_PIS_DESON", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private double vlPisDeson;

    @Column(name = "VL_COFINS_DESON", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private double vlCofinsDeson;

    @Column(name = "VL_IPI_DESON", table = "AEAITSAI", nullable = false)
    @Basic(optional = false)
    private double vlIpiDeson;

    public Integer getIdAeaitsai() {
        return this.idAeaitsai;
    }

    public void setIdAeaitsai(Integer idAeaitsai) {
        this.idAeaitsai = idAeaitsai;
    }

    public int getIdAeasaida() {
        return this.idAeasaida;
    }

    public void setIdAeasaida(int idAeasaida) {
        this.idAeasaida = idAeasaida;
    }

    public int getIdAeaplpgt() {
        return this.idAeaplpgt;
    }

    public void setIdAeaplpgt(int idAeaplpgt) {
        this.idAeaplpgt = idAeaplpgt;
    }

    public int getIdAeaunven() {
        return this.idAeaunven;
    }

    public void setIdAeaunven(int idAeaunven) {
        this.idAeaunven = idAeaunven;
    }

    public int getIdAeaestoq() {
        return this.idAeaestoq;
    }

    public void setIdAeaestoq(int idAeaestoq) {
        this.idAeaestoq = idAeaestoq;
    }

    public int getIdCfaclifoVendedor() {
        return this.idCfaclifoVendedor;
    }

    public void setIdCfaclifoVendedor(int idCfaclifoVendedor) {
        this.idCfaclifoVendedor = idCfaclifoVendedor;
    }

    public Integer getIdAeaitsaiConj() {
        return this.idAeaitsaiConj;
    }

    public void setIdAeaitsaiConj(Integer idAeaitsaiConj) {
        this.idAeaitsaiConj = idAeaitsaiConj;
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

    public String getDtVenda() {
        return this.dtVenda;
    }

    public void setDtVenda(String dtVenda) {
        this.dtVenda = dtVenda;
    }

    public int getSequencia() {
        return this.sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public double getVlCusto() {
        return this.vlCusto;
    }

    public void setVlCusto(double vlCusto) {
        this.vlCusto = vlCusto;
    }

    public double getVlVista() {
        return this.vlVista;
    }

    public void setVlVista(double vlVista) {
        this.vlVista = vlVista;
    }

    public double getVlTabela() {
        return this.vlTabela;
    }

    public void setVlTabela(double vlTabela) {
        this.vlTabela = vlTabela;
    }

    public double getVlBruto() {
        return this.vlBruto;
    }

    public void setVlBruto(double vlBruto) {
        this.vlBruto = vlBruto;
    }

    public double getVlDesconto() {
        return this.vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getQtdeDevol() {
        return this.qtdeDevol;
    }

    public void setQtdeDevol(double qtdeDevol) {
        this.qtdeDevol = qtdeDevol;
    }

    public double getQtdeRetorno() {
        return this.qtdeRetorno;
    }

    public void setQtdeRetorno(double qtdeRetorno) {
        this.qtdeRetorno = qtdeRetorno;
    }

    public double getQtdeConferido() {
        return this.qtdeConferido;
    }

    public void setQtdeConferido(double qtdeConferido) {
        this.qtdeConferido = qtdeConferido;
    }

    public Double getFcVlLiquido() {
        return this.fcVlLiquido;
    }

    public void setFcVlLiquido(Double fcVlLiquido) {
        this.fcVlLiquido = fcVlLiquido;
    }

    public Double getFcVistaUn() {
        return this.fcVistaUn;
    }

    public void setFcVistaUn(Double fcVistaUn) {
        this.fcVistaUn = fcVistaUn;
    }

    public Double getFcCustoUn() {
        return this.fcCustoUn;
    }

    public void setFcCustoUn(Double fcCustoUn) {
        this.fcCustoUn = fcCustoUn;
    }

    public Double getFcTabelaUn() {
        return this.fcTabelaUn;
    }

    public void setFcTabelaUn(Double fcTabelaUn) {
        this.fcTabelaUn = fcTabelaUn;
    }

    public Double getFcBrutoUn() {
        return this.fcBrutoUn;
    }

    public void setFcBrutoUn(Double fcBrutoUn) {
        this.fcBrutoUn = fcBrutoUn;
    }

    public Double getFcDescontoUn() {
        return this.fcDescontoUn;
    }

    public void setFcDescontoUn(Double fcDescontoUn) {
        this.fcDescontoUn = fcDescontoUn;
    }

    public Double getFcRetorno() {
        return this.fcRetorno;
    }

    public void setFcRetorno(Double fcRetorno) {
        this.fcRetorno = fcRetorno;
    }

    public double getComissao() {
        return this.comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getComissaoExt() {
        return this.comissaoExt;
    }

    public void setComissaoExt(double comissaoExt) {
        this.comissaoExt = comissaoExt;
    }

    public Character getPromocao() {
        return this.promocao;
    }

    public void setPromocao(Character promocao) {
        this.promocao = promocao;
    }

    public Character getTipoProduto() {
        return this.tipoProduto;
    }

    public void setTipoProduto(Character tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Character getAtacVarejo() {
        return this.atacVarejo;
    }

    public void setAtacVarejo(Character atacVarejo) {
        this.atacVarejo = atacVarejo;
    }

    public Character getTipoBaixa() {
        return this.tipoBaixa;
    }

    public void setTipoBaixa(Character tipoBaixa) {
        this.tipoBaixa = tipoBaixa;
    }

    public Character getTipoSaida() {
        return this.tipoSaida;
    }

    public void setTipoSaida(Character tipoSaida) {
        this.tipoSaida = tipoSaida;
    }

    public byte[] getComplemento() {
        return this.complemento;
    }

    public void setComplemento(byte[] complemento) {
        this.complemento = complemento;
    }

    public String getSeqDesconto() {
        return this.seqDesconto;
    }

    public void setSeqDesconto(String seqDesconto) {
        this.seqDesconto = seqDesconto;
    }

    public Character getBaixaPorConf() {
        return this.baixaPorConf;
    }

    public void setBaixaPorConf(Character baixaPorConf) {
        this.baixaPorConf = baixaPorConf;
    }

    public double getVlIcmsDeson() {
        return this.vlIcmsDeson;
    }

    public void setVlIcmsDeson(double vlIcmsDeson) {
        this.vlIcmsDeson = vlIcmsDeson;
    }

    public double getVlPisDeson() {
        return this.vlPisDeson;
    }

    public void setVlPisDeson(double vlPisDeson) {
        this.vlPisDeson = vlPisDeson;
    }

    public double getVlCofinsDeson() {
        return this.vlCofinsDeson;
    }

    public void setVlCofinsDeson(double vlCofinsDeson) {
        this.vlCofinsDeson = vlCofinsDeson;
    }

    public double getVlIpiDeson() {
        return this.vlIpiDeson;
    }

    public void setVlIpiDeson(double vlIpiDeson) {
        this.vlIpiDeson = vlIpiDeson;
    }

}
